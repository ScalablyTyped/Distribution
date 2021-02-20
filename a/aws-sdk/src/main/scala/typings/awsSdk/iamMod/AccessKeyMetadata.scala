package typings.awsSdk.iamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccessKeyMetadata extends StObject {
  
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
  implicit class AccessKeyMetadataMutableBuilder[Self <: AccessKeyMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessKeyId(value: accessKeyIdType): Self = StObject.set(x, "AccessKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessKeyIdUndefined: Self = StObject.set(x, "AccessKeyId", js.undefined)
    
    @scala.inline
    def setCreateDate(value: dateType): Self = StObject.set(x, "CreateDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateDateUndefined: Self = StObject.set(x, "CreateDate", js.undefined)
    
    @scala.inline
    def setStatus(value: statusType): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setUserName(value: userNameType): Self = StObject.set(x, "UserName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserNameUndefined: Self = StObject.set(x, "UserName", js.undefined)
  }
}
