package typings.awsSdk.frauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OFIMetricDataPoint extends StObject {
  
  /**
    *  The false positive rate. This is the percentage of total legitimate events that are incorrectly predicted as fraud. 
    */
  var fpr: js.UndefOr[float] = js.undefined
  
  /**
    *  The percentage of fraud events correctly predicted as fraudulent as compared to all events predicted as fraudulent. 
    */
  var precision: js.UndefOr[float] = js.undefined
  
  /**
    *  The model threshold that specifies an acceptable fraud capture rate. For example, a threshold of 500 means any model score 500 or above is labeled as fraud. 
    */
  var threshold: js.UndefOr[float] = js.undefined
  
  /**
    *  The true positive rate. This is the percentage of total fraud the model detects. Also known as capture rate. 
    */
  var tpr: js.UndefOr[float] = js.undefined
}
object OFIMetricDataPoint {
  
  inline def apply(): OFIMetricDataPoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OFIMetricDataPoint]
  }
  
  extension [Self <: OFIMetricDataPoint](x: Self) {
    
    inline def setFpr(value: float): Self = StObject.set(x, "fpr", value.asInstanceOf[js.Any])
    
    inline def setFprUndefined: Self = StObject.set(x, "fpr", js.undefined)
    
    inline def setPrecision(value: float): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
    
    inline def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
    
    inline def setThreshold(value: float): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
    
    inline def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
    
    inline def setTpr(value: float): Self = StObject.set(x, "tpr", value.asInstanceOf[js.Any])
    
    inline def setTprUndefined: Self = StObject.set(x, "tpr", js.undefined)
  }
}
