package typings.calidation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type BlacklistValidator = typings.calidation.mod.BlacklistValidatorConfig | (js.Function1[
    /* context */ typings.calidation.mod.ValidatorContext, 
    typings.calidation.mod.BlacklistValidatorConfig
  ])
  type Dictionary[T] = org.scalablytyped.runtime.StringDictionary[T]
  type Dirty = typings.calidation.mod.Dictionary[scala.Boolean]
  type Errors = typings.calidation.mod.Dictionary[java.lang.String | scala.Null]
  type Fields = typings.calidation.mod.Dictionary[js.Any]
  type FieldsConfig = typings.calidation.mod.Dictionary[typings.calidation.mod.FieldConfig]
  type LengthValidator = typings.calidation.mod.LengthValidatorConfig | (js.Function1[
    /* context */ typings.calidation.mod.ValidatorContext, 
    typings.calidation.mod.LengthValidatorConfig
  ])
  type RegexValidator = typings.calidation.mod.RegexValidatorConfig | (js.Function1[
    /* context */ typings.calidation.mod.ValidatorContext, 
    typings.calidation.mod.RegexValidatorConfig
  ])
  type SimpleValidator = java.lang.String | typings.calidation.mod.SimpleValidatorConfig | (js.Function1[
    /* context */ typings.calidation.mod.ValidatorContext, 
    typings.calidation.mod.SimpleValidatorConfig
  ])
  type Transforms = typings.calidation.mod.Dictionary[js.Function1[/* value */ js.Any, js.Any]]
  type ValidationContext = typings.std.Omit[
    typings.calidation.mod.FormContext, 
    typings.calidation.calidationStrings.register | typings.calidation.calidationStrings.unregister
  ]
  type Validator = typings.calidation.mod.SimpleValidator | typings.calidation.mod.BlacklistValidator | typings.calidation.mod.ValueValidator[js.Any] | typings.calidation.mod.RegexValidator | typings.calidation.mod.WhitelistValidator | typings.calidation.mod.LengthValidator
  type ValueValidator[T] = typings.calidation.mod.ValueValidatorConfig[T] | (js.Function1[
    /* context */ typings.calidation.mod.ValidatorContext, 
    typings.calidation.mod.ValueValidatorConfig[T]
  ])
  type WhitelistValidator = typings.calidation.mod.WhitelistValidatorConfig | (js.Function1[
    /* context */ typings.calidation.mod.ValidatorContext, 
    typings.calidation.mod.RegexValidatorConfig
  ])
}
