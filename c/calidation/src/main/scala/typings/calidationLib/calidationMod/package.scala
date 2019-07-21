package typings
package calidationLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object calidationMod {
  type BlacklistValidator = BlacklistValidatorConfig | (js.Function1[/* context */ ValidatorContext, BlacklistValidatorConfig])
  type Dictionary[T] = org.scalablytyped.runtime.StringDictionary[T]
  type Dirty = Dictionary[scala.Boolean]
  type Errors = Dictionary[java.lang.String | scala.Null]
  type Fields = Dictionary[js.Any]
  type FieldsConfig = Dictionary[FieldConfig]
  type LengthValidator = LengthValidatorConfig | (js.Function1[/* context */ ValidatorContext, LengthValidatorConfig])
  type RegexValidator = RegexValidatorConfig | (js.Function1[/* context */ ValidatorContext, RegexValidatorConfig])
  type SimpleValidator = java.lang.String | SimpleValidatorConfig | (js.Function1[/* context */ ValidatorContext, SimpleValidatorConfig])
  type Transforms = Dictionary[js.Function1[/* value */ js.Any, js.Any]]
  type ValidationContext = stdLib.Omit[
    FormContext, 
    calidationLib.calidationLibStrings.register | calidationLib.calidationLibStrings.unregister
  ]
  type Validator = SimpleValidator | BlacklistValidator | ValueValidator[js.Any] | RegexValidator | WhitelistValidator | LengthValidator
  type ValueValidator[T] = ValueValidatorConfig[T] | (js.Function1[/* context */ ValidatorContext, ValueValidatorConfig[T]])
  type WhitelistValidator = WhitelistValidatorConfig | (js.Function1[/* context */ ValidatorContext, RegexValidatorConfig])
}
