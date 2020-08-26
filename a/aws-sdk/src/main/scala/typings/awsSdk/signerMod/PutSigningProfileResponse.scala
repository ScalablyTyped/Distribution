package typings.awsSdk.signerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutSigningProfileResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the signing profile created.
    */
  var arn: js.UndefOr[java.lang.String] = js.native
}

object PutSigningProfileResponse {
  @scala.inline
  def apply(): PutSigningProfileResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutSigningProfileResponse]
  }
  @scala.inline
  implicit class PutSigningProfileResponseOps[Self <: PutSigningProfileResponse] (val x: Self) extends AnyVal {
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
    def setArn(value: java.lang.String): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
  }
  
}

