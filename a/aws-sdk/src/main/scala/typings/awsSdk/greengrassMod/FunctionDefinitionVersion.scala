package typings.awsSdk.greengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FunctionDefinitionVersion extends StObject {
  
  /**
    * The default configuration that applies to all Lambda functions in this function definition version. Individual Lambda functions can override these settings.
    */
  var DefaultConfig: js.UndefOr[FunctionDefaultConfig] = js.native
  
  /**
    * A list of Lambda functions in this function definition version.
    */
  var Functions: js.UndefOr[listOfFunction] = js.native
}
object FunctionDefinitionVersion {
  
  @scala.inline
  def apply(): FunctionDefinitionVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FunctionDefinitionVersion]
  }
  
  @scala.inline
  implicit class FunctionDefinitionVersionMutableBuilder[Self <: FunctionDefinitionVersion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultConfig(value: FunctionDefaultConfig): Self = StObject.set(x, "DefaultConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultConfigUndefined: Self = StObject.set(x, "DefaultConfig", js.undefined)
    
    @scala.inline
    def setFunctions(value: listOfFunction): Self = StObject.set(x, "Functions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFunctionsUndefined: Self = StObject.set(x, "Functions", js.undefined)
    
    @scala.inline
    def setFunctionsVarargs(value: Function*): Self = StObject.set(x, "Functions", js.Array(value :_*))
  }
}
