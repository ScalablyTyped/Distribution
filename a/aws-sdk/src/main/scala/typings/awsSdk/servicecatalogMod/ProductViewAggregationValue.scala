package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProductViewAggregationValue extends js.Object {
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
  implicit class ProductViewAggregationValueOps[Self <: ProductViewAggregationValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setApproximateCount(value: ApproximateCount): Self = this.set("ApproximateCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApproximateCount: Self = this.set("ApproximateCount", js.undefined)
    @scala.inline
    def setValue(value: AttributeValue): Self = this.set("Value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("Value", js.undefined)
  }
  
}

