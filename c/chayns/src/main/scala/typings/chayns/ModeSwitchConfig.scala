package typings.chayns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * UI Functions
  * chayns.ui.modeswitch
  * interfaces
  */
// chayns.ui.modeswitch.init()
@js.native
trait ModeSwitchConfig extends js.Object {
  var headline: js.UndefOr[String] = js.native
  var items: js.Array[ModeSwitchItem] = js.native
  var preventclose: js.UndefOr[Boolean] = js.native
  def callback(result: ModeSwitchItem): Unit = js.native
}

object ModeSwitchConfig {
  @scala.inline
  def apply(callback: ModeSwitchItem => Unit, items: js.Array[ModeSwitchItem]): ModeSwitchConfig = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction1(callback), items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModeSwitchConfig]
  }
  @scala.inline
  implicit class ModeSwitchConfigOps[Self <: ModeSwitchConfig] (val x: Self) extends AnyVal {
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
    def setCallback(value: ModeSwitchItem => Unit): Self = this.set("callback", js.Any.fromFunction1(value))
    @scala.inline
    def setItemsVarargs(value: ModeSwitchItem*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[ModeSwitchItem]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeadline(value: String): Self = this.set("headline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeadline: Self = this.set("headline", js.undefined)
    @scala.inline
    def setPreventclose(value: Boolean): Self = this.set("preventclose", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreventclose: Self = this.set("preventclose", js.undefined)
  }
  
}

