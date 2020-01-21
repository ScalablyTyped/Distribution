package typings.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccessKey extends js.Object {
  /**
    * The ID for this access key.
    */
  var AccessKeyId: accessKeyIdType = js.native
  /**
    * The date when the access key was created.
    */
  var CreateDate: js.UndefOr[dateType] = js.native
  /**
    * The secret key used to sign requests.
    */
  var SecretAccessKey: accessKeySecretType = js.native
  /**
    * The status of the access key. Active means that the key is valid for API calls, while Inactive means it is not. 
    */
  var Status: statusType = js.native
  /**
    * The name of the IAM user that the access key is associated with.
    */
  var UserName: userNameType = js.native
}

object AccessKey {
  @scala.inline
  def apply(
    AccessKeyId: accessKeyIdType,
    SecretAccessKey: accessKeySecretType,
    Status: statusType,
    UserName: userNameType,
    CreateDate: dateType = null
  ): AccessKey = {
    val __obj = js.Dynamic.literal(AccessKeyId = AccessKeyId.asInstanceOf[js.Any], SecretAccessKey = SecretAccessKey.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], UserName = UserName.asInstanceOf[js.Any])
    if (CreateDate != null) __obj.updateDynamic("CreateDate")(CreateDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessKey]
  }
}

