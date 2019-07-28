package typings.atBabelCore.atBabelCoreMod

import typings.atBabelCore.atBabelCoreStrings.plugin
import typings.atBabelCore.atBabelCoreStrings.preset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateConfigItemOptions extends js.Object {
  var dirname: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[preset | plugin] = js.undefined
}

object CreateConfigItemOptions {
  @scala.inline
  def apply(dirname: String = null, `type`: preset | plugin = null): CreateConfigItemOptions = {
    val __obj = js.Dynamic.literal()
    if (dirname != null) __obj.updateDynamic("dirname")(dirname)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateConfigItemOptions]
  }
}

