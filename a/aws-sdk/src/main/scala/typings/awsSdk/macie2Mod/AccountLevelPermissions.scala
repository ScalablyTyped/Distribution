package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountLevelPermissions extends js.Object {
  /**
    * The block public access settings for the bucket.
    */
  var blockPublicAccess: js.UndefOr[BlockPublicAccess] = js.native
}

object AccountLevelPermissions {
  @scala.inline
  def apply(blockPublicAccess: BlockPublicAccess = null): AccountLevelPermissions = {
    val __obj = js.Dynamic.literal()
    if (blockPublicAccess != null) __obj.updateDynamic("blockPublicAccess")(blockPublicAccess.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountLevelPermissions]
  }
}

