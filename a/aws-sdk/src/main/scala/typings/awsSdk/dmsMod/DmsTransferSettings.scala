package typings.awsSdk.dmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DmsTransferSettings extends StObject {
  
  /**
    *  The name of the S3 bucket to use. 
    */
  var BucketName: js.UndefOr[String] = js.native
  
  /**
    *  The IAM role that has permission to access the Amazon S3 bucket. 
    */
  var ServiceAccessRoleArn: js.UndefOr[String] = js.native
}
object DmsTransferSettings {
  
  @scala.inline
  def apply(): DmsTransferSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DmsTransferSettings]
  }
  
  @scala.inline
  implicit class DmsTransferSettingsMutableBuilder[Self <: DmsTransferSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBucketName(value: String): Self = StObject.set(x, "BucketName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucketNameUndefined: Self = StObject.set(x, "BucketName", js.undefined)
    
    @scala.inline
    def setServiceAccessRoleArn(value: String): Self = StObject.set(x, "ServiceAccessRoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceAccessRoleArnUndefined: Self = StObject.set(x, "ServiceAccessRoleArn", js.undefined)
  }
}
