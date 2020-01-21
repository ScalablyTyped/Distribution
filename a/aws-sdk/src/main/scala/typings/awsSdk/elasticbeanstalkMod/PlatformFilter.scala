package typings.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlatformFilter extends js.Object {
  /**
    * The operator to apply to the Type with each of the Values.  Valid Values: = (equal to) | != (not equal to) | &lt; (less than) | &lt;= (less than or equal to) | &gt; (greater than) | &gt;= (greater than or equal to) | contains | begins_with | ends_with 
    */
  var Operator: js.UndefOr[PlatformFilterOperator] = js.native
  /**
    * The custom platform attribute to which the filter values are applied. Valid Values: PlatformName | PlatformVersion | PlatformStatus | PlatformOwner 
    */
  var Type: js.UndefOr[PlatformFilterType] = js.native
  /**
    * The list of values applied to the custom platform attribute.
    */
  var Values: js.UndefOr[PlatformFilterValueList] = js.native
}

object PlatformFilter {
  @scala.inline
  def apply(
    Operator: PlatformFilterOperator = null,
    Type: PlatformFilterType = null,
    Values: PlatformFilterValueList = null
  ): PlatformFilter = {
    val __obj = js.Dynamic.literal()
    if (Operator != null) __obj.updateDynamic("Operator")(Operator.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    if (Values != null) __obj.updateDynamic("Values")(Values.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlatformFilter]
  }
}

