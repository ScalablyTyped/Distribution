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
    if (alternative != null) __obj.updateDynamic("alternative")(alternative)
    if (url != null) __obj.updateDynamic("url")(url)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[DeprecatedOptions]
  }
}

