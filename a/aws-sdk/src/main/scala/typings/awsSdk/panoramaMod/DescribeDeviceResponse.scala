package typings.awsSdk.panoramaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDeviceResponse extends StObject {
  
  /**
    * Beta software releases available for the device.
    */
  var AlternateSoftwares: js.UndefOr[typings.awsSdk.panoramaMod.AlternateSoftwares] = js.undefined
  
  /**
    * The device's ARN.
    */
  var Arn: js.UndefOr[DeviceArn] = js.undefined
  
  /**
    * The device's maker.
    */
  var Brand: js.UndefOr[DeviceBrand] = js.undefined
  
  /**
    * When the device was created.
    */
  var CreatedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The device's networking status.
    */
  var CurrentNetworkingStatus: js.UndefOr[NetworkStatus] = js.undefined
  
  /**
    * The device's current software version.
    */
  var CurrentSoftware: js.UndefOr[typings.awsSdk.panoramaMod.CurrentSoftware] = js.undefined
  
  /**
    * The device's description.
    */
  var Description: js.UndefOr[typings.awsSdk.panoramaMod.Description] = js.undefined
  
  /**
    * A device's aggregated status. Including the device's connection status, provisioning status, and lease status.
    */
  var DeviceAggregatedStatus: js.UndefOr[typings.awsSdk.panoramaMod.DeviceAggregatedStatus] = js.undefined
  
  /**
    * The device's connection status.
    */
  var DeviceConnectionStatus: js.UndefOr[typings.awsSdk.panoramaMod.DeviceConnectionStatus] = js.undefined
  
  /**
    * The device's ID.
    */
  var DeviceId: js.UndefOr[typings.awsSdk.panoramaMod.DeviceId] = js.undefined
  
  /**
    * The most recent beta software release.
    */
  var LatestAlternateSoftware: js.UndefOr[typings.awsSdk.panoramaMod.LatestAlternateSoftware] = js.undefined
  
  /**
    * A device's latest job. Includes the target image version, and the job status.
    */
  var LatestDeviceJob: js.UndefOr[typings.awsSdk.panoramaMod.LatestDeviceJob] = js.undefined
  
  /**
    * The latest software version available for the device.
    */
  var LatestSoftware: js.UndefOr[typings.awsSdk.panoramaMod.LatestSoftware] = js.undefined
  
  /**
    * The device's lease expiration time.
    */
  var LeaseExpirationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The device's name.
    */
  var Name: js.UndefOr[DeviceName] = js.undefined
  
  /**
    * The device's networking configuration.
    */
  var NetworkingConfiguration: js.UndefOr[NetworkPayload] = js.undefined
  
  /**
    * The device's provisioning status.
    */
  var ProvisioningStatus: js.UndefOr[DeviceStatus] = js.undefined
  
  /**
    * The device's serial number.
    */
  var SerialNumber: js.UndefOr[DeviceSerialNumber] = js.undefined
  
  /**
    * The device's tags.
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
  
  /**
    * The device's type.
    */
  var Type: js.UndefOr[DeviceType] = js.undefined
}
object DescribeDeviceResponse {
  
  inline def apply(): DescribeDeviceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDeviceResponse]
  }
  
  extension [Self <: DescribeDeviceResponse](x: Self) {
    
    inline def setAlternateSoftwares(value: AlternateSoftwares): Self = StObject.set(x, "AlternateSoftwares", value.asInstanceOf[js.Any])
    
    inline def setAlternateSoftwaresUndefined: Self = StObject.set(x, "AlternateSoftwares", js.undefined)
    
    inline def setAlternateSoftwaresVarargs(value: AlternateSoftwareMetadata*): Self = StObject.set(x, "AlternateSoftwares", js.Array(value*))
    
    inline def setArn(value: DeviceArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setBrand(value: DeviceBrand): Self = StObject.set(x, "Brand", value.asInstanceOf[js.Any])
    
    inline def setBrandUndefined: Self = StObject.set(x, "Brand", js.undefined)
    
    inline def setCreatedTime(value: js.Date): Self = StObject.set(x, "CreatedTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedTimeUndefined: Self = StObject.set(x, "CreatedTime", js.undefined)
    
    inline def setCurrentNetworkingStatus(value: NetworkStatus): Self = StObject.set(x, "CurrentNetworkingStatus", value.asInstanceOf[js.Any])
    
    inline def setCurrentNetworkingStatusUndefined: Self = StObject.set(x, "CurrentNetworkingStatus", js.undefined)
    
    inline def setCurrentSoftware(value: CurrentSoftware): Self = StObject.set(x, "CurrentSoftware", value.asInstanceOf[js.Any])
    
    inline def setCurrentSoftwareUndefined: Self = StObject.set(x, "CurrentSoftware", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setDeviceAggregatedStatus(value: DeviceAggregatedStatus): Self = StObject.set(x, "DeviceAggregatedStatus", value.asInstanceOf[js.Any])
    
    inline def setDeviceAggregatedStatusUndefined: Self = StObject.set(x, "DeviceAggregatedStatus", js.undefined)
    
    inline def setDeviceConnectionStatus(value: DeviceConnectionStatus): Self = StObject.set(x, "DeviceConnectionStatus", value.asInstanceOf[js.Any])
    
    inline def setDeviceConnectionStatusUndefined: Self = StObject.set(x, "DeviceConnectionStatus", js.undefined)
    
    inline def setDeviceId(value: DeviceId): Self = StObject.set(x, "DeviceId", value.asInstanceOf[js.Any])
    
    inline def setDeviceIdUndefined: Self = StObject.set(x, "DeviceId", js.undefined)
    
    inline def setLatestAlternateSoftware(value: LatestAlternateSoftware): Self = StObject.set(x, "LatestAlternateSoftware", value.asInstanceOf[js.Any])
    
    inline def setLatestAlternateSoftwareUndefined: Self = StObject.set(x, "LatestAlternateSoftware", js.undefined)
    
    inline def setLatestDeviceJob(value: LatestDeviceJob): Self = StObject.set(x, "LatestDeviceJob", value.asInstanceOf[js.Any])
    
    inline def setLatestDeviceJobUndefined: Self = StObject.set(x, "LatestDeviceJob", js.undefined)
    
    inline def setLatestSoftware(value: LatestSoftware): Self = StObject.set(x, "LatestSoftware", value.asInstanceOf[js.Any])
    
    inline def setLatestSoftwareUndefined: Self = StObject.set(x, "LatestSoftware", js.undefined)
    
    inline def setLeaseExpirationTime(value: js.Date): Self = StObject.set(x, "LeaseExpirationTime", value.asInstanceOf[js.Any])
    
    inline def setLeaseExpirationTimeUndefined: Self = StObject.set(x, "LeaseExpirationTime", js.undefined)
    
    inline def setName(value: DeviceName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setNetworkingConfiguration(value: NetworkPayload): Self = StObject.set(x, "NetworkingConfiguration", value.asInstanceOf[js.Any])
    
    inline def setNetworkingConfigurationUndefined: Self = StObject.set(x, "NetworkingConfiguration", js.undefined)
    
    inline def setProvisioningStatus(value: DeviceStatus): Self = StObject.set(x, "ProvisioningStatus", value.asInstanceOf[js.Any])
    
    inline def setProvisioningStatusUndefined: Self = StObject.set(x, "ProvisioningStatus", js.undefined)
    
    inline def setSerialNumber(value: DeviceSerialNumber): Self = StObject.set(x, "SerialNumber", value.asInstanceOf[js.Any])
    
    inline def setSerialNumberUndefined: Self = StObject.set(x, "SerialNumber", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setType(value: DeviceType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
