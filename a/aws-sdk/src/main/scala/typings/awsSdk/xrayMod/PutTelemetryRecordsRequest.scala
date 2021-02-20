package typings.awsSdk.xrayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutTelemetryRecordsRequest extends StObject {
  
  /**
    * 
    */
  var EC2InstanceId: js.UndefOr[typings.awsSdk.xrayMod.EC2InstanceId] = js.native
  
  /**
    * 
    */
  var Hostname: js.UndefOr[typings.awsSdk.xrayMod.Hostname] = js.native
  
  /**
    * 
    */
  var ResourceARN: js.UndefOr[typings.awsSdk.xrayMod.ResourceARN] = js.native
  
  /**
    * 
    */
  var TelemetryRecords: TelemetryRecordList = js.native
}
object PutTelemetryRecordsRequest {
  
  @scala.inline
  def apply(TelemetryRecords: TelemetryRecordList): PutTelemetryRecordsRequest = {
    val __obj = js.Dynamic.literal(TelemetryRecords = TelemetryRecords.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutTelemetryRecordsRequest]
  }
  
  @scala.inline
  implicit class PutTelemetryRecordsRequestMutableBuilder[Self <: PutTelemetryRecordsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEC2InstanceId(value: EC2InstanceId): Self = StObject.set(x, "EC2InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEC2InstanceIdUndefined: Self = StObject.set(x, "EC2InstanceId", js.undefined)
    
    @scala.inline
    def setHostname(value: Hostname): Self = StObject.set(x, "Hostname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostnameUndefined: Self = StObject.set(x, "Hostname", js.undefined)
    
    @scala.inline
    def setResourceARN(value: ResourceARN): Self = StObject.set(x, "ResourceARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceARNUndefined: Self = StObject.set(x, "ResourceARN", js.undefined)
    
    @scala.inline
    def setTelemetryRecords(value: TelemetryRecordList): Self = StObject.set(x, "TelemetryRecords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTelemetryRecordsVarargs(value: TelemetryRecord*): Self = StObject.set(x, "TelemetryRecords", js.Array(value :_*))
  }
}
