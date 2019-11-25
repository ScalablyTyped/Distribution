package typings.chromeDashApps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ extends js.Object {
  var extensions: js.UndefOr[
    js.Array[
      typings.chromeDashApps.chromeDashAppsStrings.`*` | String | Anon_Includedirectories
    ]
  ] = js.undefined
  /** File types to handle */
  var types: js.UndefOr[
    js.Array[
      typings.chromeDashApps.chromeDashAppsStrings.`*` | String | Anon_Includedirectories
    ]
  ] = js.undefined
}

object Anon_ {
  @scala.inline
  def apply(
    extensions: js.Array[
      typings.chromeDashApps.chromeDashAppsStrings.`*` | String | Anon_Includedirectories
    ] = null,
    types: js.Array[
      typings.chromeDashApps.chromeDashAppsStrings.`*` | String | Anon_Includedirectories
    ] = null
  ): Anon_ = {
    val __obj = js.Dynamic.literal()
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    if (types != null) __obj.updateDynamic("types")(types.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_]
  }
}

