package typings.babelPresetEnv

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type BrowserslistQuery = java.lang.String
  type PluginList = js.Array[typings.babelPresetEnv.mod.PluginListItem]
  type PluginListItem = java.lang.String | typings.std.RegExp
  /* Rewritten from type alias, can be one of: 
    - typings.babelPresetEnv.mod.BrowserslistQuery
    - js.Array[typings.babelPresetEnv.mod.BrowserslistQuery]
    - typings.babelPresetEnv.keyinTargetstring
    - typings.babelPresetEnv.AnonEsmodules
    - typings.babelPresetEnv.AnonNode
    - typings.babelPresetEnv.AnonSafari
    - typings.babelPresetEnv.AnonBrowsers
  */
  type TargetsOptions = typings.babelPresetEnv.mod._TargetsOptions | js.Array[typings.babelPresetEnv.mod.BrowserslistQuery] | typings.babelPresetEnv.mod.BrowserslistQuery
}
