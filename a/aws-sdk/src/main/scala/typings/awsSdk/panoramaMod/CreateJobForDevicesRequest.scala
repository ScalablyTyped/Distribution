package typings.awsSdk.panoramaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateJobForDevicesRequest extends StObject {
  
  /**
    * IDs of target devices.
    */
  var DeviceIds: DeviceIdList
  
  /**
    * Configuration settings for the job.
    */
  var DeviceJobConfig: typings.awsSdk.panoramaMod.DeviceJobConfig
  
  /**
    * The type of job to run.
    */
  var JobType: typings.awsSdk.panoramaMod.JobType
}
object CreateJobForDevicesRequest {
  
  inline def apply(DeviceIds: DeviceIdList, DeviceJobConfig: DeviceJobConfig, JobType: JobType): CreateJobForDevicesRequest = {
    val __obj = js.Dynamic.literal(DeviceIds = DeviceIds.asInstanceOf[js.Any], DeviceJobConfig = DeviceJobConfig.asInstanceOf[js.Any], JobType = JobType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateJobForDevicesRequest]
  }
  
  extension [Self <: CreateJobForDevicesRequest](x: Self) {
    
    inline def setDeviceIds(value: DeviceIdList): Self = StObject.set(x, "DeviceIds", value.asInstanceOf[js.Any])
    
    inline def setDeviceIdsVarargs(value: DeviceId*): Self = StObject.set(x, "DeviceIds", js.Array(value*))
    
    inline def setDeviceJobConfig(value: DeviceJobConfig): Self = StObject.set(x, "DeviceJobConfig", value.asInstanceOf[js.Any])
    
    inline def setJobType(value: JobType): Self = StObject.set(x, "JobType", value.asInstanceOf[js.Any])
  }
}
