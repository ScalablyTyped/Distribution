package typings.awsSdk.s3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VersioningConfiguration extends StObject {
  
  /**
    * Specifies whether MFA delete is enabled or disabled in the bucket versioning configuration for the S3 on Outposts bucket.
    */
  var MFADelete: js.UndefOr[typings.awsSdk.s3controlMod.MFADelete] = js.undefined
  
  /**
    * Sets the versioning state of the S3 on Outposts bucket.
    */
  var Status: js.UndefOr[BucketVersioningStatus] = js.undefined
}
object VersioningConfiguration {
  
  inline def apply(): VersioningConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VersioningConfiguration]
  }
  
  extension [Self <: VersioningConfiguration](x: Self) {
    
    inline def setMFADelete(value: MFADelete): Self = StObject.set(x, "MFADelete", value.asInstanceOf[js.Any])
    
    inline def setMFADeleteUndefined: Self = StObject.set(x, "MFADelete", js.undefined)
    
    inline def setStatus(value: BucketVersioningStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
