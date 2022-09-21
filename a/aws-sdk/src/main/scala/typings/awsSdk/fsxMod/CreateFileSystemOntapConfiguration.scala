package typings.awsSdk.fsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateFileSystemOntapConfiguration extends StObject {
  
  var AutomaticBackupRetentionDays: js.UndefOr[typings.awsSdk.fsxMod.AutomaticBackupRetentionDays] = js.undefined
  
  var DailyAutomaticBackupStartTime: js.UndefOr[DailyTime] = js.undefined
  
  /**
    * Specifies the FSx for ONTAP file system deployment type to use in creating the file system.     MULTI_AZ_1 - (Default) A high availability file system configured for Multi-AZ redundancy to tolerate temporary Availability Zone (AZ) unavailability.     SINGLE_AZ_1 - A file system configured for Single-AZ redundancy.   For information about the use cases for Multi-AZ and Single-AZ deployments, refer to Choosing a file system deployment type. 
    */
  var DeploymentType: OntapDeploymentType
  
  /**
    * The SSD IOPS configuration for the FSx for ONTAP file system.
    */
  var DiskIopsConfiguration: js.UndefOr[typings.awsSdk.fsxMod.DiskIopsConfiguration] = js.undefined
  
  /**
    * (Multi-AZ only) Specifies the IP address range in which the endpoints to access your file system will be created. By default, Amazon FSx selects an unused IP address range for you from the 198.19.* range.  The Endpoint IP address range you select for your file system must exist outside the VPC's CIDR range and must be at least /30 or larger. 
    */
  var EndpointIpAddressRange: js.UndefOr[IpAddressRange] = js.undefined
  
  /**
    * The ONTAP administrative password for the fsxadmin user with which you administer your file system using the NetApp ONTAP CLI and REST API.
    */
  var FsxAdminPassword: js.UndefOr[AdminPassword] = js.undefined
  
  /**
    * Required when DeploymentType is set to MULTI_AZ_1. This specifies the subnet in which you want the preferred file server to be located.
    */
  var PreferredSubnetId: js.UndefOr[SubnetId] = js.undefined
  
  /**
    * (Multi-AZ only) Specifies the virtual private cloud (VPC) route tables in which your file system's endpoints will be created. You should specify all VPC route tables associated with the subnets in which your clients are located. By default, Amazon FSx selects your VPC's default route table.
    */
  var RouteTableIds: js.UndefOr[typings.awsSdk.fsxMod.RouteTableIds] = js.undefined
  
  /**
    * Sets the throughput capacity for the file system that you're creating. Valid values are 128, 256, 512, 1024, and 2048 MBps.
    */
  var ThroughputCapacity: MegabytesPerSecond
  
  var WeeklyMaintenanceStartTime: js.UndefOr[WeeklyTime] = js.undefined
}
object CreateFileSystemOntapConfiguration {
  
  inline def apply(DeploymentType: OntapDeploymentType, ThroughputCapacity: MegabytesPerSecond): CreateFileSystemOntapConfiguration = {
    val __obj = js.Dynamic.literal(DeploymentType = DeploymentType.asInstanceOf[js.Any], ThroughputCapacity = ThroughputCapacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFileSystemOntapConfiguration]
  }
  
  extension [Self <: CreateFileSystemOntapConfiguration](x: Self) {
    
    inline def setAutomaticBackupRetentionDays(value: AutomaticBackupRetentionDays): Self = StObject.set(x, "AutomaticBackupRetentionDays", value.asInstanceOf[js.Any])
    
    inline def setAutomaticBackupRetentionDaysUndefined: Self = StObject.set(x, "AutomaticBackupRetentionDays", js.undefined)
    
    inline def setDailyAutomaticBackupStartTime(value: DailyTime): Self = StObject.set(x, "DailyAutomaticBackupStartTime", value.asInstanceOf[js.Any])
    
    inline def setDailyAutomaticBackupStartTimeUndefined: Self = StObject.set(x, "DailyAutomaticBackupStartTime", js.undefined)
    
    inline def setDeploymentType(value: OntapDeploymentType): Self = StObject.set(x, "DeploymentType", value.asInstanceOf[js.Any])
    
    inline def setDiskIopsConfiguration(value: DiskIopsConfiguration): Self = StObject.set(x, "DiskIopsConfiguration", value.asInstanceOf[js.Any])
    
    inline def setDiskIopsConfigurationUndefined: Self = StObject.set(x, "DiskIopsConfiguration", js.undefined)
    
    inline def setEndpointIpAddressRange(value: IpAddressRange): Self = StObject.set(x, "EndpointIpAddressRange", value.asInstanceOf[js.Any])
    
    inline def setEndpointIpAddressRangeUndefined: Self = StObject.set(x, "EndpointIpAddressRange", js.undefined)
    
    inline def setFsxAdminPassword(value: AdminPassword): Self = StObject.set(x, "FsxAdminPassword", value.asInstanceOf[js.Any])
    
    inline def setFsxAdminPasswordUndefined: Self = StObject.set(x, "FsxAdminPassword", js.undefined)
    
    inline def setPreferredSubnetId(value: SubnetId): Self = StObject.set(x, "PreferredSubnetId", value.asInstanceOf[js.Any])
    
    inline def setPreferredSubnetIdUndefined: Self = StObject.set(x, "PreferredSubnetId", js.undefined)
    
    inline def setRouteTableIds(value: RouteTableIds): Self = StObject.set(x, "RouteTableIds", value.asInstanceOf[js.Any])
    
    inline def setRouteTableIdsUndefined: Self = StObject.set(x, "RouteTableIds", js.undefined)
    
    inline def setRouteTableIdsVarargs(value: RouteTableId*): Self = StObject.set(x, "RouteTableIds", js.Array(value*))
    
    inline def setThroughputCapacity(value: MegabytesPerSecond): Self = StObject.set(x, "ThroughputCapacity", value.asInstanceOf[js.Any])
    
    inline def setWeeklyMaintenanceStartTime(value: WeeklyTime): Self = StObject.set(x, "WeeklyMaintenanceStartTime", value.asInstanceOf[js.Any])
    
    inline def setWeeklyMaintenanceStartTimeUndefined: Self = StObject.set(x, "WeeklyMaintenanceStartTime", js.undefined)
  }
}
