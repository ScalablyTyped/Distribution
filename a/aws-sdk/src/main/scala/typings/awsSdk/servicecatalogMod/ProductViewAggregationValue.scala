package typings.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProductViewAggregationValue extends StObject {
  
  /**
    * An approximate count of the products that match the value.
    */
  var ApproximateCount: js.UndefOr[typings.awsSdk.servicecatalogMod.ApproximateCount] = js.undefined
  
  /**
    * The value of the product view aggregation.
    */
  var Value: js.UndefOr[AttributeValue] = js.undefined
}
object ProductViewAggregationValue {
  
  inline def apply(): ProductViewAggregationValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProductViewAggregationValue]
  }
  
  extension [Self <: ProductViewAggregationValue](x: Self) {
    
    inline def setApproximateCount(value: ApproximateCount): Self = StObject.set(x, "ApproximateCount", value.asInstanceOf[js.Any])
    
    inline def setApproximateCountUndefined: Self = StObject.set(x, "ApproximateCount", js.undefined)
    
    inline def setValue(value: AttributeValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
