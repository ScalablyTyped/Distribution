package typings.babelDashPluginDashMacros

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object babelDashPluginDashMacrosMod {
  import typings.atBabelCore.atBabelCoreMod.NodePath
  import typings.atBabelTraverse.atBabelTraverseMod.Node

  type MacroHandler = js.Function1[/* params */ MacroParams, Unit]
  type References = js.Array[NodePath[Node]]
}
