package typings.babelCore.anon

import typings.babelCore.mod.TransformOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<@babel/core.@babel/core.PartialConfig> */
trait ReadonlyPartialConfig extends js.Object {
  val babelignore: js.UndefOr[String] = js.undefined
  val babelrc: js.UndefOr[String] = js.undefined
  val config: js.UndefOr[String] = js.undefined
  val options: TransformOptions
}

object ReadonlyPartialConfig {
  @scala.inline
  def apply(
    options: TransformOptions,
    babelignore: String = null,
    babelrc: String = null,
    config: String = null
  ): ReadonlyPartialConfig = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    if (babelignore != null) __obj.updateDynamic("babelignore")(babelignore.asInstanceOf[js.Any])
    if (babelrc != null) __obj.updateDynamic("babelrc")(babelrc.asInstanceOf[js.Any])
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyPartialConfig]
  }
}

