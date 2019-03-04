package typings
package builderDashUtilDashRuntimeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Format extends js.Object {
  var format: java.lang.String
  var variant: java.lang.String
  var version: js.UndefOr[scala.Nothing]
}

object Anon_Format {
  @scala.inline
  def apply(
    format: java.lang.String,
    variant: java.lang.String,
    version: js.UndefOr[scala.Nothing] = js.undefined
  ): Anon_Format = {
    val __obj = js.Dynamic.literal(format = format, variant = variant)
    if (!js.isUndefined(version)) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[Anon_Format]
  }
}

