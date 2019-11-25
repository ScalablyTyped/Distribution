package typings.cspDashHtmlDashWebpackDashPlugin.cspDashHtmlDashWebpackDashPluginMod.htmlDashWebpackDashPluginMod

import typings.cspDashHtmlDashWebpackDashPlugin.Anon_Policy
import typings.cspDashHtmlDashWebpackDashPlugin.cspDashHtmlDashWebpackDashPluginMod.AdditionalOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var cspPlugin: js.UndefOr[AdditionalOptions with Anon_Policy] = js.undefined
}

object Options {
  @scala.inline
  def apply(cspPlugin: AdditionalOptions with Anon_Policy = null): Options = {
    val __obj = js.Dynamic.literal()
    if (cspPlugin != null) __obj.updateDynamic("cspPlugin")(cspPlugin.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

