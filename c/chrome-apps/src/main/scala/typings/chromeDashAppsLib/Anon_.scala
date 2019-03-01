package typings
package chromeDashAppsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `Anon_` extends js.Object {
  var extensions: js.UndefOr[
    js.Array[
      chromeDashAppsLib.chromeDashAppsLibStrings.`*` | java.lang.String | Anon_Includedirectories
    ]
  ] = js.undefined
  /** File types to handle */
  var types: js.UndefOr[
    js.Array[
      chromeDashAppsLib.chromeDashAppsLibStrings.`*` | java.lang.String | Anon_Includedirectories
    ]
  ] = js.undefined
}

object `Anon_` {
  @scala.inline
  def apply(
    extensions: js.Array[
      chromeDashAppsLib.chromeDashAppsLibStrings.`*` | java.lang.String | Anon_Includedirectories
    ] = null,
    types: js.Array[
      chromeDashAppsLib.chromeDashAppsLibStrings.`*` | java.lang.String | Anon_Includedirectories
    ] = null
  ): `Anon_` = {
    val __obj = js.Dynamic.literal()
    if (extensions != null) __obj.updateDynamic("extensions")(extensions)
    if (types != null) __obj.updateDynamic("types")(types)
    __obj.asInstanceOf[`Anon_`]
  }
}

