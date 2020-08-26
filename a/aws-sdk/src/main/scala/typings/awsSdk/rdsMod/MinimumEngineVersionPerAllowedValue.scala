package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MinimumEngineVersionPerAllowedValue extends js.Object {
  /**
    * The allowed value for an option setting.
    */
  var AllowedValue: js.UndefOr[String] = js.native
  /**
    * The minimum DB engine version required for the allowed value.
    */
  var MinimumEngineVersion: js.UndefOr[String] = js.native
}

object MinimumEngineVersionPerAllowedValue {
  @scala.inline
  def apply(): MinimumEngineVersionPerAllowedValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MinimumEngineVersionPerAllowedValue]
  }
  @scala.inline
  implicit class MinimumEngineVersionPerAllowedValueOps[Self <: MinimumEngineVersionPerAllowedValue] (val x: Self) extends AnyVal {
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
    def setAllowedValue(value: String): Self = this.set("AllowedValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowedValue: Self = this.set("AllowedValue", js.undefined)
    @scala.inline
    def setMinimumEngineVersion(value: String): Self = this.set("MinimumEngineVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinimumEngineVersion: Self = this.set("MinimumEngineVersion", js.undefined)
  }
  
}

