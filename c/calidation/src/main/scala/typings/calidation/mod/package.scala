package typings.calidation.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type BlacklistValidator[T /* <: js.Object */] = typings.calidation.mod.BlacklistValidatorConfig[T] | (js.Function1[
/* context */ typings.calidation.mod.ValidatorContext[T], 
typings.calidation.mod.BlacklistValidatorConfig[T]])

type CustomValidatorFunction[T /* <: js.Object */] = js.Function2[
/* config */ typings.calidation.mod.SimpleValidatorConfig[T], 
/* context */ typings.calidation.mod.ValidatorContext[T], 
js.Function1[
  /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
  java.lang.String | scala.Null
]]

type Dirty[T /* <: js.Object */] = typings.std.Record[/* keyof T */ java.lang.String, scala.Boolean]

type Errors[T /* <: js.Object */] = typings.std.Record[/* keyof T */ java.lang.String, java.lang.String | scala.Null]

type Fields[T /* <: js.Object */] = T

type FieldsConfig[T /* <: js.Object */] = typings.std.Record[
java.lang.String, 
typings.calidation.mod.FieldConfig[T] | (typings.std.Record[
  java.lang.String, 
  typings.calidation.mod.SimpleValidator[T] | (typings.calidation.mod.ValueValidator[js.Any, T])
])]

type LengthValidator[T /* <: js.Object */] = typings.calidation.mod.LengthValidatorConfig[T] | (js.Function1[
/* context */ typings.calidation.mod.ValidatorContext[T], 
typings.calidation.mod.LengthValidatorConfig[T]])

type RegexValidator[T /* <: js.Object */] = typings.calidation.mod.RegexValidatorConfig[T] | (js.Function1[
/* context */ typings.calidation.mod.ValidatorContext[T], 
typings.calidation.mod.RegexValidatorConfig[T]])

type SimpleValidator[T /* <: js.Object */] = java.lang.String | typings.calidation.mod.SimpleValidatorConfig[T] | (js.Function1[
/* context */ typings.calidation.mod.ValidatorContext[T], 
typings.calidation.mod.SimpleValidatorConfig[T]])

type Transform[T /* <: js.Object */] = typings.std.Record[
/* keyof T */ java.lang.String, 
js.Function1[
  /* value */ js.Any, 
  /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
]]

type Transforms[T /* <: js.Object */] = typings.std.Partial[typings.calidation.mod.Transform[T]]

type Validator[T /* <: js.Object */] = typings.calidation.mod.SimpleValidator[T] | typings.calidation.mod.BlacklistValidator[T] | (typings.calidation.mod.ValueValidator[js.Any, T]) | typings.calidation.mod.RegexValidator[T] | typings.calidation.mod.WhitelistValidator[T] | typings.calidation.mod.LengthValidator[T]

type ValueValidator[P, T /* <: js.Object */] = (typings.calidation.mod.ValueValidatorConfig[P, T]) | (js.Function1[
/* context */ typings.calidation.mod.ValidatorContext[T], 
typings.calidation.mod.ValueValidatorConfig[P, T]])

type WhitelistValidator[T /* <: js.Object */] = typings.calidation.mod.WhitelistValidatorConfig[T] | (js.Function1[
/* context */ typings.calidation.mod.ValidatorContext[T], 
typings.calidation.mod.RegexValidatorConfig[T]])
