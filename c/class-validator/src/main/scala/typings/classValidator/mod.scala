package typings.classValidator

import org.scalablytyped.runtime.Instantiable1
import typings.classValidator.anon.Async
import typings.classValidator.anon.Get
import typings.classValidator.anon.Instantiable
import typings.classValidator.containerMod.UseContainerOptions
import typings.classValidator.isIPMod.IsIpVersion
import typings.classValidator.isISBNMod.IsISBNVersion
import typings.classValidator.isNumberMod.IsNumberOptions
import typings.classValidator.isUUIDMod.UUIDVersion
import typings.classValidator.registerDecoratorMod.ValidationDecoratorOptions
import typings.classValidator.validateByMod.ValidateByOptions
import typings.classValidator.validationArgumentsMod.ValidationArguments
import typings.classValidator.validationOptionsMod.ValidationOptions
import typings.classValidator.validationSchemaMod.ValidationSchema
import typings.classValidator.validatorOptionsMod.ValidatorOptions
import typings.std.Date
import typings.std.PropertyDecorator
import typings.std.RegExp
import typings.validator.mod.validator.AlphaLocale
import typings.validator.mod.validator.AlphanumericLocale
import typings.validator.mod.validator.HashAlgorithm
import typings.validator.mod.validator.IdentityCardLocale
import typings.validator.mod.validator.IsCurrencyOptions
import typings.validator.mod.validator.IsDecimalOptions
import typings.validator.mod.validator.IsEmailOptions
import typings.validator.mod.validator.IsFQDNOptions
import typings.validator.mod.validator.IsISO8601Options
import typings.validator.mod.validator.IsISSNOptions
import typings.validator.mod.validator.IsMACAddressOptions
import typings.validator.mod.validator.IsMobilePhoneOptions
import typings.validator.mod.validator.IsNumericOptions
import typings.validator.mod.validator.IsURLOptions
import typings.validator.mod.validator.MobilePhoneLocale
import typings.validator.mod.validator.PostalCodeLocale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("class-validator", "ARRAY_CONTAINS")
  @js.native
  val ARRAY_CONTAINS: /* "arrayContains" */ String = js.native
  
  @JSImport("class-validator", "ARRAY_MAX_SIZE")
  @js.native
  val ARRAY_MAX_SIZE: /* "arrayMaxSize" */ String = js.native
  
  @JSImport("class-validator", "ARRAY_MIN_SIZE")
  @js.native
  val ARRAY_MIN_SIZE: /* "arrayMinSize" */ String = js.native
  
  @JSImport("class-validator", "ARRAY_NOT_CONTAINS")
  @js.native
  val ARRAY_NOT_CONTAINS: /* "arrayNotContains" */ String = js.native
  
  @JSImport("class-validator", "ARRAY_NOT_EMPTY")
  @js.native
  val ARRAY_NOT_EMPTY: /* "arrayNotEmpty" */ String = js.native
  
  @JSImport("class-validator", "ARRAY_UNIQUE")
  @js.native
  val ARRAY_UNIQUE: /* "arrayUnique" */ String = js.native
  
  @JSImport("class-validator", "Allow")
  @js.native
  def Allow(): PropertyDecorator = js.native
  @JSImport("class-validator", "Allow")
  @js.native
  def Allow(validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  @JSImport("class-validator", "ArrayContains")
  @js.native
  def ArrayContains_(values: js.Array[_]): PropertyDecorator = js.native
  @JSImport("class-validator", "ArrayContains")
  @js.native
  def ArrayContains_(values: js.Array[_], validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  @JSImport("class-validator", "ArrayMaxSize")
  @js.native
  def ArrayMaxSize_(max: Double): PropertyDecorator = js.native
  @JSImport("class-validator", "ArrayMaxSize")
  @js.native
  def ArrayMaxSize_(max: Double, validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  @JSImport("class-validator", "ArrayMinSize")
  @js.native
  def ArrayMinSize_(min: Double): PropertyDecorator = js.native
  @JSImport("class-validator", "ArrayMinSize")
  @js.native
  def ArrayMinSize_(min: Double, validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  @JSImport("class-validator", "ArrayNotContains")
  @js.native
  def ArrayNotContains_(values: js.Array[_]): PropertyDecorator = js.native
  @JSImport("class-validator", "ArrayNotContains")
  @js.native
  def ArrayNotContains_(values: js.Array[_], validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  @JSImport("class-validator", "ArrayNotEmpty")
  @js.native
  def ArrayNotEmpty_(): PropertyDecorator = js.native
  @JSImport("class-validator", "ArrayNotEmpty")
  @js.native
  def ArrayNotEmpty_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  @JSImport("class-validator", "ArrayUnique")
  @js.native
  def ArrayUnique_(): PropertyDecorator = js.native
  @JSImport("class-validator", "ArrayUnique")
  @js.native
  def ArrayUnique_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  @JSImport("class-validator", "CONTAINS")
  @js.native
  val CONTAINS: /* "contains" */ String = js.native
  
  @JSImport("class-validator", "Contains")
  @js.native
  def Contains_(seed: String): PropertyDecorator = js.native
  @JSImport("class-validator", "Contains")
  @js.native
  def Contains_(seed: String, validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  @JSImport("class-validator", "EQUALS")
  @js.native
  val EQUALS: /* "equals" */ String = js.native
  
  @JSImport("class-validator", "Equals")
  @js.native
  def Equals(comparison: js.Any): PropertyDecorator = js.native
  @JSImport("class-validator", "Equals")
  @js.native
  def Equals(comparison: js.Any, validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  @JSImport("class-validator", "IS_ALPHA")
  @js.native
  val IS_ALPHA: /* "isAlpha" */ String = js.native
  
  @JSImport("class-validator", "IS_ALPHANUMERIC")
  @js.native
  val IS_ALPHANUMERIC: /* "isAlphanumeric" */ String = js.native
  
  @JSImport("class-validator", "IS_ARRAY")
  @js.native
  val IS_ARRAY: /* "isArray" */ String = js.native
  
  @JSImport("class-validator", "IS_ASCII")
  @js.native
  val IS_ASCII: /* "isAscii" */ String = js.native
  
  @JSImport("class-validator", "IS_BASE32")
  @js.native
  val IS_BASE32: /* "isBase32" */ String = js.native
  
  @JSImport("class-validator", "IS_BASE64")
  @js.native
  val IS_BASE64: /* "isBase64" */ String = js.native
  
  @JSImport("class-validator", "IS_BIC")
  @js.native
  val IS_BIC: /* "isBIC" */ String = js.native
  
  @JSImport("class-validator", "IS_BOOLEAN")
  @js.native
  val IS_BOOLEAN: /* "isBoolean" */ String = js.native
  
  @JSImport("class-validator", "IS_BOOLEAN_STRING")
  @js.native
  val IS_BOOLEAN_STRING: /* "isBooleanString" */ String = js.native
  
  @JSImport("class-validator", "IS_BTC_ADDRESS")
  @js.native
  val IS_BTC_ADDRESS: /* "isBtcAddress" */ String = js.native
  
  @JSImport("class-validator", "IS_BYTE_LENGTH")
  @js.native
  val IS_BYTE_LENGTH: /* "isByteLength" */ String = js.native
  
  @JSImport("class-validator", "IS_CREDIT_CARD")
  @js.native
  val IS_CREDIT_CARD: /* "isCreditCard" */ String = js.native
  
  @JSImport("class-validator", "IS_CURRENCY")
  @js.native
  val IS_CURRENCY: /* "isCurrency" */ String = js.native
  
  @JSImport("class-validator", "IS_DATA_URI")
  @js.native
  val IS_DATA_URI: /* "isDataURI" */ String = js.native
  
  @JSImport("class-validator", "IS_DATE")
  @js.native
  val IS_DATE: /* "isDate" */ String = js.native
  
  @JSImport("class-validator", "IS_DATE_STRING")
  @js.native
  val IS_DATE_STRING: /* "isDateString" */ String = js.native
  
  @JSImport("class-validator", "IS_DECIMAL")
  @js.native
  val IS_DECIMAL: /* "isDecimal" */ String = js.native
  
  @JSImport("class-validator", "IS_DEFINED")
  @js.native
  val IS_DEFINED: String = js.native
  
  @JSImport("class-validator", "IS_DIVISIBLE_BY")
  @js.native
  val IS_DIVISIBLE_BY: /* "isDivisibleBy" */ String = js.native
  
  @JSImport("class-validator", "IS_EAN")
  @js.native
  val IS_EAN: /* "isEAN" */ String = js.native
  
  @JSImport("class-validator", "IS_EMAIL")
  @js.native
  val IS_EMAIL: /* "isEmail" */ String = js.native
  
  @JSImport("class-validator", "IS_EMPTY")
  @js.native
  val IS_EMPTY: /* "isEmpty" */ String = js.native
  
  @JSImport("class-validator", "IS_ENUM")
  @js.native
  val IS_ENUM: /* "isEnum" */ String = js.native
  
  @JSImport("class-validator", "IS_ETHEREUM_ADDRESS")
  @js.native
  val IS_ETHEREUM_ADDRESS: /* "isEthereumAddress" */ String = js.native
  
  @JSImport("class-validator", "IS_FIREBASE_PUSH_ID")
  @js.native
  val IS_FIREBASE_PUSH_ID: /* "IsFirebasePushId" */ String = js.native
  
  @JSImport("class-validator", "IS_FQDN")
  @js.native
  val IS_FQDN: /* "isFqdn" */ String = js.native
  
  @JSImport("class-validator", "IS_FULL_WIDTH")
  @js.native
  val IS_FULL_WIDTH: /* "isFullWidth" */ String = js.native
  
  @JSImport("class-validator", "IS_HALF_WIDTH")
  @js.native
  val IS_HALF_WIDTH: /* "isHalfWidth" */ String = js.native
  
  @JSImport("class-validator", "IS_HASH")
  @js.native
  val IS_HASH: /* "isHash" */ String = js.native
  
  @JSImport("class-validator", "IS_HEXADECIMAL")
  @js.native
  val IS_HEXADECIMAL: /* "isHexadecimal" */ String = js.native
  
  @JSImport("class-validator", "IS_HEX_COLOR")
  @js.native
  val IS_HEX_COLOR: /* "isHexColor" */ String = js.native
  
  @JSImport("class-validator", "IS_HSL")
  @js.native
  val IS_HSL: /* "isHSL" */ String = js.native
  
  @JSImport("class-validator", "IS_IBAN")
  @js.native
  val IS_IBAN: /* "isIBAN" */ String = js.native
  
  @JSImport("class-validator", "IS_IDENTITY_CARD")
  @js.native
  val IS_IDENTITY_CARD: /* "isIdentityCard" */ String = js.native
  
  @JSImport("class-validator", "IS_IN")
  @js.native
  val IS_IN: /* "isIn" */ String = js.native
  
  @JSImport("class-validator", "IS_INSTANCE")
  @js.native
  val IS_INSTANCE: /* "isInstance" */ String = js.native
  
  @JSImport("class-validator", "IS_INT")
  @js.native
  val IS_INT: /* "isInt" */ String = js.native
  
  @JSImport("class-validator", "IS_IP")
  @js.native
  val IS_IP: /* "isIp" */ String = js.native
  
  @JSImport("class-validator", "IS_ISBN")
  @js.native
  val IS_ISBN: /* "isIsbn" */ String = js.native
  
  @JSImport("class-validator", "IS_ISIN")
  @js.native
  val IS_ISIN: /* "isIsin" */ String = js.native
  
  @JSImport("class-validator", "IS_ISO31661_ALPHA_2")
  @js.native
  val IS_ISO31661_ALPHA_2: /* "isISO31661Alpha2" */ String = js.native
  
  @JSImport("class-validator", "IS_ISO31661_ALPHA_3")
  @js.native
  val IS_ISO31661_ALPHA_3: /* "isISO31661Alpha3" */ String = js.native
  
  @JSImport("class-validator", "IS_ISO8601")
  @js.native
  val IS_ISO8601: /* "isIso8601" */ String = js.native
  
  @JSImport("class-validator", "IS_ISRC")
  @js.native
  val IS_ISRC: /* "isISRC" */ String = js.native
  
  @JSImport("class-validator", "IS_ISSN")
  @js.native
  val IS_ISSN: /* "isISSN" */ String = js.native
  
  @JSImport("class-validator", "IS_JSON")
  @js.native
  val IS_JSON: /* "isJson" */ String = js.native
  
  @JSImport("class-validator", "IS_JWT")
  @js.native
  val IS_JWT: /* "isJwt" */ String = js.native
  
  @JSImport("class-validator", "IS_LATITUDE")
  @js.native
  val IS_LATITUDE: /* "isLatitude" */ String = js.native
  
  @JSImport("class-validator", "IS_LATLONG")
  @js.native
  val IS_LATLONG: /* "isLatLong" */ String = js.native
  
  @JSImport("class-validator", "IS_LOCALE")
  @js.native
  val IS_LOCALE: /* "isLocale" */ String = js.native
  
  @JSImport("class-validator", "IS_LONGITUDE")
  @js.native
  val IS_LONGITUDE: /* "isLongitude" */ String = js.native
  
  @JSImport("class-validator", "IS_LOWERCASE")
  @js.native
  val IS_LOWERCASE: /* "isLowercase" */ String = js.native
  
  @JSImport("class-validator", "IS_MAC_ADDRESS")
  @js.native
  val IS_MAC_ADDRESS: /* "isMacAddress" */ String = js.native
  
  @JSImport("class-validator", "IS_MAGNET_URI")
  @js.native
  val IS_MAGNET_URI: /* "isMagnetURI" */ String = js.native
  
  @JSImport("class-validator", "IS_MILITARY_TIME")
  @js.native
  val IS_MILITARY_TIME: /* "isMilitaryTime" */ String = js.native
  
  @JSImport("class-validator", "IS_MIME_TYPE")
  @js.native
  val IS_MIME_TYPE: /* "isMimeType" */ String = js.native
  
  @JSImport("class-validator", "IS_MOBILE_PHONE")
  @js.native
  val IS_MOBILE_PHONE: /* "isMobilePhone" */ String = js.native
  
  @JSImport("class-validator", "IS_MONGO_ID")
  @js.native
  val IS_MONGO_ID: /* "isMongoId" */ String = js.native
  
  @JSImport("class-validator", "IS_MULTIBYTE")
  @js.native
  val IS_MULTIBYTE: /* "isMultibyte" */ String = js.native
  
  @JSImport("class-validator", "IS_NEGATIVE")
  @js.native
  val IS_NEGATIVE: /* "isNegative" */ String = js.native
  
  @JSImport("class-validator", "IS_NOT_EMPTY")
  @js.native
  val IS_NOT_EMPTY: /* "isNotEmpty" */ String = js.native
  
  @JSImport("class-validator", "IS_NOT_EMPTY_OBJECT")
  @js.native
  val IS_NOT_EMPTY_OBJECT: /* "isNotEmptyObject" */ String = js.native
  
  @JSImport("class-validator", "IS_NOT_IN")
  @js.native
  val IS_NOT_IN: /* "isNotIn" */ String = js.native
  
  @JSImport("class-validator", "IS_NUMBER")
  @js.native
  val IS_NUMBER: /* "isNumber" */ String = js.native
  
  @JSImport("class-validator", "IS_NUMBER_STRING")
  @js.native
  val IS_NUMBER_STRING: /* "isNumberString" */ String = js.native
  
  @JSImport("class-validator", "IS_OBJECT")
  @js.native
  val IS_OBJECT: /* "isObject" */ String = js.native
  
  @JSImport("class-validator", "IS_OCTAL")
  @js.native
  val IS_OCTAL: /* "isOctal" */ String = js.native
  
  @JSImport("class-validator", "IS_PASSPORT_NUMBER")
  @js.native
  val IS_PASSPORT_NUMBER: /* "isPassportNumber" */ String = js.native
  
  @JSImport("class-validator", "IS_PHONE_NUMBER")
  @js.native
  val IS_PHONE_NUMBER: /* "isPhoneNumber" */ String = js.native
  
  @JSImport("class-validator", "IS_PORT")
  @js.native
  val IS_PORT: /* "isPort" */ String = js.native
  
  @JSImport("class-validator", "IS_POSITIVE")
  @js.native
  val IS_POSITIVE: /* "isPositive" */ String = js.native
  
  @JSImport("class-validator", "IS_POSTAL_CODE")
  @js.native
  val IS_POSTAL_CODE: /* "isPostalCode" */ String = js.native
  
  @JSImport("class-validator", "IS_RFC_3339")
  @js.native
  val IS_RFC_3339: /* "isRFC3339" */ String = js.native
  
  @JSImport("class-validator", "IS_RGB_COLOR")
  @js.native
  val IS_RGB_COLOR: /* "isRgbColor" */ String = js.native
  
  @JSImport("class-validator", "IS_SEM_VER")
  @js.native
  val IS_SEM_VER: /* "isSemVer" */ String = js.native
  
  @JSImport("class-validator", "IS_STRING")
  @js.native
  val IS_STRING: /* "isString" */ String = js.native
  
  @JSImport("class-validator", "IS_SURROGATE_PAIR")
  @js.native
  val IS_SURROGATE_PAIR: /* "isSurrogatePair" */ String = js.native
  
  @JSImport("class-validator", "IS_UPPERCASE")
  @js.native
  val IS_UPPERCASE: /* "isUppercase" */ String = js.native
  
  @JSImport("class-validator", "IS_URL")
  @js.native
  val IS_URL: /* "isUrl" */ String = js.native
  
  @JSImport("class-validator", "IS_UUID")
  @js.native
  val IS_UUID: /* "isUuid" */ String = js.native
  
  @JSImport("class-validator", "IS_VARIABLE_WIDTH")
  @js.native
  val IS_VARIABLE_WIDTH: /* "isVariableWidth" */ String = js.native
  
  @JSImport("class-validator", "IsAlpha")
  @js.native
  def IsAlpha_(): PropertyDecorator = js.native
  @JSImport("class-validator", "IsAlpha")
  @js.native
  def IsAlpha_(locale: js.UndefOr[scala.Nothing], validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSImport("class-validator", "IsAlpha")
  @js.native
  def IsAlpha_(locale: String): PropertyDecorator = js.native
  @JSImport("class-validator", "IsAlpha")
  @js.native
  def IsAlpha_(locale: String, validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  @JSImport("class-validator", "IsAlphanumeric")
  @js.native
  def IsAlphanumeric_(): PropertyDecorator = js.native
  @JSImport("class-validator", "IsAlphanumeric")
  @js.native
  def IsAlphanumeric_(locale: js.UndefOr[scala.Nothing], validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSImport("class-validator", "IsAlphanumeric")
  @js.native
  def IsAlphanumeric_(locale: String): PropertyDecorator = js.native
  @JSImport("class-validator", "IsAlphanumeric")
  @js.native
  def IsAlphanumeric_(locale: String, validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  @JSImport("class-validator", "IsArray")
  @js.native
  def IsArray_(): PropertyDecorator = js.native
  @JSImport("class-validator", "IsArray")
  @js.native
  def IsArray_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  @JSImport("class-validator", "IsAscii")
  @js.native
  def IsAscii_(): PropertyDecorator = js.native
  @JSImport("class-validator", "IsAscii")
  @js.native
  def IsAscii_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  @JSImport("class-validator", "IsBIC")
  @js.native
  def IsBIC_(): PropertyDecorator = js.native
  @JSImport("class-validator", "IsBIC")
  @js.native
  def IsBIC_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  @JSImport("class-validator", "IsBase32")
  @js.native
  def IsBase32_(): PropertyDecorator = js.native
  @JSImport("class-validator", "IsBase32")
  @js.native
  def IsBase32_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  @JSImport("class-validator", "IsBase64")
  @js.native
  def IsBase64_(): PropertyDecorator = js.native
  @JSImport("class-validator", "IsBase64")
  @js.native
  def IsBase64_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  @JSImport("class-validator", "IsBooleanString")
  @js.native
  def IsBooleanString_(): PropertyDecorator = js.native
  @JSImport("class-validator", "IsBooleanString")
  @js.native
  def IsBooleanString_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  @JSImport("class-validator", "IsBoolean")
  @js.native
  def IsBoolean_(): PropertyDecorator = js.native
  @JSImport("class-validator", "IsBoolean")
  @js.native
  def IsBoolean_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  @JSImport("class-validator", "IsBtcAddress")
  @js.native
  def IsBtcAddress_(): PropertyDecorator = js.native
  @JSImport("class-validator", "IsBtcAddress")
  @js.native
  def IsBtcAddress_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  @JSImport("class-validator", "IsByteLength")
  @js.native
  def IsByteLength_(min: Double): PropertyDecorator = js.native
  @JSImport("class-validator", "IsByteLength")
  @js.native
  def IsByteLength_(min: Double, max: js.UndefOr[scala.Nothing], validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSImport("class-validator", "IsByteLength")
  @js.native
  def IsByteLength_(min: Double, max: Double): PropertyDecorator = js.native
  @JSImport("class-validator", "IsByteLength")
  @js.native
  def IsByteLength_(min: Double, max: Double, validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  @JSImport("class-validator", "IsCreditCard")
  @js.native
  def IsCreditCard_(): PropertyDecorator = js.native
  @JSImport("class-validator", "IsCreditCard")
  @js.native
  def IsCreditCard_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  @JSImport("class-validator", "IsCurrency")
  @js.native
  def IsCurrency_(): PropertyDecorator = js.native
  @JSImport("class-validator", "IsCurrency")
  @js.native
  def IsCurrency_(options: js.UndefOr[scala.Nothing], validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSImport("class-validator", "IsCurrency")
  @js.native
  def IsCurrency_(options: IsCurrencyOptions): PropertyDecorator = js.native
  @JSImport("class-validator", "IsCurrency")
  @js.native
  def IsCurrency_(options: IsCurrencyOptions, validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  @JSImport("class-validator", "IsDataURI")
  @js.native
  def IsDataURI_(): PropertyDecorator = js.native
  @JSImport("class-validator", "IsDataURI")
  @js.native
  def IsDataURI_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  @JSImport("class-validator", "IsDateString")
  @js.native
  def IsDateString_(): PropertyDecorator = js.native
  @JSImport("class-validator", "IsDateString")
  @js.native
  def IsDateString_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  @JSImport("class-validator", "IsDate")
  @js.native
  def IsDate_(): PropertyDecorator = js.native
  @JSImport("class-validator", "IsDate")
  @js.native
  def IsDate_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  @JSImport("class-validator", "IsDecimal")
  @js.native
  def IsDecimal_(): PropertyDecorator = js.native
  @JSImport("class-validator", "IsDecimal")
  @js.native
  def IsDecimal_(options: js.UndefOr[scala.Nothing], validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSImport("class-validator", "IsDecimal")
  @js.native
  def IsDecimal_(options: IsDecimalOptions): PropertyDecorator = js.native
  @JSImport("class-validator", "IsDecimal")
  @js.native
  def IsDecimal_(options: IsDecimalOptions, validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  @JSImport("class-validator", "IsDefined")
  @js.native
  def IsDefined_(): PropertyDecorator = js.native
  @JSImport("class-validator", "IsDefined")
  @js.native
  def IsDefined_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  @JSImport("class-validator", "IsDivisibleBy")
  @js.native
  def IsDivisibleBy_(num: Double): PropertyDecorator = js.native
  @JSImport("class-validator", "IsDivisibleBy")
  @js.native
  def IsDivisibleBy_(num: Double, validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  @JSImport("class-validator", "IsEAN")
  @js.native
  def IsEAN_(): PropertyDecorator = js.native
  @JSImport("class-validator", "IsEAN")
  @js.native
  def IsEAN_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  @JSImport("class-validator", "IsEmail")
  @js.native
  def IsEmail_(): PropertyDecorator = js.native
  @JSImport("class-validator", "IsEmail")
  @js.native
  def IsEmail_(options: js.UndefOr[scala.Nothing], validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSImport("class-validator", "IsEmail")
  @js.native
  def IsEmail_(options: IsEmailOptions): PropertyDecorator = js.native
  @JSImport("class-validator", "IsEmail")
  @js.native
  def IsEmail_(options: IsEmailOptions, validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  @JSImport("class-validator", "IsEmpty")
  @js.native
  def IsEmpty_(): PropertyDecorator = js.native
  @JSImport("class-validator", "IsEmpty")
  @js.native
  def IsEmpty_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  @JSImport("class-validator", "IsEnum")
  @js.native
  def IsEnum_(entity: js.Object): PropertyDecorator = js.native
  @JSImport("class-validator", "IsEnum")
  @js.native
  def IsEnum_(entity: js.Object, validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  @JSImport("class-validator", "IsEthereumAddress")
  @js.native
  def IsEthereumAddress_(): PropertyDecorator = js.native
  @JSImport("class-validator", "IsEthereumAddress")
  @js.native
  def IsEthereumAddress_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  @JSImport("class-validator", "IsFQDN")
  @js.native
  def IsFQDN_(): PropertyDecorator = js.native
  @JSImport("class-validator", "IsFQDN")
  @js.native
  def IsFQDN_(options: js.UndefOr[scala.Nothing], validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSImport("class-validator", "IsFQDN")
  @js.native
  def IsFQDN_(options: IsFQDNOptions): PropertyDecorator = js.native
  @JSImport("class-validator", "IsFQDN")
  @js.native
  def IsFQDN_(options: IsFQDNOptions, validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  @JSImport("class-validator", "IsFirebasePushId")
  @js.native
  def IsFirebasePushId_(): PropertyDecorator = js.native
  @JSImport("class-validator", "IsFirebasePushId")
  @js.native
  def IsFirebasePushId_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  @JSImport("class-validator", "IsFullWidth")
  @js.native
  def IsFullWidth_(): PropertyDecorator = js.native
  @JSImport("class-validator", "IsFullWidth")
  @js.native
  def IsFullWidth_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  @JSImport("class-validator", "IsHSL")
  @js.native
  def IsHSL_(): PropertyDecorator = js.native
  @JSImport("class-validator", "IsHSL")
  @js.native
  def IsHSL_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  @JSImport("class-validator", "IsHalfWidth")
  @js.native
  def IsHalfWidth_(): PropertyDecorator = js.native
  @JSImport("class-validator", "IsHalfWidth")
  @js.native
  def IsHalfWidth_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  @JSImport("class-validator", "IsHash")
  @js.native
  def IsHash_(algorithm: String): PropertyDecorator = js.native
  @JSImport("class-validator", "IsHash")
  @js.native
  def IsHash_(algorithm: String, validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  @JSImport("class-validator", "IsHexColor")
  @js.native
  def IsHexColor_(): PropertyDecorator = js.native
  @JSImport("class-validator", "IsHexColor")
  @js.native
  def IsHexColor_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  @JSImport("class-validator", "IsHexadecimal")
  @js.native
  def IsHexadecimal_(): PropertyDecorator = js.native
  @JSImport("class-validator", "IsHexadecimal")
  @js.native
  def IsHexadecimal_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  @JSImport("class-validator", "IsIBAN")
  @js.native
  def IsIBAN_(): PropertyDecorator = js.native
  @JSImport("class-validator", "IsIBAN")
  @js.native
  def IsIBAN_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  @JSImport("class-validator", "IsIP")
  @js.native
  def IsIP_(): PropertyDecorator = js.native
  @JSImport("class-validator", "IsIP")
  @js.native
  def IsIP_(version: js.UndefOr[scala.Nothing], validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSImport("class-validator", "IsIP")
  @js.native
  def IsIP_(version: IsIpVersion): PropertyDecorator = js.native
  @JSImport("class-validator", "IsIP")
  @js.native
  def IsIP_(version: IsIpVersion, validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  @JSImport("class-validator", "IsISBN")
  @js.native
  def IsISBN_(): PropertyDecorator = js.native
  @JSImport("class-validator", "IsISBN")
  @js.native
  def IsISBN_(version: js.UndefOr[scala.Nothing], validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSImport("class-validator", "IsISBN")
  @js.native
  def IsISBN_(version: IsISBNVersion): PropertyDecorator = js.native
  @JSImport("class-validator", "IsISBN")
  @js.native
  def IsISBN_(version: IsISBNVersion, validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  @JSImport("class-validator", "IsISIN")
  @js.native
  def IsISIN_(): PropertyDecorator = js.native
  @JSImport("class-validator", "IsISIN")
  @js.native
  def IsISIN_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  @JSImport("class-validator", "IsISO31661Alpha2")
  @js.native
  def IsISO31661Alpha2_(): PropertyDecorator = js.native
  @JSImport("class-validator", "IsISO31661Alpha2")
  @js.native
  def IsISO31661Alpha2_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  @JSImport("class-validator", "IsISO31661Alpha3")
  @js.native
  def IsISO31661Alpha3_(): PropertyDecorator = js.native
  @JSImport("class-validator", "IsISO31661Alpha3")
  @js.native
  def IsISO31661Alpha3_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  @JSImport("class-validator", "IsISO8601")
  @js.native
  def IsISO8601_(): PropertyDecorator = js.native
  @JSImport("class-validator", "IsISO8601")
  @js.native
  def IsISO8601_(options: js.UndefOr[scala.Nothing], validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSImport("class-validator", "IsISO8601")
  @js.native
  def IsISO8601_(options: IsISO8601Options): PropertyDecorator = js.native
  @JSImport("class-validator", "IsISO8601")
  @js.native
  def IsISO8601_(options: IsISO8601Options, validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  @JSImport("class-validator", "IsISRC")
  @js.native
  def IsISRC_(): PropertyDecorator = js.native
  @JSImport("class-validator", "IsISRC")
  @js.native
  def IsISRC_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  @JSImport("class-validator", "IsISSN")
  @js.native
  def IsISSN_(): PropertyDecorator = js.native
  @JSImport("class-validator", "IsISSN")
  @js.native
  def IsISSN_(options: js.UndefOr[scala.Nothing], validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSImport("class-validator", "IsISSN")
  @js.native
  def IsISSN_(options: IsISSNOptions): PropertyDecorator = js.native
  @JSImport("class-validator", "IsISSN")
  @js.native
  def IsISSN_(options: IsISSNOptions, validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  @JSImport("class-validator", "IsIdentityCard")
  @js.native
  def IsIdentityCard_(): PropertyDecorator = js.native
  @JSImport("class-validator", "IsIdentityCard")
  @js.native
  def IsIdentityCard_(locale: js.UndefOr[scala.Nothing], validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSImport("class-validator", "IsIdentityCard")
  @js.native
  def IsIdentityCard_(locale: IdentityCardLocale): PropertyDecorator = js.native
  @JSImport("class-validator", "IsIdentityCard")
  @js.native
  def IsIdentityCard_(locale: IdentityCardLocale, validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  @JSImport("class-validator", "IsIn")
  @js.native
  def IsIn_(values: js.Array[_]): PropertyDecorator = js.native
  @JSImport("class-validator", "IsIn")
  @js.native
  def IsIn_(values: js.Array[_], validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  @JSImport("class-validator", "IsInstance")
  @js.native
  def IsInstance_(targetType: Instantiable1[/* args (repeated) */ js.Any, js.Any]): PropertyDecorator = js.native
  @JSImport("class-validator", "IsInstance")
  @js.native
  def IsInstance_(
    targetType: Instantiable1[/* args (repeated) */ js.Any, js.Any],
    validationOptions: ValidationOptions
  ): PropertyDecorator = js.native
  
  @JSImport("class-validator", "IsInt")
  @js.native
  def IsInt_(): PropertyDecorator = js.native
  @JSImport("class-validator", "IsInt")
  @js.native
  def IsInt_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  @JSImport("class-validator", "IsJSON")
  @js.native
  def IsJSON_(): PropertyDecorator = js.native
  @JSImport("class-validator", "IsJSON")
  @js.native
  def IsJSON_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  @JSImport("class-validator", "IsJWT")
  @js.native
  def IsJWT_(): PropertyDecorator = js.native
  @JSImport("class-validator", "IsJWT")
  @js.native
  def IsJWT_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  @JSImport("class-validator", "IsLatLong")
  @js.native
  def IsLatLong_(): PropertyDecorator = js.native
  @JSImport("class-validator", "IsLatLong")
  @js.native
  def IsLatLong_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  @JSImport("class-validator", "IsLatitude")
  @js.native
  def IsLatitude_(): PropertyDecorator = js.native
  @JSImport("class-validator", "IsLatitude")
  @js.native
  def IsLatitude_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  @JSImport("class-validator", "IsLocale")
  @js.native
  def IsLocale_(): PropertyDecorator = js.native
  @JSImport("class-validator", "IsLocale")
  @js.native
  def IsLocale_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  @JSImport("class-validator", "IsLongitude")
  @js.native
  def IsLongitude_(): PropertyDecorator = js.native
  @JSImport("class-validator", "IsLongitude")
  @js.native
  def IsLongitude_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  @JSImport("class-validator", "IsLowercase")
  @js.native
  def IsLowercase_(): PropertyDecorator = js.native
  @JSImport("class-validator", "IsLowercase")
  @js.native
  def IsLowercase_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  @JSImport("class-validator", "IsMACAddress")
  @js.native
  def IsMACAddress_(): PropertyDecorator = js.native
  @JSImport("class-validator", "IsMACAddress")
  @js.native
  def IsMACAddress_(optionsArg: js.UndefOr[scala.Nothing], validationOptionsArg: ValidationOptions): PropertyDecorator = js.native
  @JSImport("class-validator", "IsMACAddress")
  @js.native
  def IsMACAddress_(optionsArg: IsMACAddressOptions): PropertyDecorator = js.native
  @JSImport("class-validator", "IsMACAddress")
  @js.native
  def IsMACAddress_(optionsArg: IsMACAddressOptions, validationOptionsArg: ValidationOptions): PropertyDecorator = js.native
  @JSImport("class-validator", "IsMACAddress")
  @js.native
  def IsMACAddress_(validationOptionsArg: ValidationOptions): PropertyDecorator = js.native
  
  @JSImport("class-validator", "IsMagnetURI")
  @js.native
  def IsMagnetURI_(): PropertyDecorator = js.native
  @JSImport("class-validator", "IsMagnetURI")
  @js.native
  def IsMagnetURI_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  @JSImport("class-validator", "IsMilitaryTime")
  @js.native
  def IsMilitaryTime_(): PropertyDecorator = js.native
  @JSImport("class-validator", "IsMilitaryTime")
  @js.native
  def IsMilitaryTime_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  @JSImport("class-validator", "IsMimeType")
  @js.native
  def IsMimeType_(): PropertyDecorator = js.native
  @JSImport("class-validator", "IsMimeType")
  @js.native
  def IsMimeType_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  @JSImport("class-validator", "IsMobilePhone")
  @js.native
  def IsMobilePhone_(): PropertyDecorator = js.native
  @JSImport("class-validator", "IsMobilePhone")
  @js.native
  def IsMobilePhone_(
    locale: js.UndefOr[scala.Nothing],
    options: js.UndefOr[scala.Nothing],
    validationOptions: ValidationOptions
  ): PropertyDecorator = js.native
  @JSImport("class-validator", "IsMobilePhone")
  @js.native
  def IsMobilePhone_(locale: js.UndefOr[scala.Nothing], options: IsMobilePhoneOptions): PropertyDecorator = js.native
  @JSImport("class-validator", "IsMobilePhone")
  @js.native
  def IsMobilePhone_(
    locale: js.UndefOr[scala.Nothing],
    options: IsMobilePhoneOptions,
    validationOptions: ValidationOptions
  ): PropertyDecorator = js.native
  @JSImport("class-validator", "IsMobilePhone")
  @js.native
  def IsMobilePhone_(locale: MobilePhoneLocale): PropertyDecorator = js.native
  @JSImport("class-validator", "IsMobilePhone")
  @js.native
  def IsMobilePhone_(
    locale: MobilePhoneLocale,
    options: js.UndefOr[scala.Nothing],
    validationOptions: ValidationOptions
  ): PropertyDecorator = js.native
  @JSImport("class-validator", "IsMobilePhone")
  @js.native
  def IsMobilePhone_(locale: MobilePhoneLocale, options: IsMobilePhoneOptions): PropertyDecorator = js.native
  @JSImport("class-validator", "IsMobilePhone")
  @js.native
  def IsMobilePhone_(locale: MobilePhoneLocale, options: IsMobilePhoneOptions, validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  @JSImport("class-validator", "IsMongoId")
  @js.native
  def IsMongoId_(): PropertyDecorator = js.native
  @JSImport("class-validator", "IsMongoId")
  @js.native
  def IsMongoId_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  @JSImport("class-validator", "IsMultibyte")
  @js.native
  def IsMultibyte_(): PropertyDecorator = js.native
  @JSImport("class-validator", "IsMultibyte")
  @js.native
  def IsMultibyte_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  @JSImport("class-validator", "IsNegative")
  @js.native
  def IsNegative_(): PropertyDecorator = js.native
  @JSImport("class-validator", "IsNegative")
  @js.native
  def IsNegative_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  @JSImport("class-validator", "IsNotEmptyObject")
  @js.native
  def IsNotEmptyObject_(): PropertyDecorator = js.native
  @JSImport("class-validator", "IsNotEmptyObject")
  @js.native
  def IsNotEmptyObject_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  @JSImport("class-validator", "IsNotEmpty")
  @js.native
  def IsNotEmpty_(): PropertyDecorator = js.native
  @JSImport("class-validator", "IsNotEmpty")
  @js.native
  def IsNotEmpty_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  @JSImport("class-validator", "IsNotIn")
  @js.native
  def IsNotIn_(values: js.Array[_]): PropertyDecorator = js.native
  @JSImport("class-validator", "IsNotIn")
  @js.native
  def IsNotIn_(values: js.Array[_], validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  @JSImport("class-validator", "IsNumberString")
  @js.native
  def IsNumberString_(): PropertyDecorator = js.native
  @JSImport("class-validator", "IsNumberString")
  @js.native
  def IsNumberString_(options: js.UndefOr[scala.Nothing], validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSImport("class-validator", "IsNumberString")
  @js.native
  def IsNumberString_(options: IsNumericOptions): PropertyDecorator = js.native
  @JSImport("class-validator", "IsNumberString")
  @js.native
  def IsNumberString_(options: IsNumericOptions, validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  @JSImport("class-validator", "IsNumber")
  @js.native
  def IsNumber_(): PropertyDecorator = js.native
  @JSImport("class-validator", "IsNumber")
  @js.native
  def IsNumber_(options: js.UndefOr[scala.Nothing], validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSImport("class-validator", "IsNumber")
  @js.native
  def IsNumber_(options: IsNumberOptions): PropertyDecorator = js.native
  @JSImport("class-validator", "IsNumber")
  @js.native
  def IsNumber_(options: IsNumberOptions, validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  @JSImport("class-validator", "IsObject")
  @js.native
  def IsObject_(): PropertyDecorator = js.native
  @JSImport("class-validator", "IsObject")
  @js.native
  def IsObject_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  @JSImport("class-validator", "IsOctal")
  @js.native
  def IsOctal_(): PropertyDecorator = js.native
  @JSImport("class-validator", "IsOctal")
  @js.native
  def IsOctal_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  @JSImport("class-validator", "IsOptional")
  @js.native
  def IsOptional(): PropertyDecorator = js.native
  @JSImport("class-validator", "IsOptional")
  @js.native
  def IsOptional(validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  @JSImport("class-validator", "IsPassportNumber")
  @js.native
  def IsPassportNumber_(countryCode: String): PropertyDecorator = js.native
  @JSImport("class-validator", "IsPassportNumber")
  @js.native
  def IsPassportNumber_(countryCode: String, validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  @JSImport("class-validator", "IsPhoneNumber")
  @js.native
  def IsPhoneNumber_(): PropertyDecorator = js.native
  @JSImport("class-validator", "IsPhoneNumber")
  @js.native
  def IsPhoneNumber_(region: String): PropertyDecorator = js.native
  @JSImport("class-validator", "IsPhoneNumber")
  @js.native
  def IsPhoneNumber_(region: String, validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSImport("class-validator", "IsPhoneNumber")
  @js.native
  def IsPhoneNumber_(region: Null, validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  @JSImport("class-validator", "IsPort")
  @js.native
  def IsPort_(): PropertyDecorator = js.native
  @JSImport("class-validator", "IsPort")
  @js.native
  def IsPort_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  @JSImport("class-validator", "IsPositive")
  @js.native
  def IsPositive_(): PropertyDecorator = js.native
  @JSImport("class-validator", "IsPositive")
  @js.native
  def IsPositive_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  @JSImport("class-validator", "IsPostalCode")
  @js.native
  def IsPostalCode_(): PropertyDecorator = js.native
  @JSImport("class-validator", "IsPostalCode")
  @js.native
  def IsPostalCode_(locale: js.UndefOr[scala.Nothing], validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSImport("class-validator", "IsPostalCode")
  @js.native
  def IsPostalCode_(locale: PostalCodeLocale): PropertyDecorator = js.native
  @JSImport("class-validator", "IsPostalCode")
  @js.native
  def IsPostalCode_(locale: PostalCodeLocale, validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  @JSImport("class-validator", "IsRFC3339")
  @js.native
  def IsRFC3339_(): PropertyDecorator = js.native
  @JSImport("class-validator", "IsRFC3339")
  @js.native
  def IsRFC3339_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  @JSImport("class-validator", "IsRgbColor")
  @js.native
  def IsRgbColor_(): PropertyDecorator = js.native
  @JSImport("class-validator", "IsRgbColor")
  @js.native
  def IsRgbColor_(includePercentValues: js.UndefOr[scala.Nothing], validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSImport("class-validator", "IsRgbColor")
  @js.native
  def IsRgbColor_(includePercentValues: Boolean): PropertyDecorator = js.native
  @JSImport("class-validator", "IsRgbColor")
  @js.native
  def IsRgbColor_(includePercentValues: Boolean, validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  @JSImport("class-validator", "IsSemVer")
  @js.native
  def IsSemVer_(): PropertyDecorator = js.native
  @JSImport("class-validator", "IsSemVer")
  @js.native
  def IsSemVer_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  @JSImport("class-validator", "IsString")
  @js.native
  def IsString_(): PropertyDecorator = js.native
  @JSImport("class-validator", "IsString")
  @js.native
  def IsString_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  @JSImport("class-validator", "IsSurrogatePair")
  @js.native
  def IsSurrogatePair_(): PropertyDecorator = js.native
  @JSImport("class-validator", "IsSurrogatePair")
  @js.native
  def IsSurrogatePair_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  @JSImport("class-validator", "IsUUID")
  @js.native
  def IsUUID_(): PropertyDecorator = js.native
  @JSImport("class-validator", "IsUUID")
  @js.native
  def IsUUID_(version: js.UndefOr[scala.Nothing], validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSImport("class-validator", "IsUUID")
  @js.native
  def IsUUID_(version: UUIDVersion): PropertyDecorator = js.native
  @JSImport("class-validator", "IsUUID")
  @js.native
  def IsUUID_(version: UUIDVersion, validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  @JSImport("class-validator", "IsUppercase")
  @js.native
  def IsUppercase_(): PropertyDecorator = js.native
  @JSImport("class-validator", "IsUppercase")
  @js.native
  def IsUppercase_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  @JSImport("class-validator", "IsUrl")
  @js.native
  def IsUrl_(): PropertyDecorator = js.native
  @JSImport("class-validator", "IsUrl")
  @js.native
  def IsUrl_(options: js.UndefOr[scala.Nothing], validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSImport("class-validator", "IsUrl")
  @js.native
  def IsUrl_(options: IsURLOptions): PropertyDecorator = js.native
  @JSImport("class-validator", "IsUrl")
  @js.native
  def IsUrl_(options: IsURLOptions, validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  @JSImport("class-validator", "IsVariableWidth")
  @js.native
  def IsVariableWidth_(): PropertyDecorator = js.native
  @JSImport("class-validator", "IsVariableWidth")
  @js.native
  def IsVariableWidth_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  @JSImport("class-validator", "LENGTH")
  @js.native
  val LENGTH: /* "length" */ String = js.native
  
  @JSImport("class-validator", "Length")
  @js.native
  def Length_(min: Double): PropertyDecorator = js.native
  @JSImport("class-validator", "Length")
  @js.native
  def Length_(min: Double, max: js.UndefOr[scala.Nothing], validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSImport("class-validator", "Length")
  @js.native
  def Length_(min: Double, max: Double): PropertyDecorator = js.native
  @JSImport("class-validator", "Length")
  @js.native
  def Length_(min: Double, max: Double, validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  @JSImport("class-validator", "MATCHES")
  @js.native
  val MATCHES: /* "matches" */ String = js.native
  
  @JSImport("class-validator", "MAX")
  @js.native
  val MAX: /* "max" */ String = js.native
  
  @JSImport("class-validator", "MAX_DATE")
  @js.native
  val MAX_DATE: /* "maxDate" */ String = js.native
  
  @JSImport("class-validator", "MAX_LENGTH")
  @js.native
  val MAX_LENGTH: /* "maxLength" */ String = js.native
  
  @JSImport("class-validator", "MIN")
  @js.native
  val MIN: /* "min" */ String = js.native
  
  @JSImport("class-validator", "MIN_DATE")
  @js.native
  val MIN_DATE: /* "minDate" */ String = js.native
  
  @JSImport("class-validator", "MIN_LENGTH")
  @js.native
  val MIN_LENGTH: /* "minLength" */ String = js.native
  
  @JSImport("class-validator", "Matches")
  @js.native
  def Matches_(pattern: String): PropertyDecorator = js.native
  @JSImport("class-validator", "Matches")
  @js.native
  def Matches_(pattern: String, modifiers: js.UndefOr[scala.Nothing], validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSImport("class-validator", "Matches")
  @js.native
  def Matches_(pattern: String, modifiers: String): PropertyDecorator = js.native
  @JSImport("class-validator", "Matches")
  @js.native
  def Matches_(pattern: String, modifiers: String, validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSImport("class-validator", "Matches")
  @js.native
  def Matches_(pattern: RegExp): PropertyDecorator = js.native
  @JSImport("class-validator", "Matches")
  @js.native
  def Matches_(pattern: RegExp, validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  @JSImport("class-validator", "MaxDate")
  @js.native
  def MaxDate_(date: Date): PropertyDecorator = js.native
  @JSImport("class-validator", "MaxDate")
  @js.native
  def MaxDate_(date: Date, validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  @JSImport("class-validator", "MaxLength")
  @js.native
  def MaxLength_(max: Double): PropertyDecorator = js.native
  @JSImport("class-validator", "MaxLength")
  @js.native
  def MaxLength_(max: Double, validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  @JSImport("class-validator", "Max")
  @js.native
  def Max_(maxValue: Double): PropertyDecorator = js.native
  @JSImport("class-validator", "Max")
  @js.native
  def Max_(maxValue: Double, validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  @JSImport("class-validator", "MetadataStorage")
  @js.native
  class MetadataStorage ()
    extends typings.classValidator.metadataStorageMod.MetadataStorage
  
  @JSImport("class-validator", "MinDate")
  @js.native
  def MinDate_(date: Date): PropertyDecorator = js.native
  @JSImport("class-validator", "MinDate")
  @js.native
  def MinDate_(date: Date, validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  @JSImport("class-validator", "MinLength")
  @js.native
  def MinLength_(min: Double): PropertyDecorator = js.native
  @JSImport("class-validator", "MinLength")
  @js.native
  def MinLength_(min: Double, validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  @JSImport("class-validator", "Min")
  @js.native
  def Min_(minValue: Double): PropertyDecorator = js.native
  @JSImport("class-validator", "Min")
  @js.native
  def Min_(minValue: Double, validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  @JSImport("class-validator", "NOT_CONTAINS")
  @js.native
  val NOT_CONTAINS: /* "notContains" */ String = js.native
  
  @JSImport("class-validator", "NOT_EQUALS")
  @js.native
  val NOT_EQUALS: /* "notEquals" */ String = js.native
  
  @JSImport("class-validator", "NotContains")
  @js.native
  def NotContains_(seed: String): PropertyDecorator = js.native
  @JSImport("class-validator", "NotContains")
  @js.native
  def NotContains_(seed: String, validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  @JSImport("class-validator", "NotEquals")
  @js.native
  def NotEquals_(comparison: js.Any): PropertyDecorator = js.native
  @JSImport("class-validator", "NotEquals")
  @js.native
  def NotEquals_(comparison: js.Any, validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  @JSImport("class-validator", "ValidateBy")
  @js.native
  def ValidateBy(options: ValidateByOptions): PropertyDecorator = js.native
  @JSImport("class-validator", "ValidateBy")
  @js.native
  def ValidateBy(options: ValidateByOptions, validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  @JSImport("class-validator", "ValidateIf")
  @js.native
  def ValidateIf(condition: js.Function2[/* object */ js.Any, /* value */ js.Any, Boolean]): PropertyDecorator = js.native
  @JSImport("class-validator", "ValidateIf")
  @js.native
  def ValidateIf(
    condition: js.Function2[/* object */ js.Any, /* value */ js.Any, Boolean],
    validationOptions: ValidationOptions
  ): PropertyDecorator = js.native
  
  @JSImport("class-validator", "ValidateNested")
  @js.native
  def ValidateNested(): PropertyDecorator = js.native
  @JSImport("class-validator", "ValidateNested")
  @js.native
  def ValidateNested(validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  @JSImport("class-validator", "ValidatePromise")
  @js.native
  def ValidatePromise(): PropertyDecorator = js.native
  @JSImport("class-validator", "ValidatePromise")
  @js.native
  def ValidatePromise(validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  @JSImport("class-validator", "Validate")
  @js.native
  def Validate_(constraintClass: js.Function): PropertyDecorator = js.native
  @JSImport("class-validator", "Validate")
  @js.native
  def Validate_(
    constraintClass: js.Function,
    constraints: js.UndefOr[scala.Nothing],
    validationOptions: ValidationOptions
  ): PropertyDecorator = js.native
  @JSImport("class-validator", "Validate")
  @js.native
  def Validate_(constraintClass: js.Function, constraints: js.Array[_]): PropertyDecorator = js.native
  @JSImport("class-validator", "Validate")
  @js.native
  def Validate_(constraintClass: js.Function, constraints: js.Array[_], validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSImport("class-validator", "Validate")
  @js.native
  def Validate_(constraintClass: js.Function, validationOptions: ValidationOptions): PropertyDecorator = js.native
  
  @JSImport("class-validator", "ValidationError")
  @js.native
  class ValidationError ()
    extends typings.classValidator.validationErrorMod.ValidationError
  
  @JSImport("class-validator", "ValidationTypes")
  @js.native
  class ValidationTypes ()
    extends typings.classValidator.validationTypesMod.ValidationTypes
  /* static members */
  object ValidationTypes {
    
    @JSImport("class-validator", "ValidationTypes")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("class-validator", "ValidationTypes.CONDITIONAL_VALIDATION")
    @js.native
    def CONDITIONAL_VALIDATION: String = js.native
    @scala.inline
    def CONDITIONAL_VALIDATION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CONDITIONAL_VALIDATION")(x.asInstanceOf[js.Any])
    
    @JSImport("class-validator", "ValidationTypes.CUSTOM_VALIDATION")
    @js.native
    def CUSTOM_VALIDATION: String = js.native
    @scala.inline
    def CUSTOM_VALIDATION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CUSTOM_VALIDATION")(x.asInstanceOf[js.Any])
    
    @JSImport("class-validator", "ValidationTypes.IS_DEFINED")
    @js.native
    def IS_DEFINED: String = js.native
    @scala.inline
    def IS_DEFINED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IS_DEFINED")(x.asInstanceOf[js.Any])
    
    @JSImport("class-validator", "ValidationTypes.NESTED_VALIDATION")
    @js.native
    def NESTED_VALIDATION: String = js.native
    @scala.inline
    def NESTED_VALIDATION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NESTED_VALIDATION")(x.asInstanceOf[js.Any])
    
    @JSImport("class-validator", "ValidationTypes.PROMISE_VALIDATION")
    @js.native
    def PROMISE_VALIDATION: String = js.native
    @scala.inline
    def PROMISE_VALIDATION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PROMISE_VALIDATION")(x.asInstanceOf[js.Any])
    
    @JSImport("class-validator", "ValidationTypes.WHITELIST")
    @js.native
    def WHITELIST: String = js.native
    @scala.inline
    def WHITELIST_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WHITELIST")(x.asInstanceOf[js.Any])
    
    /**
      * Checks if validation type is valid.
      */
    @JSImport("class-validator", "ValidationTypes.isValid")
    @js.native
    def isValid(`type`: String): Boolean = js.native
  }
  
  @JSImport("class-validator", "Validator")
  @js.native
  class Validator ()
    extends typings.classValidator.validatorMod.Validator
  
  @JSImport("class-validator", "ValidatorConstraint")
  @js.native
  def ValidatorConstraint(): js.Function1[/* target */ js.Function, Unit] = js.native
  @JSImport("class-validator", "ValidatorConstraint")
  @js.native
  def ValidatorConstraint(options: Async): js.Function1[/* target */ js.Function, Unit] = js.native
  
  @JSImport("class-validator", "arrayContains")
  @js.native
  def arrayContains(array: js.Any, values: js.Array[_]): Boolean = js.native
  
  @JSImport("class-validator", "arrayMaxSize")
  @js.native
  def arrayMaxSize(array: js.Any, max: Double): Boolean = js.native
  
  @JSImport("class-validator", "arrayMinSize")
  @js.native
  def arrayMinSize(array: js.Any, min: Double): Boolean = js.native
  
  @JSImport("class-validator", "arrayNotContains")
  @js.native
  def arrayNotContains(array: js.Any, values: js.Array[_]): Boolean = js.native
  
  @JSImport("class-validator", "arrayNotEmpty")
  @js.native
  def arrayNotEmpty(array: js.Any): Boolean = js.native
  
  @JSImport("class-validator", "arrayUnique")
  @js.native
  def arrayUnique(array: js.Any): Boolean = js.native
  
  @JSImport("class-validator", "buildMessage")
  @js.native
  def buildMessage(impl: js.Function2[/* eachPrefix */ String, /* args */ js.UndefOr[ValidationArguments], String]): js.Function1[/* validationArguments */ js.UndefOr[ValidationArguments], String] = js.native
  @JSImport("class-validator", "buildMessage")
  @js.native
  def buildMessage(
    impl: js.Function2[/* eachPrefix */ String, /* args */ js.UndefOr[ValidationArguments], String],
    validationOptions: ValidationOptions
  ): js.Function1[/* validationArguments */ js.UndefOr[ValidationArguments], String] = js.native
  
  @JSImport("class-validator", "contains")
  @js.native
  def contains(value: js.Any, seed: String): Boolean = js.native
  
  @JSImport("class-validator", "equals")
  @js.native
  def equals_(value: js.Any, comparison: js.Any): Boolean = js.native
  
  @JSImport("class-validator", "getFromContainer")
  @js.native
  def getFromContainer[T](someClass: js.Function): T = js.native
  @JSImport("class-validator", "getFromContainer")
  @js.native
  def getFromContainer[T](someClass: Instantiable[T]): T = js.native
  
  @JSImport("class-validator", "getMetadataStorage")
  @js.native
  def getMetadataStorage(): typings.classValidator.metadataStorageMod.MetadataStorage = js.native
  
  @JSImport("class-validator", "isAlpha")
  @js.native
  def isAlpha(value: js.Any): Boolean = js.native
  @JSImport("class-validator", "isAlpha")
  @js.native
  def isAlpha(value: js.Any, locale: AlphaLocale): Boolean = js.native
  
  @JSImport("class-validator", "isAlphanumeric")
  @js.native
  def isAlphanumeric(value: js.Any): Boolean = js.native
  @JSImport("class-validator", "isAlphanumeric")
  @js.native
  def isAlphanumeric(value: js.Any, locale: AlphanumericLocale): Boolean = js.native
  
  @JSImport("class-validator", "isArray")
  @js.native
  def isArray(value: js.Any): Boolean = js.native
  
  @JSImport("class-validator", "isAscii")
  @js.native
  def isAscii(value: js.Any): Boolean = js.native
  
  @JSImport("class-validator", "isBIC")
  @js.native
  def isBIC(value: js.Any): Boolean = js.native
  
  @JSImport("class-validator", "isBase32")
  @js.native
  def isBase32(value: js.Any): Boolean = js.native
  
  @JSImport("class-validator", "isBase64")
  @js.native
  def isBase64(value: js.Any): Boolean = js.native
  
  @JSImport("class-validator", "isBoolean")
  @js.native
  def isBoolean(value: js.Any): Boolean = js.native
  
  @JSImport("class-validator", "isBooleanString")
  @js.native
  def isBooleanString(value: js.Any): Boolean = js.native
  
  @JSImport("class-validator", "isBtcAddress")
  @js.native
  def isBtcAddress(value: js.Any): Boolean = js.native
  
  @JSImport("class-validator", "isByteLength")
  @js.native
  def isByteLength(value: js.Any, min: Double): Boolean = js.native
  @JSImport("class-validator", "isByteLength")
  @js.native
  def isByteLength(value: js.Any, min: Double, max: Double): Boolean = js.native
  
  @JSImport("class-validator", "isCreditCard")
  @js.native
  def isCreditCard(value: js.Any): Boolean = js.native
  
  @JSImport("class-validator", "isCurrency")
  @js.native
  def isCurrency(value: js.Any): Boolean = js.native
  @JSImport("class-validator", "isCurrency")
  @js.native
  def isCurrency(value: js.Any, options: IsCurrencyOptions): Boolean = js.native
  
  @JSImport("class-validator", "isDataURI")
  @js.native
  def isDataURI(value: js.Any): Boolean = js.native
  
  @JSImport("class-validator", "isDate")
  @js.native
  def isDate(value: js.Any): Boolean = js.native
  
  @JSImport("class-validator", "isDateString")
  @js.native
  def isDateString(value: js.Any): Boolean = js.native
  
  @JSImport("class-validator", "isDecimal")
  @js.native
  def isDecimal(value: js.Any): Boolean = js.native
  @JSImport("class-validator", "isDecimal")
  @js.native
  def isDecimal(value: js.Any, options: IsDecimalOptions): Boolean = js.native
  
  @JSImport("class-validator", "isDefined")
  @js.native
  def isDefined(value: js.Any): Boolean = js.native
  
  @JSImport("class-validator", "isDivisibleBy")
  @js.native
  def isDivisibleBy(value: js.Any, num: Double): Boolean = js.native
  
  @JSImport("class-validator", "isEAN")
  @js.native
  def isEAN(value: js.Any): Boolean = js.native
  
  @JSImport("class-validator", "isEmail")
  @js.native
  def isEmail(value: js.Any): Boolean = js.native
  @JSImport("class-validator", "isEmail")
  @js.native
  def isEmail(value: js.Any, options: IsEmailOptions): Boolean = js.native
  
  @JSImport("class-validator", "isEmpty")
  @js.native
  def isEmpty(value: js.Any): Boolean = js.native
  
  @JSImport("class-validator", "isEnum")
  @js.native
  def isEnum(value: js.Any, entity: js.Any): Boolean = js.native
  
  @JSImport("class-validator", "isEthereumAddress")
  @js.native
  def isEthereumAddress(value: js.Any): Boolean = js.native
  
  @JSImport("class-validator", "isFQDN")
  @js.native
  def isFQDN(value: js.Any): Boolean = js.native
  @JSImport("class-validator", "isFQDN")
  @js.native
  def isFQDN(value: js.Any, options: IsFQDNOptions): Boolean = js.native
  
  @JSImport("class-validator", "isFirebasePushId")
  @js.native
  def isFirebasePushId(value: js.Any): Boolean = js.native
  
  @JSImport("class-validator", "isFullWidth")
  @js.native
  def isFullWidth(value: js.Any): Boolean = js.native
  
  @JSImport("class-validator", "isHSL")
  @js.native
  def isHSL(value: js.Any): Boolean = js.native
  
  @JSImport("class-validator", "isHalfWidth")
  @js.native
  def isHalfWidth(value: js.Any): Boolean = js.native
  
  @JSImport("class-validator", "isHash")
  @js.native
  def isHash(value: js.Any, algorithm: HashAlgorithm): Boolean = js.native
  
  @JSImport("class-validator", "isHexColor")
  @js.native
  def isHexColor(value: js.Any): Boolean = js.native
  
  @JSImport("class-validator", "isHexadecimal")
  @js.native
  def isHexadecimal(value: js.Any): Boolean = js.native
  
  @JSImport("class-validator", "isIBAN")
  @js.native
  def isIBAN(value: js.Any): Boolean = js.native
  
  @JSImport("class-validator", "isIP")
  @js.native
  def isIP(value: js.Any): Boolean = js.native
  @JSImport("class-validator", "isIP")
  @js.native
  def isIP(value: js.Any, version: IsIpVersion): Boolean = js.native
  
  @JSImport("class-validator", "isISBN")
  @js.native
  def isISBN(value: js.Any): Boolean = js.native
  @JSImport("class-validator", "isISBN")
  @js.native
  def isISBN(value: js.Any, version: IsISBNVersion): Boolean = js.native
  
  @JSImport("class-validator", "isISIN")
  @js.native
  def isISIN(value: js.Any): Boolean = js.native
  
  @JSImport("class-validator", "isISO31661Alpha2")
  @js.native
  def isISO31661Alpha2(value: js.Any): Boolean = js.native
  
  @JSImport("class-validator", "isISO31661Alpha3")
  @js.native
  def isISO31661Alpha3(value: js.Any): Boolean = js.native
  
  @JSImport("class-validator", "isISO8601")
  @js.native
  def isISO8601(value: js.Any): Boolean = js.native
  @JSImport("class-validator", "isISO8601")
  @js.native
  def isISO8601(value: js.Any, options: IsISO8601Options): Boolean = js.native
  
  @JSImport("class-validator", "isISRC")
  @js.native
  def isISRC(value: js.Any): Boolean = js.native
  
  @JSImport("class-validator", "isISSN")
  @js.native
  def isISSN(value: js.Any): Boolean = js.native
  @JSImport("class-validator", "isISSN")
  @js.native
  def isISSN(value: js.Any, options: IsISSNOptions): Boolean = js.native
  
  @JSImport("class-validator", "isIdentityCard")
  @js.native
  def isIdentityCard(value: js.Any, locale: IdentityCardLocale): Boolean = js.native
  
  @JSImport("class-validator", "isIn")
  @js.native
  def isIn(value: js.Any, possibleValues: js.Array[_]): Boolean = js.native
  
  @JSImport("class-validator", "isInstance")
  @js.native
  def isInstance(`object`: js.Any, targetTypeConstructor: Instantiable1[/* args (repeated) */ js.Any, js.Any]): Boolean = js.native
  
  @JSImport("class-validator", "isInt")
  @js.native
  def isInt(`val`: js.Any): Boolean = js.native
  
  @JSImport("class-validator", "isJSON")
  @js.native
  def isJSON(value: js.Any): Boolean = js.native
  
  @JSImport("class-validator", "isJWT")
  @js.native
  def isJWT(value: js.Any): Boolean = js.native
  
  @JSImport("class-validator", "isLatLong")
  @js.native
  def isLatLong(value: String): Boolean = js.native
  
  @JSImport("class-validator", "isLatitude")
  @js.native
  def isLatitude(value: String): Boolean = js.native
  
  @JSImport("class-validator", "isLocale")
  @js.native
  def isLocale(value: js.Any): Boolean = js.native
  
  @JSImport("class-validator", "isLongitude")
  @js.native
  def isLongitude(value: String): Boolean = js.native
  
  @JSImport("class-validator", "isLowercase")
  @js.native
  def isLowercase(value: js.Any): Boolean = js.native
  
  @JSImport("class-validator", "isMACAddress")
  @js.native
  def isMACAddress(value: js.Any): Boolean = js.native
  @JSImport("class-validator", "isMACAddress")
  @js.native
  def isMACAddress(value: js.Any, options: IsMACAddressOptions): Boolean = js.native
  
  @JSImport("class-validator", "isMagnetURI")
  @js.native
  def isMagnetURI(value: js.Any): Boolean = js.native
  
  @JSImport("class-validator", "isMilitaryTime")
  @js.native
  def isMilitaryTime(value: js.Any): Boolean = js.native
  
  @JSImport("class-validator", "isMimeType")
  @js.native
  def isMimeType(value: js.Any): Boolean = js.native
  
  @JSImport("class-validator", "isMobilePhone")
  @js.native
  def isMobilePhone(value: js.Any): Boolean = js.native
  @JSImport("class-validator", "isMobilePhone")
  @js.native
  def isMobilePhone(value: js.Any, locale: js.UndefOr[scala.Nothing], options: IsMobilePhoneOptions): Boolean = js.native
  @JSImport("class-validator", "isMobilePhone")
  @js.native
  def isMobilePhone(value: js.Any, locale: MobilePhoneLocale): Boolean = js.native
  @JSImport("class-validator", "isMobilePhone")
  @js.native
  def isMobilePhone(value: js.Any, locale: MobilePhoneLocale, options: IsMobilePhoneOptions): Boolean = js.native
  
  @JSImport("class-validator", "isMongoId")
  @js.native
  def isMongoId(value: js.Any): Boolean = js.native
  
  @JSImport("class-validator", "isMultibyte")
  @js.native
  def isMultibyte(value: js.Any): Boolean = js.native
  
  @JSImport("class-validator", "isNegative")
  @js.native
  def isNegative(value: js.Any): Boolean = js.native
  
  @JSImport("class-validator", "isNotEmpty")
  @js.native
  def isNotEmpty(value: js.Any): Boolean = js.native
  
  @JSImport("class-validator", "isNotEmptyObject")
  @js.native
  def isNotEmptyObject(value: js.Any): Boolean = js.native
  
  @JSImport("class-validator", "isNotIn")
  @js.native
  def isNotIn(value: js.Any, possibleValues: js.Array[_]): Boolean = js.native
  
  @JSImport("class-validator", "isNumber")
  @js.native
  def isNumber(value: js.Any): Boolean = js.native
  @JSImport("class-validator", "isNumber")
  @js.native
  def isNumber(value: js.Any, options: IsNumberOptions): Boolean = js.native
  
  @JSImport("class-validator", "isNumberString")
  @js.native
  def isNumberString(value: js.Any): Boolean = js.native
  @JSImport("class-validator", "isNumberString")
  @js.native
  def isNumberString(value: js.Any, options: IsNumericOptions): Boolean = js.native
  
  @JSImport("class-validator", "isObject")
  @js.native
  def isObject(value: js.Any): /* is object */ Boolean = js.native
  
  @JSImport("class-validator", "isOctal")
  @js.native
  def isOctal(value: js.Any): Boolean = js.native
  
  @JSImport("class-validator", "isPassportNumber")
  @js.native
  def isPassportNumber(value: js.Any, countryCode: String): Boolean = js.native
  
  @JSImport("class-validator", "isPhoneNumber")
  @js.native
  def isPhoneNumber(value: String): Boolean = js.native
  @JSImport("class-validator", "isPhoneNumber")
  @js.native
  def isPhoneNumber(value: String, region: String): Boolean = js.native
  
  @JSImport("class-validator", "isPort")
  @js.native
  def isPort(value: js.Any): Boolean = js.native
  
  @JSImport("class-validator", "isPositive")
  @js.native
  def isPositive(value: js.Any): Boolean = js.native
  
  @JSImport("class-validator", "isPostalCode")
  @js.native
  def isPostalCode(value: js.Any, locale: PostalCodeLocale): Boolean = js.native
  
  @JSImport("class-validator", "isRFC3339")
  @js.native
  def isRFC3339(value: js.Any): Boolean = js.native
  
  @JSImport("class-validator", "isRgbColor")
  @js.native
  def isRgbColor(value: js.Any): Boolean = js.native
  @JSImport("class-validator", "isRgbColor")
  @js.native
  def isRgbColor(value: js.Any, includePercentValues: Boolean): Boolean = js.native
  
  @JSImport("class-validator", "isSemVer")
  @js.native
  def isSemVer(value: js.Any): Boolean = js.native
  
  @JSImport("class-validator", "isString")
  @js.native
  def isString(value: js.Any): /* is string */ Boolean = js.native
  
  @JSImport("class-validator", "isSurrogatePair")
  @js.native
  def isSurrogatePair(value: js.Any): Boolean = js.native
  
  @JSImport("class-validator", "isURL")
  @js.native
  def isURL(value: String): Boolean = js.native
  @JSImport("class-validator", "isURL")
  @js.native
  def isURL(value: String, options: IsURLOptions): Boolean = js.native
  
  @JSImport("class-validator", "isUUID")
  @js.native
  def isUUID(value: js.Any): Boolean = js.native
  @JSImport("class-validator", "isUUID")
  @js.native
  def isUUID(value: js.Any, version: UUIDVersion): Boolean = js.native
  
  @JSImport("class-validator", "isUppercase")
  @js.native
  def isUppercase(value: js.Any): Boolean = js.native
  
  @JSImport("class-validator", "isValidationOptions")
  @js.native
  def isValidationOptions(`val`: js.Any): /* is class-validator.class-validator/types/decorator/ValidationOptions.ValidationOptions */ Boolean = js.native
  
  @JSImport("class-validator", "isVariableWidth")
  @js.native
  def isVariableWidth(value: js.Any): Boolean = js.native
  
  @JSImport("class-validator", "length")
  @js.native
  def length(value: js.Any, min: Double): Boolean = js.native
  @JSImport("class-validator", "length")
  @js.native
  def length(value: js.Any, min: Double, max: Double): Boolean = js.native
  
  @JSImport("class-validator", "matches")
  @js.native
  def matches(value: String, pattern: String, modifiers: String): Boolean = js.native
  @JSImport("class-validator", "matches")
  @js.native
  def matches(value: String, pattern: RegExp): Boolean = js.native
  
  @JSImport("class-validator", "max")
  @js.native
  def max(num: js.Any, max: Double): Boolean = js.native
  
  @JSImport("class-validator", "maxDate")
  @js.native
  def maxDate(date: js.Any, maxDate: Date): Boolean = js.native
  
  @JSImport("class-validator", "maxLength")
  @js.native
  def maxLength(value: js.Any, max: Double): Boolean = js.native
  
  @JSImport("class-validator", "min")
  @js.native
  def min(num: js.Any, min: Double): Boolean = js.native
  
  @JSImport("class-validator", "minDate")
  @js.native
  def minDate(date: js.Any, minDate: Date): Boolean = js.native
  
  @JSImport("class-validator", "minLength")
  @js.native
  def minLength(value: js.Any, min: Double): Boolean = js.native
  
  @JSImport("class-validator", "notContains")
  @js.native
  def notContains(value: js.Any, seed: String): Boolean = js.native
  
  @JSImport("class-validator", "notEquals")
  @js.native
  def notEquals(value: js.Any, comparison: js.Any): Boolean = js.native
  
  @JSImport("class-validator", "registerDecorator")
  @js.native
  def registerDecorator(options: ValidationDecoratorOptions): Unit = js.native
  
  @JSImport("class-validator", "registerSchema")
  @js.native
  def registerSchema(schema: ValidationSchema): Unit = js.native
  
  @JSImport("class-validator", "useContainer")
  @js.native
  def useContainer(iocContainer: Get): Unit = js.native
  @JSImport("class-validator", "useContainer")
  @js.native
  def useContainer(iocContainer: Get, options: UseContainerOptions): Unit = js.native
  
  @JSImport("class-validator", "validate")
  @js.native
  def validate(`object`: js.Object): js.Promise[js.Array[typings.classValidator.validationErrorMod.ValidationError]] = js.native
  @JSImport("class-validator", "validate")
  @js.native
  def validate(`object`: js.Object, validatorOptions: ValidatorOptions): js.Promise[js.Array[typings.classValidator.validationErrorMod.ValidationError]] = js.native
  @JSImport("class-validator", "validate")
  @js.native
  def validate(schemaName: String, `object`: js.Object): js.Promise[js.Array[typings.classValidator.validationErrorMod.ValidationError]] = js.native
  @JSImport("class-validator", "validate")
  @js.native
  def validate(schemaName: String, `object`: js.Object, validatorOptions: ValidatorOptions): js.Promise[js.Array[typings.classValidator.validationErrorMod.ValidationError]] = js.native
  
  @JSImport("class-validator", "validateOrReject")
  @js.native
  def validateOrReject(`object`: js.Object): js.Promise[Unit] = js.native
  @JSImport("class-validator", "validateOrReject")
  @js.native
  def validateOrReject(`object`: js.Object, validatorOptions: ValidatorOptions): js.Promise[Unit] = js.native
  @JSImport("class-validator", "validateOrReject")
  @js.native
  def validateOrReject(schemaName: String, `object`: js.Object): js.Promise[Unit] = js.native
  @JSImport("class-validator", "validateOrReject")
  @js.native
  def validateOrReject(schemaName: String, `object`: js.Object, validatorOptions: ValidatorOptions): js.Promise[Unit] = js.native
  
  @JSImport("class-validator", "validateSync")
  @js.native
  def validateSync(`object`: js.Object): js.Array[typings.classValidator.validationErrorMod.ValidationError] = js.native
  @JSImport("class-validator", "validateSync")
  @js.native
  def validateSync(`object`: js.Object, validatorOptions: ValidatorOptions): js.Array[typings.classValidator.validationErrorMod.ValidationError] = js.native
  @JSImport("class-validator", "validateSync")
  @js.native
  def validateSync(schemaName: String, `object`: js.Object): js.Array[typings.classValidator.validationErrorMod.ValidationError] = js.native
  @JSImport("class-validator", "validateSync")
  @js.native
  def validateSync(schemaName: String, `object`: js.Object, validatorOptions: ValidatorOptions): js.Array[typings.classValidator.validationErrorMod.ValidationError] = js.native
}
