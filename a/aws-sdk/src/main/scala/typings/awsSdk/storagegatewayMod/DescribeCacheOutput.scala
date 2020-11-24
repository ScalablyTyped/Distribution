package typings.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeCacheOutput extends js.Object {
  
  /**
    * The amount of cache in bytes allocated to a gateway.
    */
  var CacheAllocatedInBytes: js.UndefOr[long] = js.native
  
  /**
    * The file share's contribution to the overall percentage of the gateway's cache that has not been persisted to AWS. The sample is taken at the end of the reporting period.
    */
  var CacheDirtyPercentage: js.UndefOr[double] = js.native
  
  /**
    * Percent of application read operations from the file shares that are served from cache. The sample is taken at the end of the reporting period.
    */
  var CacheHitPercentage: js.UndefOr[double] = js.native
  
  /**
    * Percent of application read operations from the file shares that are not served from cache. The sample is taken at the end of the reporting period.
    */
  var CacheMissPercentage: js.UndefOr[double] = js.native
  
  /**
    * Percent use of the gateway's cache storage. This metric applies only to the gateway-cached volume setup. The sample is taken at the end of the reporting period.
    */
  var CacheUsedPercentage: js.UndefOr[double] = js.native
  
  /**
    * An array of strings that identify disks that are to be configured as working storage. Each string has a minimum length of 1 and maximum length of 300. You can get the disk IDs from the ListLocalDisks API.
    */
  var DiskIds: js.UndefOr[typings.awsSdk.storagegatewayMod.DiskIds] = js.native
  
  var GatewayARN: js.UndefOr[typings.awsSdk.storagegatewayMod.GatewayARN] = js.native
}
object DescribeCacheOutput {
  
  @scala.inline
  def apply(): DescribeCacheOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeCacheOutput]
  }
  
  @scala.inline
  implicit class DescribeCacheOutputOps[Self <: DescribeCacheOutput] (val x: Self) extends AnyVal {
    
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
    def setCacheAllocatedInBytes(value: long): Self = this.set("CacheAllocatedInBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCacheAllocatedInBytes: Self = this.set("CacheAllocatedInBytes", js.undefined)
    
    @scala.inline
    def setCacheDirtyPercentage(value: double): Self = this.set("CacheDirtyPercentage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCacheDirtyPercentage: Self = this.set("CacheDirtyPercentage", js.undefined)
    
    @scala.inline
    def setCacheHitPercentage(value: double): Self = this.set("CacheHitPercentage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCacheHitPercentage: Self = this.set("CacheHitPercentage", js.undefined)
    
    @scala.inline
    def setCacheMissPercentage(value: double): Self = this.set("CacheMissPercentage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCacheMissPercentage: Self = this.set("CacheMissPercentage", js.undefined)
    
    @scala.inline
    def setCacheUsedPercentage(value: double): Self = this.set("CacheUsedPercentage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCacheUsedPercentage: Self = this.set("CacheUsedPercentage", js.undefined)
    
    @scala.inline
    def setDiskIdsVarargs(value: DiskId*): Self = this.set("DiskIds", js.Array(value :_*))
    
    @scala.inline
    def setDiskIds(value: DiskIds): Self = this.set("DiskIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDiskIds: Self = this.set("DiskIds", js.undefined)
    
    @scala.inline
    def setGatewayARN(value: GatewayARN): Self = this.set("GatewayARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGatewayARN: Self = this.set("GatewayARN", js.undefined)
  }
}
