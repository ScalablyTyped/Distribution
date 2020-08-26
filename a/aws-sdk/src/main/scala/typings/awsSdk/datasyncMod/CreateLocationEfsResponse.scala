package typings.awsSdk.datasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateLocationEfsResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the Amazon EFS file system location that is created.
    */
  var LocationArn: js.UndefOr[typings.awsSdk.datasyncMod.LocationArn] = js.native
}

object CreateLocationEfsResponse {
  @scala.inline
  def apply(): CreateLocationEfsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateLocationEfsResponse]
  }
  @scala.inline
  implicit class CreateLocationEfsResponseOps[Self <: CreateLocationEfsResponse] (val x: Self) extends AnyVal {
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

