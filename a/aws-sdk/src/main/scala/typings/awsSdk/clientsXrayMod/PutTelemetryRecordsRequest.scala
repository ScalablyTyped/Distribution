package typings.awsSdk.clientsXrayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutTelemetryRecordsRequest extends StObject {
  
  /**
    * 
    */
  var EC2InstanceId: js.UndefOr[typings.awsSdk.clientsXrayMod.EC2InstanceId] = js.undefined
  
  /**
    * 
    */
  var Hostname: js.UndefOr[typings.awsSdk.clientsXrayMod.Hostname] = js.undefined
  
  /**
    * 
    */
  var ResourceARN: js.UndefOr[typings.awsSdk.clientsXrayMod.ResourceARN] = js.undefined
  
  /**
    * 
    */
  var TelemetryRecords: TelemetryRecordList
}
object PutTelemetryRecordsRequest {
  
  inline def apply(TelemetryRecords: TelemetryRecordList): PutTelemetryRecordsRequest = {
    val __obj = js.Dynamic.literal(TelemetryRecords = TelemetryRecords.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutTelemetryRecordsRequest]
  }
  
  extension [Self <: PutTelemetryRecordsRequest](x: Self) {
    
    inline def setEC2InstanceId(value: EC2InstanceId): Self = StObject.set(x, "EC2InstanceId", value.asInstanceOf[js.Any])
    
    inline def setEC2InstanceIdUndefined: Self = StObject.set(x, "EC2InstanceId", js.undefined)
    
    inline def setHostname(value: Hostname): Self = StObject.set(x, "Hostname", value.asInstanceOf[js.Any])
    
    inline def setHostnameUndefined: Self = StObject.set(x, "Hostname", js.undefined)
    
    inline def setResourceARN(value: ResourceARN): Self = StObject.set(x, "ResourceARN", value.asInstanceOf[js.Any])
    
    inline def setResourceARNUndefined: Self = StObject.set(x, "ResourceARN", js.undefined)
    
    inline def setTelemetryRecords(value: TelemetryRecordList): Self = StObject.set(x, "TelemetryRecords", value.asInstanceOf[js.Any])
    
    inline def setTelemetryRecordsVarargs(value: TelemetryRecord*): Self = StObject.set(x, "TelemetryRecords", js.Array(value*))
  }
}
