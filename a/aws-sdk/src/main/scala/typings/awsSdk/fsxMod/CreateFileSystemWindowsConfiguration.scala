package typings.awsSdk.fsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateFileSystemWindowsConfiguration extends StObject {
  
  /**
    * The ID for an existing AWS Managed Microsoft Active Directory (AD) instance that the file system should join when it's created.
    */
  var ActiveDirectoryId: js.UndefOr[DirectoryId] = js.undefined
  
  /**
    * An array of one or more DNS alias names that you want to associate with the Amazon FSx file system. Aliases allow you to use existing DNS names to access the data in your Amazon FSx file system. You can associate up to 50 aliases with a file system at any time. You can associate additional DNS aliases after you create the file system using the AssociateFileSystemAliases operation. You can remove DNS aliases from the file system after it is created using the DisassociateFileSystemAliases operation. You only need to specify the alias name in the request payload. For more information, see Working with DNS Aliases and Walkthrough 5: Using DNS aliases to access your file system, including additional steps you must take to be able to access your file system using a DNS alias. An alias name has to meet the following requirements:   Formatted as a fully-qualified domain name (FQDN), hostname.domain, for example, accounting.example.com.   Can contain alphanumeric characters and the hyphen (-).   Cannot start or end with a hyphen.   Can start with a numeric.   For DNS alias names, Amazon FSx stores alphabetic characters as lowercase letters (a-z), regardless of how you specify them: as uppercase letters, lowercase letters, or the corresponding letters in escape codes.
    */
  var Aliases: js.UndefOr[AlternateDNSNames] = js.undefined
  
  /**
    * The number of days to retain automatic backups. The default is to retain backups for 7 days. Setting this value to 0 disables the creation of automatic backups. The maximum retention period for backups is 90 days.
    */
  var AutomaticBackupRetentionDays: js.UndefOr[typings.awsSdk.fsxMod.AutomaticBackupRetentionDays] = js.undefined
  
  /**
    * A boolean flag indicating whether tags for the file system should be copied to backups. This value defaults to false. If it's set to true, all tags for the file system are copied to all automatic and user-initiated backups where the user doesn't specify tags. If this value is true, and you specify one or more tags, only the specified tags are copied to backups. If you specify one or more tags when creating a user-initiated backup, no tags are copied from the file system, regardless of this value.
    */
  var CopyTagsToBackups: js.UndefOr[Flag] = js.undefined
  
  /**
    * The preferred time to take daily automatic backups, formatted HH:MM in the UTC time zone.
    */
  var DailyAutomaticBackupStartTime: js.UndefOr[DailyTime] = js.undefined
  
  /**
    * Specifies the file system deployment type, valid values are the following:    MULTI_AZ_1 - Deploys a high availability file system that is configured for Multi-AZ redundancy to tolerate temporary Availability Zone (AZ) unavailability. You can only deploy a Multi-AZ file system in AWS Regions that have a minimum of three Availability Zones. Also supports HDD storage type    SINGLE_AZ_1 - (Default) Choose to deploy a file system that is configured for single AZ redundancy.    SINGLE_AZ_2 - The latest generation Single AZ file system. Specifies a file system that is configured for single AZ redundancy and supports HDD storage type.   For more information, see  Availability and Durability: Single-AZ and Multi-AZ File Systems.
    */
  var DeploymentType: js.UndefOr[WindowsDeploymentType] = js.undefined
  
  /**
    * Required when DeploymentType is set to MULTI_AZ_1. This specifies the subnet in which you want the preferred file server to be located. For in-AWS applications, we recommend that you launch your clients in the same Availability Zone (AZ) as your preferred file server to reduce cross-AZ data transfer costs and minimize latency. 
    */
  var PreferredSubnetId: js.UndefOr[SubnetId] = js.undefined
  
  var SelfManagedActiveDirectoryConfiguration: js.UndefOr[typings.awsSdk.fsxMod.SelfManagedActiveDirectoryConfiguration] = js.undefined
  
  /**
    * The throughput of an Amazon FSx file system, measured in megabytes per second, in 2 to the nth increments, between 2^3 (8) and 2^11 (2048).
    */
  var ThroughputCapacity: MegabytesPerSecond
  
  /**
    * The preferred start time to perform weekly maintenance, formatted d:HH:MM in the UTC time zone, where d is the weekday number, from 1 through 7, beginning with Monday and ending with Sunday.
    */
  var WeeklyMaintenanceStartTime: js.UndefOr[WeeklyTime] = js.undefined
}
object CreateFileSystemWindowsConfiguration {
  
