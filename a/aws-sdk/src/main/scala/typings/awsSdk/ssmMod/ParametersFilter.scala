package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParametersFilter extends js.Object {
  /**
    * The name of the filter.
    */
  var Key: ParametersFilterKey = js.native
  /**
    * The filter values.
    */
  var Values: ParametersFilterValueList = js.native
}

object ParametersFilter {
  @scala.inline
  def apply(Key: ParametersFilterKey, Values: ParametersFilterValueList): ParametersFilter = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], Values = Values.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersFilter]
  }
}

