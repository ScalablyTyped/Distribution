package typings.cspDashHtmlDashWebpackDashPlugin

import typings.cspDashHtmlDashWebpackDashPlugin.cspDashHtmlDashWebpackDashPluginMod.Policy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Policy extends js.Object {
  var policy: js.UndefOr[Policy] = js.undefined
}

object Anon_Policy {
  @scala.inline
  def apply(policy: Policy = null): Anon_Policy = {
    val __obj = js.Dynamic.literal()
    if (policy != null) __obj.updateDynamic("policy")(policy)
    __obj.asInstanceOf[Anon_Policy]
  }
}

