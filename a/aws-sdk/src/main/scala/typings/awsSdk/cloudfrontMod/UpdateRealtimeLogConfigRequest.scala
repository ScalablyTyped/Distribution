package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateRealtimeLogConfigRequest extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) for this real-time log configuration.
    */
  var ARN: js.UndefOr[String] = js.native
  
  /**
    * Contains information about the Amazon Kinesis data stream where you are sending real-time log data.
    */
  var EndPoints: js.UndefOr[EndPointList] = js.native
  
  /**
    * A list of fields to include in each real-time log record. For more information about fields, see Real-time log configuration fields in the Amazon CloudFront Developer Guide.
    */
  var Fields: js.UndefOr[FieldList] = js.native
  
  /**
    * The name for this real-time log configuration.
    */
  var Name: js.UndefOr[String] = js.native
  
  /**
    * The sampling rate for this real-time log configuration. The sampling rate determines the percentage of viewer requests that are represented in the real-time log data. You must provide an integer between 1 and 100, inclusive.
    */
  var SamplingRate: js.UndefOr[long] = js.native
}
object UpdateRealtimeLogConfigRequest {
  
  @scala.inline
  def apply(): UpdateRealtimeLogConfigRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateRealtimeLogConfigRequest]
  }
  
  @scala.inline
  implicit class UpdateRealtimeLogConfigRequestOps[Self <: UpdateRealtimeLogConfigRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setARN(value: String): Self = this.set("ARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteARN: Self = this.set("ARN", js.undefined)
    
    @scala.inline
    def setEndPointsVarargs(value: EndPoint*): Self = this.set("EndPoints", js.Array(value :_*))
    
    @scala.inline
    def setEndPoints(value: EndPointList): Self = this.set("EndPoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndPoints: Self = this.set("EndPoints", js.undefined)
    
    @scala.inline
    def setFieldsVarargs(value: String*): Self = this.set("Fields", js.Array(value :_*))
    
    @scala.inline
    def setFields(value: FieldList): Self = this.set("Fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFields: Self = this.set("Fields", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    
    @scala.inline
    def setSamplingRate(value: long): Self = this.set("SamplingRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSamplingRate: Self = this.set("SamplingRate", js.undefined)
  }
}
