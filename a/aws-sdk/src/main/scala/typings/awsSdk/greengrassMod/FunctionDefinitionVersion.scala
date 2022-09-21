package typings.awsSdk.greengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FunctionDefinitionVersion extends StObject {
  
  /**
    * The default configuration that applies to all Lambda functions in this function definition version. Individual Lambda functions can override these settings.
    */
  var DefaultConfig: js.UndefOr[FunctionDefaultConfig] = js.undefined
  
  /**
    * A list of Lambda functions in this function definition version.
    */
  var Functions: js.UndefOr[listOfFunction] = js.undefined
}
object FunctionDefinitionVersion {
  
  inline def apply(): FunctionDefinitionVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FunctionDefinitionVersion]
  }
  
  extension [Self <: FunctionDefinitionVersion](x: Self) {
    
    inline def setDefaultConfig(value: FunctionDefaultConfig): Self = StObject.set(x, "DefaultConfig", value.asInstanceOf[js.Any])
    
    inline def setDefaultConfigUndefined: Self = StObject.set(x, "DefaultConfig", js.undefined)
    
    inline def setFunctions(value: listOfFunction): Self = StObject.set(x, "Functions", value.asInstanceOf[js.Any])
    
    inline def setFunctionsUndefined: Self = StObject.set(x, "Functions", js.undefined)
    
    inline def setFunctionsVarargs(value: Function*): Self = StObject.set(x, "Functions", js.Array(value*))
  }
}
