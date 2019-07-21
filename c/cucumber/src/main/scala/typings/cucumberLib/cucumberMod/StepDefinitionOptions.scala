package typings
package cucumberLib.cucumberMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StepDefinitionOptions extends js.Object {
  var timeout: js.UndefOr[scala.Double] = js.undefined
  var wrapperOptions: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
}

object StepDefinitionOptions {
  @scala.inline
  def apply(
    timeout: scala.Int | scala.Double = null,
    wrapperOptions: org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): StepDefinitionOptions = {
    val __obj = js.Dynamic.literal()
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (wrapperOptions != null) __obj.updateDynamic("wrapperOptions")(wrapperOptions)
    __obj.asInstanceOf[StepDefinitionOptions]
  }
}

