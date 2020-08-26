package typings.awsSdk.cloudtrailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTrailResponse extends js.Object {
  var Trail: js.UndefOr[typings.awsSdk.cloudtrailMod.Trail] = js.native
}

object GetTrailResponse {
  @scala.inline
  def apply(): GetTrailResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTrailResponse]
  }
  @scala.inline
  implicit class GetTrailResponseOps[Self <: GetTrailResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setTrail(value: Trail): Self = this.set("Trail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrail: Self = this.set("Trail", js.undefined)
  }
  
}

