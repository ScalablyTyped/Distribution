package typings.awsSdk.workdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserStorageMetadata extends js.Object {
  /**
    * The storage for a user.
    */
  var StorageRule: js.UndefOr[StorageRuleType] = js.native
  /**
    * The amount of storage used, in bytes.
    */
  var StorageUtilizedInBytes: js.UndefOr[SizeType] = js.native
}

object UserStorageMetadata {
  @scala.inline
  def apply(StorageRule: StorageRuleType = null, StorageUtilizedInBytes: Int | Double = null): UserStorageMetadata = {
    val __obj = js.Dynamic.literal()
    if (StorageRule != null) __obj.updateDynamic("StorageRule")(StorageRule.asInstanceOf[js.Any])
    if (StorageUtilizedInBytes != null) __obj.updateDynamic("StorageUtilizedInBytes")(StorageUtilizedInBytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserStorageMetadata]
  }
}

