package typings.classDashValidator

import org.scalablytyped.runtime.Instantiable1
import typings.classDashValidator.classDashValidatorStrings.`10`
import typings.classDashValidator.classDashValidatorStrings.`13`
import typings.classDashValidator.classDashValidatorStrings.`3`
import typings.classDashValidator.classDashValidatorStrings.`4`
import typings.classDashValidator.classDashValidatorStrings.`5`
import typings.classDashValidator.classDashValidatorStrings.`6`
import typings.classDashValidator.decoratorValidationOptionsMod.ValidationOptions
import typings.classDashValidator.validationValidationTypeOptionsMod.IsCurrencyOptions
import typings.classDashValidator.validationValidationTypeOptionsMod.IsEmailOptions
import typings.classDashValidator.validationValidationTypeOptionsMod.IsFQDNOptions
import typings.classDashValidator.validationValidationTypeOptionsMod.IsNumberOptions
import typings.classDashValidator.validationValidationTypeOptionsMod.IsURLOptions
import typings.std.Date
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("class-validator/decorator/decorators", JSImport.Namespace)
@js.native
object decoratorDecoratorsMod extends js.Object {
  def Allow(): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def Allow(validationOptions: ValidationOptions): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def ArrayContains(values: js.Array[_]): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def ArrayContains(values: js.Array[_], validationOptions: ValidationOptions): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def ArrayMaxSize(max: Double): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def ArrayMaxSize(max: Double, validationOptions: ValidationOptions): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def ArrayMinSize(min: Double): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def ArrayMinSize(min: Double, validationOptions: ValidationOptions): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def ArrayNotContains(values: js.Array[_]): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def ArrayNotContains(values: js.Array[_], validationOptions: ValidationOptions): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def ArrayNotEmpty(): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def ArrayNotEmpty(validationOptions: ValidationOptions): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def ArrayUnique(): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def ArrayUnique(validationOptions: ValidationOptions): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def Contains(seed: String): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def Contains(seed: String, validationOptions: ValidationOptions): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def Equals(comparison: js.Any): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def Equals(comparison: js.Any, validationOptions: ValidationOptions): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsAlpha(): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsAlpha(validationOptions: ValidationOptions): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsAlphanumeric(): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsAlphanumeric(validationOptions: ValidationOptions): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsArray(): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsArray(validationOptions: ValidationOptions): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsAscii(): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsAscii(validationOptions: ValidationOptions): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsBase64(): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsBase64(validationOptions: ValidationOptions): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsBoolean(): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsBoolean(validationOptions: ValidationOptions): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsBooleanString(): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsBooleanString(validationOptions: ValidationOptions): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsByteLength(min: Double): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsByteLength(min: Double, max: Double): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsByteLength(min: Double, max: Double, validationOptions: ValidationOptions): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsCreditCard(): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsCreditCard(validationOptions: ValidationOptions): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsCurrency(): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsCurrency(options: IsCurrencyOptions): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsCurrency(options: IsCurrencyOptions, validationOptions: ValidationOptions): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsDate(): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsDate(validationOptions: ValidationOptions): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsDateString(): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsDateString(validationOptions: ValidationOptions): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsDefined(): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsDefined(validationOptions: ValidationOptions): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsDivisibleBy(num: Double): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsDivisibleBy(num: Double, validationOptions: ValidationOptions): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsEmail(): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsEmail(options: IsEmailOptions): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsEmail(options: IsEmailOptions, validationOptions: ValidationOptions): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsEmpty(): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsEmpty(validationOptions: ValidationOptions): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsEnum(entity: js.Object): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsEnum(entity: js.Object, validationOptions: ValidationOptions): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsFQDN(): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsFQDN(options: IsFQDNOptions): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsFQDN(options: IsFQDNOptions, validationOptions: ValidationOptions): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsFullWidth(): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsFullWidth(validationOptions: ValidationOptions): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsHalfWidth(): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsHalfWidth(validationOptions: ValidationOptions): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsHexColor(): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsHexColor(validationOptions: ValidationOptions): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsHexadecimal(): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsHexadecimal(validationOptions: ValidationOptions): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsIP(): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  @JSName("IsIP")
  def IsIP_4(version: `4`): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  @JSName("IsIP")
  def IsIP_4(version: `4`, validationOptions: ValidationOptions): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  @JSName("IsIP")
  def IsIP_6(version: `6`): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  @JSName("IsIP")
  def IsIP_6(version: `6`, validationOptions: ValidationOptions): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsISBN(): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  @JSName("IsISBN")
  def IsISBN_10(version: `10`): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  @JSName("IsISBN")
  def IsISBN_10(version: `10`, validationOptions: ValidationOptions): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  @JSName("IsISBN")
  def IsISBN_13(version: `13`): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  @JSName("IsISBN")
  def IsISBN_13(version: `13`, validationOptions: ValidationOptions): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsISIN(): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsISIN(validationOptions: ValidationOptions): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsISO8601(): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsISO8601(validationOptions: ValidationOptions): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsIn(values: js.Array[_]): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsIn(values: js.Array[_], validationOptions: ValidationOptions): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsInstance(targetType: Instantiable1[/* args (repeated) */ js.Any, js.Any]): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsInstance(
    targetType: Instantiable1[/* args (repeated) */ js.Any, js.Any],
    validationOptions: ValidationOptions
  ): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsInt(): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsInt(validationOptions: ValidationOptions): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsJSON(): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsJSON(validationOptions: ValidationOptions): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsLowercase(): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsLowercase(validationOptions: ValidationOptions): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsMilitaryTime(): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsMilitaryTime(validationOptions: ValidationOptions): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsMobilePhone(locale: String): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsMobilePhone(locale: String, validationOptions: ValidationOptions): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsMongoId(): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsMongoId(validationOptions: ValidationOptions): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsMultibyte(): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsMultibyte(validationOptions: ValidationOptions): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsNegative(): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsNegative(validationOptions: ValidationOptions): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsNotEmpty(): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsNotEmpty(validationOptions: ValidationOptions): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsNotIn(values: js.Array[_]): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsNotIn(values: js.Array[_], validationOptions: ValidationOptions): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsNumber(): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsNumber(options: IsNumberOptions): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsNumber(options: IsNumberOptions, validationOptions: ValidationOptions): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsNumberString(): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsNumberString(validationOptions: ValidationOptions): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsOptional(): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsOptional(validationOptions: ValidationOptions): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsPhoneNumber(region: String): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsPhoneNumber(region: String, validationOptions: ValidationOptions): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsPositive(): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsPositive(validationOptions: ValidationOptions): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsString(): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsString(validationOptions: ValidationOptions): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsSurrogatePair(): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsSurrogatePair(validationOptions: ValidationOptions): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsUUID(): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  @JSName("IsUUID")
  def IsUUID_3(version: `3`): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  @JSName("IsUUID")
  def IsUUID_3(version: `3`, validationOptions: ValidationOptions): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  @JSName("IsUUID")
  def IsUUID_4(version: `4`): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  @JSName("IsUUID")
  def IsUUID_4(version: `4`, validationOptions: ValidationOptions): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  @JSName("IsUUID")
  def IsUUID_5(version: `5`): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  @JSName("IsUUID")
  def IsUUID_5(version: `5`, validationOptions: ValidationOptions): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsUppercase(): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsUppercase(validationOptions: ValidationOptions): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsUrl(): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsUrl(options: IsURLOptions): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsUrl(options: IsURLOptions, validationOptions: ValidationOptions): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsVariableWidth(): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsVariableWidth(validationOptions: ValidationOptions): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def Length(min: Double): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def Length(min: Double, max: Double): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def Length(min: Double, max: Double, validationOptions: ValidationOptions): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def Matches(pattern: RegExp): js.Function = js.native
  def Matches(pattern: RegExp, modifiers: String): js.Function = js.native
  def Matches(pattern: RegExp, modifiers: String, validationOptions: ValidationOptions): js.Function = js.native
  def Matches(pattern: RegExp, validationOptions: ValidationOptions): js.Function = js.native
  def Max(max: Double): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def Max(max: Double, validationOptions: ValidationOptions): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def MaxDate(date: Date): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def MaxDate(date: Date, validationOptions: ValidationOptions): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def MaxLength(max: Double): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def MaxLength(max: Double, validationOptions: ValidationOptions): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def Min(min: Double): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def Min(min: Double, validationOptions: ValidationOptions): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def MinDate(date: Date): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def MinDate(date: Date, validationOptions: ValidationOptions): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def MinLength(min: Double): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def MinLength(min: Double, validationOptions: ValidationOptions): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def NotContains(seed: String): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def NotContains(seed: String, validationOptions: ValidationOptions): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def NotEquals(comparison: js.Any): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def NotEquals(comparison: js.Any, validationOptions: ValidationOptions): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def Validate(constraintClass: js.Function): js.Function = js.native
  def Validate(constraintClass: js.Function, constraints: js.Array[_]): js.Function = js.native
  def Validate(constraintClass: js.Function, constraints: js.Array[_], validationOptions: ValidationOptions): js.Function = js.native
  def Validate(constraintClass: js.Function, validationOptions: ValidationOptions): js.Function = js.native
  def ValidateIf(condition: js.Function2[/* object */ js.Any, /* value */ js.Any, Boolean]): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def ValidateIf(
    condition: js.Function2[/* object */ js.Any, /* value */ js.Any, Boolean],
    validationOptions: ValidationOptions
  ): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def ValidateNested(): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def ValidateNested(validationOptions: ValidationOptions): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def ValidatorConstraint(): js.Function1[/* target */ js.Function, Unit] = js.native
  def ValidatorConstraint(options: Anon_Async): js.Function1[/* target */ js.Function, Unit] = js.native
}

