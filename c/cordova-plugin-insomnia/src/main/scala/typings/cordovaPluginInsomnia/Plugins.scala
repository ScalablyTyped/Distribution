package typings.cordovaPluginInsomnia

import typings.cordovaPluginInsomnia.InsomniaPlugin.Insomnia
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Plugins extends js.Object {
  var insomnia: Insomnia
}

object Plugins {
  @scala.inline
  def apply(insomnia: Insomnia): Plugins = {
    val __obj = js.Dynamic.literal(insomnia = insomnia.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Plugins]
  }
}

