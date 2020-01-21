package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IntegerParameterRangeSpecification extends js.Object {
  /**
    * The maximum integer value allowed.
    */
  var MaxValue: ParameterValue = js.native
  /**
    * The minimum integer value allowed.
    */
  var MinValue: ParameterValue = js.native
}

object IntegerParameterRangeSpecification {
  @scala.inline
  def apply(MaxValue: ParameterValue, MinValue: ParameterValue): IntegerParameterRangeSpecification = {
    val __obj = js.Dynamic.literal(MaxValue = MaxValue.asInstanceOf[js.Any], MinValue = MinValue.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IntegerParameterRangeSpecification]
  }
}

