package typings.calidation.mod

import typings.std.Partial
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type BlacklistValidator[T /* <: js.Object */] = BlacklistValidatorConfig[T] | (js.Function1[/* context */ ValidatorContext[T], BlacklistValidatorConfig[T]])

type CustomValidatorFunction[T /* <: js.Object */] = js.Function2[
/* config */ SimpleValidatorConfig[T], 
/* context */ ValidatorContext[T], 
js.Function1[
  /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
  String | Null
]]

type Dirty[T /* <: js.Object */] = Record[/* keyof T */ String, Boolean]

type Errors[T /* <: js.Object */] = Record[/* keyof T */ String, String | Null]

type Fields[T /* <: js.Object */] = T

type FieldsConfig[T /* <: js.Object */] = Record[
String, 
FieldConfig[T] | (Record[String, SimpleValidator[T] | (ValueValidator[Any, T])])]

type LengthValidator[T /* <: js.Object */] = LengthValidatorConfig[T] | (js.Function1[/* context */ ValidatorContext[T], LengthValidatorConfig[T]])

type RegexValidator[T /* <: js.Object */] = RegexValidatorConfig[T] | (js.Function1[/* context */ ValidatorContext[T], RegexValidatorConfig[T]])

type SimpleValidator[T /* <: js.Object */] = String | SimpleValidatorConfig[T] | (js.Function1[/* context */ ValidatorContext[T], SimpleValidatorConfig[T]])

type Transform[T /* <: js.Object */] = Record[
/* keyof T */ String, 
js.Function1[
  /* value */ Any, 
  /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
]]

type Transforms[T /* <: js.Object */] = Partial[Transform[T]]

type Validator[T /* <: js.Object */] = SimpleValidator[T] | BlacklistValidator[T] | (ValueValidator[Any, T]) | RegexValidator[T] | WhitelistValidator[T] | LengthValidator[T]

type ValueValidator[P, T /* <: js.Object */] = (ValueValidatorConfig[P, T]) | (js.Function1[/* context */ ValidatorContext[T], ValueValidatorConfig[P, T]])

type WhitelistValidator[T /* <: js.Object */] = WhitelistValidatorConfig[T] | (js.Function1[/* context */ ValidatorContext[T], RegexValidatorConfig[T]])