  inline def apply(ThroughputCapacity: MegabytesPerSecond): CreateFileSystemWindowsConfiguration = {
    val __obj = js.Dynamic.literal(ThroughputCapacity = ThroughputCapacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFileSystemWindowsConfiguration]
  }
  
  extension [Self <: CreateFileSystemWindowsConfiguration](x: Self) {
    
    inline def setActiveDirectoryId(value: DirectoryId): Self = StObject.set(x, "ActiveDirectoryId", value.asInstanceOf[js.Any])
    
    inline def setActiveDirectoryIdUndefined: Self = StObject.set(x, "ActiveDirectoryId", js.undefined)
    
    inline def setAliases(value: AlternateDNSNames): Self = StObject.set(x, "Aliases", value.asInstanceOf[js.Any])
    
    inline def setAliasesUndefined: Self = StObject.set(x, "Aliases", js.undefined)
    
    inline def setAliasesVarargs(value: AlternateDNSName*): Self = StObject.set(x, "Aliases", js.Array(value :_*))
    
    inline def setAutomaticBackupRetentionDays(value: AutomaticBackupRetentionDays): Self = StObject.set(x, "AutomaticBackupRetentionDays", value.asInstanceOf[js.Any])
    
    inline def setAutomaticBackupRetentionDaysUndefined: Self = StObject.set(x, "AutomaticBackupRetentionDays", js.undefined)
    
    inline def setCopyTagsToBackups(value: Flag): Self = StObject.set(x, "CopyTagsToBackups", value.asInstanceOf[js.Any])
    
    inline def setCopyTagsToBackupsUndefined: Self = StObject.set(x, "CopyTagsToBackups", js.undefined)
    
    inline def setDailyAutomaticBackupStartTime(value: DailyTime): Self = StObject.set(x, "DailyAutomaticBackupStartTime", value.asInstanceOf[js.Any])
    
    inline def setDailyAutomaticBackupStartTimeUndefined: Self = StObject.set(x, "DailyAutomaticBackupStartTime", js.undefined)
    
    inline def setDeploymentType(value: WindowsDeploymentType): Self = StObject.set(x, "DeploymentType", value.asInstanceOf[js.Any])
    
    inline def setDeploymentTypeUndefined: Self = StObject.set(x, "DeploymentType", js.undefined)
    
    inline def setPreferredSubnetId(value: SubnetId): Self = StObject.set(x, "PreferredSubnetId", value.asInstanceOf[js.Any])
    
    inline def setPreferredSubnetIdUndefined: Self = StObject.set(x, "PreferredSubnetId", js.undefined)
    
    inline def setSelfManagedActiveDirectoryConfiguration(value: SelfManagedActiveDirectoryConfiguration): Self = StObject.set(x, "SelfManagedActiveDirectoryConfiguration", value.asInstanceOf[js.Any])
    
    inline def setSelfManagedActiveDirectoryConfigurationUndefined: Self = StObject.set(x, "SelfManagedActiveDirectoryConfiguration", js.undefined)
    
    inline def setThroughputCapacity(value: MegabytesPerSecond): Self = StObject.set(x, "ThroughputCapacity", value.asInstanceOf[js.Any])
    
    inline def setWeeklyMaintenanceStartTime(value: WeeklyTime): Self = StObject.set(x, "WeeklyMaintenanceStartTime", value.asInstanceOf[js.Any])
    
    inline def setWeeklyMaintenanceStartTimeUndefined: Self = StObject.set(x, "WeeklyMaintenanceStartTime", js.undefined)
  }
}
