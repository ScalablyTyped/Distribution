package typings.awsSdk.frauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetVariablesResult extends StObject {
  
  /**
    * The next page token to be used in subsequent requests. 
    */
  var nextToken: js.UndefOr[String] = js.undefined
  
  /**
    * The names of the variables returned. 
    */
  var variables: js.UndefOr[VariableList] = js.undefined
}
object GetVariablesResult {
  
  inline def apply(): GetVariablesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetVariablesResult]
  }
  
  extension [Self <: GetVariablesResult](x: Self) {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setVariables(value: VariableList): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
    
    inline def setVariablesUndefined: Self = StObject.set(x, "variables", js.undefined)
    
    inline def setVariablesVarargs(value: Variable*): Self = StObject.set(x, "variables", js.Array(value :_*))
  }
}
