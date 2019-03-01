package typings
package baiduDashAppLib.swanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthorizeOptions
  extends BaseOptions[js.Any, js.Any] {
  var scope: Scope
}

object AuthorizeOptions {
  @scala.inline
  def apply(
    scope: Scope,
    complete: js.Function1[/* res */ js.Any, scala.Unit] = null,
    fail: js.Function1[js.Any, scala.Unit] = null,
    success: js.Function1[js.Any, scala.Unit] = null
  ): AuthorizeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("scope")(scope)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    if (success != null) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[AuthorizeOptions]
  }
}

