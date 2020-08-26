package typings.awsSdk.mediastoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeContainerInput extends js.Object {
  /**
    * The name of the container to query.
    */
  var ContainerName: js.UndefOr[typings.awsSdk.mediastoreMod.ContainerName] = js.native
}

object DescribeContainerInput {
  @scala.inline
  def apply(): DescribeContainerInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeContainerInput]
  }
  @scala.inline
  implicit class DescribeContainerInputOps[Self <: DescribeContainerInput] (val x: Self) extends AnyVal {
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
    @scala.inline
    def deleteContainerName: Self = this.set("ContainerName", js.undefined)
  }
  
}

