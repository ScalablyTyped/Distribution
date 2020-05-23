package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccessControlList extends js.Object {
  /**
    * Specifies whether the ACL grants the general public with read access permissions for the bucket.
    */
  var allowsPublicReadAccess: js.UndefOr[boolean] = js.native
  /**
    * Specifies whether the ACL grants the general public with write access permissions for the bucket.
    */
  var allowsPublicWriteAccess: js.UndefOr[boolean] = js.native
}

object AccessControlList {
  @scala.inline
  def apply(
    allowsPublicReadAccess: js.UndefOr[boolean] = js.undefined,
    allowsPublicWriteAccess: js.UndefOr[boolean] = js.undefined
  ): AccessControlList = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowsPublicReadAccess)) __obj.updateDynamic("allowsPublicReadAccess")(allowsPublicReadAccess.get.asInstanceOf[js.Any])
    if (!js.isUndefined(allowsPublicWriteAccess)) __obj.updateDynamic("allowsPublicWriteAccess")(allowsPublicWriteAccess.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessControlList]
  }
}

