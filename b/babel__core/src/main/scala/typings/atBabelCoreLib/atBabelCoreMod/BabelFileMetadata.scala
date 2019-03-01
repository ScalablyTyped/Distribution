package typings
package atBabelCoreLib.atBabelCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BabelFileMetadata extends js.Object {
  var marked: js.Array[atBabelCoreLib.Anon_Loc]
  var modules: BabelFileModulesMetadata
  var usedHelpers: js.Array[java.lang.String]
}

object BabelFileMetadata {
  @scala.inline
  def apply(
    marked: js.Array[atBabelCoreLib.Anon_Loc],
    modules: BabelFileModulesMetadata,
    usedHelpers: js.Array[java.lang.String]
  ): BabelFileMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("marked")(marked)
    __obj.updateDynamic("modules")(modules)
    __obj.updateDynamic("usedHelpers")(usedHelpers)
    __obj.asInstanceOf[BabelFileMetadata]
  }
}

