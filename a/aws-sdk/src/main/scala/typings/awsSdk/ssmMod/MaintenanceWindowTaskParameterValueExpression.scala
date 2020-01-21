package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MaintenanceWindowTaskParameterValueExpression extends js.Object {
  /**
    * This field contains an array of 0 or more strings, each 1 to 255 characters in length.
    */
  var Values: js.UndefOr[MaintenanceWindowTaskParameterValueList] = js.native
}

object MaintenanceWindowTaskParameterValueExpression {
  @scala.inline
  def apply(Values: MaintenanceWindowTaskParameterValueList = null): MaintenanceWindowTaskParameterValueExpression = {
    val __obj = js.Dynamic.literal()
    if (Values != null) __obj.updateDynamic("Values")(Values.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaintenanceWindowTaskParameterValueExpression]
  }
}

