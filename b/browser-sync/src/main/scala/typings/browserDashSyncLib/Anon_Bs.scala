package typings
package browserDashSyncLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bs extends js.Object {
  var `plugin:name`: js.UndefOr[java.lang.String] = js.undefined
  def plugin(opts: js.Object, bs: browserDashSyncLib.browserDashSyncMod.browserSyncNs.BrowserSyncInstance): js.Any
}

object Anon_Bs {
  @scala.inline
  def apply(
    plugin: js.Function2[
      js.Object, 
      browserDashSyncLib.browserDashSyncMod.browserSyncNs.BrowserSyncInstance, 
      js.Any
    ],
    `plugin:name`: java.lang.String = null
  ): Anon_Bs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("plugin")(plugin)
    if (`plugin:name` != null) __obj.updateDynamic("plugin:name")(`plugin:name`)
    __obj.asInstanceOf[Anon_Bs]
  }
}

