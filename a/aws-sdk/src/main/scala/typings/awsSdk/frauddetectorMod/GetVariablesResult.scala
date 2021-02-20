package typings.awsSdk.frauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetVariablesResult extends StObject {
  
  /**
    * The next page token to be used in subsequent requests. 
    */
  var nextToken: js.UndefOr[String] = js.native
  
  /**
    * The names of the variables returned. 
    */
  var variables: js.UndefOr[VariableList] = js.native
}
object GetVariablesResult {
  
  @scala.inline
  def apply(): GetVariablesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetVariablesResult]
  }
  
  @scala.inline
  implicit class GetVariablesResultMutableBuilder[Self <: GetVariablesResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setVariables(value: VariableList): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariablesUndefined: Self = StObject.set(x, "variables", js.undefined)
    
    @scala.inline
    def setVariablesVarargs(value: Variable*): Self = StObject.set(x, "variables", js.Array(value :_*))
  }
}
