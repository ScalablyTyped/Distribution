package typings.atBabelCore.atBabelCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PartialConfig extends js.Object {
  var babelignore: js.UndefOr[String] = js.undefined
  var babelrc: js.UndefOr[String] = js.undefined
  var config: js.UndefOr[String] = js.undefined
  var options: TransformOptions
}

object PartialConfig {
  @scala.inline
  def apply(
    options: TransformOptions,
    babelignore: String = null,
    babelrc: String = null,
    config: String = null
  ): PartialConfig = {
    val __obj = js.Dynamic.literal(options = options)
    if (babelignore != null) __obj.updateDynamic("babelignore")(babelignore)
    if (babelrc != null) __obj.updateDynamic("babelrc")(babelrc)
    if (config != null) __obj.updateDynamic("config")(config)
    __obj.asInstanceOf[PartialConfig]
  }
}

