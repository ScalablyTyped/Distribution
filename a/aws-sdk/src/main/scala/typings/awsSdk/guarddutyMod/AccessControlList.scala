package typings.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccessControlList extends js.Object {
  /**
    * A value that indicates whether public read access for the bucket is enabled through an Access Control List (ACL).
    */
  var AllowsPublicReadAccess: js.UndefOr[Boolean] = js.native
  /**
    * A value that indicates whether public write access for the bucket is enabled through an Access Control List (ACL).
    */
  var AllowsPublicWriteAccess: js.UndefOr[Boolean] = js.native
}

object AccessControlList {
  @scala.inline
  def apply(
    AllowsPublicReadAccess: js.UndefOr[Boolean] = js.undefined,
    AllowsPublicWriteAccess: js.UndefOr[Boolean] = js.undefined
  ): AccessControlList = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(AllowsPublicReadAccess)) __obj.updateDynamic("AllowsPublicReadAccess")(AllowsPublicReadAccess.get.asInstanceOf[js.Any])
    if (!js.isUndefined(AllowsPublicWriteAccess)) __obj.updateDynamic("AllowsPublicWriteAccess")(AllowsPublicWriteAccess.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessControlList]
  }
}

