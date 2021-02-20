package typings.awsSdk.datasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeLocationNfsResponse extends StObject {
  
  /**
    * The time that the NFS location was created.
    */
  var CreationTime: js.UndefOr[Time] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the NFS location that was described.
    */
  var LocationArn: js.UndefOr[typings.awsSdk.datasyncMod.LocationArn] = js.native
  
  /**
    * The URL of the source NFS location that was described.
    */
  var LocationUri: js.UndefOr[typings.awsSdk.datasyncMod.LocationUri] = js.native
  
  /**
    * The NFS mount options that DataSync used to mount your NFS share.
    */
  var MountOptions: js.UndefOr[NfsMountOptions] = js.native
  
  var OnPremConfig: js.UndefOr[typings.awsSdk.datasyncMod.OnPremConfig] = js.native
}
object DescribeLocationNfsResponse {
  
  @scala.inline
  def apply(): DescribeLocationNfsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeLocationNfsResponse]
  }
  
  @scala.inline
  implicit class DescribeLocationNfsResponseMutableBuilder[Self <: DescribeLocationNfsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationTime(value: Time): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    @scala.inline
    def setLocationArn(value: LocationArn): Self = StObject.set(x, "LocationArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationArnUndefined: Self = StObject.set(x, "LocationArn", js.undefined)
    
    @scala.inline
    def setLocationUri(value: LocationUri): Self = StObject.set(x, "LocationUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUriUndefined: Self = StObject.set(x, "LocationUri", js.undefined)
    
    @scala.inline
    def setMountOptions(value: NfsMountOptions): Self = StObject.set(x, "MountOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMountOptionsUndefined: Self = StObject.set(x, "MountOptions", js.undefined)
    
    @scala.inline
    def setOnPremConfig(value: OnPremConfig): Self = StObject.set(x, "OnPremConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPremConfigUndefined: Self = StObject.set(x, "OnPremConfig", js.undefined)
  }
}
