package typings.awsSdk.pricingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Filter extends js.Object {
  /**
    * The product metadata field that you want to filter on. You can filter by just the service code to see all products for a specific service, filter by just the attribute name to see a specific attribute for multiple services, or use both a service code and an attribute name to retrieve only products that match both fields. Valid values include: ServiceCode, and all attribute names For example, you can filter by the AmazonEC2 service code and the volumeType attribute name to get the prices for only Amazon EC2 volumes.
    */
  var Field: String = js.native
  /**
    * The type of filter that you want to use. Valid values are: TERM_MATCH. TERM_MATCH returns only products that match both the given filter field and the given value.
    */
  var Type: FilterType = js.native
  /**
    * The service code or attribute value that you want to filter by. If you are filtering by service code this is the actual service code, such as AmazonEC2. If you are filtering by attribute name, this is the attribute value that you want the returned products to match, such as a Provisioned IOPS volume.
    */
  var Value: String = js.native
}

object Filter {
  @scala.inline
  def apply(Field: String, Type: FilterType, Value: String): Filter = {
    val __obj = js.Dynamic.literal(Field = Field.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Filter]
  }
}

