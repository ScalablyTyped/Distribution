package typings
package baseuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Any extends js.Object {
  var filterOption: js.UndefOr[
    js.Function2[
      /* option */ baseuiLib.selectMod.Option, 
      /* filterValue */ java.lang.String, 
      scala.Boolean
    ]
  ] = js.undefined
  var ignoreCase: js.UndefOr[scala.Boolean] = js.undefined
  var labelKey: js.UndefOr[java.lang.String] = js.undefined
  var matchPos: js.UndefOr[baseuiLib.baseuiLibStrings.any | baseuiLib.baseuiLibStrings.start] = js.undefined
  var matchProp: js.UndefOr[
    baseuiLib.baseuiLibStrings.any | baseuiLib.baseuiLibStrings.label | baseuiLib.baseuiLibStrings.value
  ] = js.undefined
  var trimFilter: js.UndefOr[scala.Boolean] = js.undefined
  var valueKey: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Any {
  @scala.inline
  def apply(
    filterOption: (/* option */ baseuiLib.selectMod.Option, /* filterValue */ java.lang.String) => scala.Boolean = null,
    ignoreCase: js.UndefOr[scala.Boolean] = js.undefined,
    labelKey: java.lang.String = null,
    matchPos: baseuiLib.baseuiLibStrings.any | baseuiLib.baseuiLibStrings.start = null,
    matchProp: baseuiLib.baseuiLibStrings.any | baseuiLib.baseuiLibStrings.label | baseuiLib.baseuiLibStrings.value = null,
    trimFilter: js.UndefOr[scala.Boolean] = js.undefined,
    valueKey: java.lang.String = null
  ): Anon_Any = {
    val __obj = js.Dynamic.literal()
    if (filterOption != null) __obj.updateDynamic("filterOption")(js.Any.fromFunction2(filterOption))
    if (!js.isUndefined(ignoreCase)) __obj.updateDynamic("ignoreCase")(ignoreCase)
    if (labelKey != null) __obj.updateDynamic("labelKey")(labelKey)
    if (matchPos != null) __obj.updateDynamic("matchPos")(matchPos.asInstanceOf[js.Any])
    if (matchProp != null) __obj.updateDynamic("matchProp")(matchProp.asInstanceOf[js.Any])
    if (!js.isUndefined(trimFilter)) __obj.updateDynamic("trimFilter")(trimFilter)
    if (valueKey != null) __obj.updateDynamic("valueKey")(valueKey)
    __obj.asInstanceOf[Anon_Any]
  }
}

