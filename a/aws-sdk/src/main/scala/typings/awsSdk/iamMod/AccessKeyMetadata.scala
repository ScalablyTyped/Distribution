package typings.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccessKeyMetadata extends js.Object {
  
  /**
    * The ID for this access key.
    */
  var AccessKeyId: js.UndefOr[accessKeyIdType] = js.native
  
  /**
    * The date when the access key was created.
    */
  var CreateDate: js.UndefOr[dateType] = js.native
  
  /**
    * The status of the access key. Active means that the key is valid for API calls; Inactive means it is not.
    */
  var Status: js.UndefOr[statusType] = js.native
  
  /**
    * The name of the IAM user that the key is associated with.
    */
  var UserName: js.UndefOr[userNameType] = js.native
}
object AccessKeyMetadata {
  
  @scala.inline
  def apply(): AccessKeyMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccessKeyMetadata]
  }
  
  @scala.inline
  implicit class AccessKeyMetadataOps[Self <: AccessKeyMetadata] (val x: Self) extends AnyVal {
    
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
    def deleteAccessKeyId: Self = this.set("AccessKeyId", js.undefined)
    
    @scala.inline
    def setCreateDate(value: dateType): Self = this.set("CreateDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateDate: Self = this.set("CreateDate", js.undefined)
    
    @scala.inline
    def setStatus(value: statusType): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    
    @scala.inline
    def setUserName(value: userNameType): Self = this.set("UserName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserName: Self = this.set("UserName", js.undefined)
  }
}
