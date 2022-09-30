package typings.awsSdk.fsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileCacheLustreConfiguration extends StObject {
  
  /**
    * The deployment type of the Amazon File Cache resource, which must be CACHE_1.
    */
  var DeploymentType: js.UndefOr[FileCacheLustreDeploymentType] = js.undefined
  
  /**
    * The configuration for Lustre logging used to write the enabled logging events for your Amazon File Cache resource to Amazon CloudWatch Logs.
    */
  var LogConfiguration: js.UndefOr[LustreLogConfiguration] = js.undefined
  
  /**
    * The configuration for a Lustre MDT (Metadata Target) storage volume.
    */
  var MetadataConfiguration: js.UndefOr[FileCacheLustreMetadataConfiguration] = js.undefined
  
  /**
    * You use the MountName value when mounting the cache. If you pass a cache ID to the DescribeFileCaches operation, it returns the the MountName value as part of the cache's description.
    */
  var MountName: js.UndefOr[LustreFileSystemMountName] = js.undefined
  
  /**
    * Per unit storage throughput represents the megabytes per second of read or write throughput per 1 tebibyte of storage provisioned. Cache throughput capacity is equal to Storage capacity (TiB) * PerUnitStorageThroughput (MB/s/TiB). The only supported value is 1000.
    */
  var PerUnitStorageThroughput: js.UndefOr[typings.awsSdk.fsxMod.PerUnitStorageThroughput] = js.undefined
  
  var WeeklyMaintenanceStartTime: js.UndefOr[WeeklyTime] = js.undefined
}
object FileCacheLustreConfiguration {
  
  inline def apply(): FileCacheLustreConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileCacheLustreConfiguration]
  }
  
  extension [Self <: FileCacheLustreConfiguration](x: Self) {
    
    inline def setDeploymentType(value: FileCacheLustreDeploymentType): Self = StObject.set(x, "DeploymentType", value.asInstanceOf[js.Any])
    
    inline def setDeploymentTypeUndefined: Self = StObject.set(x, "DeploymentType", js.undefined)
    
    inline def setLogConfiguration(value: LustreLogConfiguration): Self = StObject.set(x, "LogConfiguration", value.asInstanceOf[js.Any])
    
    inline def setLogConfigurationUndefined: Self = StObject.set(x, "LogConfiguration", js.undefined)
    
    inline def setMetadataConfiguration(value: FileCacheLustreMetadataConfiguration): Self = StObject.set(x, "MetadataConfiguration", value.asInstanceOf[js.Any])
    
    inline def setMetadataConfigurationUndefined: Self = StObject.set(x, "MetadataConfiguration", js.undefined)
    
    inline def setMountName(value: LustreFileSystemMountName): Self = StObject.set(x, "MountName", value.asInstanceOf[js.Any])
    
    inline def setMountNameUndefined: Self = StObject.set(x, "MountName", js.undefined)
    
    inline def setPerUnitStorageThroughput(value: PerUnitStorageThroughput): Self = StObject.set(x, "PerUnitStorageThroughput", value.asInstanceOf[js.Any])
    
    inline def setPerUnitStorageThroughputUndefined: Self = StObject.set(x, "PerUnitStorageThroughput", js.undefined)
    
    inline def setWeeklyMaintenanceStartTime(value: WeeklyTime): Self = StObject.set(x, "WeeklyMaintenanceStartTime", value.asInstanceOf[js.Any])
    
    inline def setWeeklyMaintenanceStartTimeUndefined: Self = StObject.set(x, "WeeklyMaintenanceStartTime", js.undefined)
  }
}
