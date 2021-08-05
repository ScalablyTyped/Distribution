package typings.awsSdk.dmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DmsTransferSettings extends StObject {
  
  /**
    *  The name of the S3 bucket to use. 
    */
  var BucketName: js.UndefOr[String] = js.undefined
  
  /**
    *  The IAM role that has permission to access the Amazon S3 bucket. 
    */
  var ServiceAccessRoleArn: js.UndefOr[String] = js.undefined
}
object DmsTransferSettings {
  
  inline def apply(): DmsTransferSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DmsTransferSettings]
  }
  
  extension [Self <: DmsTransferSettings](x: Self) {
    
    inline def setBucketName(value: String): Self = StObject.set(x, "BucketName", value.asInstanceOf[js.Any])
    
    inline def setBucketNameUndefined: Self = StObject.set(x, "BucketName", js.undefined)
    
    inline def setServiceAccessRoleArn(value: String): Self = StObject.set(x, "ServiceAccessRoleArn", value.asInstanceOf[js.Any])
    
    inline def setServiceAccessRoleArnUndefined: Self = StObject.set(x, "ServiceAccessRoleArn", js.undefined)
  }
}
