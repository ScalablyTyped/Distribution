package typings
package babelDashCoreLib.babelDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BabelFileMetadata extends js.Object {
  var marked: js.Array[babelDashCoreLib.Anon_Loc]
  var modules: BabelFileModulesMetadata
  var usedHelpers: js.Array[java.lang.String]
}

object BabelFileMetadata {
  @scala.inline
  def apply(
    marked: js.Array[babelDashCoreLib.Anon_Loc],
    modules: BabelFileModulesMetadata,
    usedHelpers: js.Array[java.lang.String]
  ): BabelFileMetadata = {
    val __obj = js.Dynamic.literal(marked = marked, modules = modules, usedHelpers = usedHelpers)
  
    __obj.asInstanceOf[BabelFileMetadata]
  }
}

