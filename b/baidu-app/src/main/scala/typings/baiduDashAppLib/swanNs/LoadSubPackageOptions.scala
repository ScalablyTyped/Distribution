package typings
package baiduDashAppLib.swanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoadSubPackageOptions
  extends BaseOptions[js.Any, js.Any] {
  var root: java.lang.String
}

object LoadSubPackageOptions {
  @scala.inline
  def apply(
    root: java.lang.String,
    complete: js.Function1[/* res */ js.Any, scala.Unit] = null,
    fail: js.Function1[js.Any, scala.Unit] = null,
    success: js.Function1[js.Any, scala.Unit] = null
  ): LoadSubPackageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("root")(root)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    if (success != null) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[LoadSubPackageOptions]
  }
}

