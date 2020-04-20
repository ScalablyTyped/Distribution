package typings.awsSdk.licensemanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProductInformationFilter extends js.Object {
  /**
    * Logical operator.
    */
  var ProductInformationFilterComparator: String = js.native
  /**
    * Filter name.
    */
  var ProductInformationFilterName: String = js.native
  /**
    * Filter value.
    */
  var ProductInformationFilterValue: StringList = js.native
}

object ProductInformationFilter {
  @scala.inline
  def apply(
    ProductInformationFilterComparator: String,
    ProductInformationFilterName: String,
    ProductInformationFilterValue: StringList
  ): ProductInformationFilter = {
    val __obj = js.Dynamic.literal(ProductInformationFilterComparator = ProductInformationFilterComparator.asInstanceOf[js.Any], ProductInformationFilterName = ProductInformationFilterName.asInstanceOf[js.Any], ProductInformationFilterValue = ProductInformationFilterValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProductInformationFilter]
  }
}

