package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolicyStatus extends js.Object {
  /**
    * The policy status for this bucket. TRUE indicates that this bucket is public. FALSE indicates that the bucket is not public.
    */
  var IsPublic: js.UndefOr[typings.awsSdk.s3Mod.IsPublic] = js.native
}

object PolicyStatus {
  @scala.inline
  def apply(IsPublic: js.UndefOr[Boolean] = js.undefined): PolicyStatus = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(IsPublic)) __obj.updateDynamic("IsPublic")(IsPublic.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicyStatus]
  }
}

