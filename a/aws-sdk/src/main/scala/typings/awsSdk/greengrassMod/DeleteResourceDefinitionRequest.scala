package typings.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteResourceDefinitionRequest extends js.Object {
  /**
    * The ID of the resource definition.
    */
  var ResourceDefinitionId: string = js.native
}

object DeleteResourceDefinitionRequest {
  @scala.inline
  def apply(ResourceDefinitionId: string): DeleteResourceDefinitionRequest = {
    val __obj = js.Dynamic.literal(ResourceDefinitionId = ResourceDefinitionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteResourceDefinitionRequest]
  }
  @scala.inline
  implicit class DeleteResourceDefinitionRequestOps[Self <: DeleteResourceDefinitionRequest] (val x: Self) extends AnyVal {
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
    def setResourceDefinitionId(value: string): Self = this.set("ResourceDefinitionId", value.asInstanceOf[js.Any])
  }
  
}

