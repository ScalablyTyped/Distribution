package typings.awsSdk.ssmincidentsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemValue extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the related item, if the related item is an Amazon resource.
    */
  var arn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The metric definition, if the related item is a metric in Amazon CloudWatch.
    */
  var metricDefinition: js.UndefOr[MetricDefinition] = js.undefined
  
  /**
    * The URL, if the related item is a non-Amazon Web Services resource.
    */
  var url: js.UndefOr[Url] = js.undefined
}
object ItemValue {
  
  inline def apply(): ItemValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ItemValue]
  }
  
  extension [Self <: ItemValue](x: Self) {
    
    inline def setArn(value: Arn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setMetricDefinition(value: MetricDefinition): Self = StObject.set(x, "metricDefinition", value.asInstanceOf[js.Any])
    
    inline def setMetricDefinitionUndefined: Self = StObject.set(x, "metricDefinition", js.undefined)
    
    inline def setUrl(value: Url): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
