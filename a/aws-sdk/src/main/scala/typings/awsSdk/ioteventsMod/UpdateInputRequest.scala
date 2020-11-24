package typings.awsSdk.ioteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateInputRequest extends js.Object {
  
  /**
    * The definition of the input.
    */
  var inputDefinition: InputDefinition = js.native
  
  /**
    * A brief description of the input.
    */
  var inputDescription: js.UndefOr[InputDescription] = js.native
  
  /**
    * The name of the input you want to update.
    */
  var inputName: InputName = js.native
}
object UpdateInputRequest {
  
  @scala.inline
  def apply(inputDefinition: InputDefinition, inputName: InputName): UpdateInputRequest = {
    val __obj = js.Dynamic.literal(inputDefinition = inputDefinition.asInstanceOf[js.Any], inputName = inputName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateInputRequest]
  }
  
  @scala.inline
  implicit class UpdateInputRequestOps[Self <: UpdateInputRequest] (val x: Self) extends AnyVal {
    
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
    def setInputDefinition(value: InputDefinition): Self = this.set("inputDefinition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputName(value: InputName): Self = this.set("inputName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputDescription(value: InputDescription): Self = this.set("inputDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputDescription: Self = this.set("inputDescription", js.undefined)
  }
}
