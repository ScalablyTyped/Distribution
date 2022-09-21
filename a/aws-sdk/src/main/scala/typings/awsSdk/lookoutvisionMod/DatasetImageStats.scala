package typings.awsSdk.lookoutvisionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatasetImageStats extends StObject {
  
  /**
    * the total number of images labeled as an anomaly.
    */
  var Anomaly: js.UndefOr[Integer] = js.undefined
  
  /**
    * The total number of labeled images.
    */
  var Labeled: js.UndefOr[Integer] = js.undefined
  
  /**
    * The total number of images labeled as normal.
    */
  var Normal: js.UndefOr[Integer] = js.undefined
  
  /**
    * The total number of images in the dataset.
    */
  var Total: js.UndefOr[Integer] = js.undefined
}
object DatasetImageStats {
  
  inline def apply(): DatasetImageStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatasetImageStats]
  }
  
  extension [Self <: DatasetImageStats](x: Self) {
    
    inline def setAnomaly(value: Integer): Self = StObject.set(x, "Anomaly", value.asInstanceOf[js.Any])
    
    inline def setAnomalyUndefined: Self = StObject.set(x, "Anomaly", js.undefined)
    
    inline def setLabeled(value: Integer): Self = StObject.set(x, "Labeled", value.asInstanceOf[js.Any])
    
    inline def setLabeledUndefined: Self = StObject.set(x, "Labeled", js.undefined)
    
    inline def setNormal(value: Integer): Self = StObject.set(x, "Normal", value.asInstanceOf[js.Any])
    
    inline def setNormalUndefined: Self = StObject.set(x, "Normal", js.undefined)
    
    inline def setTotal(value: Integer): Self = StObject.set(x, "Total", value.asInstanceOf[js.Any])
    
    inline def setTotalUndefined: Self = StObject.set(x, "Total", js.undefined)
  }
}
