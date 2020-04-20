package typings.calidation.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidatorsProviderProps extends js.Object {
  var validators: Dictionary[
    js.Function1[/* config */ SimpleValidatorConfig, js.Function1[/* value */ _, String | Null]]
  ]
}

object ValidatorsProviderProps {
  @scala.inline
  def apply(
    validators: Dictionary[
      js.Function1[/* config */ SimpleValidatorConfig, js.Function1[/* value */ _, String | Null]]
    ]
  ): ValidatorsProviderProps = {
    val __obj = js.Dynamic.literal(validators = validators.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidatorsProviderProps]
  }
}

