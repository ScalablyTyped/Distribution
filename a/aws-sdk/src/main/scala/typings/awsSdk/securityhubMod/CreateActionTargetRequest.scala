package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateActionTargetRequest extends js.Object {
  
  /**
    * The description for the custom action target.
    */
  var Description: NonEmptyString = js.native
  
  /**
    * The ID for the custom action target.
    */
  var Id: NonEmptyString = js.native
  
  /**
    * The name of the custom action target.
    */
  var Name: NonEmptyString = js.native
}
object CreateActionTargetRequest {
  
  @scala.inline
  def apply(Description: NonEmptyString, Id: NonEmptyString, Name: NonEmptyString): CreateActionTargetRequest = {
    val __obj = js.Dynamic.literal(Description = Description.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateActionTargetRequest]
  }
  
  @scala.inline
  implicit class CreateActionTargetRequestOps[Self <: CreateActionTargetRequest] (val x: Self) extends AnyVal {
    
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
    def setDescription(value: NonEmptyString): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: NonEmptyString): Self = this.set("Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: NonEmptyString): Self = this.set("Name", value.asInstanceOf[js.Any])
  }
}
