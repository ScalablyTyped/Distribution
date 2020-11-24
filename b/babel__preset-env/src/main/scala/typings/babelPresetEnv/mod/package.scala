package typings.babelPresetEnv

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type BrowserslistQuery = java.lang.String
  
  type PluginList = js.Array[typings.babelPresetEnv.mod.PluginListItem]
  
  type PluginListItem = java.lang.String | typings.std.RegExp
  
  /* Rewritten from type alias, can be one of: 
    - typings.babelPresetEnv.mod.BrowserslistQuery
    - js.Array[typings.babelPresetEnv.mod.BrowserslistQuery]
    - typings.babelPresetEnv.anon.keyinTargetstring
    - typings.babelPresetEnv.anon.Esmodules
    - typings.babelPresetEnv.anon.Node
    - typings.babelPresetEnv.anon.Safari
    - typings.babelPresetEnv.anon.Browsers
  */
  type TargetsOptions = typings.babelPresetEnv.mod._TargetsOptions | js.Array[typings.babelPresetEnv.mod.BrowserslistQuery] | typings.babelPresetEnv.mod.BrowserslistQuery
}
