package typings.classDashValidator

import typings.classDashValidator.validationValidationArgumentsMod.ValidationArguments
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("class-validator/validation/ValidationTypes", JSImport.Namespace)
@js.native
object validationValidationTypesMod extends js.Object {
  @js.native
  class ValidationTypes () extends js.Object
  
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
    var IS_DEFINED: String = js.native
    var IS_DIVISIBLE_BY: String = js.native
    var IS_EMAIL: String = js.native
    var IS_EMPTY: String = js.native
    var IS_ENUM: String = js.native
    var IS_FQDN: String = js.native
    var IS_FULL_WIDTH: String = js.native
    var IS_HALF_WIDTH: String = js.native
    var IS_HEXADECIMAL: String = js.native
    var IS_HEX_COLOR: String = js.native
    var IS_IN: String = js.native
    var IS_INSTANCE: String = js.native
    var IS_INT: String = js.native
    var IS_IP: String = js.native
    var IS_ISBN: String = js.native
    var IS_ISIN: String = js.native
    var IS_ISO8601: String = js.native
    var IS_JSON: String = js.native
    var IS_LOWERCASE: String = js.native
    var IS_MILITARY_TIME: String = js.native
    var IS_MOBILE_PHONE: String = js.native
    var IS_MONGO_ID: String = js.native
    var IS_MULTIBYTE: String = js.native
    var IS_NEGATIVE: String = js.native
    var IS_NOT_EMPTY: String = js.native
    var IS_NOT_IN: String = js.native
    var IS_NUMBER: String = js.native
    var IS_NUMBER_STRING: String = js.native
    var IS_PHONE_NUMBER: String = js.native
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

