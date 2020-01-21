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
  def apply(arn: java.lang.String = null): PutSigningProfileResponse = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutSigningProfileResponse]
  }
}

