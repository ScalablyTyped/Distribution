package typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages

import typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.StepMatchArgument.IGroup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a StepMatchArgument. */
@js.native
trait IStepMatchArgument extends js.Object {
  
  /**
    * Represents the outermost capture group of an argument. This message closely matches the
    * `Group` class in the `cucumber-expressions` library.
    */
  var group: js.UndefOr[IGroup | Null] = js.native
  
  /** StepMatchArgument parameterTypeName */
  var parameterTypeName: js.UndefOr[String | Null] = js.native
}
object IStepMatchArgument {
  
  @scala.inline
  def apply(): IStepMatchArgument = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IStepMatchArgument]
  }
  
  @scala.inline
  implicit class IStepMatchArgumentOps[Self <: IStepMatchArgument] (val x: Self) extends AnyVal {
    
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
    def setGroup(value: IGroup): Self = this.set("group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroup: Self = this.set("group", js.undefined)
    
    @scala.inline
    def setGroupNull: Self = this.set("group", null)
    
    @scala.inline
    def setParameterTypeName(value: String): Self = this.set("parameterTypeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameterTypeName: Self = this.set("parameterTypeName", js.undefined)
    
    @scala.inline
    def setParameterTypeNameNull: Self = this.set("parameterTypeName", null)
  }
}
