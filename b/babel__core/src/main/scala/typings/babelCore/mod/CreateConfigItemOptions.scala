package typings.babelCore.mod

import typings.babelCore.babelCoreStrings.plugin
import typings.babelCore.babelCoreStrings.preset
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
    if (dirname != null) __obj.updateDynamic("dirname")(dirname.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateConfigItemOptions]
  }
}

