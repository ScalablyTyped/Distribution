package typings
package catalogLib.catalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpecimenProps extends js.Object {
  var rawBody: js.UndefOr[java.lang.String] = js.undefined
  var rawOptions: js.UndefOr[java.lang.String] = js.undefined
  var span: js.UndefOr[
    catalogLib.catalogLibNumbers.`1` | catalogLib.catalogLibNumbers.`2` | catalogLib.catalogLibNumbers.`3` | catalogLib.catalogLibNumbers.`4` | catalogLib.catalogLibNumbers.`5` | catalogLib.catalogLibNumbers.`6`
  ] = js.undefined
}

object SpecimenProps {
  @scala.inline
  def apply(
    rawBody: java.lang.String = null,
    rawOptions: java.lang.String = null,
    span: catalogLib.catalogLibNumbers.`1` | catalogLib.catalogLibNumbers.`2` | catalogLib.catalogLibNumbers.`3` | catalogLib.catalogLibNumbers.`4` | catalogLib.catalogLibNumbers.`5` | catalogLib.catalogLibNumbers.`6` = null
  ): SpecimenProps = {
    val __obj = js.Dynamic.literal()
    if (rawBody != null) __obj.updateDynamic("rawBody")(rawBody)
    if (rawOptions != null) __obj.updateDynamic("rawOptions")(rawOptions)
    if (span != null) __obj.updateDynamic("span")(span.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpecimenProps]
  }
}

