package typings.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VersioningConfiguration extends StObject {
  
  /**
    * Specifies whether MFA delete is enabled in the bucket versioning configuration. This element is only returned if the bucket has been configured with MFA delete. If the bucket has never been so configured, this element is not returned.
    */
  var MFADelete: js.UndefOr[typings.awsSdk.s3Mod.MFADelete] = js.undefined
  
  /**
    * The versioning state of the bucket.
    */
  var Status: js.UndefOr[BucketVersioningStatus] = js.undefined
}
object VersioningConfiguration {
  
  @scala.inline
  def apply(): VersioningConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VersioningConfiguration]
  }
  
  @scala.inline
  implicit class VersioningConfigurationMutableBuilder[Self <: VersioningConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMFADelete(value: MFADelete): Self = StObject.set(x, "MFADelete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMFADeleteUndefined: Self = StObject.set(x, "MFADelete", js.undefined)
    
    @scala.inline
    def setStatus(value: BucketVersioningStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
