package typings.awsSdk.xrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutTelemetryRecordsRequest extends js.Object {
  
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
  implicit class PutTelemetryRecordsRequestOps[Self <: PutTelemetryRecordsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setTelemetryRecordsVarargs(value: TelemetryRecord*): Self = this.set("TelemetryRecords", js.Array(value :_*))
    
    @scala.inline
    def setTelemetryRecords(value: TelemetryRecordList): Self = this.set("TelemetryRecords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEC2InstanceId(value: EC2InstanceId): Self = this.set("EC2InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEC2InstanceId: Self = this.set("EC2InstanceId", js.undefined)
    
    @scala.inline
    def setHostname(value: Hostname): Self = this.set("Hostname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHostname: Self = this.set("Hostname", js.undefined)
    
    @scala.inline
    def setResourceARN(value: ResourceARN): Self = this.set("ResourceARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceARN: Self = this.set("ResourceARN", js.undefined)
  }
}
