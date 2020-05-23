package typings.axiosMockAdapter.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestDataMatcher
  extends /* index */ StringDictionary[js.Any] {
  var params: js.UndefOr[StringDictionary[js.Any]] = js.undefined
}

object RequestDataMatcher {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    params: StringDictionary[js.Any] = null
  ): RequestDataMatcher = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestDataMatcher]
  }
}

