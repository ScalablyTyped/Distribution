package typings.awsSdk.mqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Configurations extends js.Object {
  /**
    * The current configuration of the broker.
    */
  var Current: js.UndefOr[ConfigurationId] = js.native
  /**
    * The history of configurations applied to the broker.
    */
  var History: js.UndefOr[listOfConfigurationId] = js.native
  /**
    * The pending configuration of the broker.
    */
  var Pending: js.UndefOr[ConfigurationId] = js.native
}

object Configurations {
  @scala.inline
  def apply(): Configurations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Configurations]
  }
  @scala.inline
  implicit class ConfigurationsOps[Self <: Configurations] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCurrent(value: ConfigurationId): Self = this.set("Current", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrent: Self = this.set("Current", js.undefined)
    @scala.inline
    def setHistoryVarargs(value: ConfigurationId*): Self = this.set("History", js.Array(value :_*))
    @scala.inline
    def setHistory(value: listOfConfigurationId): Self = this.set("History", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHistory: Self = this.set("History", js.undefined)
    @scala.inline
    def setPending(value: ConfigurationId): Self = this.set("Pending", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePending: Self = this.set("Pending", js.undefined)
  }
  
}

