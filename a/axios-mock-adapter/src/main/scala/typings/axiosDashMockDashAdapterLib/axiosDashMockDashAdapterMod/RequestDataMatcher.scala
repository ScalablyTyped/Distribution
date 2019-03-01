package typings
package axiosDashMockDashAdapterLib.axiosDashMockDashAdapterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestDataMatcher
  extends /* index */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var params: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
}

object RequestDataMatcher {
  @scala.inline
  def apply(
    StringDictionary: /* index */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    params: org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): RequestDataMatcher = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (params != null) __obj.updateDynamic("params")(params)
    __obj.asInstanceOf[RequestDataMatcher]
  }
}

