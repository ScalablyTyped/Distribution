package typings.calidation

import org.scalablytyped.runtime.StringDictionary
import typings.calidation.calidationStrings.register
import typings.calidation.calidationStrings.unregister
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object calidationMod {
  type BlacklistValidator = BlacklistValidatorConfig | (js.Function1[/* context */ ValidatorContext, BlacklistValidatorConfig])
  type Dictionary[T] = StringDictionary[T]
  type Dirty = Dictionary[Boolean]
  type Errors = Dictionary[String | Null]
  type Fields = Dictionary[js.Any]
  type FieldsConfig = Dictionary[FieldConfig]
  type LengthValidator = LengthValidatorConfig | (js.Function1[/* context */ ValidatorContext, LengthValidatorConfig])
  type RegexValidator = RegexValidatorConfig | (js.Function1[/* context */ ValidatorContext, RegexValidatorConfig])
  type SimpleValidator = String | SimpleValidatorConfig | (js.Function1[/* context */ ValidatorContext, SimpleValidatorConfig])
  type Transforms = Dictionary[js.Function1[/* value */ js.Any, js.Any]]
  type ValidationContext = Omit[FormContext, register | unregister]
  type Validator = SimpleValidator | BlacklistValidator | ValueValidator[js.Any] | RegexValidator | WhitelistValidator | LengthValidator
  type ValueValidator[T] = ValueValidatorConfig[T] | (js.Function1[/* context */ ValidatorContext, ValueValidatorConfig[T]])
  type WhitelistValidator = WhitelistValidatorConfig | (js.Function1[/* context */ ValidatorContext, RegexValidatorConfig])
}
