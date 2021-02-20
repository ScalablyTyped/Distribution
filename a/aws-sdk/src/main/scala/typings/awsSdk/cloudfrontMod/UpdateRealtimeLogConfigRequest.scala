package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateRealtimeLogConfigRequest extends StObject {
  
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
  implicit class UpdateRealtimeLogConfigRequestMutableBuilder[Self <: UpdateRealtimeLogConfigRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setARN(value: String): Self = StObject.set(x, "ARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setARNUndefined: Self = StObject.set(x, "ARN", js.undefined)
    
    @scala.inline
    def setEndPoints(value: EndPointList): Self = StObject.set(x, "EndPoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndPointsUndefined: Self = StObject.set(x, "EndPoints", js.undefined)
    
    @scala.inline
    def setEndPointsVarargs(value: EndPoint*): Self = StObject.set(x, "EndPoints", js.Array(value :_*))
    
    @scala.inline
    def setFields(value: FieldList): Self = StObject.set(x, "Fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "Fields", js.undefined)
    
    @scala.inline
    def setFieldsVarargs(value: String*): Self = StObject.set(x, "Fields", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setSamplingRate(value: long): Self = StObject.set(x, "SamplingRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSamplingRateUndefined: Self = StObject.set(x, "SamplingRate", js.undefined)
  }
}
