package typings.awsSdk.s3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolicyStatus extends js.Object {
  /**
    * 
    */
  var IsPublic: js.UndefOr[typings.awsSdk.s3controlMod.IsPublic] = js.native
}

object PolicyStatus {
  @scala.inline
  def apply(IsPublic: js.UndefOr[scala.Boolean] = js.undefined): PolicyStatus = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(IsPublic)) __obj.updateDynamic("IsPublic")(IsPublic.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicyStatus]
  }
}

