package typings.classDashValidator

import org.scalablytyped.runtime.Instantiable1
import typings.classDashValidator.classDashValidatorStrings.`3`
import typings.classDashValidator.classDashValidatorStrings.`4`
import typings.classDashValidator.classDashValidatorStrings.`5`
import typings.classDashValidator.metadataValidationMetadataMod.ValidationMetadata
import typings.classDashValidator.validationValidationErrorMod.ValidationError
import typings.classDashValidator.validationValidationTypeOptionsMod.IsNumberOptions
import typings.classDashValidator.validationValidatorOptionsMod.ValidatorOptions
import typings.std.Date
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("class-validator/validation/Validator", JSImport.Namespace)
@js.native
object validationValidatorMod extends js.Object {
  @js.native
  class Validator () extends js.Object {
    var _isEmptyObject: js.Any = js.native
    /**
      * Performs validation of the given object based on decorators or validation schema.
      * Common method for `validateOrReject` and `validate` methods.
      */
    var coreValidate: js.Any = js.native
    var libPhoneNumber: js.Any = js.native
    var validatorJs: js.Any = js.native
    /**
      * Checks if array contains all values from the given array of values.
      * If null or undefined is given then this function returns false.
      */
    def arrayContains(array: js.Any, values: js.Array[_]): Boolean = js.native
    /**
      * Checks if array's length is as maximal this number.
      * If null or undefined is given then this function returns false.
      */
    def arrayMaxSize(array: js.Any, max: Double): Boolean = js.native
    /**
      * Checks if array's length is as minimal this number.
      * If null or undefined is given then this function returns false.
      */
    def arrayMinSize(array: js.Any, min: Double): Boolean = js.native
    /**
      * Checks if array does not contain any of the given values.
      * If null or undefined is given then this function returns false.
      */
    def arrayNotContains(array: js.Any, values: js.Array[_]): Boolean = js.native
    /**
      * Checks if given array is not empty.
      * If null or undefined is given then this function returns false.
      */
    def arrayNotEmpty(array: js.Any): Boolean = js.native
    /**
      * Checks if all array's values are unique. Comparison for objects is reference-based.
      * If null or undefined is given then this function returns false.
      */
    def arrayUnique(array: js.Any): Boolean = js.native
    /**
      * Checks if the string contains the seed.
      * If given value is not a string, then it returns false.
      */
    def contains(value: js.Any, seed: String): Boolean = js.native
    /**
      * Checks if value matches ("===") the comparison.
      */
    def equals(value: js.Any, comparison: js.Any): Boolean = js.native
    /**
      * Checks if the string contains only letters (a-zA-Z).
      * If given value is not a string, then it returns false.
      */
    def isAlpha(value: js.Any): Boolean = js.native
    def isAlpha(
      value: js.Any,
      locale: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ValidatorJS.AlphaLocale */ js.Any
    ): Boolean = js.native
    /**
      * Checks if the string contains only letters and numbers.
      * If given value is not a string, then it returns false.
      */
    def isAlphanumeric(value: js.Any): Boolean = js.native
    def isAlphanumeric(
      value: js.Any,
      locale: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ValidatorJS.AlphanumericLocale */ js.Any
    ): Boolean = js.native
    /**
      * Checks if a given value is an array
      */
    def isArray(value: js.Any): Boolean = js.native
    /**
      * Checks if the string contains ASCII chars only.
      * If given value is not a string, then it returns false.
      */
    def isAscii(value: js.Any): Boolean = js.native
    /**
      * Checks if a string is base64 encoded.
      * If given value is not a string, then it returns false.
      */
    def isBase64(value: js.Any): Boolean = js.native
    /**
      * Checks if a given value is a real boolean.
      */
    def isBoolean(value: js.Any): Boolean = js.native
    /**
      * Checks if a string is a boolean.
      * If given value is not a string, then it returns false.
      */
    def isBooleanString(value: js.Any): Boolean = js.native
    /**
      * Checks if the string's length (in bytes) falls in a range.
      * If given value is not a string, then it returns false.
      */
    def isByteLength(value: js.Any, min: Double): Boolean = js.native
    def isByteLength(value: js.Any, min: Double, max: Double): Boolean = js.native
    /**
      * Checks if the string is a credit card.
      * If given value is not a string, then it returns false.
      */
    def isCreditCard(value: js.Any): Boolean = js.native
    /**
      * Checks if the string is a valid currency amount.
      * If given value is not a string, then it returns false.
      */
    def isCurrency(value: js.Any): Boolean = js.native
    def isCurrency(
      value: js.Any,
      options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ValidatorJS.IsCurrencyOptions */ js.Any
    ): Boolean = js.native
    /**
      * Checks if a given value is a real date.
      */
    def isDate(value: js.Any): Boolean = js.native
    /**
      * Checks if a given value is a ISOString date.
      */
    def isDateString(value: js.Any): Boolean = js.native
    /**
      * Checks if the string is a valid decimal.
      * If given value is not a string, then it returns false.
      */
    def isDecimal(value: js.Any): Boolean = js.native
    def isDecimal(
      value: js.Any,
      options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ValidatorJS.IsDecimalOptions */ js.Any
    ): Boolean = js.native
    /**
      * Checks if value is defined (!== undefined, !== null).
      */
    def isDefined(value: js.Any): Boolean = js.native
    /**
      * Checks if value is a number that's divisible by another.
      */
    def isDivisibleBy(value: js.Any, num: Double): Boolean = js.native
    /**
      * Checks if the string is an email.
      * If given value is not a string, then it returns false.
      */
    def isEmail(value: js.Any): Boolean = js.native
    def isEmail(
      value: js.Any,
      options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ValidatorJS.IsEmailOptions */ js.Any
    ): Boolean = js.native
    /**
      * Checks if given value is empty (=== '', === null, === undefined).
      */
    def isEmpty(value: js.Any): Boolean = js.native
    /**
      * Checks if a given value is an enum
      */
    def isEnum(value: js.Any, entity: js.Any): Boolean = js.native
    /**
      * Checks if the string is a fully qualified domain name (e.g. domain.com).
      * If given value is not a string, then it returns false.
      */
    def isFQDN(value: js.Any): Boolean = js.native
    def isFQDN(
      value: js.Any,
      options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ValidatorJS.IsFQDNOptions */ js.Any
    ): Boolean = js.native
    /**
      * Checks if the string contains any full-width chars.
      * If given value is not a string, then it returns false.
      */
    def isFullWidth(value: js.Any): Boolean = js.native
    /**
      * Checks if the string contains any half-width chars.
      * If given value is not a string, then it returns false.
      */
    def isHalfWidth(value: js.Any): Boolean = js.native
    /**
      * check if the string is a hash of type algorithm.
      * Algorithm is one of ['md4', 'md5', 'sha1', 'sha256', 'sha384', 'sha512', 'ripemd128', 'ripemd160', 'tiger128',
      * 'tiger160', 'tiger192', 'crc32', 'crc32b']
      */
    def isHash(
      value: js.Any,
      algorithm: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ValidatorJS.HashAlgorithm */ js.Any
    ): Boolean = js.native
    /**
      * Checks if the string is a hexadecimal color.
      * If given value is not a string, then it returns false.
      */
    def isHexColor(value: js.Any): Boolean = js.native
    /**
      * Checks if the string is a hexadecimal number.
      * If given value is not a string, then it returns false.
      */
    def isHexadecimal(value: js.Any): Boolean = js.native
    /**
      * Checks if the string is an IP (version 4 or 6).
      * If given value is not a string, then it returns false.
      */
    def isIP(value: js.Any): Boolean = js.native
    def isIP(value: js.Any, version: Double): Boolean = js.native
    /**
      * Checks if the string is an ISBN (version 10 or 13).
      * If given value is not a string, then it returns false.
      */
    def isISBN(value: js.Any): Boolean = js.native
    def isISBN(value: js.Any, version: Double): Boolean = js.native
    /**
      * Checks if the string is an ISIN (stock/security identifier).
      * If given value is not a string, then it returns false.
      */
    def isISIN(value: js.Any): Boolean = js.native
    /**
      * Check if the string is a valid [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) officially assigned country code.
      */
    def isISO31661Alpha2(value: js.Any): Boolean = js.native
    /**
      * Check if the string is a valid [ISO 3166-1 alpha-3](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-3) officially assigned country code.
      */
    def isISO31661Alpha3(value: js.Any): Boolean = js.native
    /**
      * Checks if the string is a valid ISO 8601 date.
      * If given value is not a string, then it returns false.
      */
    def isISO8601(value: js.Any): Boolean = js.native
    /**
      * Checks if the string is a ISSN.
      * If given value is not a string, then it returns false.
      */
    def isISSN(value: js.Any): Boolean = js.native
    def isISSN(
      value: js.Any,
      options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ValidatorJS.IsISSNOptions */ js.Any
    ): Boolean = js.native
    /**
      * Checks if given value is in a array of allowed values.
      */
    def isIn(value: js.Any, possibleValues: js.Array[_]): Boolean = js.native
    /**
      * Checks if the value is an instance of the specified object.
      */
    def isInstance(`object`: js.Any, targetTypeConstructor: Instantiable1[/* args (repeated) */ js.Any, js.Any]): Boolean = js.native
    /**
      * Checks if value is an integer.
      */
    def isInt(`val`: js.Any): Boolean = js.native
    /**
      * Checks if the string is valid JSON (note: uses JSON.parse).
      * If given value is not a string, then it returns false.
      */
    def isJSON(value: js.Any): Boolean = js.native
    /**
      * Checks if the string is valid JWT token.
      * If given value is not a string, then it returns false.
      */
    def isJWT(value: js.Any): Boolean = js.native
    /**
      * Checks if a given value is a latitude.
      */
    def isLatLong(value: js.Any): Boolean = js.native
    /**
      * Checks if a given value is a latitude.
      */
    def isLatitude(value: js.Any): Boolean = js.native
    /**
      * Checks if a given value is a longitude.
      */
    def isLongitude(value: js.Any): Boolean = js.native
    /**
      * Checks if the string is lowercase.
      * If given value is not a string, then it returns false.
      */
    def isLowercase(value: js.Any): Boolean = js.native
    /**
      * Check if the string is a MAC address.
      * If given value is not a string, then it returns false.
      */
    def isMACAddress(value: js.Any): Boolean = js.native
    /**
      * Checks if the string represents a time without a given timezone in the format HH:MM (military)
      * If the given value does not match the pattern HH:MM, then it returns false.
      */
    def isMilitaryTime(value: js.Any): Boolean = js.native
    /**
      * Checks if the string is a mobile phone number (locale is one of ['zh-CN', 'zh-TW', 'en-ZA', 'en-AU', 'en-HK',
      * 'pt-PT', 'fr-FR', 'el-GR', 'en-GB', 'en-US', 'en-ZM', 'ru-RU', 'nb-NO', 'nn-NO', 'vi-VN', 'en-NZ']).
      * If given value is not a string, then it returns false.
      */
    def isMobilePhone(
      value: js.Any,
      locale: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ValidatorJS.MobilePhoneLocale */ js.Any
    ): Boolean = js.native
    /**
      * Checks if the string is a valid hex-encoded representation of a MongoDB ObjectId.
      * If given value is not a string, then it returns false.
      */
    def isMongoId(value: js.Any): Boolean = js.native
    /**
      * Checks if the string contains one or more multibyte chars.
      * If given value is not a string, then it returns false.
      */
    def isMultibyte(value: js.Any): Boolean = js.native
    /**
      * Checks if the value is a negative number.
      */
    def isNegative(value: js.Any): Boolean = js.native
    /**
      * Checks if given value is not empty (!== '', !== null, !== undefined).
      */
    def isNotEmpty(value: js.Any): Boolean = js.native
    /**
      * Checks if the value is valid Object & not empty.
      * Returns false if the value is not an object or an empty valid object.
      */
    def isNotEmptyObject(value: js.Any): Boolean = js.native
    /**
      * Checks if given value not in a array of allowed values.
      */
    def isNotIn(value: js.Any, possibleValues: js.Array[_]): Boolean = js.native
    /**
      * Checks if a given value is a number.
      */
    def isNumber(value: js.Any): Boolean = js.native
    def isNumber(value: js.Any, options: IsNumberOptions): Boolean = js.native
    /**
      * Checks if the string is numeric.
      * If given value is not a string, then it returns false.
      */
    def isNumberString(value: js.Any): Boolean = js.native
    def isNumberString(
      value: js.Any,
      options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ValidatorJS.IsNumericOptions */ js.Any
    ): Boolean = js.native
    /**
      * Checks if the value is valid Object.
      * Returns false if the value is not an object.
      */
    def isObject(value: js.Any): /* is object */ Boolean = js.native
    /**
      * Checks if the string is a valid phone number.
      * @param value the potential phone number string to test
      * @param {string} region 2 characters uppercase country code (e.g. DE, US, CH).
      * If users must enter the intl. prefix (e.g. +41), then you may pass "ZZ" or null as region.
      * See [google-libphonenumber, metadata.js:countryCodeToRegionCodeMap on github]{@link https://github.com/ruimarinho/google-libphonenumber/blob/1e46138878cff479aafe2ce62175c6c49cb58720/src/metadata.js#L33}
      */
    def isPhoneNumber(value: js.Any, region: String): Boolean = js.native
    /**
      * Check if the string is a valid port number.
      */
    def isPort(value: js.Any): Boolean = js.native
    /**
      * Checks if the value is a positive number.
      */
    def isPositive(value: js.Any): Boolean = js.native
    /**
      * Checks if a given value is a real string.
      */
    def isString(value: js.Any): /* is string */ Boolean = js.native
    /**
      * Checks if the string contains any surrogate pairs chars.
      * If given value is not a string, then it returns false.
      */
    def isSurrogatePair(value: js.Any): Boolean = js.native
    /**
      * Checks if the string is an url.
      * If given value is not a string, then it returns false.
      */
    def isURL(value: js.Any): Boolean = js.native
    def isURL(
      value: js.Any,
      options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ValidatorJS.IsURLOptions */ js.Any
    ): Boolean = js.native
    /**
      * Checks if the string is a UUID (version 3, 4 or 5).
      * If given value is not a string, then it returns false.
      */
    def isUUID(value: js.Any): Boolean = js.native
    @JSName("isUUID")
    def isUUID_3(value: js.Any, version: `3`): Boolean = js.native
    @JSName("isUUID")
    def isUUID_4(value: js.Any, version: `4`): Boolean = js.native
    @JSName("isUUID")
    def isUUID_5(value: js.Any, version: `5`): Boolean = js.native
    /**
      * Checks if the string is uppercase.
      * If given value is not a string, then it returns false.
      */
    def isUppercase(value: js.Any): Boolean = js.native
    /**
      * Checks if the string contains variable-width chars.
      * If given value is not a string, then it returns false.
      */
    def isVariableWidth(value: js.Any): Boolean = js.native
    /**
      * Checks if the string's length falls in a range. Note: this function takes into account surrogate pairs.
      * If given value is not a string, then it returns false.
      */
    def length(value: js.Any, min: Double): Boolean = js.native
    def length(value: js.Any, min: Double, max: Double): Boolean = js.native
    /**
      * Checks if string matches the pattern. Either matches('foo', /foo/i) or matches('foo', 'foo', 'i').
      * If given value is not a string, then it returns false.
      */
    def matches(value: js.Any, pattern: RegExp): Boolean = js.native
    def matches(value: js.Any, pattern: RegExp, modifiers: String): Boolean = js.native
    /**
      * Checks if the first number is less than or equal to the second.
      */
    def max(num: js.Any, max: Double): Boolean = js.native
    /**
      * Checks if the value is a date that's before the specified date.
      */
    def maxDate(date: js.Any, maxDate: Date): Boolean = js.native
    /**
      * Checks if the string's length is not more than given number. Note: this function takes into account surrogate pairs.
      * If given value is not a string, then it returns false.
      */
    def maxLength(value: js.Any, max: Double): Boolean = js.native
    /**
      * Checks if the first number is greater than or equal to the second.
      */
    def min(num: js.Any, min: Double): Boolean = js.native
    /**
      * Checks if the value is a date that's after the specified date.
      */
    def minDate(date: js.Any, minDate: Date): Boolean = js.native
    /**
      * Checks if the string's length is not less than given number. Note: this function takes into account surrogate pairs.
      * If given value is not a string, then it returns false.
      */
    def minLength(value: js.Any, min: Double): Boolean = js.native
    /**
      * Checks if the string does not contain the seed.
      * If given value is not a string, then it returns false.
      */
    def notContains(value: js.Any, seed: String): Boolean = js.native
    /**
      * Checks if value does not match ("!==") the comparison.
      */
    def notEquals(value: js.Any, comparison: js.Any): Boolean = js.native
    /**
      * Performs validation of the given object based on decorators used in given object class.
      */
    def validate(`object`: js.Object): js.Promise[js.Array[ValidationError]] = js.native
    def validate(`object`: js.Object, options: ValidatorOptions): js.Promise[js.Array[ValidationError]] = js.native
    /**
      * Performs validation of the given object based on validation schema.
      */
    def validate(schemaName: String, `object`: js.Object): js.Promise[js.Array[ValidationError]] = js.native
    def validate(schemaName: String, `object`: js.Object, options: ValidatorOptions): js.Promise[js.Array[ValidationError]] = js.native
    /**
      * Performs validation of the given object based on decorators used in given object class and reject on error.
      */
    def validateOrReject(`object`: js.Object): js.Promise[Unit] = js.native
    def validateOrReject(`object`: js.Object, options: ValidatorOptions): js.Promise[Unit] = js.native
    /**
      * Performs validation of the given object based on validation schema and reject on error.
      */
    def validateOrReject(schemaName: String, `object`: js.Object): js.Promise[Unit] = js.native
    def validateOrReject(schemaName: String, `object`: js.Object, options: ValidatorOptions): js.Promise[Unit] = js.native
    /**
      * Performs validation of the given object based on decorators used in given object class.
      * NOTE: This method completely ignores all async validations.
      */
    def validateSync(`object`: js.Object): js.Array[ValidationError] = js.native
    def validateSync(`object`: js.Object, options: ValidatorOptions): js.Array[ValidationError] = js.native
    /**
      * Performs validation of the given object based on validation schema.
      */
    def validateSync(schemaName: String, `object`: js.Object): js.Array[ValidationError] = js.native
    def validateSync(schemaName: String, `object`: js.Object, options: ValidatorOptions): js.Array[ValidationError] = js.native
    /**
      * Performs validation of the given object based on the given ValidationMetadata object.
      */
    def validateValueByMetadata(value: js.Any, metadata: ValidationMetadata): Boolean = js.native
  }
  
}

