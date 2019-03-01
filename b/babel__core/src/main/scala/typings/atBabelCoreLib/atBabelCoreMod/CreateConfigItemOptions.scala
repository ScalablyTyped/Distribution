package typings
package atBabelCoreLib.atBabelCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateConfigItemOptions extends js.Object {
  var dirname: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[
    atBabelCoreLib.atBabelCoreLibStrings.preset | atBabelCoreLib.atBabelCoreLibStrings.plugin
  ] = js.undefined
}

object CreateConfigItemOptions {
  @scala.inline
  def apply(
    dirname: java.lang.String = null,
    `type`: atBabelCoreLib.atBabelCoreLibStrings.preset | atBabelCoreLib.atBabelCoreLibStrings.plugin = null
  ): CreateConfigItemOptions = {
    val __obj = js.Dynamic.literal()
    if (dirname != null) __obj.updateDynamic("dirname")(dirname)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateConfigItemOptions]
  }
}

