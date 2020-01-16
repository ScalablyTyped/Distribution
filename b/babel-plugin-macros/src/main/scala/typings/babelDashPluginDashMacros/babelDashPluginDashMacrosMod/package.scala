package typings.babelDashPluginDashMacros

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object babelDashPluginDashMacrosMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.atBabelCore.atBabelCoreMod.NodePath
  import typings.atBabelTraverse.atBabelTraverseMod.Node

  type MacroHandler = js.Function1[/* params */ MacroParams, Unit]
  type References = StringDictionary[js.Array[NodePath[Node]]]
}
