package typings.awsSdk.fsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateFileSystemLustreConfiguration extends StObject {
  
  /**
    *  (Optional) When you create your file system, your existing S3 objects appear as file and directory listings. Use this property to choose how Amazon FSx keeps your file and directory listing up to date as you add or modify objects in your linked S3 bucket. AutoImportPolicy can have the following values:    NONE - (Default) AutoImport is off. Amazon FSx only updates file and directory listings from the linked S3 bucket when the file system is created. FSx does not update the file and directory listing for any new or changed objects after choosing this option.    NEW - AutoImport is on. Amazon FSx automatically imports directory listings of any new objects added to the linked S3 bucket that do not currently exist in the FSx file system.     NEW_CHANGED - AutoImport is on. Amazon FSx automatically imports file and directory listings of any new objects added to the S3 bucket and any existing objects that are changed in the S3 bucket after you choose this option.    NEW_CHANGED_DELETED - AutoImport is on. Amazon FSx automatically imports file and directory listings of any new objects added to the S3 bucket, any existing objects that are changed in the S3 bucket, and any objects that were deleted in the S3 bucket.   The AutoImportPolicy parameter is not supported for Lustre file systems with the Persistent_2 deployment type. Instead, use to update a data repository association on your Persistent_2 file system.
    */
  var AutoImportPolicy: js.UndefOr[AutoImportPolicyType] = js.undefined
  
  var AutomaticBackupRetentionDays: js.UndefOr[typings.awsSdk.fsxMod.AutomaticBackupRetentionDays] = js.undefined
  
  var DailyAutomaticBackupStartTime: js.UndefOr[DailyTime] = js.undefined
  
  /**
    * Sets the data compression configuration for the file system. DataCompressionType can have the following values:    NONE - Data compression is turned off for the file system.    LZ4 - Data compression is turned on with the LZ4 algorithm.   If you don't use DataCompressionType, the file system retains its current data compression configuration. For more information, see Lustre data compression.
    */
  var DataCompressionType: js.UndefOr[typings.awsSdk.fsxMod.DataCompressionType] = js.undefined
  
  /**
    * The Lustre logging configuration used when updating an Amazon FSx for Lustre file system. When logging is enabled, Lustre logs error and warning events for data repositories associated with your file system to Amazon CloudWatch Logs.
    */
  var LogConfiguration: js.UndefOr[LustreLogCreateConfiguration] = js.undefined
  
  /**
    * The Lustre root squash configuration used when updating an Amazon FSx for Lustre file system. When enabled, root squash restricts root-level access from clients that try to access your file system as a root user.
    */
  var RootSquashConfiguration: js.UndefOr[LustreRootSquashConfiguration] = js.undefined
  
  /**
    * (Optional) The preferred start time to perform weekly maintenance, formatted d:HH:MM in the UTC time zone. d is the weekday number, from 1 through 7, beginning with Monday and ending with Sunday.
    */
  var WeeklyMaintenanceStartTime: js.UndefOr[WeeklyTime] = js.undefined
}
object UpdateFileSystemLustreConfiguration {
  
  inline def apply(): UpdateFileSystemLustreConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateFileSystemLustreConfiguration]
  }
  
  extension [Self <: UpdateFileSystemLustreConfiguration](x: Self) {
    
    inline def setAutoImportPolicy(value: AutoImportPolicyType): Self = StObject.set(x, "AutoImportPolicy", value.asInstanceOf[js.Any])
    
    inline def setAutoImportPolicyUndefined: Self = StObject.set(x, "AutoImportPolicy", js.undefined)
    
    inline def setAutomaticBackupRetentionDays(value: AutomaticBackupRetentionDays): Self = StObject.set(x, "AutomaticBackupRetentionDays", value.asInstanceOf[js.Any])
    
    inline def setAutomaticBackupRetentionDaysUndefined: Self = StObject.set(x, "AutomaticBackupRetentionDays", js.undefined)
    
    inline def setDailyAutomaticBackupStartTime(value: DailyTime): Self = StObject.set(x, "DailyAutomaticBackupStartTime", value.asInstanceOf[js.Any])
    
    inline def setDailyAutomaticBackupStartTimeUndefined: Self = StObject.set(x, "DailyAutomaticBackupStartTime", js.undefined)
    
    inline def setDataCompressionType(value: DataCompressionType): Self = StObject.set(x, "DataCompressionType", value.asInstanceOf[js.Any])
    
    inline def setDataCompressionTypeUndefined: Self = StObject.set(x, "DataCompressionType", js.undefined)
    
    inline def setLogConfiguration(value: LustreLogCreateConfiguration): Self = StObject.set(x, "LogConfiguration", value.asInstanceOf[js.Any])
    
    inline def setLogConfigurationUndefined: Self = StObject.set(x, "LogConfiguration", js.undefined)
    
    inline def setRootSquashConfiguration(value: LustreRootSquashConfiguration): Self = StObject.set(x, "RootSquashConfiguration", value.asInstanceOf[js.Any])
    
    inline def setRootSquashConfigurationUndefined: Self = StObject.set(x, "RootSquashConfiguration", js.undefined)
    
    inline def setWeeklyMaintenanceStartTime(value: WeeklyTime): Self = StObject.set(x, "WeeklyMaintenanceStartTime", value.asInstanceOf[js.Any])
    
    inline def setWeeklyMaintenanceStartTimeUndefined: Self = StObject.set(x, "WeeklyMaintenanceStartTime", js.undefined)
  }
}
