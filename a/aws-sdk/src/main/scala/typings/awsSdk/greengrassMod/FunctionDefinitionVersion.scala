package typings.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FunctionDefinitionVersion extends js.Object {
  
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
  implicit class FunctionDefinitionVersionOps[Self <: FunctionDefinitionVersion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDefaultConfig(value: FunctionDefaultConfig): Self = this.set("DefaultConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultConfig: Self = this.set("DefaultConfig", js.undefined)
    
    @scala.inline
    def setFunctionsVarargs(value: Function*): Self = this.set("Functions", js.Array(value :_*))
    
    @scala.inline
    def setFunctions(value: listOfFunction): Self = this.set("Functions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFunctions: Self = this.set("Functions", js.undefined)
  }
}
