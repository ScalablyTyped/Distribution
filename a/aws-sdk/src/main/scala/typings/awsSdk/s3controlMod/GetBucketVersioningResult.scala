package typings.awsSdk.s3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBucketVersioningResult extends StObject {
  
  /**
    * Specifies whether MFA delete is enabled in the bucket versioning configuration. This element is returned only if the bucket has been configured with MFA delete. If MFA delete has never been configured for the bucket, this element is not returned.
    */
  var MFADelete: js.UndefOr[MFADeleteStatus] = js.undefined
  
  /**
    * The versioning state of the S3 on Outposts bucket.
    */
  var Status: js.UndefOr[BucketVersioningStatus] = js.undefined
}
object GetBucketVersioningResult {
  
  inline def apply(): GetBucketVersioningResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBucketVersioningResult]
  }
  
  extension [Self <: GetBucketVersioningResult](x: Self) {
    
    inline def setMFADelete(value: MFADeleteStatus): Self = StObject.set(x, "MFADelete", value.asInstanceOf[js.Any])
    
    inline def setMFADeleteUndefined: Self = StObject.set(x, "MFADelete", js.undefined)
    
    inline def setStatus(value: BucketVersioningStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
