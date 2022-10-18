package typings.classValidator

import org.scalablytyped.runtime.Instantiable1
import typings.classValidator.anon.Async
import typings.classValidator.anon.Nullable
import typings.classValidator.classValidatorStrings.any
import typings.classValidator.typesDecoratorArrayArrayUniqueMod.ArrayUniqueIdentifier
import typings.classValidator.typesDecoratorCommonValidateByMod.ValidateByOptions
import typings.classValidator.typesDecoratorStringIsIPMod.IsIpVersion
import typings.classValidator.typesDecoratorStringIsISBNMod.IsISBNVersion
import typings.classValidator.typesDecoratorStringIsUUIDMod.UUIDVersion
import typings.classValidator.typesDecoratorTypecheckerIsNumberMod.IsNumberOptions
import typings.classValidator.typesDecoratorValidationOptionsMod.ValidationOptions
import typings.classValidator.typesValidationValidationArgumentsMod.ValidationArguments
import typings.libphonenumberJs.typesMod.CountryCode
import typings.std.PropertyDecorator
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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesDecoratorDecoratorsMod {
  
  @JSImport("class-validator/types/decorator/decorators", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("class-validator/types/decorator/decorators", "ARRAY_CONTAINS")
  @js.native
  val ARRAY_CONTAINS: /* "arrayContains" */ String = js.native
  
  @JSImport("class-validator/types/decorator/decorators", "ARRAY_MAX_SIZE")
  @js.native
  val ARRAY_MAX_SIZE: /* "arrayMaxSize" */ String = js.native
  
  @JSImport("class-validator/types/decorator/decorators", "ARRAY_MIN_SIZE")
  @js.native
  val ARRAY_MIN_SIZE: /* "arrayMinSize" */ String = js.native
  
  @JSImport("class-validator/types/decorator/decorators", "ARRAY_NOT_CONTAINS")
  @js.native
  val ARRAY_NOT_CONTAINS: /* "arrayNotContains" */ String = js.native
  
  @JSImport("class-validator/types/decorator/decorators", "ARRAY_NOT_EMPTY")
  @js.native
  val ARRAY_NOT_EMPTY: /* "arrayNotEmpty" */ String = js.native
  
  @JSImport("class-validator/types/decorator/decorators", "ARRAY_UNIQUE")
  @js.native
  val ARRAY_UNIQUE: /* "arrayUnique" */ String = js.native
  
  inline def Allow(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Allow")().asInstanceOf[PropertyDecorator]
  inline def Allow(validationOptions: ValidationOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Allow")(validationOptions.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  
  inline def ArrayContains_(values: js.Array[Any]): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("ArrayContains")(values.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  inline def ArrayContains_(values: js.Array[Any], validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("ArrayContains")(values.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  
  inline def ArrayMaxSize_(max: Double): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("ArrayMaxSize")(max.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  inline def ArrayMaxSize_(max: Double, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("ArrayMaxSize")(max.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  
  inline def ArrayMinSize_(min: Double): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("ArrayMinSize")(min.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  inline def ArrayMinSize_(min: Double, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("ArrayMinSize")(min.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  
  inline def ArrayNotContains_(values: js.Array[Any]): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("ArrayNotContains")(values.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  inline def ArrayNotContains_(values: js.Array[Any], validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("ArrayNotContains")(values.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  
  inline def ArrayNotEmpty_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("ArrayNotEmpty")().asInstanceOf[PropertyDecorator]
  inline def ArrayNotEmpty_(validationOptions: ValidationOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("ArrayNotEmpty")(validationOptions.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  
  inline def ArrayUnique_[T](): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("ArrayUnique")().asInstanceOf[PropertyDecorator]
  inline def ArrayUnique_[T](identifierOrOptions: Unit, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("ArrayUnique")(identifierOrOptions.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  inline def ArrayUnique_[T](identifierOrOptions: ArrayUniqueIdentifier[T]): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("ArrayUnique")(identifierOrOptions.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  inline def ArrayUnique_[T](identifierOrOptions: ArrayUniqueIdentifier[T], validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("ArrayUnique")(identifierOrOptions.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  inline def ArrayUnique_[T](identifierOrOptions: ValidationOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("ArrayUnique")(identifierOrOptions.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  inline def ArrayUnique_[T](identifierOrOptions: ValidationOptions, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("ArrayUnique")(identifierOrOptions.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  
  @JSImport("class-validator/types/decorator/decorators", "CONTAINS")
  @js.native
  val CONTAINS__ : /* "contains" */ String = js.native
  
  inline def Contains_(seed: String): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Contains")(seed.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  inline def Contains_(seed: String, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("Contains")(seed.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  
  @JSImport("class-validator/types/decorator/decorators", "EQUALS")
  @js.native
  val EQUALS__ : /* "equals" */ String = js.native
  
  inline def Equals(comparison: Any): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Equals")(comparison.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  inline def Equals(comparison: Any, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("Equals")(comparison.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  
  @JSImport("class-validator/types/decorator/decorators", "IS_ALPHA")
  @js.native
  val IS_ALPHA: /* "isAlpha" */ String = js.native
  
  @JSImport("class-validator/types/decorator/decorators", "IS_ALPHANUMERIC")
  @js.native
  val IS_ALPHANUMERIC: /* "isAlphanumeric" */ String = js.native
  
  @JSImport("class-validator/types/decorator/decorators", "IS_ARRAY")
  @js.native
  val IS_ARRAY: /* "isArray" */ String = js.native
  
  @JSImport("class-validator/types/decorator/decorators", "IS_ASCII")
  @js.native
  val IS_ASCII: /* "isAscii" */ String = js.native
  
  @JSImport("class-validator/types/decorator/decorators", "IS_BASE32")
  @js.native
  val IS_BASE32: /* "isBase32" */ String = js.native
  
  @JSImport("class-validator/types/decorator/decorators", "IS_BASE64")
  @js.native
  val IS_BASE64: /* "isBase64" */ String = js.native
  
  @JSImport("class-validator/types/decorator/decorators", "IS_BIC")
  @js.native
  val IS_BIC: /* "isBIC" */ String = js.native
  
  @JSImport("class-validator/types/decorator/decorators", "IS_BOOLEAN")
  @js.native
  val IS_BOOLEAN: /* "isBoolean" */ String = js.native
  
  @JSImport("class-validator/types/decorator/decorators", "IS_BOOLEAN_STRING")
  @js.native
  val IS_BOOLEAN_STRING: /* "isBooleanString" */ String = js.native
  
  @JSImport("class-validator/types/decorator/decorators", "IS_BTC_ADDRESS")
  @js.native
  val IS_BTC_ADDRESS: /* "isBtcAddress" */ String = js.native
  
  @JSImport("class-validator/types/decorator/decorators", "IS_BYTE_LENGTH")
  @js.native
  val IS_BYTE_LENGTH: /* "isByteLength" */ String = js.native
  
  @JSImport("class-validator/types/decorator/decorators", "IS_CREDIT_CARD")
  @js.native
  val IS_CREDIT_CARD: /* "isCreditCard" */ String = js.native
  
  @JSImport("class-validator/types/decorator/decorators", "IS_CURRENCY")
  @js.native
  val IS_CURRENCY: /* "isCurrency" */ String = js.native
  
  @JSImport("class-validator/types/decorator/decorators", "IS_DATA_URI")
  @js.native
  val IS_DATA_URI: /* "isDataURI" */ String = js.native
  
  @JSImport("class-validator/types/decorator/decorators", "IS_DATE")
  @js.native
  val IS_DATE: /* "isDate" */ String = js.native
  
  @JSImport("class-validator/types/decorator/decorators", "IS_DATE_STRING")
  @js.native
  val IS_DATE_STRING: /* "isDateString" */ String = js.native
  
  @JSImport("class-validator/types/decorator/decorators", "IS_DECIMAL")
  @js.native
  val IS_DECIMAL: /* "isDecimal" */ String = js.native
  
  @JSImport("class-validator/types/decorator/decorators", "IS_DEFINED")
  @js.native
  val IS_DEFINED: String = js.native
  
  @JSImport("class-validator/types/decorator/decorators", "IS_DIVISIBLE_BY")
  @js.native
  val IS_DIVISIBLE_BY: /* "isDivisibleBy" */ String = js.native
  
  @JSImport("class-validator/types/decorator/decorators", "IS_EAN")
  @js.native
  val IS_EAN: /* "isEAN" */ String = js.native
  
  @JSImport("class-validator/types/decorator/decorators", "IS_EMAIL")
  @js.native
  val IS_EMAIL: /* "isEmail" */ String = js.native
  
  @JSImport("class-validator/types/decorator/decorators", "IS_EMPTY")
  @js.native
  val IS_EMPTY: /* "isEmpty" */ String = js.native
  
  @JSImport("class-validator/types/decorator/decorators", "IS_ENUM")
  @js.native
  val IS_ENUM: /* "isEnum" */ String = js.native
  
  @JSImport("class-validator/types/decorator/decorators", "IS_ETHEREUM_ADDRESS")
  @js.native
  val IS_ETHEREUM_ADDRESS: /* "isEthereumAddress" */ String = js.native
  
  @JSImport("class-validator/types/decorator/decorators", "IS_FIREBASE_PUSH_ID")
  @js.native
  val IS_FIREBASE_PUSH_ID: /* "IsFirebasePushId" */ String = js.native
  
  @JSImport("class-validator/types/decorator/decorators", "IS_FQDN")
  @js.native
  val IS_FQDN: /* "isFqdn" */ String = js.native
  
  @JSImport("class-validator/types/decorator/decorators", "IS_FULL_WIDTH")
  @js.native
  val IS_FULL_WIDTH: /* "isFullWidth" */ String = js.native
  
  @JSImport("class-validator/types/decorator/decorators", "IS_HALF_WIDTH")
  @js.native
  val IS_HALF_WIDTH: /* "isHalfWidth" */ String = js.native
  
  @JSImport("class-validator/types/decorator/decorators", "IS_HASH")
  @js.native
  val IS_HASH: /* "isHash" */ String = js.native
  
  @JSImport("class-validator/types/decorator/decorators", "IS_HEXADECIMAL")
  @js.native
  val IS_HEXADECIMAL: /* "isHexadecimal" */ String = js.native
  
  @JSImport("class-validator/types/decorator/decorators", "IS_HEX_COLOR")
  @js.native
  val IS_HEX_COLOR: /* "isHexColor" */ String = js.native
  
  @JSImport("class-validator/types/decorator/decorators", "IS_HSL")
  @js.native
  val IS_HSL: /* "isHSL" */ String = js.native
  
  @JSImport("class-validator/types/decorator/decorators", "IS_IBAN")
  @js.native
  val IS_IBAN: /* "isIBAN" */ String = js.native
  
  @JSImport("class-validator/types/decorator/decorators", "IS_IDENTITY_CARD")
  @js.native
  val IS_IDENTITY_CARD: /* "isIdentityCard" */ String = js.native
  
  @JSImport("class-validator/types/decorator/decorators", "IS_IN")
  @js.native
  val IS_IN: /* "isIn" */ String = js.native
  
  @JSImport("class-validator/types/decorator/decorators", "IS_INSTANCE")
  @js.native
  val IS_INSTANCE: /* "isInstance" */ String = js.native
  
  @JSImport("class-validator/types/decorator/decorators", "IS_INT")
  @js.native
  val IS_INT: /* "isInt" */ String = js.native
  
  @JSImport("class-validator/types/decorator/decorators", "IS_IP")
  @js.native
  val IS_IP: /* "isIp" */ String = js.native
  
  @JSImport("class-validator/types/decorator/decorators", "IS_ISBN")
  @js.native
  val IS_ISBN: /* "isIsbn" */ String = js.native
  
  @JSImport("class-validator/types/decorator/decorators", "IS_ISIN")
  @js.native
  val IS_ISIN: /* "isIsin" */ String = js.native
  
  @JSImport("class-validator/types/decorator/decorators", "IS_ISO31661_ALPHA_2")
  @js.native
  val IS_ISO31661_ALPHA_2: /* "isISO31661Alpha2" */ String = js.native
  
  @JSImport("class-validator/types/decorator/decorators", "IS_ISO31661_ALPHA_3")
  @js.native
  val IS_ISO31661_ALPHA_3: /* "isISO31661Alpha3" */ String = js.native
  
  @JSImport("class-validator/types/decorator/decorators", "IS_ISO8601")
  @js.native
  val IS_ISO8601: /* "isIso8601" */ String = js.native
  
  @JSImport("class-validator/types/decorator/decorators", "IS_ISRC")
  @js.native
  val IS_ISRC: /* "isISRC" */ String = js.native
  
  @JSImport("class-validator/types/decorator/decorators", "IS_ISSN")
  @js.native
  val IS_ISSN: /* "isISSN" */ String = js.native
  
  @JSImport("class-validator/types/decorator/decorators", "IS_JSON")
  @js.native
  val IS_JSON: /* "isJson" */ String = js.native
  
  @JSImport("class-validator/types/decorator/decorators", "IS_JWT")
  @js.native
  val IS_JWT: /* "isJwt" */ String = js.native
  
  @JSImport("class-validator/types/decorator/decorators", "IS_LATITUDE")
  @js.native
  val IS_LATITUDE: /* "isLatitude" */ String = js.native
  
  @JSImport("class-validator/types/decorator/decorators", "IS_LATLONG")
  @js.native
  val IS_LATLONG: /* "isLatLong" */ String = js.native
  
  @JSImport("class-validator/types/decorator/decorators", "IS_LENGTH")
  @js.native
  val IS_LENGTH: /* "isLength" */ String = js.native
  
  @JSImport("class-validator/types/decorator/decorators", "IS_LOCALE")
  @js.native
  val IS_LOCALE: /* "isLocale" */ String = js.native
  
  @JSImport("class-validator/types/decorator/decorators", "IS_LONGITUDE")
  @js.native
  val IS_LONGITUDE: /* "isLongitude" */ String = js.native
  
  @JSImport("class-validator/types/decorator/decorators", "IS_LOWERCASE")
  @js.native
  val IS_LOWERCASE: /* "isLowercase" */ String = js.native
  
  @JSImport("class-validator/types/decorator/decorators", "IS_MAC_ADDRESS")
  @js.native
  val IS_MAC_ADDRESS: /* "isMacAddress" */ String = js.native
  
  @JSImport("class-validator/types/decorator/decorators", "IS_MAGNET_URI")
  @js.native
  val IS_MAGNET_URI: /* "isMagnetURI" */ String = js.native
  
  @JSImport("class-validator/types/decorator/decorators", "IS_MILITARY_TIME")
  @js.native
  val IS_MILITARY_TIME: /* "isMilitaryTime" */ String = js.native
  
  @JSImport("class-validator/types/decorator/decorators", "IS_MIME_TYPE")
  @js.native
  val IS_MIME_TYPE: /* "isMimeType" */ String = js.native
  
  @JSImport("class-validator/types/decorator/decorators", "IS_MOBILE_PHONE")
  @js.native
  val IS_MOBILE_PHONE: /* "isMobilePhone" */ String = js.native
  
  @JSImport("class-validator/types/decorator/decorators", "IS_MONGO_ID")
  @js.native
  val IS_MONGO_ID: /* "isMongoId" */ String = js.native
  
  @JSImport("class-validator/types/decorator/decorators", "IS_MULTIBYTE")
  @js.native
  val IS_MULTIBYTE: /* "isMultibyte" */ String = js.native
  
  @JSImport("class-validator/types/decorator/decorators", "IS_NEGATIVE")
  @js.native
  val IS_NEGATIVE: /* "isNegative" */ String = js.native
  
  @JSImport("class-validator/types/decorator/decorators", "IS_NOT_EMPTY")
  @js.native
  val IS_NOT_EMPTY: /* "isNotEmpty" */ String = js.native
  
  @JSImport("class-validator/types/decorator/decorators", "IS_NOT_EMPTY_OBJECT")
  @js.native
  val IS_NOT_EMPTY_OBJECT: /* "isNotEmptyObject" */ String = js.native
  
  @JSImport("class-validator/types/decorator/decorators", "IS_NOT_IN")
  @js.native
  val IS_NOT_IN: /* "isNotIn" */ String = js.native
  
  @JSImport("class-validator/types/decorator/decorators", "IS_NUMBER")
  @js.native
  val IS_NUMBER: /* "isNumber" */ String = js.native
  
  @JSImport("class-validator/types/decorator/decorators", "IS_NUMBER_STRING")
  @js.native
  val IS_NUMBER_STRING: /* "isNumberString" */ String = js.native
  
  @JSImport("class-validator/types/decorator/decorators", "IS_OBJECT")
  @js.native
  val IS_OBJECT: /* "isObject" */ String = js.native
  
  @JSImport("class-validator/types/decorator/decorators", "IS_OCTAL")
  @js.native
  val IS_OCTAL: /* "isOctal" */ String = js.native
  
  @JSImport("class-validator/types/decorator/decorators", "IS_PASSPORT_NUMBER")
  @js.native
  val IS_PASSPORT_NUMBER: /* "isPassportNumber" */ String = js.native
  
  @JSImport("class-validator/types/decorator/decorators", "IS_PHONE_NUMBER")
  @js.native
  val IS_PHONE_NUMBER: /* "isPhoneNumber" */ String = js.native
  
  @JSImport("class-validator/types/decorator/decorators", "IS_PORT")
  @js.native
  val IS_PORT: /* "isPort" */ String = js.native
  
  @JSImport("class-validator/types/decorator/decorators", "IS_POSITIVE")
  @js.native
  val IS_POSITIVE: /* "isPositive" */ String = js.native
  
  @JSImport("class-validator/types/decorator/decorators", "IS_POSTAL_CODE")
  @js.native
  val IS_POSTAL_CODE: /* "isPostalCode" */ String = js.native
  
  @JSImport("class-validator/types/decorator/decorators", "IS_RFC_3339")
  @js.native
  val IS_RFC_3339: /* "isRFC3339" */ String = js.native
  
  @JSImport("class-validator/types/decorator/decorators", "IS_RGB_COLOR")
  @js.native
  val IS_RGB_COLOR: /* "isRgbColor" */ String = js.native
  
  @JSImport("class-validator/types/decorator/decorators", "IS_SEM_VER")
  @js.native
  val IS_SEM_VER: /* "isSemVer" */ String = js.native
  
  @JSImport("class-validator/types/decorator/decorators", "IS_STRING")
  @js.native
  val IS_STRING: /* "isString" */ String = js.native
  
  @JSImport("class-validator/types/decorator/decorators", "IS_SURROGATE_PAIR")
  @js.native
  val IS_SURROGATE_PAIR: /* "isSurrogatePair" */ String = js.native
  
  @JSImport("class-validator/types/decorator/decorators", "IS_UPPERCASE")
  @js.native
  val IS_UPPERCASE: /* "isUppercase" */ String = js.native
  
  @JSImport("class-validator/types/decorator/decorators", "IS_URL")
  @js.native
  val IS_URL: /* "isUrl" */ String = js.native
  
  @JSImport("class-validator/types/decorator/decorators", "IS_UUID")
  @js.native
  val IS_UUID: /* "isUuid" */ String = js.native
  
  @JSImport("class-validator/types/decorator/decorators", "IS_VARIABLE_WIDTH")
  @js.native
  val IS_VARIABLE_WIDTH: /* "isVariableWidth" */ String = js.native
  
  inline def IsAlpha_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsAlpha")().asInstanceOf[PropertyDecorator]
  inline def IsAlpha_(locale: String): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsAlpha")(locale.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  inline def IsAlpha_(locale: String, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("IsAlpha")(locale.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  inline def IsAlpha_(locale: Unit, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("IsAlpha")(locale.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  
  inline def IsAlphanumeric_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsAlphanumeric")().asInstanceOf[PropertyDecorator]
  inline def IsAlphanumeric_(locale: String): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsAlphanumeric")(locale.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  inline def IsAlphanumeric_(locale: String, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("IsAlphanumeric")(locale.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  inline def IsAlphanumeric_(locale: Unit, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("IsAlphanumeric")(locale.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  
  inline def IsArray_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsArray")().asInstanceOf[PropertyDecorator]
  inline def IsArray_(validationOptions: ValidationOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsArray")(validationOptions.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  
  inline def IsAscii_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsAscii")().asInstanceOf[PropertyDecorator]
  inline def IsAscii_(validationOptions: ValidationOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsAscii")(validationOptions.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  
  inline def IsBIC_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsBIC")().asInstanceOf[PropertyDecorator]
  inline def IsBIC_(validationOptions: ValidationOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsBIC")(validationOptions.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  
  inline def IsBase32_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsBase32")().asInstanceOf[PropertyDecorator]
  inline def IsBase32_(validationOptions: ValidationOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsBase32")(validationOptions.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  
  inline def IsBase64_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsBase64")().asInstanceOf[PropertyDecorator]
  inline def IsBase64_(validationOptions: ValidationOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsBase64")(validationOptions.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  
  inline def IsBooleanString_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsBooleanString")().asInstanceOf[PropertyDecorator]
  inline def IsBooleanString_(validationOptions: ValidationOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsBooleanString")(validationOptions.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  
  inline def IsBoolean_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsBoolean")().asInstanceOf[PropertyDecorator]
  inline def IsBoolean_(validationOptions: ValidationOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsBoolean")(validationOptions.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  
  inline def IsBtcAddress_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsBtcAddress")().asInstanceOf[PropertyDecorator]
  inline def IsBtcAddress_(validationOptions: ValidationOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsBtcAddress")(validationOptions.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  
  inline def IsByteLength_(min: Double): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsByteLength")(min.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  inline def IsByteLength_(min: Double, max: Double): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("IsByteLength")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  inline def IsByteLength_(min: Double, max: Double, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("IsByteLength")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  inline def IsByteLength_(min: Double, max: Unit, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("IsByteLength")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  
  inline def IsCreditCard_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsCreditCard")().asInstanceOf[PropertyDecorator]
  inline def IsCreditCard_(validationOptions: ValidationOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsCreditCard")(validationOptions.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  
  inline def IsCurrency_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsCurrency")().asInstanceOf[PropertyDecorator]
  inline def IsCurrency_(options: Unit, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("IsCurrency")(options.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  inline def IsCurrency_(options: IsCurrencyOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsCurrency")(options.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  inline def IsCurrency_(options: IsCurrencyOptions, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("IsCurrency")(options.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  
  inline def IsDataURI_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsDataURI")().asInstanceOf[PropertyDecorator]
  inline def IsDataURI_(validationOptions: ValidationOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsDataURI")(validationOptions.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  
  inline def IsDateString_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsDateString")().asInstanceOf[PropertyDecorator]
  inline def IsDateString_(options: Unit, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("IsDateString")(options.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  inline def IsDateString_(options: IsISO8601Options): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsDateString")(options.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  inline def IsDateString_(options: IsISO8601Options, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("IsDateString")(options.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  
  inline def IsDate_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsDate")().asInstanceOf[PropertyDecorator]
  inline def IsDate_(validationOptions: ValidationOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsDate")(validationOptions.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  
  inline def IsDecimal_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsDecimal")().asInstanceOf[PropertyDecorator]
  inline def IsDecimal_(options: Unit, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("IsDecimal")(options.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  inline def IsDecimal_(options: IsDecimalOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsDecimal")(options.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  inline def IsDecimal_(options: IsDecimalOptions, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("IsDecimal")(options.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  
  inline def IsDefined_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsDefined")().asInstanceOf[PropertyDecorator]
  inline def IsDefined_(validationOptions: ValidationOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsDefined")(validationOptions.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  
  inline def IsDivisibleBy_(num: Double): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsDivisibleBy")(num.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  inline def IsDivisibleBy_(num: Double, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("IsDivisibleBy")(num.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  
  inline def IsEAN_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsEAN")().asInstanceOf[PropertyDecorator]
  inline def IsEAN_(validationOptions: ValidationOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsEAN")(validationOptions.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  
  inline def IsEmail_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsEmail")().asInstanceOf[PropertyDecorator]
  inline def IsEmail_(options: Unit, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("IsEmail")(options.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  inline def IsEmail_(options: IsEmailOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsEmail")(options.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  inline def IsEmail_(options: IsEmailOptions, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("IsEmail")(options.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  
  inline def IsEmpty_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsEmpty")().asInstanceOf[PropertyDecorator]
  inline def IsEmpty_(validationOptions: ValidationOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsEmpty")(validationOptions.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  
  inline def IsEnum_(entity: js.Object): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsEnum")(entity.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  inline def IsEnum_(entity: js.Object, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("IsEnum")(entity.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  
  inline def IsEthereumAddress_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsEthereumAddress")().asInstanceOf[PropertyDecorator]
  inline def IsEthereumAddress_(validationOptions: ValidationOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsEthereumAddress")(validationOptions.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  
  inline def IsFQDN_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsFQDN")().asInstanceOf[PropertyDecorator]
  inline def IsFQDN_(options: Unit, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("IsFQDN")(options.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  inline def IsFQDN_(options: IsFQDNOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsFQDN")(options.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  inline def IsFQDN_(options: IsFQDNOptions, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("IsFQDN")(options.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  
  inline def IsFirebasePushId_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsFirebasePushId")().asInstanceOf[PropertyDecorator]
  inline def IsFirebasePushId_(validationOptions: ValidationOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsFirebasePushId")(validationOptions.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  
  inline def IsFullWidth_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsFullWidth")().asInstanceOf[PropertyDecorator]
  inline def IsFullWidth_(validationOptions: ValidationOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsFullWidth")(validationOptions.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  
  inline def IsHSL_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsHSL")().asInstanceOf[PropertyDecorator]
  inline def IsHSL_(validationOptions: ValidationOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsHSL")(validationOptions.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  
  inline def IsHalfWidth_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsHalfWidth")().asInstanceOf[PropertyDecorator]
  inline def IsHalfWidth_(validationOptions: ValidationOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsHalfWidth")(validationOptions.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  
  inline def IsHash_(algorithm: String): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsHash")(algorithm.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  inline def IsHash_(algorithm: String, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("IsHash")(algorithm.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  
  inline def IsHexColor_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsHexColor")().asInstanceOf[PropertyDecorator]
  inline def IsHexColor_(validationOptions: ValidationOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsHexColor")(validationOptions.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  
  inline def IsHexadecimal_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsHexadecimal")().asInstanceOf[PropertyDecorator]
  inline def IsHexadecimal_(validationOptions: ValidationOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsHexadecimal")(validationOptions.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  
  inline def IsIBAN_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsIBAN")().asInstanceOf[PropertyDecorator]
  inline def IsIBAN_(validationOptions: ValidationOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsIBAN")(validationOptions.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  
  inline def IsIP_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsIP")().asInstanceOf[PropertyDecorator]
  inline def IsIP_(version: Unit, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("IsIP")(version.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  inline def IsIP_(version: IsIpVersion): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsIP")(version.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  inline def IsIP_(version: IsIpVersion, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("IsIP")(version.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  
  inline def IsISBN_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsISBN")().asInstanceOf[PropertyDecorator]
  inline def IsISBN_(version: Unit, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("IsISBN")(version.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  inline def IsISBN_(version: IsISBNVersion): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsISBN")(version.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  inline def IsISBN_(version: IsISBNVersion, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("IsISBN")(version.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  
  inline def IsISIN_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsISIN")().asInstanceOf[PropertyDecorator]
  inline def IsISIN_(validationOptions: ValidationOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsISIN")(validationOptions.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  
  inline def IsISO31661Alpha2_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsISO31661Alpha2")().asInstanceOf[PropertyDecorator]
  inline def IsISO31661Alpha2_(validationOptions: ValidationOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsISO31661Alpha2")(validationOptions.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  
  inline def IsISO31661Alpha3_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsISO31661Alpha3")().asInstanceOf[PropertyDecorator]
  inline def IsISO31661Alpha3_(validationOptions: ValidationOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsISO31661Alpha3")(validationOptions.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  
  inline def IsISO8601_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsISO8601")().asInstanceOf[PropertyDecorator]
  inline def IsISO8601_(options: Unit, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("IsISO8601")(options.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  inline def IsISO8601_(options: IsISO8601Options): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsISO8601")(options.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  inline def IsISO8601_(options: IsISO8601Options, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("IsISO8601")(options.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  
  inline def IsISRC_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsISRC")().asInstanceOf[PropertyDecorator]
  inline def IsISRC_(validationOptions: ValidationOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsISRC")(validationOptions.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  
  inline def IsISSN_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsISSN")().asInstanceOf[PropertyDecorator]
  inline def IsISSN_(options: Unit, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("IsISSN")(options.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  inline def IsISSN_(options: IsISSNOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsISSN")(options.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  inline def IsISSN_(options: IsISSNOptions, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("IsISSN")(options.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  
  inline def IsIdentityCard_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsIdentityCard")().asInstanceOf[PropertyDecorator]
  inline def IsIdentityCard_(locale: Unit, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("IsIdentityCard")(locale.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  inline def IsIdentityCard_(locale: IdentityCardLocale): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsIdentityCard")(locale.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  inline def IsIdentityCard_(locale: IdentityCardLocale, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("IsIdentityCard")(locale.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  
  inline def IsIn_(values: js.Array[Any]): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsIn")(values.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  inline def IsIn_(values: js.Array[Any], validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("IsIn")(values.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  
  inline def IsInstance_(targetType: Instantiable1[/* args (repeated) */ Any, Any]): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsInstance")(targetType.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  inline def IsInstance_(targetType: Instantiable1[/* args (repeated) */ Any, Any], validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("IsInstance")(targetType.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  
  inline def IsInt_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsInt")().asInstanceOf[PropertyDecorator]
  inline def IsInt_(validationOptions: ValidationOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsInt")(validationOptions.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  
  inline def IsJSON_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsJSON")().asInstanceOf[PropertyDecorator]
  inline def IsJSON_(validationOptions: ValidationOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsJSON")(validationOptions.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  
  inline def IsJWT_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsJWT")().asInstanceOf[PropertyDecorator]
  inline def IsJWT_(validationOptions: ValidationOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsJWT")(validationOptions.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  
  inline def IsLatLong_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsLatLong")().asInstanceOf[PropertyDecorator]
  inline def IsLatLong_(validationOptions: ValidationOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsLatLong")(validationOptions.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  
  inline def IsLatitude_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsLatitude")().asInstanceOf[PropertyDecorator]
  inline def IsLatitude_(validationOptions: ValidationOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsLatitude")(validationOptions.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  
  inline def IsLocale_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsLocale")().asInstanceOf[PropertyDecorator]
  inline def IsLocale_(validationOptions: ValidationOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsLocale")(validationOptions.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  
  inline def IsLongitude_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsLongitude")().asInstanceOf[PropertyDecorator]
  inline def IsLongitude_(validationOptions: ValidationOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsLongitude")(validationOptions.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  
  inline def IsLowercase_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsLowercase")().asInstanceOf[PropertyDecorator]
  inline def IsLowercase_(validationOptions: ValidationOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsLowercase")(validationOptions.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  
  inline def IsMACAddress_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsMACAddress")().asInstanceOf[PropertyDecorator]
  inline def IsMACAddress_(optionsArg: Unit, validationOptionsArg: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("IsMACAddress")(optionsArg.asInstanceOf[js.Any], validationOptionsArg.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  inline def IsMACAddress_(optionsArg: IsMACAddressOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsMACAddress")(optionsArg.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  inline def IsMACAddress_(optionsArg: IsMACAddressOptions, validationOptionsArg: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("IsMACAddress")(optionsArg.asInstanceOf[js.Any], validationOptionsArg.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  inline def IsMACAddress_(validationOptionsArg: ValidationOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsMACAddress")(validationOptionsArg.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  
  inline def IsMagnetURI_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsMagnetURI")().asInstanceOf[PropertyDecorator]
  inline def IsMagnetURI_(validationOptions: ValidationOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsMagnetURI")(validationOptions.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  
  inline def IsMilitaryTime_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsMilitaryTime")().asInstanceOf[PropertyDecorator]
  inline def IsMilitaryTime_(validationOptions: ValidationOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsMilitaryTime")(validationOptions.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  
  inline def IsMimeType_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsMimeType")().asInstanceOf[PropertyDecorator]
  inline def IsMimeType_(validationOptions: ValidationOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsMimeType")(validationOptions.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  
  inline def IsMobilePhone_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsMobilePhone")().asInstanceOf[PropertyDecorator]
  inline def IsMobilePhone_(locale: Unit, options: Unit, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("IsMobilePhone")(locale.asInstanceOf[js.Any], options.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  inline def IsMobilePhone_(locale: Unit, options: IsMobilePhoneOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("IsMobilePhone")(locale.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  inline def IsMobilePhone_(locale: Unit, options: IsMobilePhoneOptions, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("IsMobilePhone")(locale.asInstanceOf[js.Any], options.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  inline def IsMobilePhone_(locale: MobilePhoneLocale): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsMobilePhone")(locale.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  inline def IsMobilePhone_(locale: MobilePhoneLocale, options: Unit, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("IsMobilePhone")(locale.asInstanceOf[js.Any], options.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  inline def IsMobilePhone_(locale: MobilePhoneLocale, options: IsMobilePhoneOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("IsMobilePhone")(locale.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  inline def IsMobilePhone_(locale: MobilePhoneLocale, options: IsMobilePhoneOptions, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("IsMobilePhone")(locale.asInstanceOf[js.Any], options.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  
  inline def IsMongoId_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsMongoId")().asInstanceOf[PropertyDecorator]
  inline def IsMongoId_(validationOptions: ValidationOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsMongoId")(validationOptions.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  
  inline def IsMultibyte_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsMultibyte")().asInstanceOf[PropertyDecorator]
  inline def IsMultibyte_(validationOptions: ValidationOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsMultibyte")(validationOptions.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  
  inline def IsNegative_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsNegative")().asInstanceOf[PropertyDecorator]
  inline def IsNegative_(validationOptions: ValidationOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsNegative")(validationOptions.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  
  inline def IsNotEmptyObject_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsNotEmptyObject")().asInstanceOf[PropertyDecorator]
  inline def IsNotEmptyObject_(options: Unit, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("IsNotEmptyObject")(options.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  inline def IsNotEmptyObject_(options: Nullable): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsNotEmptyObject")(options.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  inline def IsNotEmptyObject_(options: Nullable, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("IsNotEmptyObject")(options.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  
  inline def IsNotEmpty_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsNotEmpty")().asInstanceOf[PropertyDecorator]
  inline def IsNotEmpty_(validationOptions: ValidationOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsNotEmpty")(validationOptions.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  
  inline def IsNotIn_(values: js.Array[Any]): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsNotIn")(values.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  inline def IsNotIn_(values: js.Array[Any], validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("IsNotIn")(values.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  
  inline def IsNumberString_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsNumberString")().asInstanceOf[PropertyDecorator]
  inline def IsNumberString_(options: Unit, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("IsNumberString")(options.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  inline def IsNumberString_(options: IsNumericOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsNumberString")(options.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  inline def IsNumberString_(options: IsNumericOptions, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("IsNumberString")(options.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  
  inline def IsNumber_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsNumber")().asInstanceOf[PropertyDecorator]
  inline def IsNumber_(options: Unit, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("IsNumber")(options.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  inline def IsNumber_(options: IsNumberOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsNumber")(options.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  inline def IsNumber_(options: IsNumberOptions, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("IsNumber")(options.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  
  inline def IsObject_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsObject")().asInstanceOf[PropertyDecorator]
  inline def IsObject_(validationOptions: ValidationOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsObject")(validationOptions.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  
  inline def IsOctal_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsOctal")().asInstanceOf[PropertyDecorator]
  inline def IsOctal_(validationOptions: ValidationOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsOctal")(validationOptions.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  
  inline def IsOptional(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsOptional")().asInstanceOf[PropertyDecorator]
  inline def IsOptional(validationOptions: ValidationOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsOptional")(validationOptions.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  
  inline def IsPassportNumber_(countryCode: String): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsPassportNumber")(countryCode.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  inline def IsPassportNumber_(countryCode: String, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("IsPassportNumber")(countryCode.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  
  inline def IsPhoneNumber_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsPhoneNumber")().asInstanceOf[PropertyDecorator]
  inline def IsPhoneNumber_(region: Unit, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("IsPhoneNumber")(region.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  inline def IsPhoneNumber_(region: CountryCode): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsPhoneNumber")(region.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  inline def IsPhoneNumber_(region: CountryCode, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("IsPhoneNumber")(region.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  
  inline def IsPort_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsPort")().asInstanceOf[PropertyDecorator]
  inline def IsPort_(validationOptions: ValidationOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsPort")(validationOptions.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  
  inline def IsPositive_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsPositive")().asInstanceOf[PropertyDecorator]
  inline def IsPositive_(validationOptions: ValidationOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsPositive")(validationOptions.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  
  inline def IsPostalCode_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsPostalCode")().asInstanceOf[PropertyDecorator]
  inline def IsPostalCode_(locale: Unit, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("IsPostalCode")(locale.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  inline def IsPostalCode_(locale: PostalCodeLocale): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsPostalCode")(locale.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  inline def IsPostalCode_(locale: PostalCodeLocale, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("IsPostalCode")(locale.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  
  inline def IsPostalCode__any(locale: any): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsPostalCode")(locale.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  inline def IsPostalCode__any(locale: any, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("IsPostalCode")(locale.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  
  inline def IsRFC3339_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsRFC3339")().asInstanceOf[PropertyDecorator]
  inline def IsRFC3339_(validationOptions: ValidationOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsRFC3339")(validationOptions.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  
  inline def IsRgbColor_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsRgbColor")().asInstanceOf[PropertyDecorator]
  inline def IsRgbColor_(includePercentValues: Boolean): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsRgbColor")(includePercentValues.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  inline def IsRgbColor_(includePercentValues: Boolean, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("IsRgbColor")(includePercentValues.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  inline def IsRgbColor_(includePercentValues: Unit, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("IsRgbColor")(includePercentValues.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  
  inline def IsSemVer_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsSemVer")().asInstanceOf[PropertyDecorator]
  inline def IsSemVer_(validationOptions: ValidationOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsSemVer")(validationOptions.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  
  inline def IsString_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsString")().asInstanceOf[PropertyDecorator]
  inline def IsString_(validationOptions: ValidationOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsString")(validationOptions.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  
  inline def IsSurrogatePair_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsSurrogatePair")().asInstanceOf[PropertyDecorator]
  inline def IsSurrogatePair_(validationOptions: ValidationOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsSurrogatePair")(validationOptions.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  
  inline def IsUUID_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsUUID")().asInstanceOf[PropertyDecorator]
  inline def IsUUID_(version: Unit, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("IsUUID")(version.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  inline def IsUUID_(version: UUIDVersion): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsUUID")(version.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  inline def IsUUID_(version: UUIDVersion, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("IsUUID")(version.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  
  inline def IsUppercase_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsUppercase")().asInstanceOf[PropertyDecorator]
  inline def IsUppercase_(validationOptions: ValidationOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsUppercase")(validationOptions.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  
  inline def IsUrl_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsUrl")().asInstanceOf[PropertyDecorator]
  inline def IsUrl_(options: Unit, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("IsUrl")(options.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  inline def IsUrl_(options: IsURLOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsUrl")(options.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  inline def IsUrl_(options: IsURLOptions, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("IsUrl")(options.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  
  inline def IsVariableWidth_(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsVariableWidth")().asInstanceOf[PropertyDecorator]
  inline def IsVariableWidth_(validationOptions: ValidationOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("IsVariableWidth")(validationOptions.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  
  inline def Length_(min: Double): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Length")(min.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  inline def Length_(min: Double, max: Double): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("Length")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  inline def Length_(min: Double, max: Double, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("Length")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  inline def Length_(min: Double, max: Unit, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("Length")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  
  @JSImport("class-validator/types/decorator/decorators", "MATCHES")
  @js.native
  val MATCHES__ : /* "matches" */ String = js.native
  
  @JSImport("class-validator/types/decorator/decorators", "MAX_DATE")
  @js.native
  val MAX_DATE: /* "maxDate" */ String = js.native
  
  @JSImport("class-validator/types/decorator/decorators", "MAX_LENGTH")
  @js.native
  val MAX_LENGTH: /* "maxLength" */ String = js.native
  
  @JSImport("class-validator/types/decorator/decorators", "MAX")
  @js.native
  val MAX__ : /* "max" */ String = js.native
  
  @JSImport("class-validator/types/decorator/decorators", "MIN_DATE")
  @js.native
  val MIN_DATE: /* "minDate" */ String = js.native
  
  @JSImport("class-validator/types/decorator/decorators", "MIN_LENGTH")
  @js.native
  val MIN_LENGTH: /* "minLength" */ String = js.native
  
  @JSImport("class-validator/types/decorator/decorators", "MIN")
  @js.native
  val MIN__ : /* "min" */ String = js.native
  
  inline def Matches_(pattern: String): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Matches")(pattern.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  inline def Matches_(pattern: String, modifiers: String): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("Matches")(pattern.asInstanceOf[js.Any], modifiers.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  inline def Matches_(pattern: String, modifiers: String, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("Matches")(pattern.asInstanceOf[js.Any], modifiers.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  inline def Matches_(pattern: String, modifiers: Unit, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("Matches")(pattern.asInstanceOf[js.Any], modifiers.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  inline def Matches_(pattern: js.RegExp): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Matches")(pattern.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  inline def Matches_(pattern: js.RegExp, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("Matches")(pattern.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  
  inline def MaxDate_(date: js.Date): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("MaxDate")(date.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  inline def MaxDate_(date: js.Date, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("MaxDate")(date.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  
  inline def MaxLength_(max: Double): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("MaxLength")(max.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  inline def MaxLength_(max: Double, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("MaxLength")(max.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  
  inline def Max_(maxValue: Double): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Max")(maxValue.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  inline def Max_(maxValue: Double, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("Max")(maxValue.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  
  inline def MinDate_(date: js.Date): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("MinDate")(date.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  inline def MinDate_(date: js.Date, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("MinDate")(date.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  
  inline def MinLength_(min: Double): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("MinLength")(min.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  inline def MinLength_(min: Double, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("MinLength")(min.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  
  inline def Min_(minValue: Double): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Min")(minValue.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  inline def Min_(minValue: Double, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("Min")(minValue.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  
  @JSImport("class-validator/types/decorator/decorators", "NOT_CONTAINS")
  @js.native
  val NOT_CONTAINS: /* "notContains" */ String = js.native
  
  @JSImport("class-validator/types/decorator/decorators", "NOT_EQUALS")
  @js.native
  val NOT_EQUALS: /* "notEquals" */ String = js.native
  
  inline def NotContains_(seed: String): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("NotContains")(seed.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  inline def NotContains_(seed: String, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("NotContains")(seed.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  
  inline def NotEquals_(comparison: Any): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("NotEquals")(comparison.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  inline def NotEquals_(comparison: Any, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("NotEquals")(comparison.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  
  inline def Validate(constraintClass: js.Function): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Validate")(constraintClass.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  inline def Validate(constraintClass: js.Function, constraints: js.Array[Any]): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("Validate")(constraintClass.asInstanceOf[js.Any], constraints.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  inline def Validate(constraintClass: js.Function, constraints: js.Array[Any], validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("Validate")(constraintClass.asInstanceOf[js.Any], constraints.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  inline def Validate(constraintClass: js.Function, constraints: Unit, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("Validate")(constraintClass.asInstanceOf[js.Any], constraints.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  inline def Validate(constraintClass: js.Function, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("Validate")(constraintClass.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  
  inline def ValidateBy(options: ValidateByOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("ValidateBy")(options.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  inline def ValidateBy(options: ValidateByOptions, validationOptions: ValidationOptions): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("ValidateBy")(options.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  
  inline def ValidateIf(condition: js.Function2[/* object */ Any, /* value */ Any, Boolean]): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("ValidateIf")(condition.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  inline def ValidateIf(
    condition: js.Function2[/* object */ Any, /* value */ Any, Boolean],
    validationOptions: ValidationOptions
  ): PropertyDecorator = (^.asInstanceOf[js.Dynamic].applyDynamic("ValidateIf")(condition.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[PropertyDecorator]
  
  inline def ValidateNested(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("ValidateNested")().asInstanceOf[PropertyDecorator]
  inline def ValidateNested(validationOptions: ValidationOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("ValidateNested")(validationOptions.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  
  inline def ValidatePromise(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("ValidatePromise")().asInstanceOf[PropertyDecorator]
  inline def ValidatePromise(validationOptions: ValidationOptions): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("ValidatePromise")(validationOptions.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
  
  inline def ValidatorConstraint(): js.Function1[/* target */ js.Function, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("ValidatorConstraint")().asInstanceOf[js.Function1[/* target */ js.Function, Unit]]
  inline def ValidatorConstraint(options: Async): js.Function1[/* target */ js.Function, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("ValidatorConstraint")(options.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* target */ js.Function, Unit]]
  
  inline def arrayContains(array: Any, values: js.Array[Any]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayContains")(array.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def arrayMaxSize(array: Any, max: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayMaxSize")(array.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def arrayMinSize(array: Any, min: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayMinSize")(array.asInstanceOf[js.Any], min.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def arrayNotContains(array: Any, values: js.Array[Any]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayNotContains")(array.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def arrayNotEmpty(array: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayNotEmpty")(array.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def arrayUnique(array: js.Array[Any]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("arrayUnique")(array.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def arrayUnique(array: js.Array[Any], identifier: ArrayUniqueIdentifier[Any]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("arrayUnique")(array.asInstanceOf[js.Any], identifier.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def buildMessage(impl: js.Function2[/* eachPrefix */ String, /* args */ js.UndefOr[ValidationArguments], String]): js.Function1[/* validationArguments */ js.UndefOr[ValidationArguments], String] = ^.asInstanceOf[js.Dynamic].applyDynamic("buildMessage")(impl.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* validationArguments */ js.UndefOr[ValidationArguments], String]]
  inline def buildMessage(
    impl: js.Function2[/* eachPrefix */ String, /* args */ js.UndefOr[ValidationArguments], String],
    validationOptions: ValidationOptions
  ): js.Function1[/* validationArguments */ js.UndefOr[ValidationArguments], String] = (^.asInstanceOf[js.Dynamic].applyDynamic("buildMessage")(impl.asInstanceOf[js.Any], validationOptions.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* validationArguments */ js.UndefOr[ValidationArguments], String]]
  
  inline def contains(value: Any, seed: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("contains")(value.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def equals_(value: Any, comparison: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(value.asInstanceOf[js.Any], comparison.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isAlpha(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAlpha")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isAlpha(value: Any, locale: AlphaLocale): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isAlpha")(value.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isAlphanumeric(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAlphanumeric")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isAlphanumeric(value: Any, locale: AlphanumericLocale): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isAlphanumeric")(value.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isArray(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArray")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isAscii(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAscii")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isBIC(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBIC")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isBase32(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBase32")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isBase64(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBase64")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isBoolean(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBoolean")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isBooleanString(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBooleanString")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isBtcAddress(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBtcAddress")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isByteLength(value: Any, min: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isByteLength")(value.asInstanceOf[js.Any], min.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isByteLength(value: Any, min: Double, max: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isByteLength")(value.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isCreditCard(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCreditCard")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isCurrency(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCurrency")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isCurrency(value: Any, options: IsCurrencyOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isCurrency")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isDataURI(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDataURI")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isDate(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDate")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isDateString(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDateString")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isDateString(value: Any, options: IsISO8601Options): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isDateString")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isDecimal(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDecimal")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isDecimal(value: Any, options: IsDecimalOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isDecimal")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isDefined(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDefined")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isDivisibleBy(value: Any, num: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isDivisibleBy")(value.asInstanceOf[js.Any], num.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isEAN(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEAN")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isEmail(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmail")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isEmail(value: Any, options: IsEmailOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isEmail")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isEmpty(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmpty")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isEnum(value: Any, entity: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isEnum")(value.asInstanceOf[js.Any], entity.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isEthereumAddress(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEthereumAddress")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isFQDN(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFQDN")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isFQDN(value: Any, options: IsFQDNOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isFQDN")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isFirebasePushId(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFirebasePushId")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isFullWidth(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFullWidth")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isHSL(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isHSL")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isHalfWidth(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isHalfWidth")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isHash(value: Any, algorithm: HashAlgorithm): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isHash")(value.asInstanceOf[js.Any], algorithm.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isHexColor(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isHexColor")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isHexadecimal(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isHexadecimal")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isIBAN(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIBAN")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isIP(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIP")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isIP(value: Any, version: IsIpVersion): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isIP")(value.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isISBN(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isISBN")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isISBN(value: Any, version: IsISBNVersion): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isISBN")(value.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isISIN(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isISIN")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isISO31661Alpha2(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isISO31661Alpha2")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isISO31661Alpha3(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isISO31661Alpha3")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isISO8601(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isISO8601")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isISO8601(value: Any, options: IsISO8601Options): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isISO8601")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isISRC(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isISRC")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isISSN(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isISSN")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isISSN(value: Any, options: IsISSNOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isISSN")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isIdentityCard(value: Any, locale: IdentityCardLocale): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isIdentityCard")(value.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isIn(value: Any, possibleValues: js.Array[Any]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isIn")(value.asInstanceOf[js.Any], possibleValues.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isInstance(`object`: Any, targetTypeConstructor: Instantiable1[/* args (repeated) */ Any, Any]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(`object`.asInstanceOf[js.Any], targetTypeConstructor.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isInt(`val`: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInt")(`val`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isJSON(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJSON")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isJWT(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJWT")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isLatLong(value: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLatLong")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isLatitude(value: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLatitude")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isLocale(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLocale")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isLongitude(value: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLongitude")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isLowercase(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLowercase")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isMACAddress(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMACAddress")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isMACAddress(value: Any, options: IsMACAddressOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isMACAddress")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isMagnetURI(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMagnetURI")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isMilitaryTime(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMilitaryTime")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isMimeType(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMimeType")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isMobilePhone(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMobilePhone")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isMobilePhone(value: Any, locale: Unit, options: IsMobilePhoneOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isMobilePhone")(value.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isMobilePhone(value: Any, locale: MobilePhoneLocale): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isMobilePhone")(value.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isMobilePhone(value: Any, locale: MobilePhoneLocale, options: IsMobilePhoneOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isMobilePhone")(value.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isMongoId(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMongoId")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isMultibyte(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMultibyte")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isNegative(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNegative")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isNotEmpty(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNotEmpty")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isNotEmptyObject(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNotEmptyObject")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isNotEmptyObject(value: Any, options: Nullable): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isNotEmptyObject")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isNotIn(value: Any, possibleValues: js.Array[Any]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isNotIn")(value.asInstanceOf[js.Any], possibleValues.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isNumber(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumber")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isNumber(value: Any, options: IsNumberOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isNumber")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isNumberString(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumberString")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isNumberString(value: Any, options: IsNumericOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isNumberString")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isObject(value: Any): /* is object */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObject")(value.asInstanceOf[js.Any]).asInstanceOf[/* is object */ Boolean]
  
  inline def isOctal(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isOctal")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isPassportNumber(value: Any, countryCode: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPassportNumber")(value.asInstanceOf[js.Any], countryCode.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isPhoneNumber(value: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPhoneNumber")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isPhoneNumber(value: String, region: CountryCode): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPhoneNumber")(value.asInstanceOf[js.Any], region.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isPort(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPort")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isPositive(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPositive")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isPostalCode(value: Any, locale: PostalCodeLocale): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPostalCode")(value.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isPostalCode_any(value: Any, locale: any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isPostalCode")(value.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isRFC3339(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRFC3339")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isRgbColor(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRgbColor")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isRgbColor(value: Any, includePercentValues: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isRgbColor")(value.asInstanceOf[js.Any], includePercentValues.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isSemVer(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSemVer")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isString(value: Any): /* is string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isString")(value.asInstanceOf[js.Any]).asInstanceOf[/* is string */ Boolean]
  
  inline def isSurrogatePair(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSurrogatePair")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isURL(value: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isURL")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isURL(value: String, options: IsURLOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isURL")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isUUID(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUUID")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isUUID(value: Any, version: UUIDVersion): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isUUID")(value.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isUppercase(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUppercase")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isVariableWidth(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isVariableWidth")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def length(value: Any, min: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("length")(value.asInstanceOf[js.Any], min.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def length(value: Any, min: Double, max: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("length")(value.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def matches(value: String, pattern: String, modifiers: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("matches")(value.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], modifiers.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def matches(value: String, pattern: js.RegExp): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("matches")(value.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def max(num: Any, max: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("max")(num.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def maxDate(date: Any, maxDate: js.Date): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("maxDate")(date.asInstanceOf[js.Any], maxDate.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def maxLength(value: Any, max: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("maxLength")(value.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def min(num: Any, min: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("min")(num.asInstanceOf[js.Any], min.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def minDate(date: Any, minDate: js.Date): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("minDate")(date.asInstanceOf[js.Any], minDate.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def minLength(value: Any, min: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("minLength")(value.asInstanceOf[js.Any], min.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def notContains(value: Any, seed: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("notContains")(value.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def notEquals(value: Any, comparison: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("notEquals")(value.asInstanceOf[js.Any], comparison.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
