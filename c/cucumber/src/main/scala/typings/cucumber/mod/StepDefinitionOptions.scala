package typings.cucumber.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StepDefinitionOptions extends js.Object {
  var timeout: js.UndefOr[Double] = js.undefined
  var wrapperOptions: js.UndefOr[StringDictionary[js.Any]] = js.undefined
}

object StepDefinitionOptions {
  @scala.inline
  def apply(timeout: js.UndefOr[Double] = js.undefined, wrapperOptions: StringDictionary[js.Any] = null): StepDefinitionOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    if (wrapperOptions != null) __obj.updateDynamic("wrapperOptions")(wrapperOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[StepDefinitionOptions]
  }
}

