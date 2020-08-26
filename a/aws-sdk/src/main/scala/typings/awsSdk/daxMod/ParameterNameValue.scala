package typings.awsSdk.daxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParameterNameValue extends js.Object {
  /**
    * The name of the parameter.
    */
  var ParameterName: js.UndefOr[String] = js.native
  /**
    * The value of the parameter.
    */
  var ParameterValue: js.UndefOr[String] = js.native
}

object ParameterNameValue {
  @scala.inline
  def apply(): ParameterNameValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParameterNameValue]
  }
  @scala.inline
  implicit class ParameterNameValueOps[Self <: ParameterNameValue] (val x: Self) extends AnyVal {
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
    def setParameterName(value: String): Self = this.set("ParameterName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParameterName: Self = this.set("ParameterName", js.undefined)
    @scala.inline
    def setParameterValue(value: String): Self = this.set("ParameterValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParameterValue: Self = this.set("ParameterValue", js.undefined)
  }
  
}

