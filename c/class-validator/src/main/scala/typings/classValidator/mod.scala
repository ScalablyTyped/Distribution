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
  
  val ARRAY_CONTAINS: /* "arrayContains" */ String = js.native
  val ARRAY_MAX_SIZE: /* "arrayMaxSize" */ String = js.native
  val ARRAY_MIN_SIZE: /* "arrayMinSize" */ String = js.native
  val ARRAY_NOT_CONTAINS: /* "arrayNotContains" */ String = js.native
  val ARRAY_NOT_EMPTY: /* "arrayNotEmpty" */ String = js.native
  val ARRAY_UNIQUE: /* "arrayUnique" */ String = js.native
  val CONTAINS: /* "contains" */ String = js.native
  val EQUALS: /* "equals" */ String = js.native
  val IS_ALPHA: /* "isAlpha" */ String = js.native
  val IS_ALPHANUMERIC: /* "isAlphanumeric" */ String = js.native
  val IS_ARRAY: /* "isArray" */ String = js.native
  val IS_ASCII: /* "isAscii" */ String = js.native
  val IS_BASE32: /* "isBase32" */ String = js.native
  val IS_BASE64: /* "isBase64" */ String = js.native
  val IS_BIC: /* "isBIC" */ String = js.native
  val IS_BOOLEAN: /* "isBoolean" */ String = js.native
  val IS_BOOLEAN_STRING: /* "isBooleanString" */ String = js.native
  val IS_BTC_ADDRESS: /* "isBtcAddress" */ String = js.native
  val IS_BYTE_LENGTH: /* "isByteLength" */ String = js.native
  val IS_CREDIT_CARD: /* "isCreditCard" */ String = js.native
  val IS_CURRENCY: /* "isCurrency" */ String = js.native
  val IS_DATA_URI: /* "isDataURI" */ String = js.native
  val IS_DATE: /* "isDate" */ String = js.native
  val IS_DATE_STRING: /* "isDateString" */ String = js.native
  val IS_DECIMAL: /* "isDecimal" */ String = js.native
  val IS_DEFINED: String = js.native
  val IS_DIVISIBLE_BY: /* "isDivisibleBy" */ String = js.native
  val IS_EAN: /* "isEAN" */ String = js.native
  val IS_EMAIL: /* "isEmail" */ String = js.native
  val IS_EMPTY: /* "isEmpty" */ String = js.native
  val IS_ENUM: /* "isEnum" */ String = js.native
  val IS_ETHEREUM_ADDRESS: /* "isEthereumAddress" */ String = js.native
  val IS_FIREBASE_PUSH_ID: /* "IsFirebasePushId" */ String = js.native
  val IS_FQDN: /* "isFqdn" */ String = js.native
  val IS_FULL_WIDTH: /* "isFullWidth" */ String = js.native
  val IS_HALF_WIDTH: /* "isHalfWidth" */ String = js.native
  val IS_HASH: /* "isHash" */ String = js.native
  val IS_HEXADECIMAL: /* "isHexadecimal" */ String = js.native
  val IS_HEX_COLOR: /* "isHexColor" */ String = js.native
  val IS_HSL: /* "isHSL" */ String = js.native
  val IS_IBAN: /* "isIBAN" */ String = js.native
  val IS_IDENTITY_CARD: /* "isIdentityCard" */ String = js.native
  val IS_IN: /* "isIn" */ String = js.native
  val IS_INSTANCE: /* "isInstance" */ String = js.native
  val IS_INT: /* "isInt" */ String = js.native
  val IS_IP: /* "isIp" */ String = js.native
  val IS_ISBN: /* "isIsbn" */ String = js.native
  val IS_ISIN: /* "isIsin" */ String = js.native
  val IS_ISO31661_ALPHA_2: /* "isISO31661Alpha2" */ String = js.native
  val IS_ISO31661_ALPHA_3: /* "isISO31661Alpha3" */ String = js.native
  val IS_ISO8601: /* "isIso8601" */ String = js.native
  val IS_ISRC: /* "isISRC" */ String = js.native
  val IS_ISSN: /* "isISSN" */ String = js.native
  val IS_JSON: /* "isJson" */ String = js.native
  val IS_JWT: /* "isJwt" */ String = js.native
  val IS_LATITUDE: /* "isLatitude" */ String = js.native
  val IS_LATLONG: /* "isLatLong" */ String = js.native
  val IS_LOCALE: /* "isLocale" */ String = js.native
  val IS_LONGITUDE: /* "isLongitude" */ String = js.native
  val IS_LOWERCASE: /* "isLowercase" */ String = js.native
  val IS_MAC_ADDRESS: /* "isMacAddress" */ String = js.native
  val IS_MAGNET_URI: /* "isMagnetURI" */ String = js.native
  val IS_MILITARY_TIME: /* "isMilitaryTime" */ String = js.native
  val IS_MIME_TYPE: /* "isMimeType" */ String = js.native
  val IS_MOBILE_PHONE: /* "isMobilePhone" */ String = js.native
  val IS_MONGO_ID: /* "isMongoId" */ String = js.native
  val IS_MULTIBYTE: /* "isMultibyte" */ String = js.native
  val IS_NEGATIVE: /* "isNegative" */ String = js.native
  val IS_NOT_EMPTY: /* "isNotEmpty" */ String = js.native
  val IS_NOT_EMPTY_OBJECT: /* "isNotEmptyObject" */ String = js.native
  val IS_NOT_IN: /* "isNotIn" */ String = js.native
  val IS_NUMBER: /* "isNumber" */ String = js.native
  val IS_NUMBER_STRING: /* "isNumberString" */ String = js.native
  val IS_OBJECT: /* "isObject" */ String = js.native
  val IS_OCTAL: /* "isOctal" */ String = js.native
  val IS_PASSPORT_NUMBER: /* "isPassportNumber" */ String = js.native
  val IS_PHONE_NUMBER: /* "isPhoneNumber" */ String = js.native
  val IS_PORT: /* "isPort" */ String = js.native
  val IS_POSITIVE: /* "isPositive" */ String = js.native
  val IS_POSTAL_CODE: /* "isPostalCode" */ String = js.native
  val IS_RFC_3339: /* "isRFC3339" */ String = js.native
  val IS_RGB_COLOR: /* "isRgbColor" */ String = js.native
  val IS_SEM_VER: /* "isSemVer" */ String = js.native
  val IS_STRING: /* "isString" */ String = js.native
  val IS_SURROGATE_PAIR: /* "isSurrogatePair" */ String = js.native
  val IS_UPPERCASE: /* "isUppercase" */ String = js.native
  val IS_URL: /* "isUrl" */ String = js.native
  val IS_UUID: /* "isUuid" */ String = js.native
  val IS_VARIABLE_WIDTH: /* "isVariableWidth" */ String = js.native
  val LENGTH: /* "length" */ String = js.native
  val MATCHES: /* "matches" */ String = js.native
  val MAX: /* "max" */ String = js.native
  val MAX_DATE: /* "maxDate" */ String = js.native
  val MAX_LENGTH: /* "maxLength" */ String = js.native
  val MIN: /* "min" */ String = js.native
  val MIN_DATE: /* "minDate" */ String = js.native
  val MIN_LENGTH: /* "minLength" */ String = js.native
  val NOT_CONTAINS: /* "notContains" */ String = js.native
  val NOT_EQUALS: /* "notEquals" */ String = js.native
  def Allow(): PropertyDecorator = js.native
  def Allow(validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSName("ArrayContains")
  def ArrayContains_(values: js.Array[_]): PropertyDecorator = js.native
  @JSName("ArrayContains")
  def ArrayContains_(values: js.Array[_], validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSName("ArrayMaxSize")
  def ArrayMaxSize_(max: Double): PropertyDecorator = js.native
  @JSName("ArrayMaxSize")
  def ArrayMaxSize_(max: Double, validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSName("ArrayMinSize")
  def ArrayMinSize_(min: Double): PropertyDecorator = js.native
  @JSName("ArrayMinSize")
  def ArrayMinSize_(min: Double, validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSName("ArrayNotContains")
  def ArrayNotContains_(values: js.Array[_]): PropertyDecorator = js.native
  @JSName("ArrayNotContains")
  def ArrayNotContains_(values: js.Array[_], validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSName("ArrayNotEmpty")
  def ArrayNotEmpty_(): PropertyDecorator = js.native
  @JSName("ArrayNotEmpty")
  def ArrayNotEmpty_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSName("ArrayUnique")
  def ArrayUnique_(): PropertyDecorator = js.native
  @JSName("ArrayUnique")
  def ArrayUnique_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSName("Contains")
  def Contains_(seed: String): PropertyDecorator = js.native
  @JSName("Contains")
  def Contains_(seed: String, validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSName("Equals")
  def Equals_(comparison: js.Any): PropertyDecorator = js.native
  @JSName("Equals")
  def Equals_(comparison: js.Any, validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSName("IsAlpha")
  def IsAlpha_(): PropertyDecorator = js.native
  @JSName("IsAlpha")
  def IsAlpha_(locale: js.UndefOr[scala.Nothing], validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSName("IsAlpha")
  def IsAlpha_(locale: String): PropertyDecorator = js.native
  @JSName("IsAlpha")
  def IsAlpha_(locale: String, validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSName("IsAlphanumeric")
  def IsAlphanumeric_(): PropertyDecorator = js.native
  @JSName("IsAlphanumeric")
  def IsAlphanumeric_(locale: js.UndefOr[scala.Nothing], validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSName("IsAlphanumeric")
  def IsAlphanumeric_(locale: String): PropertyDecorator = js.native
  @JSName("IsAlphanumeric")
  def IsAlphanumeric_(locale: String, validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSName("IsArray")
  def IsArray_(): PropertyDecorator = js.native
  @JSName("IsArray")
  def IsArray_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSName("IsAscii")
  def IsAscii_(): PropertyDecorator = js.native
  @JSName("IsAscii")
  def IsAscii_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSName("IsBIC")
  def IsBIC_(): PropertyDecorator = js.native
  @JSName("IsBIC")
  def IsBIC_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSName("IsBase32")
  def IsBase32_(): PropertyDecorator = js.native
  @JSName("IsBase32")
  def IsBase32_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSName("IsBase64")
  def IsBase64_(): PropertyDecorator = js.native
  @JSName("IsBase64")
  def IsBase64_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSName("IsBooleanString")
  def IsBooleanString_(): PropertyDecorator = js.native
  @JSName("IsBooleanString")
  def IsBooleanString_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSName("IsBoolean")
  def IsBoolean_(): PropertyDecorator = js.native
  @JSName("IsBoolean")
  def IsBoolean_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSName("IsBtcAddress")
  def IsBtcAddress_(): PropertyDecorator = js.native
  @JSName("IsBtcAddress")
  def IsBtcAddress_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSName("IsByteLength")
  def IsByteLength_(min: Double): PropertyDecorator = js.native
  @JSName("IsByteLength")
  def IsByteLength_(min: Double, max: js.UndefOr[scala.Nothing], validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSName("IsByteLength")
  def IsByteLength_(min: Double, max: Double): PropertyDecorator = js.native
  @JSName("IsByteLength")
  def IsByteLength_(min: Double, max: Double, validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSName("IsCreditCard")
  def IsCreditCard_(): PropertyDecorator = js.native
  @JSName("IsCreditCard")
  def IsCreditCard_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSName("IsCurrency")
  def IsCurrency_(): PropertyDecorator = js.native
  @JSName("IsCurrency")
  def IsCurrency_(options: js.UndefOr[scala.Nothing], validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSName("IsCurrency")
  def IsCurrency_(options: IsCurrencyOptions): PropertyDecorator = js.native
  @JSName("IsCurrency")
  def IsCurrency_(options: IsCurrencyOptions, validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSName("IsDataURI")
  def IsDataURI_(): PropertyDecorator = js.native
  @JSName("IsDataURI")
  def IsDataURI_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSName("IsDateString")
  def IsDateString_(): PropertyDecorator = js.native
  @JSName("IsDateString")
  def IsDateString_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSName("IsDate")
  def IsDate_(): PropertyDecorator = js.native
  @JSName("IsDate")
  def IsDate_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSName("IsDecimal")
  def IsDecimal_(): PropertyDecorator = js.native
  @JSName("IsDecimal")
  def IsDecimal_(options: js.UndefOr[scala.Nothing], validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSName("IsDecimal")
  def IsDecimal_(options: IsDecimalOptions): PropertyDecorator = js.native
  @JSName("IsDecimal")
  def IsDecimal_(options: IsDecimalOptions, validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSName("IsDefined")
  def IsDefined_(): PropertyDecorator = js.native
  @JSName("IsDefined")
  def IsDefined_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSName("IsDivisibleBy")
  def IsDivisibleBy_(num: Double): PropertyDecorator = js.native
  @JSName("IsDivisibleBy")
  def IsDivisibleBy_(num: Double, validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSName("IsEAN")
  def IsEAN_(): PropertyDecorator = js.native
  @JSName("IsEAN")
  def IsEAN_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSName("IsEmail")
  def IsEmail_(): PropertyDecorator = js.native
  @JSName("IsEmail")
  def IsEmail_(options: js.UndefOr[scala.Nothing], validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSName("IsEmail")
  def IsEmail_(options: IsEmailOptions): PropertyDecorator = js.native
  @JSName("IsEmail")
  def IsEmail_(options: IsEmailOptions, validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSName("IsEmpty")
  def IsEmpty_(): PropertyDecorator = js.native
  @JSName("IsEmpty")
  def IsEmpty_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSName("IsEnum")
  def IsEnum_(entity: js.Object): PropertyDecorator = js.native
  @JSName("IsEnum")
  def IsEnum_(entity: js.Object, validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSName("IsEthereumAddress")
  def IsEthereumAddress_(): PropertyDecorator = js.native
  @JSName("IsEthereumAddress")
  def IsEthereumAddress_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSName("IsFQDN")
  def IsFQDN_(): PropertyDecorator = js.native
  @JSName("IsFQDN")
  def IsFQDN_(options: js.UndefOr[scala.Nothing], validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSName("IsFQDN")
  def IsFQDN_(options: IsFQDNOptions): PropertyDecorator = js.native
  @JSName("IsFQDN")
  def IsFQDN_(options: IsFQDNOptions, validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSName("IsFirebasePushId")
  def IsFirebasePushId_(): PropertyDecorator = js.native
  @JSName("IsFirebasePushId")
  def IsFirebasePushId_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSName("IsFullWidth")
  def IsFullWidth_(): PropertyDecorator = js.native
  @JSName("IsFullWidth")
  def IsFullWidth_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSName("IsHSL")
  def IsHSL_(): PropertyDecorator = js.native
  @JSName("IsHSL")
  def IsHSL_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSName("IsHalfWidth")
  def IsHalfWidth_(): PropertyDecorator = js.native
  @JSName("IsHalfWidth")
  def IsHalfWidth_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSName("IsHash")
  def IsHash_(algorithm: String): PropertyDecorator = js.native
  @JSName("IsHash")
  def IsHash_(algorithm: String, validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSName("IsHexColor")
  def IsHexColor_(): PropertyDecorator = js.native
  @JSName("IsHexColor")
  def IsHexColor_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSName("IsHexadecimal")
  def IsHexadecimal_(): PropertyDecorator = js.native
  @JSName("IsHexadecimal")
  def IsHexadecimal_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSName("IsIBAN")
  def IsIBAN_(): PropertyDecorator = js.native
  @JSName("IsIBAN")
  def IsIBAN_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSName("IsIP")
  def IsIP_(): PropertyDecorator = js.native
  @JSName("IsIP")
  def IsIP_(version: js.UndefOr[scala.Nothing], validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSName("IsIP")
  def IsIP_(version: IsIpVersion): PropertyDecorator = js.native
  @JSName("IsIP")
  def IsIP_(version: IsIpVersion, validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSName("IsISBN")
  def IsISBN_(): PropertyDecorator = js.native
  @JSName("IsISBN")
  def IsISBN_(version: js.UndefOr[scala.Nothing], validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSName("IsISBN")
  def IsISBN_(version: IsISBNVersion): PropertyDecorator = js.native
  @JSName("IsISBN")
  def IsISBN_(version: IsISBNVersion, validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSName("IsISIN")
  def IsISIN_(): PropertyDecorator = js.native
  @JSName("IsISIN")
  def IsISIN_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSName("IsISO31661Alpha2")
  def IsISO31661Alpha2_(): PropertyDecorator = js.native
  @JSName("IsISO31661Alpha2")
  def IsISO31661Alpha2_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSName("IsISO31661Alpha3")
  def IsISO31661Alpha3_(): PropertyDecorator = js.native
  @JSName("IsISO31661Alpha3")
  def IsISO31661Alpha3_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSName("IsISO8601")
  def IsISO8601_(): PropertyDecorator = js.native
  @JSName("IsISO8601")
  def IsISO8601_(options: js.UndefOr[scala.Nothing], validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSName("IsISO8601")
  def IsISO8601_(options: IsISO8601Options): PropertyDecorator = js.native
  @JSName("IsISO8601")
  def IsISO8601_(options: IsISO8601Options, validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSName("IsISRC")
  def IsISRC_(): PropertyDecorator = js.native
  @JSName("IsISRC")
  def IsISRC_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSName("IsISSN")
  def IsISSN_(): PropertyDecorator = js.native
  @JSName("IsISSN")
  def IsISSN_(options: js.UndefOr[scala.Nothing], validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSName("IsISSN")
  def IsISSN_(options: IsISSNOptions): PropertyDecorator = js.native
  @JSName("IsISSN")
  def IsISSN_(options: IsISSNOptions, validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSName("IsIdentityCard")
  def IsIdentityCard_(): PropertyDecorator = js.native
  @JSName("IsIdentityCard")
  def IsIdentityCard_(locale: js.UndefOr[scala.Nothing], validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSName("IsIdentityCard")
  def IsIdentityCard_(locale: IdentityCardLocale): PropertyDecorator = js.native
  @JSName("IsIdentityCard")
  def IsIdentityCard_(locale: IdentityCardLocale, validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSName("IsIn")
  def IsIn_(values: js.Array[_]): PropertyDecorator = js.native
  @JSName("IsIn")
  def IsIn_(values: js.Array[_], validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSName("IsInstance")
  def IsInstance_(targetType: Instantiable1[/* args (repeated) */ js.Any, js.Any]): PropertyDecorator = js.native
  @JSName("IsInstance")
  def IsInstance_(
    targetType: Instantiable1[/* args (repeated) */ js.Any, js.Any],
    validationOptions: ValidationOptions
  ): PropertyDecorator = js.native
  @JSName("IsInt")
  def IsInt_(): PropertyDecorator = js.native
  @JSName("IsInt")
  def IsInt_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSName("IsJSON")
  def IsJSON_(): PropertyDecorator = js.native
  @JSName("IsJSON")
  def IsJSON_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSName("IsJWT")
  def IsJWT_(): PropertyDecorator = js.native
  @JSName("IsJWT")
  def IsJWT_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSName("IsLatLong")
  def IsLatLong_(): PropertyDecorator = js.native
  @JSName("IsLatLong")
  def IsLatLong_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSName("IsLatitude")
  def IsLatitude_(): PropertyDecorator = js.native
  @JSName("IsLatitude")
  def IsLatitude_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSName("IsLocale")
  def IsLocale_(): PropertyDecorator = js.native
  @JSName("IsLocale")
  def IsLocale_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSName("IsLongitude")
  def IsLongitude_(): PropertyDecorator = js.native
  @JSName("IsLongitude")
  def IsLongitude_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSName("IsLowercase")
  def IsLowercase_(): PropertyDecorator = js.native
  @JSName("IsLowercase")
  def IsLowercase_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSName("IsMACAddress")
  def IsMACAddress_(): PropertyDecorator = js.native
  @JSName("IsMACAddress")
  def IsMACAddress_(optionsArg: js.UndefOr[scala.Nothing], validationOptionsArg: ValidationOptions): PropertyDecorator = js.native
  @JSName("IsMACAddress")
  def IsMACAddress_(optionsArg: IsMACAddressOptions): PropertyDecorator = js.native
  @JSName("IsMACAddress")
  def IsMACAddress_(optionsArg: IsMACAddressOptions, validationOptionsArg: ValidationOptions): PropertyDecorator = js.native
  @JSName("IsMACAddress")
  def IsMACAddress_(validationOptionsArg: ValidationOptions): PropertyDecorator = js.native
  @JSName("IsMagnetURI")
  def IsMagnetURI_(): PropertyDecorator = js.native
  @JSName("IsMagnetURI")
  def IsMagnetURI_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSName("IsMilitaryTime")
  def IsMilitaryTime_(): PropertyDecorator = js.native
  @JSName("IsMilitaryTime")
  def IsMilitaryTime_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSName("IsMimeType")
  def IsMimeType_(): PropertyDecorator = js.native
  @JSName("IsMimeType")
  def IsMimeType_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSName("IsMobilePhone")
  def IsMobilePhone_(): PropertyDecorator = js.native
  @JSName("IsMobilePhone")
  def IsMobilePhone_(
    locale: js.UndefOr[scala.Nothing],
    options: js.UndefOr[scala.Nothing],
    validationOptions: ValidationOptions
  ): PropertyDecorator = js.native
  @JSName("IsMobilePhone")
  def IsMobilePhone_(locale: js.UndefOr[scala.Nothing], options: IsMobilePhoneOptions): PropertyDecorator = js.native
  @JSName("IsMobilePhone")
  def IsMobilePhone_(
    locale: js.UndefOr[scala.Nothing],
    options: IsMobilePhoneOptions,
    validationOptions: ValidationOptions
  ): PropertyDecorator = js.native
  @JSName("IsMobilePhone")
  def IsMobilePhone_(locale: MobilePhoneLocale): PropertyDecorator = js.native
  @JSName("IsMobilePhone")
  def IsMobilePhone_(
    locale: MobilePhoneLocale,
    options: js.UndefOr[scala.Nothing],
    validationOptions: ValidationOptions
  ): PropertyDecorator = js.native
  @JSName("IsMobilePhone")
  def IsMobilePhone_(locale: MobilePhoneLocale, options: IsMobilePhoneOptions): PropertyDecorator = js.native
  @JSName("IsMobilePhone")
  def IsMobilePhone_(locale: MobilePhoneLocale, options: IsMobilePhoneOptions, validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSName("IsMongoId")
  def IsMongoId_(): PropertyDecorator = js.native
  @JSName("IsMongoId")
  def IsMongoId_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSName("IsMultibyte")
  def IsMultibyte_(): PropertyDecorator = js.native
  @JSName("IsMultibyte")
  def IsMultibyte_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSName("IsNegative")
  def IsNegative_(): PropertyDecorator = js.native
  @JSName("IsNegative")
  def IsNegative_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSName("IsNotEmptyObject")
  def IsNotEmptyObject_(): PropertyDecorator = js.native
  @JSName("IsNotEmptyObject")
  def IsNotEmptyObject_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSName("IsNotEmpty")
  def IsNotEmpty_(): PropertyDecorator = js.native
  @JSName("IsNotEmpty")
  def IsNotEmpty_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSName("IsNotIn")
  def IsNotIn_(values: js.Array[_]): PropertyDecorator = js.native
  @JSName("IsNotIn")
  def IsNotIn_(values: js.Array[_], validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSName("IsNumberString")
  def IsNumberString_(): PropertyDecorator = js.native
  @JSName("IsNumberString")
  def IsNumberString_(options: js.UndefOr[scala.Nothing], validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSName("IsNumberString")
  def IsNumberString_(options: IsNumericOptions): PropertyDecorator = js.native
  @JSName("IsNumberString")
  def IsNumberString_(options: IsNumericOptions, validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSName("IsNumber")
  def IsNumber_(): PropertyDecorator = js.native
  @JSName("IsNumber")
  def IsNumber_(options: js.UndefOr[scala.Nothing], validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSName("IsNumber")
  def IsNumber_(options: IsNumberOptions): PropertyDecorator = js.native
  @JSName("IsNumber")
  def IsNumber_(options: IsNumberOptions, validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSName("IsObject")
  def IsObject_(): PropertyDecorator = js.native
  @JSName("IsObject")
  def IsObject_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSName("IsOctal")
  def IsOctal_(): PropertyDecorator = js.native
  @JSName("IsOctal")
  def IsOctal_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  def IsOptional(): PropertyDecorator = js.native
  def IsOptional(validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSName("IsPassportNumber")
  def IsPassportNumber_(countryCode: String): PropertyDecorator = js.native
  @JSName("IsPassportNumber")
  def IsPassportNumber_(countryCode: String, validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSName("IsPhoneNumber")
  def IsPhoneNumber_(): PropertyDecorator = js.native
  @JSName("IsPhoneNumber")
  def IsPhoneNumber_(region: String): PropertyDecorator = js.native
  @JSName("IsPhoneNumber")
  def IsPhoneNumber_(region: String, validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSName("IsPhoneNumber")
  def IsPhoneNumber_(region: Null, validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSName("IsPort")
  def IsPort_(): PropertyDecorator = js.native
  @JSName("IsPort")
  def IsPort_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSName("IsPositive")
  def IsPositive_(): PropertyDecorator = js.native
  @JSName("IsPositive")
  def IsPositive_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSName("IsPostalCode")
  def IsPostalCode_(): PropertyDecorator = js.native
  @JSName("IsPostalCode")
  def IsPostalCode_(locale: js.UndefOr[scala.Nothing], validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSName("IsPostalCode")
  def IsPostalCode_(locale: PostalCodeLocale): PropertyDecorator = js.native
  @JSName("IsPostalCode")
  def IsPostalCode_(locale: PostalCodeLocale, validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSName("IsRFC3339")
  def IsRFC3339_(): PropertyDecorator = js.native
  @JSName("IsRFC3339")
  def IsRFC3339_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSName("IsRgbColor")
  def IsRgbColor_(): PropertyDecorator = js.native
  @JSName("IsRgbColor")
  def IsRgbColor_(includePercentValues: js.UndefOr[scala.Nothing], validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSName("IsRgbColor")
  def IsRgbColor_(includePercentValues: Boolean): PropertyDecorator = js.native
  @JSName("IsRgbColor")
  def IsRgbColor_(includePercentValues: Boolean, validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSName("IsSemVer")
  def IsSemVer_(): PropertyDecorator = js.native
  @JSName("IsSemVer")
  def IsSemVer_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSName("IsString")
  def IsString_(): PropertyDecorator = js.native
  @JSName("IsString")
  def IsString_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSName("IsSurrogatePair")
  def IsSurrogatePair_(): PropertyDecorator = js.native
  @JSName("IsSurrogatePair")
  def IsSurrogatePair_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSName("IsUUID")
  def IsUUID_(): PropertyDecorator = js.native
  @JSName("IsUUID")
  def IsUUID_(version: js.UndefOr[scala.Nothing], validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSName("IsUUID")
  def IsUUID_(version: UUIDVersion): PropertyDecorator = js.native
  @JSName("IsUUID")
  def IsUUID_(version: UUIDVersion, validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSName("IsUppercase")
  def IsUppercase_(): PropertyDecorator = js.native
  @JSName("IsUppercase")
  def IsUppercase_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSName("IsUrl")
  def IsUrl_(): PropertyDecorator = js.native
  @JSName("IsUrl")
  def IsUrl_(options: js.UndefOr[scala.Nothing], validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSName("IsUrl")
  def IsUrl_(options: IsURLOptions): PropertyDecorator = js.native
  @JSName("IsUrl")
  def IsUrl_(options: IsURLOptions, validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSName("IsVariableWidth")
  def IsVariableWidth_(): PropertyDecorator = js.native
  @JSName("IsVariableWidth")
  def IsVariableWidth_(validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSName("Length")
  def Length_(min: Double): PropertyDecorator = js.native
  @JSName("Length")
  def Length_(min: Double, max: js.UndefOr[scala.Nothing], validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSName("Length")
  def Length_(min: Double, max: Double): PropertyDecorator = js.native
  @JSName("Length")
  def Length_(min: Double, max: Double, validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSName("Matches")
  def Matches_(pattern: String): PropertyDecorator = js.native
  @JSName("Matches")
  def Matches_(pattern: String, modifiers: js.UndefOr[scala.Nothing], validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSName("Matches")
  def Matches_(pattern: String, modifiers: String): PropertyDecorator = js.native
  @JSName("Matches")
  def Matches_(pattern: String, modifiers: String, validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSName("Matches")
  def Matches_(pattern: RegExp): PropertyDecorator = js.native
  @JSName("Matches")
  def Matches_(pattern: RegExp, validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSName("MaxDate")
  def MaxDate_(date: Date): PropertyDecorator = js.native
  @JSName("MaxDate")
  def MaxDate_(date: Date, validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSName("MaxLength")
  def MaxLength_(max: Double): PropertyDecorator = js.native
  @JSName("MaxLength")
  def MaxLength_(max: Double, validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSName("Max")
  def Max_(maxValue: Double): PropertyDecorator = js.native
  @JSName("Max")
  def Max_(maxValue: Double, validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSName("MinDate")
  def MinDate_(date: Date): PropertyDecorator = js.native
  @JSName("MinDate")
  def MinDate_(date: Date, validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSName("MinLength")
  def MinLength_(min: Double): PropertyDecorator = js.native
  @JSName("MinLength")
  def MinLength_(min: Double, validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSName("Min")
  def Min_(minValue: Double): PropertyDecorator = js.native
  @JSName("Min")
  def Min_(minValue: Double, validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSName("NotContains")
  def NotContains_(seed: String): PropertyDecorator = js.native
  @JSName("NotContains")
  def NotContains_(seed: String, validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSName("NotEquals")
  def NotEquals_(comparison: js.Any): PropertyDecorator = js.native
  @JSName("NotEquals")
  def NotEquals_(comparison: js.Any, validationOptions: ValidationOptions): PropertyDecorator = js.native
  def ValidateBy(options: ValidateByOptions): PropertyDecorator = js.native
  def ValidateBy(options: ValidateByOptions, validationOptions: ValidationOptions): PropertyDecorator = js.native
  def ValidateIf(condition: js.Function2[/* object */ js.Any, /* value */ js.Any, Boolean]): PropertyDecorator = js.native
  def ValidateIf(
    condition: js.Function2[/* object */ js.Any, /* value */ js.Any, Boolean],
    validationOptions: ValidationOptions
  ): PropertyDecorator = js.native
  def ValidateNested(): PropertyDecorator = js.native
  def ValidateNested(validationOptions: ValidationOptions): PropertyDecorator = js.native
  def ValidatePromise(): PropertyDecorator = js.native
  def ValidatePromise(validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSName("Validate")
  def Validate_(constraintClass: js.Function): PropertyDecorator = js.native
  @JSName("Validate")
  def Validate_(
    constraintClass: js.Function,
    constraints: js.UndefOr[scala.Nothing],
    validationOptions: ValidationOptions
  ): PropertyDecorator = js.native
  @JSName("Validate")
  def Validate_(constraintClass: js.Function, constraints: js.Array[_]): PropertyDecorator = js.native
  @JSName("Validate")
  def Validate_(constraintClass: js.Function, constraints: js.Array[_], validationOptions: ValidationOptions): PropertyDecorator = js.native
  @JSName("Validate")
  def Validate_(constraintClass: js.Function, validationOptions: ValidationOptions): PropertyDecorator = js.native
  def ValidatorConstraint(): js.Function1[/* target */ js.Function, Unit] = js.native
  def ValidatorConstraint(options: Async): js.Function1[/* target */ js.Function, Unit] = js.native
  def arrayContains(array: js.Any, values: js.Array[_]): Boolean = js.native
  def arrayMaxSize(array: js.Any, max: Double): Boolean = js.native
  def arrayMinSize(array: js.Any, min: Double): Boolean = js.native
  def arrayNotContains(array: js.Any, values: js.Array[_]): Boolean = js.native
  def arrayNotEmpty(array: js.Any): Boolean = js.native
  def arrayUnique(array: js.Any): Boolean = js.native
  def buildMessage(impl: js.Function2[/* eachPrefix */ String, /* args */ js.UndefOr[ValidationArguments], String]): js.Function1[/* validationArguments */ js.UndefOr[ValidationArguments], String] = js.native
  def buildMessage(
    impl: js.Function2[/* eachPrefix */ String, /* args */ js.UndefOr[ValidationArguments], String],
    validationOptions: ValidationOptions
  ): js.Function1[/* validationArguments */ js.UndefOr[ValidationArguments], String] = js.native
  def contains(value: js.Any, seed: String): Boolean = js.native
  def equals(value: js.Any, comparison: js.Any): Boolean = js.native
  def getFromContainer[T](someClass: js.Function): T = js.native
  def getFromContainer[T](someClass: Instantiable[T]): T = js.native
  def getMetadataStorage(): typings.classValidator.metadataStorageMod.MetadataStorage = js.native
  def isAlpha(value: js.Any): Boolean = js.native
  def isAlpha(value: js.Any, locale: AlphaLocale): Boolean = js.native
  def isAlphanumeric(value: js.Any): Boolean = js.native
  def isAlphanumeric(value: js.Any, locale: AlphanumericLocale): Boolean = js.native
  def isArray(value: js.Any): Boolean = js.native
  def isAscii(value: js.Any): Boolean = js.native
  def isBIC(value: js.Any): Boolean = js.native
  def isBase32(value: js.Any): Boolean = js.native
  def isBase64(value: js.Any): Boolean = js.native
  def isBoolean(value: js.Any): Boolean = js.native
  def isBooleanString(value: js.Any): Boolean = js.native
  def isBtcAddress(value: js.Any): Boolean = js.native
  def isByteLength(value: js.Any, min: Double): Boolean = js.native
  def isByteLength(value: js.Any, min: Double, max: Double): Boolean = js.native
  def isCreditCard(value: js.Any): Boolean = js.native
  def isCurrency(value: js.Any): Boolean = js.native
  def isCurrency(value: js.Any, options: IsCurrencyOptions): Boolean = js.native
  def isDataURI(value: js.Any): Boolean = js.native
  def isDate(value: js.Any): Boolean = js.native
  def isDateString(value: js.Any): Boolean = js.native
  def isDecimal(value: js.Any): Boolean = js.native
  def isDecimal(value: js.Any, options: IsDecimalOptions): Boolean = js.native
  def isDefined(value: js.Any): Boolean = js.native
  def isDivisibleBy(value: js.Any, num: Double): Boolean = js.native
  def isEAN(value: js.Any): Boolean = js.native
  def isEmail(value: js.Any): Boolean = js.native
  def isEmail(value: js.Any, options: IsEmailOptions): Boolean = js.native
  def isEmpty(value: js.Any): Boolean = js.native
  def isEnum(value: js.Any, entity: js.Any): Boolean = js.native
  def isEthereumAddress(value: js.Any): Boolean = js.native
  def isFQDN(value: js.Any): Boolean = js.native
  def isFQDN(value: js.Any, options: IsFQDNOptions): Boolean = js.native
  def isFirebasePushId(value: js.Any): Boolean = js.native
  def isFullWidth(value: js.Any): Boolean = js.native
  def isHSL(value: js.Any): Boolean = js.native
  def isHalfWidth(value: js.Any): Boolean = js.native
  def isHash(value: js.Any, algorithm: HashAlgorithm): Boolean = js.native
  def isHexColor(value: js.Any): Boolean = js.native
  def isHexadecimal(value: js.Any): Boolean = js.native
  def isIBAN(value: js.Any): Boolean = js.native
  def isIP(value: js.Any): Boolean = js.native
  def isIP(value: js.Any, version: IsIpVersion): Boolean = js.native
  def isISBN(value: js.Any): Boolean = js.native
  def isISBN(value: js.Any, version: IsISBNVersion): Boolean = js.native
  def isISIN(value: js.Any): Boolean = js.native
  def isISO31661Alpha2(value: js.Any): Boolean = js.native
  def isISO31661Alpha3(value: js.Any): Boolean = js.native
  def isISO8601(value: js.Any): Boolean = js.native
  def isISO8601(value: js.Any, options: IsISO8601Options): Boolean = js.native
  def isISRC(value: js.Any): Boolean = js.native
  def isISSN(value: js.Any): Boolean = js.native
  def isISSN(value: js.Any, options: IsISSNOptions): Boolean = js.native
  def isIdentityCard(value: js.Any, locale: IdentityCardLocale): Boolean = js.native
  def isIn(value: js.Any, possibleValues: js.Array[_]): Boolean = js.native
  def isInstance(`object`: js.Any, targetTypeConstructor: Instantiable1[/* args (repeated) */ js.Any, js.Any]): Boolean = js.native
  def isInt(`val`: js.Any): Boolean = js.native
  def isJSON(value: js.Any): Boolean = js.native
  def isJWT(value: js.Any): Boolean = js.native
  def isLatLong(value: String): Boolean = js.native
  def isLatitude(value: String): Boolean = js.native
  def isLocale(value: js.Any): Boolean = js.native
  def isLongitude(value: String): Boolean = js.native
  def isLowercase(value: js.Any): Boolean = js.native
  def isMACAddress(value: js.Any): Boolean = js.native
  def isMACAddress(value: js.Any, options: IsMACAddressOptions): Boolean = js.native
  def isMagnetURI(value: js.Any): Boolean = js.native
  def isMilitaryTime(value: js.Any): Boolean = js.native
  def isMimeType(value: js.Any): Boolean = js.native
  def isMobilePhone(value: js.Any): Boolean = js.native
  def isMobilePhone(value: js.Any, locale: js.UndefOr[scala.Nothing], options: IsMobilePhoneOptions): Boolean = js.native
  def isMobilePhone(value: js.Any, locale: MobilePhoneLocale): Boolean = js.native
  def isMobilePhone(value: js.Any, locale: MobilePhoneLocale, options: IsMobilePhoneOptions): Boolean = js.native
  def isMongoId(value: js.Any): Boolean = js.native
  def isMultibyte(value: js.Any): Boolean = js.native
  def isNegative(value: js.Any): Boolean = js.native
  def isNotEmpty(value: js.Any): Boolean = js.native
  def isNotEmptyObject(value: js.Any): Boolean = js.native
  def isNotIn(value: js.Any, possibleValues: js.Array[_]): Boolean = js.native
  def isNumber(value: js.Any): Boolean = js.native
  def isNumber(value: js.Any, options: IsNumberOptions): Boolean = js.native
  def isNumberString(value: js.Any): Boolean = js.native
  def isNumberString(value: js.Any, options: IsNumericOptions): Boolean = js.native
  def isObject(value: js.Any): /* is object */ Boolean = js.native
  def isOctal(value: js.Any): Boolean = js.native
  def isPassportNumber(value: js.Any, countryCode: String): Boolean = js.native
  def isPhoneNumber(value: String): Boolean = js.native
  def isPhoneNumber(value: String, region: String): Boolean = js.native
  def isPort(value: js.Any): Boolean = js.native
  def isPositive(value: js.Any): Boolean = js.native
  def isPostalCode(value: js.Any, locale: PostalCodeLocale): Boolean = js.native
  def isRFC3339(value: js.Any): Boolean = js.native
  def isRgbColor(value: js.Any): Boolean = js.native
  def isRgbColor(value: js.Any, includePercentValues: Boolean): Boolean = js.native
  def isSemVer(value: js.Any): Boolean = js.native
  def isString(value: js.Any): /* is string */ Boolean = js.native
  def isSurrogatePair(value: js.Any): Boolean = js.native
  def isURL(value: String): Boolean = js.native
  def isURL(value: String, options: IsURLOptions): Boolean = js.native
  def isUUID(value: js.Any): Boolean = js.native
  def isUUID(value: js.Any, version: UUIDVersion): Boolean = js.native
  def isUppercase(value: js.Any): Boolean = js.native
  def isValidationOptions(`val`: js.Any): /* is class-validator.class-validator/types/decorator/ValidationOptions.ValidationOptions */ Boolean = js.native
  def isVariableWidth(value: js.Any): Boolean = js.native
  def length(value: js.Any, min: Double): Boolean = js.native
  def length(value: js.Any, min: Double, max: Double): Boolean = js.native
  def matches(value: String, pattern: String, modifiers: String): Boolean = js.native
  def matches(value: String, pattern: RegExp): Boolean = js.native
  def max(num: js.Any, max: Double): Boolean = js.native
  def maxDate(date: js.Any, maxDate: Date): Boolean = js.native
  def maxLength(value: js.Any, max: Double): Boolean = js.native
  def min(num: js.Any, min: Double): Boolean = js.native
  def minDate(date: js.Any, minDate: Date): Boolean = js.native
  def minLength(value: js.Any, min: Double): Boolean = js.native
  def notContains(value: js.Any, seed: String): Boolean = js.native
  def notEquals(value: js.Any, comparison: js.Any): Boolean = js.native
  def registerDecorator(options: ValidationDecoratorOptions): Unit = js.native
  def registerSchema(schema: ValidationSchema): Unit = js.native
  def useContainer(iocContainer: Get): Unit = js.native
  def useContainer(iocContainer: Get, options: UseContainerOptions): Unit = js.native
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
    var CONDITIONAL_VALIDATION: String = js.native
    var CUSTOM_VALIDATION: String = js.native
    var IS_DEFINED: String = js.native
    var NESTED_VALIDATION: String = js.native
    var PROMISE_VALIDATION: String = js.native
    var WHITELIST: String = js.native
    /**
      * Checks if validation type is valid.
      */
    def isValid(`type`: String): Boolean = js.native
  }
  
}

