package typings.awsSdk.managedblockchainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogConfiguration extends js.Object {
  /**
    * Indicates whether logging is enabled.
    */
  var Enabled: js.UndefOr[typings.awsSdk.managedblockchainMod.Enabled] = js.native
}

object LogConfiguration {
  @scala.inline
  def apply(): LogConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogConfiguration]
  }
  @scala.inline
  implicit class LogConfigurationOps[Self <: LogConfiguration] (val x: Self) extends AnyVal {
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
    def setEnabled(value: Enabled): Self = this.set("Enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("Enabled", js.undefined)
  }
  
}

