package typings.cordovaPluginInsomnia

import typings.cordovaPluginInsomnia.InsomniaPlugin.Insomnia
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Plugins extends js.Object {
  var insomnia: Insomnia = js.native
}

object Plugins {
  @scala.inline
  def apply(insomnia: Insomnia): Plugins = {
    val __obj = js.Dynamic.literal(insomnia = insomnia.asInstanceOf[js.Any])
    __obj.asInstanceOf[Plugins]
  }
  @scala.inline
  implicit class PluginsOps[Self <: Plugins] (val x: Self) extends AnyVal {
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
    def setInsomnia(value: Insomnia): Self = this.set("insomnia", value.asInstanceOf[js.Any])
  }
  
}

