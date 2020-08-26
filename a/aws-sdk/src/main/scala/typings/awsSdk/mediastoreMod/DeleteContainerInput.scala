package typings.awsSdk.mediastoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteContainerInput extends js.Object {
  /**
    * The name of the container to delete. 
    */
  var ContainerName: typings.awsSdk.mediastoreMod.ContainerName = js.native
}

object DeleteContainerInput {
  @scala.inline
  def apply(ContainerName: ContainerName): DeleteContainerInput = {
    val __obj = js.Dynamic.literal(ContainerName = ContainerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteContainerInput]
  }
  @scala.inline
  implicit class DeleteContainerInputOps[Self <: DeleteContainerInput] (val x: Self) extends AnyVal {
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
    def setContainerName(value: ContainerName): Self = this.set("ContainerName", value.asInstanceOf[js.Any])
  }
  
}

