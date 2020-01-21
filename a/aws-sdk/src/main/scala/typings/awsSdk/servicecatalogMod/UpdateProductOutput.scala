package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateProductOutput extends js.Object {
  /**
    * Information about the product view.
    */
  var ProductViewDetail: js.UndefOr[typings.awsSdk.servicecatalogMod.ProductViewDetail] = js.native
  /**
    * Information about the tags associated with the product.
    */
  var Tags: js.UndefOr[typings.awsSdk.servicecatalogMod.Tags] = js.native
}

object UpdateProductOutput {
  @scala.inline
  def apply(ProductViewDetail: ProductViewDetail = null, Tags: Tags = null): UpdateProductOutput = {
    val __obj = js.Dynamic.literal()
    if (ProductViewDetail != null) __obj.updateDynamic("ProductViewDetail")(ProductViewDetail.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateProductOutput]
  }
}

