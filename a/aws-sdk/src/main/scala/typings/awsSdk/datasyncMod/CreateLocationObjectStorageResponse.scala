package typings.awsSdk.datasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateLocationObjectStorageResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the agents associated with the self-managed object storage server location.
    */
  var LocationArn: js.UndefOr[typings.awsSdk.datasyncMod.LocationArn] = js.native
}

object CreateLocationObjectStorageResponse {
  @scala.inline
  def apply(): CreateLocationObjectStorageResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateLocationObjectStorageResponse]
  }
  @scala.inline
  implicit class CreateLocationObjectStorageResponseOps[Self <: CreateLocationObjectStorageResponse] (val x: Self) extends AnyVal {
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
    def setLocationArn(value: LocationArn): Self = this.set("LocationArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocationArn: Self = this.set("LocationArn", js.undefined)
  }
  
}

