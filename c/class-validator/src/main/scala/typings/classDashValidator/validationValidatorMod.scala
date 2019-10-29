package typings.classDashValidator

import org.scalablytyped.runtime.Instantiable1
import typings.classDashValidator.classDashValidatorStrings.`10`
import typings.classDashValidator.classDashValidatorStrings.`13`
import typings.classDashValidator.classDashValidatorStrings.`3`
import typings.classDashValidator.classDashValidatorStrings.`4`
import typings.classDashValidator.classDashValidatorStrings.`5`
import typings.classDashValidator.classDashValidatorStrings.`6`
import typings.classDashValidator.metadataValidationMetadataMod.ValidationMetadata
import typings.classDashValidator.validationValidationErrorMod.ValidationError
import typings.classDashValidator.validationValidationTypeOptionsMod.IsCurrencyOptions
import typings.classDashValidator.validationValidationTypeOptionsMod.IsEmailOptions
import typings.classDashValidator.validationValidationTypeOptionsMod.IsFQDNOptions
import typings.classDashValidator.validationValidationTypeOptionsMod.IsNumberOptions
import typings.classDashValidator.validationValidationTypeOptionsMod.IsURLOptions
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
    def arrayContains(array: js.Array[_], values: js.Array[_]): Boolean = js.native
    /**
      * Checks if array's length is as maximal this number.
      * If null or undefined is given then this function returns false.
      */
    def arrayMaxSize(array: js.Array[_], max: Double): Boolean = js.native
    /**
      * Checks if array's length is as minimal this number.
      * If null or undefined is given then this function returns false.
      */
    def arrayMinSize(array: js.Array[_], min: Double): Boolean = js.native
    /**
      * Checks if array does not contain any of the given values.
      * If null or undefined is given then this function returns false.
      */
    def arrayNotContains(array: js.Array[_], values: js.Array[_]): Boolean = js.native
    /**
      * Checks if given array is not empty.
      * If null or undefined is given then this function returns false.
      */
    def arrayNotEmpty(array: js.Array[_]): Boolean = js.native
    /**
      * Checks if all array's values are unique. Comparison for objects is reference-based.
      * If null or undefined is given then this function returns false.
      */
    def arrayUnique(array: js.Array[_]): Boolean = js.native
    /**
      * Checks if the string contains the seed.
      * If given value is not a string, then it returns false.
      */
    def contains(value: String, seed: String): Boolean = js.native
    /**
      * Checks if value matches ("===") the comparison.
      */
    def equals(value: js.Any, comparison: js.Any): Boolean = js.native
    /**
      * Checks if the string contains only letters (a-zA-Z).
      * If given value is not a string, then it returns false.
      */
    def isAlpha(value: String): Boolean = js.native
    /**
      * Checks if the string contains only letters and numbers.
      * If given value is not a string, then it returns false.
      */
    def isAlphanumeric(value: String): Boolean = js.native
    /**
      * Checks if a given value is an array
      */
    def isArray(value: js.Any): Boolean = js.native
    /**
      * Checks if the string contains ASCII chars only.
      * If given value is not a string, then it returns false.
      */
    def isAscii(value: String): Boolean = js.native
    /**
      * Checks if a string is base64 encoded.
      * If given value is not a string, then it returns false.
      */
    def isBase64(value: String): Boolean = js.native
    /**
      * Checks if a given value is a real boolean.
      */
    def isBoolean(value: js.Any): Boolean = js.native
    /**
      * Checks if a string is a boolean.
      * If given value is not a string, then it returns false.
      */
    def isBooleanString(value: String): Boolean = js.native
    /**
      * Checks if the string's length (in bytes) falls in a range.
      * If given value is not a string, then it returns false.
      */
    def isByteLength(value: String, min: Double): Boolean = js.native
    def isByteLength(value: String, min: Double, max: Double): Boolean = js.native
    /**
      * Checks if the string is a credit card.
      * If given value is not a string, then it returns false.
      */
    def isCreditCard(value: String): Boolean = js.native
    /**
      * Checks if the string is a valid currency amount.
      * If given value is not a string, then it returns false.
      */
    def isCurrency(value: String): Boolean = js.native
    def isCurrency(value: String, options: IsCurrencyOptions): Boolean = js.native
    /**
      * Checks if a given value is a real date.
      */
    def isDate(value: js.Any): Boolean = js.native
    /**
      * Checks if a given value is a ISOString date.
      */
    def isDateString(value: js.Any): Boolean = js.native
    /**
      * Checks if value is defined (!== undefined, !== null).
      */
    def isDefined(value: js.Any): Boolean = js.native
    /**
      * Checks if value is a number that's divisible by another.
      */
    def isDivisibleBy(value: Double, num: Double): Boolean = js.native
    /**
      * Checks if the string is an email.
      * If given value is not a string, then it returns false.
      */
    def isEmail(value: String): Boolean = js.native
    def isEmail(value: String, options: IsEmailOptions): Boolean = js.native
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
    def isFQDN(value: String): Boolean = js.native
    def isFQDN(value: String, options: IsFQDNOptions): Boolean = js.native
    /**
      * Checks if the string contains any full-width chars.
      * If given value is not a string, then it returns false.
      */
    def isFullWidth(value: String): Boolean = js.native
    /**
      * Checks if the string contains any half-width chars.
      * If given value is not a string, then it returns false.
      */
    def isHalfWidth(value: String): Boolean = js.native
    /**
      * Checks if the string is a hexadecimal color.
      * If given value is not a string, then it returns false.
      */
    def isHexColor(value: String): Boolean = js.native
    /**
      * Checks if the string is a hexadecimal number.
      * If given value is not a string, then it returns false.
      */
    def isHexadecimal(value: String): Boolean = js.native
    /**
      * Checks if the string is an IP (version 4 or 6).
      * If given value is not a string, then it returns false.
      */
    def isIP(value: String): Boolean = js.native
    @JSName("isIP")
    def isIP_4(value: String, version: `4`): Boolean = js.native
    @JSName("isIP")
    def isIP_6(value: String, version: `6`): Boolean = js.native
    /**
      * Checks if the string is an ISBN (version 10 or 13).
      * If given value is not a string, then it returns false.
      */
    def isISBN(value: String): Boolean = js.native
    @JSName("isISBN")
    def isISBN_10(value: String, version: `10`): Boolean = js.native
    @JSName("isISBN")
    def isISBN_13(value: String, version: `13`): Boolean = js.native
    /**
      * Checks if the string is an ISIN (stock/security identifier).
      * If given value is not a string, then it returns false.
      */
    def isISIN(value: String): Boolean = js.native
    /**
      * Checks if the string is a valid ISO 8601 date.
      * If given value is not a string, then it returns false.
      */
    def isISO8601(value: String): Boolean = js.native
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
    def isInt(`val`: Double): Boolean = js.native
    /**
      * Checks if the string is valid JSON (note: uses JSON.parse).
      * If given value is not a string, then it returns false.
      */
    def isJSON(value: String): Boolean = js.native
    /**
      * Checks if the string is lowercase.
      * If given value is not a string, then it returns false.
      */
    def isLowercase(value: String): Boolean = js.native
    /**
      * Checks if the string represents a time without a given timezone in the format HH:MM (military)
      * If the given value does not match the pattern HH:MM, then it returns false.
      */
    def isMilitaryTime(value: String): Boolean = js.native
    /**
      * Checks if the string is a mobile phone number (locale is one of ['zh-CN', 'zh-TW', 'en-ZA', 'en-AU', 'en-HK',
      * 'pt-PT', 'fr-FR', 'el-GR', 'en-GB', 'en-US', 'en-ZM', 'ru-RU', 'nb-NO', 'nn-NO', 'vi-VN', 'en-NZ']).
      * If given value is not a string, then it returns false.
      */
    def isMobilePhone(value: String, locale: String): Boolean = js.native
    /**
      * Checks if the string is a valid hex-encoded representation of a MongoDB ObjectId.
      * If given value is not a string, then it returns false.
      */
    def isMongoId(value: String): Boolean = js.native
    /**
      * Checks if the string contains one or more multibyte chars.
      * If given value is not a string, then it returns false.
      */
    def isMultibyte(value: String): Boolean = js.native
    /**
      * Checks if the value is a negative number.
      */
    def isNegative(value: Double): Boolean = js.native
    /**
      * Checks if given value is not empty (!== '', !== null, !== undefined).
      */
    def isNotEmpty(value: js.Any): Boolean = js.native
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
    def isNumberString(value: String): Boolean = js.native
    /**
      * Checks if the string is a valid phone number.
      * @param value the potential phone number string to test
      * @param {string} region 2 characters uppercase country code (e.g. DE, US, CH).
      * If users must enter the intl. prefix (e.g. +41), then you may pass "ZZ" or null as region.
      * See [google-libphonenumber, metadata.js:countryCodeToRegionCodeMap on github]{@link https://github.com/ruimarinho/google-libphonenumber/blob/1e46138878cff479aafe2ce62175c6c49cb58720/src/metadata.js#L33}
      */
    def isPhoneNumber(value: String, region: String): Boolean = js.native
    /**
      * Checks if the value is a positive number.
      */
    def isPositive(value: Double): Boolean = js.native
    /**
      * Checks if a given value is a real string.
      */
    def isString(value: js.Any): Boolean = js.native
    /**
      * Checks if the string contains any surrogate pairs chars.
      * If given value is not a string, then it returns false.
      */
    def isSurrogatePair(value: String): Boolean = js.native
    /**
      * Checks if the string is an url.
      * If given value is not a string, then it returns false.
      */
    def isURL(value: String): Boolean = js.native
    def isURL(value: String, options: IsURLOptions): Boolean = js.native
    /**
      * Checks if the string is a UUID (version 3, 4 or 5).
      * If given value is not a string, then it returns false.
      */
    def isUUID(value: String): Boolean = js.native
    @JSName("isUUID")
    def isUUID_3(value: String, version: `3`): Boolean = js.native
    @JSName("isUUID")
    def isUUID_4(value: String, version: `4`): Boolean = js.native
    @JSName("isUUID")
    def isUUID_5(value: String, version: `5`): Boolean = js.native
    /**
      * Checks if the string is uppercase.
      * If given value is not a string, then it returns false.
      */
    def isUppercase(value: String): Boolean = js.native
    /**
      * Checks if the string contains variable-width chars.
      * If given value is not a string, then it returns false.
      */
    def isVariableWidth(value: String): Boolean = js.native
    /**
      * Checks if the string's length falls in a range. Note: this function takes into account surrogate pairs.
      * If given value is not a string, then it returns false.
      */
    def length(value: String, min: Double): Boolean = js.native
    def length(value: String, min: Double, max: Double): Boolean = js.native
    /**
      * Checks if string matches the pattern. Either matches('foo', /foo/i) or matches('foo', 'foo', 'i').
      * If given value is not a string, then it returns false.
      */
    def matches(value: String, pattern: RegExp): Boolean = js.native
    def matches(value: String, pattern: RegExp, modifiers: String): Boolean = js.native
    /**
      * Checks if the first number is less than or equal to the second.
      */
    def max(num: Double, max: Double): Boolean = js.native
    /**
      * Checks if the value is a date that's before the specified date.
      */
    def maxDate(date: Date, maxDate: Date): Boolean = js.native
    /**
      * Checks if the string's length is not more than given number. Note: this function takes into account surrogate pairs.
      * If given value is not a string, then it returns false.
      */
    def maxLength(value: String, max: Double): Boolean = js.native
    /**
      * Checks if the first number is greater than or equal to the second.
      */
    def min(num: Double, min: Double): Boolean = js.native
    /**
      * Checks if the value is a date that's after the specified date.
      */
    def minDate(date: Date, minDate: Date): Boolean = js.native
    /**
      * Checks if the string's length is not less than given number. Note: this function takes into account surrogate pairs.
      * If given value is not a string, then it returns false.
      */
    def minLength(value: String, min: Double): Boolean = js.native
    /**
      * Checks if the string does not contain the seed.
      * If given value is not a string, then it returns false.
      */
    def notContains(value: String, seed: String): Boolean = js.native
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

