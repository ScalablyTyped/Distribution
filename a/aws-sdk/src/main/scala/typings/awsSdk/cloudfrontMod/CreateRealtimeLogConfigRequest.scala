package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateRealtimeLogConfigRequest extends StObject {
  
  /**
    * Contains information about the Amazon Kinesis data stream where you are sending real-time log data.
    */
  var EndPoints: EndPointList = js.native
  
  /**
    * A list of fields to include in each real-time log record. For more information about fields, see Real-time log configuration fields in the Amazon CloudFront Developer Guide.
    */
  var Fields: FieldList = js.native
  
  /**
    * A unique name to identify this real-time log configuration.
    */
  var Name: String = js.native
  
  /**
    * The sampling rate for this real-time log configuration. The sampling rate determines the percentage of viewer requests that are represented in the real-time log data. You must provide an integer between 1 and 100, inclusive.
    */
  var SamplingRate: long = js.native
}
object CreateRealtimeLogConfigRequest {
  
  @scala.inline
  def apply(EndPoints: EndPointList, Fields: FieldList, Name: String, SamplingRate: long): CreateRealtimeLogConfigRequest = {
    val __obj = js.Dynamic.literal(EndPoints = EndPoints.asInstanceOf[js.Any], Fields = Fields.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], SamplingRate = SamplingRate.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRealtimeLogConfigRequest]
  }
  
  @scala.inline
  implicit class CreateRealtimeLogConfigRequestMutableBuilder[Self <: CreateRealtimeLogConfigRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndPoints(value: EndPointList): Self = StObject.set(x, "EndPoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndPointsVarargs(value: EndPoint*): Self = StObject.set(x, "EndPoints", js.Array(value :_*))
    
    @scala.inline
    def setFields(value: FieldList): Self = StObject.set(x, "Fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsVarargs(value: String*): Self = StObject.set(x, "Fields", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSamplingRate(value: long): Self = StObject.set(x, "SamplingRate", value.asInstanceOf[js.Any])
  }
}
