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
  def apply(): MaintenanceWindowTaskParameterValueExpression = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaintenanceWindowTaskParameterValueExpression]
  }
  @scala.inline
  implicit class MaintenanceWindowTaskParameterValueExpressionOps[Self <: MaintenanceWindowTaskParameterValueExpression] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setValuesVarargs(value: MaintenanceWindowTaskParameterValue*): Self = this.set("Values", js.Array(value :_*))
    @scala.inline
    def setValues(value: MaintenanceWindowTaskParameterValueList): Self = this.set("Values", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValues: Self = this.set("Values", js.undefined)
  }
  
}

