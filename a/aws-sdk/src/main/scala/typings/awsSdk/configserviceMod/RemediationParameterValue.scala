package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemediationParameterValue extends js.Object {
  /**
    * The value is dynamic and changes at run-time.
    */
  var ResourceValue: js.UndefOr[typings.awsSdk.configserviceMod.ResourceValue] = js.native
  /**
    * The value is static and does not change at run-time.
    */
  var StaticValue: js.UndefOr[typings.awsSdk.configserviceMod.StaticValue] = js.native
}

object RemediationParameterValue {
  @scala.inline
  def apply(): RemediationParameterValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemediationParameterValue]
  }
  @scala.inline
  implicit class RemediationParameterValueOps[Self <: RemediationParameterValue] (val x: Self) extends AnyVal {
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
    def setResourceValue(value: ResourceValue): Self = this.set("ResourceValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceValue: Self = this.set("ResourceValue", js.undefined)
    @scala.inline
    def setStaticValue(value: StaticValue): Self = this.set("StaticValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStaticValue: Self = this.set("StaticValue", js.undefined)
  }
  
}

