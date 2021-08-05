package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CurrentMetricResult extends StObject {
  
  /**
    * The set of metrics.
    */
  var Collections: js.UndefOr[CurrentMetricDataCollections] = js.undefined
  
  /**
    * The dimensions for the metrics.
    */
  var Dimensions: js.UndefOr[typings.awsSdk.connectMod.Dimensions] = js.undefined
}
object CurrentMetricResult {
  
  inline def apply(): CurrentMetricResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CurrentMetricResult]
  }
  
  extension [Self <: CurrentMetricResult](x: Self) {
    
    inline def setCollections(value: CurrentMetricDataCollections): Self = StObject.set(x, "Collections", value.asInstanceOf[js.Any])
    
    inline def setCollectionsUndefined: Self = StObject.set(x, "Collections", js.undefined)
    
    inline def setCollectionsVarargs(value: CurrentMetricData*): Self = StObject.set(x, "Collections", js.Array(value :_*))
    
    inline def setDimensions(value: Dimensions): Self = StObject.set(x, "Dimensions", value.asInstanceOf[js.Any])
    
    inline def setDimensionsUndefined: Self = StObject.set(x, "Dimensions", js.undefined)
  }
}
