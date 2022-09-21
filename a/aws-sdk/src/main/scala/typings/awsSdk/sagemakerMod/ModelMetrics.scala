package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModelMetrics extends StObject {
  
  /**
    * Metrics that measure bais in a model.
    */
  var Bias: js.UndefOr[typings.awsSdk.sagemakerMod.Bias] = js.undefined
  
  /**
    * Metrics that help explain a model.
    */
  var Explainability: js.UndefOr[typings.awsSdk.sagemakerMod.Explainability] = js.undefined
  
  /**
    * Metrics that measure the quality of the input data for a model.
    */
  var ModelDataQuality: js.UndefOr[typings.awsSdk.sagemakerMod.ModelDataQuality] = js.undefined
  
  /**
    * Metrics that measure the quality of a model.
    */
  var ModelQuality: js.UndefOr[typings.awsSdk.sagemakerMod.ModelQuality] = js.undefined
}
object ModelMetrics {
  
  inline def apply(): ModelMetrics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModelMetrics]
  }
  
  extension [Self <: ModelMetrics](x: Self) {
    
    inline def setBias(value: Bias): Self = StObject.set(x, "Bias", value.asInstanceOf[js.Any])
    
    inline def setBiasUndefined: Self = StObject.set(x, "Bias", js.undefined)
    
    inline def setExplainability(value: Explainability): Self = StObject.set(x, "Explainability", value.asInstanceOf[js.Any])
    
    inline def setExplainabilityUndefined: Self = StObject.set(x, "Explainability", js.undefined)
    
    inline def setModelDataQuality(value: ModelDataQuality): Self = StObject.set(x, "ModelDataQuality", value.asInstanceOf[js.Any])
    
    inline def setModelDataQualityUndefined: Self = StObject.set(x, "ModelDataQuality", js.undefined)
    
    inline def setModelQuality(value: ModelQuality): Self = StObject.set(x, "ModelQuality", value.asInstanceOf[js.Any])
    
    inline def setModelQualityUndefined: Self = StObject.set(x, "ModelQuality", js.undefined)
  }
}
