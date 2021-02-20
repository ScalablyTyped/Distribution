package typings.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProductViewAggregationValue extends StObject {
  
  /**
    * An approximate count of the products that match the value.
    */
  var ApproximateCount: js.UndefOr[typings.awsSdk.servicecatalogMod.ApproximateCount] = js.native
  
  /**
    * The value of the product view aggregation.
    */
  var Value: js.UndefOr[AttributeValue] = js.native
}
object ProductViewAggregationValue {
  
  @scala.inline
  def apply(): ProductViewAggregationValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProductViewAggregationValue]
  }
  
  @scala.inline
  implicit class ProductViewAggregationValueMutableBuilder[Self <: ProductViewAggregationValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApproximateCount(value: ApproximateCount): Self = StObject.set(x, "ApproximateCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApproximateCountUndefined: Self = StObject.set(x, "ApproximateCount", js.undefined)
    
    @scala.inline
    def setValue(value: AttributeValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
