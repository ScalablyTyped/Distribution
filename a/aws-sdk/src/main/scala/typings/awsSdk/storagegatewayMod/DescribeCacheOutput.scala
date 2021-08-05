package typings.awsSdk.storagegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeCacheOutput extends StObject {
  
  /**
    * The amount of cache in bytes allocated to a gateway.
    */
  var CacheAllocatedInBytes: js.UndefOr[long] = js.undefined
  
  /**
    * The file share's contribution to the overall percentage of the gateway's cache that has not been persisted to AWS. The sample is taken at the end of the reporting period.
    */
  var CacheDirtyPercentage: js.UndefOr[double] = js.undefined
  
  /**
    * Percent of application read operations from the file shares that are served from cache. The sample is taken at the end of the reporting period.
    */
  var CacheHitPercentage: js.UndefOr[double] = js.undefined
  
  /**
    * Percent of application read operations from the file shares that are not served from cache. The sample is taken at the end of the reporting period.
    */
  var CacheMissPercentage: js.UndefOr[double] = js.undefined
  
  /**
    * Percent use of the gateway's cache storage. This metric applies only to the gateway-cached volume setup. The sample is taken at the end of the reporting period.
    */
  var CacheUsedPercentage: js.UndefOr[double] = js.undefined
  
  /**
    * An array of strings that identify disks that are to be configured as working storage. Each string has a minimum length of 1 and maximum length of 300. You can get the disk IDs from the ListLocalDisks API.
    */
  var DiskIds: js.UndefOr[typings.awsSdk.storagegatewayMod.DiskIds] = js.undefined
  
  var GatewayARN: js.UndefOr[typings.awsSdk.storagegatewayMod.GatewayARN] = js.undefined
}
object DescribeCacheOutput {
  
  inline def apply(): DescribeCacheOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeCacheOutput]
  }
  
  extension [Self <: DescribeCacheOutput](x: Self) {
    
    inline def setCacheAllocatedInBytes(value: long): Self = StObject.set(x, "CacheAllocatedInBytes", value.asInstanceOf[js.Any])
    
    inline def setCacheAllocatedInBytesUndefined: Self = StObject.set(x, "CacheAllocatedInBytes", js.undefined)
    
    inline def setCacheDirtyPercentage(value: double): Self = StObject.set(x, "CacheDirtyPercentage", value.asInstanceOf[js.Any])
    
    inline def setCacheDirtyPercentageUndefined: Self = StObject.set(x, "CacheDirtyPercentage", js.undefined)
    
    inline def setCacheHitPercentage(value: double): Self = StObject.set(x, "CacheHitPercentage", value.asInstanceOf[js.Any])
    
    inline def setCacheHitPercentageUndefined: Self = StObject.set(x, "CacheHitPercentage", js.undefined)
    
    inline def setCacheMissPercentage(value: double): Self = StObject.set(x, "CacheMissPercentage", value.asInstanceOf[js.Any])
    
    inline def setCacheMissPercentageUndefined: Self = StObject.set(x, "CacheMissPercentage", js.undefined)
    
    inline def setCacheUsedPercentage(value: double): Self = StObject.set(x, "CacheUsedPercentage", value.asInstanceOf[js.Any])
    
    inline def setCacheUsedPercentageUndefined: Self = StObject.set(x, "CacheUsedPercentage", js.undefined)
    
    inline def setDiskIds(value: DiskIds): Self = StObject.set(x, "DiskIds", value.asInstanceOf[js.Any])
    
    inline def setDiskIdsUndefined: Self = StObject.set(x, "DiskIds", js.undefined)
    
    inline def setDiskIdsVarargs(value: DiskId*): Self = StObject.set(x, "DiskIds", js.Array(value :_*))
    
    inline def setGatewayARN(value: GatewayARN): Self = StObject.set(x, "GatewayARN", value.asInstanceOf[js.Any])
    
    inline def setGatewayARNUndefined: Self = StObject.set(x, "GatewayARN", js.undefined)
  }
}
