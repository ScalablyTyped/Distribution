package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateRealtimeLogConfigRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) for this real-time log configuration.
    */
  var ARN: js.UndefOr[String] = js.undefined
  
  /**
    * Contains information about the Amazon Kinesis data stream where you are sending real-time log data.
    */
  var EndPoints: js.UndefOr[EndPointList] = js.undefined
  
  /**
    * A list of fields to include in each real-time log record. For more information about fields, see Real-time log configuration fields in the Amazon CloudFront Developer Guide.
    */
  var Fields: js.UndefOr[FieldList] = js.undefined
  
  /**
    * The name for this real-time log configuration.
    */
  var Name: js.UndefOr[String] = js.undefined
  
  /**
    * The sampling rate for this real-time log configuration. The sampling rate determines the percentage of viewer requests that are represented in the real-time log data. You must provide an integer between 1 and 100, inclusive.
    */
  var SamplingRate: js.UndefOr[long] = js.undefined
}
object UpdateRealtimeLogConfigRequest {
  
  inline def apply(): UpdateRealtimeLogConfigRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateRealtimeLogConfigRequest]
  }
  
  extension [Self <: UpdateRealtimeLogConfigRequest](x: Self) {
    
    inline def setARN(value: String): Self = StObject.set(x, "ARN", value.asInstanceOf[js.Any])
    
    inline def setARNUndefined: Self = StObject.set(x, "ARN", js.undefined)
    
    inline def setEndPoints(value: EndPointList): Self = StObject.set(x, "EndPoints", value.asInstanceOf[js.Any])
    
    inline def setEndPointsUndefined: Self = StObject.set(x, "EndPoints", js.undefined)
    
    inline def setEndPointsVarargs(value: EndPoint*): Self = StObject.set(x, "EndPoints", js.Array(value :_*))
    
    inline def setFields(value: FieldList): Self = StObject.set(x, "Fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "Fields", js.undefined)
    
    inline def setFieldsVarargs(value: String*): Self = StObject.set(x, "Fields", js.Array(value :_*))
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setSamplingRate(value: long): Self = StObject.set(x, "SamplingRate", value.asInstanceOf[js.Any])
    
    inline def setSamplingRateUndefined: Self = StObject.set(x, "SamplingRate", js.undefined)
  }
}
