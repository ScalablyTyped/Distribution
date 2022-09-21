package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateCustomMetricRequest extends StObject {
  
  /**
    * Each custom metric must have a unique client request token. If you try to create a new custom metric that already exists with a different token, an exception occurs. If you omit this value, Amazon Web Services SDKs will automatically generate a unique client request. 
    */
  var clientRequestToken: ClientRequestToken
  
  /**
    *  The friendly name in the console for the custom metric. This name doesn't have to be unique. Don't use this name as the metric identifier in the device metric report. You can update the friendly name after you define it.
    */
  var displayName: js.UndefOr[CustomMetricDisplayName] = js.undefined
  
  /**
    *  The name of the custom metric. This will be used in the metric report submitted from the device/thing. The name can't begin with aws:. You can't change the name after you define it.
    */
  var metricName: MetricName
  
  /**
    *  The type of the custom metric.   The type number only takes a single metric value as an input, but when you submit the metrics value in the DeviceMetrics report, you must pass it as an array with a single value. 
    */
  var metricType: CustomMetricType
  
  /**
    *  Metadata that can be used to manage the custom metric. 
    */
  var tags: js.UndefOr[TagList] = js.undefined
}
object CreateCustomMetricRequest {
  
  inline def apply(clientRequestToken: ClientRequestToken, metricName: MetricName, metricType: CustomMetricType): CreateCustomMetricRequest = {
    val __obj = js.Dynamic.literal(clientRequestToken = clientRequestToken.asInstanceOf[js.Any], metricName = metricName.asInstanceOf[js.Any], metricType = metricType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCustomMetricRequest]
  }
  
  extension [Self <: CreateCustomMetricRequest](x: Self) {
    
    inline def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "clientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setDisplayName(value: CustomMetricDisplayName): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setMetricName(value: MetricName): Self = StObject.set(x, "metricName", value.asInstanceOf[js.Any])
    
    inline def setMetricType(value: CustomMetricType): Self = StObject.set(x, "metricType", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value*))
  }
}
