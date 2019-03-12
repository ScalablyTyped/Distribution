package typings
package baidumapDashWebDashSdkLib.BMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutocompleteOptions extends js.Object {
  var input: js.UndefOr[java.lang.String | stdLib.HTMLElement] = js.undefined
  var location: js.UndefOr[java.lang.String | Map | Point] = js.undefined
  var onSearchComplete: js.UndefOr[js.Function1[/* result */ AutocompleteResult, scala.Unit]] = js.undefined
  var types: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object AutocompleteOptions {
  @scala.inline
  def apply(
    input: java.lang.String | stdLib.HTMLElement = null,
    location: java.lang.String | Map | Point = null,
    onSearchComplete: /* result */ AutocompleteResult => scala.Unit = null,
    types: js.Array[java.lang.String] = null
  ): AutocompleteOptions = {
    val __obj = js.Dynamic.literal()
    if (input != null) __obj.updateDynamic("input")(input.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (onSearchComplete != null) __obj.updateDynamic("onSearchComplete")(js.Any.fromFunction1(onSearchComplete))
    if (types != null) __obj.updateDynamic("types")(types)
    __obj.asInstanceOf[AutocompleteOptions]
  }
}

