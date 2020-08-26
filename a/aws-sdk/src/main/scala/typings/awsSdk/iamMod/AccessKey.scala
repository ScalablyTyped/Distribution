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
    UserName: userNameType
  ): AccessKey = {
    val __obj = js.Dynamic.literal(AccessKeyId = AccessKeyId.asInstanceOf[js.Any], SecretAccessKey = SecretAccessKey.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], UserName = UserName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessKey]
  }
  @scala.inline
  implicit class AccessKeyOps[Self <: AccessKey] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAccessKeyId(value: accessKeyIdType): Self = this.set("AccessKeyId", value.asInstanceOf[js.Any])
    @scala.inline
    def setSecretAccessKey(value: accessKeySecretType): Self = this.set("SecretAccessKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: statusType): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserName(value: userNameType): Self = this.set("UserName", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreateDate(value: dateType): Self = this.set("CreateDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreateDate: Self = this.set("CreateDate", js.undefined)
  }
  
}

