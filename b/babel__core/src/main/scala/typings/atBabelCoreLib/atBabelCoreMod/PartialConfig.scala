package typings
package atBabelCoreLib.atBabelCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PartialConfig extends js.Object {
  var babelignore: js.UndefOr[java.lang.String] = js.undefined
  var babelrc: js.UndefOr[java.lang.String] = js.undefined
  var config: js.UndefOr[java.lang.String] = js.undefined
  var options: TransformOptions
}

object PartialConfig {
  @scala.inline
  def apply(
    options: TransformOptions,
    babelignore: java.lang.String = null,
    babelrc: java.lang.String = null,
    config: java.lang.String = null
  ): PartialConfig = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("options")(options)
    if (babelignore != null) __obj.updateDynamic("babelignore")(babelignore)
    if (babelrc != null) __obj.updateDynamic("babelrc")(babelrc)
    if (config != null) __obj.updateDynamic("config")(config)
    __obj.asInstanceOf[PartialConfig]
  }
}

