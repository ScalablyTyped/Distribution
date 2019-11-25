package typings.deprecatedDashDecorator.deprecatedDashDecoratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeprecatedOptions extends js.Object {
  var alternative: js.UndefOr[String] = js.undefined
  var url: js.UndefOr[String] = js.undefined
  var version: js.UndefOr[String] = js.undefined
}

object DeprecatedOptions {
  @scala.inline
  def apply(alternative: String = null, url: String = null, version: String = null): DeprecatedOptions = {
    val __obj = js.Dynamic.literal()
    if (alternative != null) __obj.updateDynamic("alternative")(alternative.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeprecatedOptions]
  }
}

