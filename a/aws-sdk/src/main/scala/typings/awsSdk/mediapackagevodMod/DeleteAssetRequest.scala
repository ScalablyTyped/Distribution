package typings.awsSdk.mediapackagevodMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteAssetRequest extends js.Object {
  /**
    * The ID of the MediaPackage VOD Asset resource to delete.
    */
  var Id: string = js.native
}

object DeleteAssetRequest {
  @scala.inline
  def apply(Id: string): DeleteAssetRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAssetRequest]
  }
  @scala.inline
  implicit class DeleteAssetRequestOps[Self <: DeleteAssetRequest] (val x: Self) extends AnyVal {
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
    def setId(value: string): Self = this.set("Id", value.asInstanceOf[js.Any])
  }
  
}

