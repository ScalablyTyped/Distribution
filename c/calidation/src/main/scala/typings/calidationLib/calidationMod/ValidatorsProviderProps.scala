package typings
package calidationLib.calidationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidatorsProviderProps extends js.Object {
  var validators: Dictionary[
    js.Function1[
      /* config */ SimpleValidatorConfig, 
      js.Function1[/* value */ _, java.lang.String | scala.Null]
    ]
  ]
}

object ValidatorsProviderProps {
  @scala.inline
  def apply(
    validators: Dictionary[
      js.Function1[
        /* config */ SimpleValidatorConfig, 
        js.Function1[/* value */ _, java.lang.String | scala.Null]
      ]
    ]
  ): ValidatorsProviderProps = {
    val __obj = js.Dynamic.literal(validators = validators)
  
    __obj.asInstanceOf[ValidatorsProviderProps]
  }
}

