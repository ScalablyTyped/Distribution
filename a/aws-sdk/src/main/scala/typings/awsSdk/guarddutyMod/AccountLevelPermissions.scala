package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountLevelPermissions extends js.Object {
  /**
    * Describes the S3 Block Public Access settings of the bucket's parent account.
    */
  var BlockPublicAccess: js.UndefOr[typings.awsSdk.guarddutyMod.BlockPublicAccess] = js.native
}

object AccountLevelPermissions {
  @scala.inline
  def apply(BlockPublicAccess: BlockPublicAccess = null): AccountLevelPermissions = {
    val __obj = js.Dynamic.literal()
    if (BlockPublicAccess != null) __obj.updateDynamic("BlockPublicAccess")(BlockPublicAccess.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountLevelPermissions]
  }
}

