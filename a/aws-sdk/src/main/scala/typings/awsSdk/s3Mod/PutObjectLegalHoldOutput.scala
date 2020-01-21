package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutObjectLegalHoldOutput extends js.Object {
  var RequestCharged: js.UndefOr[typings.awsSdk.s3Mod.RequestCharged] = js.native
}

object PutObjectLegalHoldOutput {
  @scala.inline
  def apply(RequestCharged: RequestCharged = null): PutObjectLegalHoldOutput = {
    val __obj = js.Dynamic.literal()
    if (RequestCharged != null) __obj.updateDynamic("RequestCharged")(RequestCharged.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutObjectLegalHoldOutput]
  }
}

