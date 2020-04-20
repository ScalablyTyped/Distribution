package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceInformationFilter extends js.Object {
  /**
    * The name of the filter. 
    */
  var key: InstanceInformationFilterKey = js.native
  /**
    * The filter values.
    */
  var valueSet: InstanceInformationFilterValueSet = js.native
}

object InstanceInformationFilter {
  @scala.inline
  def apply(key: InstanceInformationFilterKey, valueSet: InstanceInformationFilterValueSet): InstanceInformationFilter = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], valueSet = valueSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceInformationFilter]
  }
}

