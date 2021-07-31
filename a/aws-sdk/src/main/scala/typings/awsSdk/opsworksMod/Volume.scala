package typings.awsSdk.opsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Volume extends StObject {
  
  /**
    * The volume Availability Zone. For more information, see Regions and Endpoints.
    */
  var AvailabilityZone: js.UndefOr[String] = js.undefined
  
  /**
    * The device name.
    */
  var Device: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon EC2 volume ID.
    */
  var Ec2VolumeId: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies whether an Amazon EBS volume is encrypted. For more information, see Amazon EBS Encryption.
    */
  var Encrypted: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The instance ID.
    */
  var InstanceId: js.UndefOr[String] = js.undefined
  
  /**
    * For PIOPS volumes, the IOPS per disk.
    */
  var Iops: js.UndefOr[Integer] = js.undefined
  
  /**
    * The volume mount point. For example, "/mnt/disk1".
    */
  var MountPoint: js.UndefOr[String] = js.undefined
  
  /**
    * The volume name.
    */
  var Name: js.UndefOr[String] = js.undefined
  
  /**
    * The RAID array ID.
    */
  var RaidArrayId: js.UndefOr[String] = js.undefined
  
  /**
    * The AWS region. For more information about AWS regions, see Regions and Endpoints.
    */
  var Region: js.UndefOr[String] = js.undefined
  
  /**
    * The volume size.
    */
  var Size: js.UndefOr[Integer] = js.undefined
  
  /**
    * The value returned by DescribeVolumes.
    */
  var Status: js.UndefOr[String] = js.undefined
  
  /**
    * The volume ID.
    */
  var VolumeId: js.UndefOr[String] = js.undefined
  
  /**
    * The volume type. For more information, see  Amazon EBS Volume Types.    standard - Magnetic. Magnetic volumes must have a minimum size of 1 GiB and a maximum size of 1024 GiB.    io1 - Provisioned IOPS (SSD). PIOPS volumes must have a minimum size of 4 GiB and a maximum size of 16384 GiB.    gp2 - General Purpose (SSD). General purpose volumes must have a minimum size of 1 GiB and a maximum size of 16384 GiB.    st1 - Throughput Optimized hard disk drive (HDD). Throughput optimized HDD volumes must have a minimum size of 500 GiB and a maximum size of 16384 GiB.    sc1 - Cold HDD. Cold HDD volumes must have a minimum size of 500 GiB and a maximum size of 16384 GiB.  
    */
  var VolumeType: js.UndefOr[String] = js.undefined
}
object Volume {
  
  @scala.inline
  def apply(): Volume = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Volume]
  }
  
  @scala.inline
  implicit class VolumeMutableBuilder[Self <: Volume] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvailabilityZone(value: String): Self = StObject.set(x, "AvailabilityZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailabilityZoneUndefined: Self = StObject.set(x, "AvailabilityZone", js.undefined)
    
    @scala.inline
    def setDevice(value: String): Self = StObject.set(x, "Device", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceUndefined: Self = StObject.set(x, "Device", js.undefined)
    
    @scala.inline
    def setEc2VolumeId(value: String): Self = StObject.set(x, "Ec2VolumeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEc2VolumeIdUndefined: Self = StObject.set(x, "Ec2VolumeId", js.undefined)
    
    @scala.inline
    def setEncrypted(value: Boolean): Self = StObject.set(x, "Encrypted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptedUndefined: Self = StObject.set(x, "Encrypted", js.undefined)
    
    @scala.inline
    def setInstanceId(value: String): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceIdUndefined: Self = StObject.set(x, "InstanceId", js.undefined)
    
    @scala.inline
    def setIops(value: Integer): Self = StObject.set(x, "Iops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIopsUndefined: Self = StObject.set(x, "Iops", js.undefined)
    
    @scala.inline
    def setMountPoint(value: String): Self = StObject.set(x, "MountPoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMountPointUndefined: Self = StObject.set(x, "MountPoint", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setRaidArrayId(value: String): Self = StObject.set(x, "RaidArrayId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRaidArrayIdUndefined: Self = StObject.set(x, "RaidArrayId", js.undefined)
    
    @scala.inline
    def setRegion(value: String): Self = StObject.set(x, "Region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionUndefined: Self = StObject.set(x, "Region", js.undefined)
    
    @scala.inline
    def setSize(value: Integer): Self = StObject.set(x, "Size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "Size", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setVolumeId(value: String): Self = StObject.set(x, "VolumeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeIdUndefined: Self = StObject.set(x, "VolumeId", js.undefined)
    
    @scala.inline
    def setVolumeType(value: String): Self = StObject.set(x, "VolumeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeTypeUndefined: Self = StObject.set(x, "VolumeType", js.undefined)
  }
}
