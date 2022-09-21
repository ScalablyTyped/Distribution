package typings.awsSdk.panoramaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDeviceJobResponse extends StObject {
  
  /**
    * When the job was created.
    */
  var CreatedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The device's ARN.
    */
  var DeviceArn: js.UndefOr[typings.awsSdk.panoramaMod.DeviceArn] = js.undefined
  
  /**
    * The device's ID.
    */
  var DeviceId: js.UndefOr[typings.awsSdk.panoramaMod.DeviceId] = js.undefined
  
  /**
    * The device's name.
    */
  var DeviceName: js.UndefOr[typings.awsSdk.panoramaMod.DeviceName] = js.undefined
  
  /**
    * The device's type.
    */
  var DeviceType: js.UndefOr[typings.awsSdk.panoramaMod.DeviceType] = js.undefined
  
  /**
    * For an OTA job, the target version of the device software.
    */
  var ImageVersion: js.UndefOr[typings.awsSdk.panoramaMod.ImageVersion] = js.undefined
  
  /**
    * The job's ID.
    */
  var JobId: js.UndefOr[typings.awsSdk.panoramaMod.JobId] = js.undefined
  
  /**
    * The job's status.
    */
  var Status: js.UndefOr[UpdateProgress] = js.undefined
}
object DescribeDeviceJobResponse {
  
  inline def apply(): DescribeDeviceJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDeviceJobResponse]
  }
  
  extension [Self <: DescribeDeviceJobResponse](x: Self) {
    
    inline def setCreatedTime(value: js.Date): Self = StObject.set(x, "CreatedTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedTimeUndefined: Self = StObject.set(x, "CreatedTime", js.undefined)
    
    inline def setDeviceArn(value: DeviceArn): Self = StObject.set(x, "DeviceArn", value.asInstanceOf[js.Any])
    
    inline def setDeviceArnUndefined: Self = StObject.set(x, "DeviceArn", js.undefined)
    
    inline def setDeviceId(value: DeviceId): Self = StObject.set(x, "DeviceId", value.asInstanceOf[js.Any])
    
    inline def setDeviceIdUndefined: Self = StObject.set(x, "DeviceId", js.undefined)
    
    inline def setDeviceName(value: DeviceName): Self = StObject.set(x, "DeviceName", value.asInstanceOf[js.Any])
    
    inline def setDeviceNameUndefined: Self = StObject.set(x, "DeviceName", js.undefined)
    
    inline def setDeviceType(value: DeviceType): Self = StObject.set(x, "DeviceType", value.asInstanceOf[js.Any])
    
    inline def setDeviceTypeUndefined: Self = StObject.set(x, "DeviceType", js.undefined)
    
    inline def setImageVersion(value: ImageVersion): Self = StObject.set(x, "ImageVersion", value.asInstanceOf[js.Any])
    
    inline def setImageVersionUndefined: Self = StObject.set(x, "ImageVersion", js.undefined)
    
    inline def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
    
    inline def setJobIdUndefined: Self = StObject.set(x, "JobId", js.undefined)
    
    inline def setStatus(value: UpdateProgress): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
