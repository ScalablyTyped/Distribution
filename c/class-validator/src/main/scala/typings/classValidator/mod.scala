package typings.classValidator

import org.scalablytyped.runtime.Instantiable1
import typings.classValidator.classValidatorStrings.`3`
import typings.classValidator.classValidatorStrings.`4`
import typings.classValidator.classValidatorStrings.`5`
import typings.classValidator.containerMod.UseContainerOptions
import typings.classValidator.registerDecoratorMod.ValidationDecoratorOptions
import typings.classValidator.validationArgumentsMod.ValidationArguments
import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.classValidator.validationSchemaMod.ValidationSchema
import typings.classValidator.validationTypeOptionsMod.IsNumberOptions
import typings.classValidator.validatorOptionsMod.ValidatorOptions
import typings.std.Date
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("class-validator", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class MetadataStorage ()
    extends typings.classValidator.metadataStorageMod.MetadataStorage
  
  @js.native
  class ValidationError ()
    extends typings.classValidator.validationErrorMod.ValidationError
  
  @js.native
  class ValidationTypes ()
    extends typings.classValidator.validationTypesMod.ValidationTypes
  
  @js.native
  class Validator ()
    extends typings.classValidator.validatorMod.Validator
  
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
  def IsAlpha(locale: String): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsAlpha(locale: String, validationOptions: ValidationOptions): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsAlphanumeric(): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsAlphanumeric(locale: String): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsAlphanumeric(locale: String, validationOptions: ValidationOptions): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
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
  def IsCurrency(
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ValidatorJS.IsCurrencyOptions */ js.Any
  ): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsCurrency(
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ValidatorJS.IsCurrencyOptions */ js.Any,
    validationOptions: ValidationOptions
  ): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsDate(): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsDate(validationOptions: ValidationOptions): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsDateString(): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsDateString(validationOptions: ValidationOptions): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsDecimal(): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsDecimal(
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ValidatorJS.IsDecimalOptions */ js.Any
  ): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsDecimal(
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ValidatorJS.IsDecimalOptions */ js.Any,
    validationOptions: ValidationOptions
  ): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsDefined(): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsDefined(validationOptions: ValidationOptions): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsDivisibleBy(num: Double): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsDivisibleBy(num: Double, validationOptions: ValidationOptions): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsEmail(): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsEmail(
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ValidatorJS.IsEmailOptions */ js.Any
  ): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsEmail(
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ValidatorJS.IsEmailOptions */ js.Any,
    validationOptions: ValidationOptions
  ): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsEmpty(): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsEmpty(validationOptions: ValidationOptions): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsEnum(entity: js.Object): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsEnum(entity: js.Object, validationOptions: ValidationOptions): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsFQDN(): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsFQDN(
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ValidatorJS.IsFQDNOptions */ js.Any
  ): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsFQDN(
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ValidatorJS.IsFQDNOptions */ js.Any,
    validationOptions: ValidationOptions
  ): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsFullWidth(): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsFullWidth(validationOptions: ValidationOptions): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsHalfWidth(): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsHalfWidth(validationOptions: ValidationOptions): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsHash(algorithm: String): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsHash(algorithm: String, validationOptions: ValidationOptions): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsHexColor(): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsHexColor(validationOptions: ValidationOptions): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsHexadecimal(): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsHexadecimal(validationOptions: ValidationOptions): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsIP(): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsIP(version: Double): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsIP(version: Double, validationOptions: ValidationOptions): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsISBN(): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsISBN(version: Double): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsISBN(version: Double, validationOptions: ValidationOptions): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsISIN(): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsISIN(validationOptions: ValidationOptions): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsISO31661Alpha2(): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsISO31661Alpha2(validationOptions: ValidationOptions): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsISO31661Alpha3(): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsISO31661Alpha3(validationOptions: ValidationOptions): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsISO8601(): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsISO8601(validationOptions: ValidationOptions): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsISSN(): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsISSN(
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ValidatorJS.IsISSNOptions */ js.Any
  ): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsISSN(
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ValidatorJS.IsISSNOptions */ js.Any,
    validationOptions: ValidationOptions
  ): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
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
  def IsJWT(): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsJWT(validationOptions: ValidationOptions): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsLatLong(): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsLatLong(validationOptions: ValidationOptions): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsLatitude(): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsLatitude(validationOptions: ValidationOptions): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsLongitude(): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsLongitude(validationOptions: ValidationOptions): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsLowercase(): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsLowercase(validationOptions: ValidationOptions): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsMACAddress(): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsMACAddress(validationOptions: ValidationOptions): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
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
  def IsNotEmptyObject(): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsNotEmptyObject(validationOptions: ValidationOptions): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsNotIn(values: js.Array[_]): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsNotIn(values: js.Array[_], validationOptions: ValidationOptions): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsNumber(): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsNumber(options: IsNumberOptions): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsNumber(options: IsNumberOptions, validationOptions: ValidationOptions): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsNumberString(): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsNumberString(validationOptions: ValidationOptions): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsNumberString(validationOptions: ValidationOptions, NumberOptions: IsNumberOptions): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsObject(): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsObject(validationOptions: ValidationOptions): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsOptional(): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsOptional(validationOptions: ValidationOptions): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsPhoneNumber(region: String): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsPhoneNumber(region: String, validationOptions: ValidationOptions): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsPort(): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsPort(validationOptions: ValidationOptions): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
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
  def IsUrl(
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ValidatorJS.IsURLOptions */ js.Any
  ): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def IsUrl(
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ValidatorJS.IsURLOptions */ js.Any,
    validationOptions: ValidationOptions
  ): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
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
  def ValidateIf(condition: js.Function2[/* object */ js.Any, /* value */ js.Any, Boolean]): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def ValidateIf(
    condition: js.Function2[/* object */ js.Any, /* value */ js.Any, Boolean],
    validationOptions: ValidationOptions
  ): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def ValidateNested(): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def ValidateNested(validationOptions: ValidationOptions): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def ValidatePromise(): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  def ValidatePromise(validationOptions: ValidationOptions): js.Function2[/* object */ js.Object, /* propertyName */ String, Unit] = js.native
  @JSName("Validate")
  def Validate_(constraintClass: js.Function): js.Function = js.native
  @JSName("Validate")
  def Validate_(constraintClass: js.Function, constraints: js.Array[_]): js.Function = js.native
  @JSName("Validate")
  def Validate_(constraintClass: js.Function, constraints: js.Array[_], validationOptions: ValidationOptions): js.Function = js.native
  @JSName("Validate")
  def Validate_(constraintClass: js.Function, validationOptions: ValidationOptions): js.Function = js.native
  def ValidatorConstraint(): js.Function1[/* target */ js.Function, Unit] = js.native
  def ValidatorConstraint(options: AnonAsync): js.Function1[/* target */ js.Function, Unit] = js.native
  def getFromContainer[T](someClass: js.Function): T = js.native
  def getFromContainer[T](someClass: AnonInstantiable[T]): T = js.native
  def registerDecorator(options: ValidationDecoratorOptions): Unit = js.native
  def registerSchema(schema: ValidationSchema): Unit = js.native
  def useContainer(iocContainer: AnonGet): Unit = js.native
  def useContainer(iocContainer: AnonGet, options: UseContainerOptions): Unit = js.native
  def validate(`object`: js.Object): js.Promise[js.Array[typings.classValidator.validationErrorMod.ValidationError]] = js.native
  def validate(`object`: js.Object, validatorOptions: ValidatorOptions): js.Promise[js.Array[typings.classValidator.validationErrorMod.ValidationError]] = js.native
  def validate(schemaName: String, `object`: js.Object): js.Promise[js.Array[typings.classValidator.validationErrorMod.ValidationError]] = js.native
  def validate(schemaName: String, `object`: js.Object, validatorOptions: ValidatorOptions): js.Promise[js.Array[typings.classValidator.validationErrorMod.ValidationError]] = js.native
  def validateOrReject(`object`: js.Object): js.Promise[Unit] = js.native
  def validateOrReject(`object`: js.Object, validatorOptions: ValidatorOptions): js.Promise[Unit] = js.native
  def validateOrReject(schemaName: String, `object`: js.Object): js.Promise[Unit] = js.native
  def validateOrReject(schemaName: String, `object`: js.Object, validatorOptions: ValidatorOptions): js.Promise[Unit] = js.native
  def validateSync(`object`: js.Object): js.Array[typings.classValidator.validationErrorMod.ValidationError] = js.native
  def validateSync(`object`: js.Object, validatorOptions: ValidatorOptions): js.Array[typings.classValidator.validationErrorMod.ValidationError] = js.native
  def validateSync(schemaName: String, `object`: js.Object): js.Array[typings.classValidator.validationErrorMod.ValidationError] = js.native
  def validateSync(schemaName: String, `object`: js.Object, validatorOptions: ValidatorOptions): js.Array[typings.classValidator.validationErrorMod.ValidationError] = js.native
  /* static members */
  @js.native
  object ValidationTypes extends js.Object {
    var ARRAY_CONTAINS: String = js.native
    var ARRAY_MAX_SIZE: String = js.native
    var ARRAY_MIN_SIZE: String = js.native
    var ARRAY_NOT_CONTAINS: String = js.native
    var ARRAY_NOT_EMPTY: String = js.native
    var ARRAY_UNIQUE: String = js.native
    var CONDITIONAL_VALIDATION: String = js.native
    var CONTAINS: String = js.native
    var CUSTOM_VALIDATION: String = js.native
    var EQUALS: String = js.native
    var IS_ALPHA: String = js.native
    var IS_ALPHANUMERIC: String = js.native
    var IS_ARRAY: String = js.native
    var IS_ASCII: String = js.native
    var IS_BASE64: String = js.native
    var IS_BOOLEAN: String = js.native
    var IS_BOOLEAN_STRING: String = js.native
    var IS_BYTE_LENGTH: String = js.native
    var IS_CREDIT_CARD: String = js.native
    var IS_CURRENCY: String = js.native
    var IS_DATE: String = js.native
    var IS_DATE_STRING: String = js.native
    var IS_DECIMAL: String = js.native
    var IS_DEFINED: String = js.native
    var IS_DIVISIBLE_BY: String = js.native
    var IS_EMAIL: String = js.native
    var IS_EMPTY: String = js.native
    var IS_ENUM: String = js.native
    var IS_FQDN: String = js.native
    var IS_FULL_WIDTH: String = js.native
    var IS_HALF_WIDTH: String = js.native
    var IS_HASH: String = js.native
    var IS_HEXADECIMAL: String = js.native
    var IS_HEX_COLOR: String = js.native
    var IS_IN: String = js.native
    var IS_INSTANCE: String = js.native
    var IS_INT: String = js.native
    var IS_IP: String = js.native
    var IS_ISBN: String = js.native
    var IS_ISIN: String = js.native
    var IS_ISO31661_ALPHA_2: String = js.native
    var IS_ISO31661_ALPHA_3: String = js.native
    var IS_ISO8601: String = js.native
    var IS_ISSN: String = js.native
    var IS_JSON: String = js.native
    var IS_JWT: String = js.native
    var IS_LATITUDE: String = js.native
    var IS_LATLONG: String = js.native
    var IS_LONGITUDE: String = js.native
    var IS_LOWERCASE: String = js.native
    var IS_MAC_ADDRESS: String = js.native
    var IS_MILITARY_TIME: String = js.native
    var IS_MOBILE_PHONE: String = js.native
    var IS_MONGO_ID: String = js.native
    var IS_MULTIBYTE: String = js.native
    var IS_NEGATIVE: String = js.native
    var IS_NOT_EMPTY: String = js.native
    var IS_NOT_EMPTY_OBJECT: String = js.native
    var IS_NOT_IN: String = js.native
    var IS_NUMBER: String = js.native
    var IS_NUMBER_STRING: String = js.native
    var IS_OBJECT: String = js.native
    var IS_PHONE_NUMBER: String = js.native
    var IS_PORT: String = js.native
    var IS_POSITIVE: String = js.native
    var IS_STRING: String = js.native
    var IS_SURROGATE_PAIR: String = js.native
    var IS_UPPERCASE: String = js.native
    var IS_URL: String = js.native
    var IS_UUID: String = js.native
    var IS_VARIABLE_WIDTH: String = js.native
    var LENGTH: String = js.native
    var MATCHES: String = js.native
    var MAX: String = js.native
    var MAX_DATE: String = js.native
    var MAX_LENGTH: String = js.native
    var MIN: String = js.native
    var MIN_DATE: String = js.native
    var MIN_LENGTH: String = js.native
    var NESTED_VALIDATION: String = js.native
    var NOT_CONTAINS: String = js.native
    var NOT_EQUALS: String = js.native
    var PROMISE_VALIDATION: String = js.native
    var WHITELIST: String = js.native
    /**
      * Gets default validation error message for the given validation type.
      */
    def getMessage(`type`: String, isEach: Boolean): String | (js.Function1[/* args */ ValidationArguments, String]) = js.native
    /**
      * Checks if validation type is valid.
      */
    def isValid(`type`: String): Boolean = js.native
  }
  
}

