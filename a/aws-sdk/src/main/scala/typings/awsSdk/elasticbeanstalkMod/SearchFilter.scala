package typings.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchFilter extends js.Object {
  /**
    * The result attribute to which the filter values are applied. Valid values vary by API action.
    */
  var Attribute: js.UndefOr[SearchFilterAttribute] = js.native
  /**
    * The operator to apply to the Attribute with each of the Values. Valid values vary by Attribute.
    */
  var Operator: js.UndefOr[SearchFilterOperator] = js.native
  /**
    * The list of values applied to the Attribute and Operator attributes. Number of values and valid values vary by Attribute.
    */
  var Values: js.UndefOr[SearchFilterValues] = js.native
}

object SearchFilter {
  @scala.inline
  def apply(
    Attribute: SearchFilterAttribute = null,
    Operator: SearchFilterOperator = null,
    Values: SearchFilterValues = null
  ): SearchFilter = {
    val __obj = js.Dynamic.literal()
    if (Attribute != null) __obj.updateDynamic("Attribute")(Attribute.asInstanceOf[js.Any])
    if (Operator != null) __obj.updateDynamic("Operator")(Operator.asInstanceOf[js.Any])
    if (Values != null) __obj.updateDynamic("Values")(Values.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchFilter]
  }
}

