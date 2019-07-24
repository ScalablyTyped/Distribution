package typings
package bazingaDashTranslatorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BazingaTranslator extends js.Object {
  /**
    * Default domain.
    *
    * @type {String}
    */
  var defaultDomain: java.lang.String = js.native
  /**
    * Fallback locale.
    *
    * @type {String}
    */
  var fallback: java.lang.String = js.native
  /**
    * The current locale.
    *
    * @type {String}
    */
  var locale: java.lang.String = js.native
  /**
    * Placeholder prefix.
    *
    * @type {String}
    */
  var placeHolderPrefix: java.lang.String = js.native
  /**
    * Placeholder suffix.
    *
    * @type {String}
    */
  var placeHolderSuffix: java.lang.String = js.native
  /**
    * Plural separator.
    *
    * @type {String}
    */
  var pluralSeparator: java.lang.String = js.native
  /**
    * Adds a translation entry.
    *
    * @param {String} id         The message id
    * @param {String} message    The message to register for the given id
    * @param {String} [domain]   The domain for the message or null to use the default
    * @param {String} [locale]   The locale or null to use the default
    *
    * @return {Object}           Translator
    */
  def add(id: java.lang.String, message: java.lang.String): BazingaTranslator = js.native
  def add(id: java.lang.String, message: java.lang.String, domain: java.lang.String): BazingaTranslator = js.native
  def add(
    id: java.lang.String,
    message: java.lang.String,
    domain: java.lang.String,
    locale: java.lang.String
  ): BazingaTranslator = js.native
  /**
    * Loads translations from JSON.
    *
    * @param {String} data     A JSON string or object literal
    *
    * @return {Object}         Translator
    */
  def fromJSON(data: java.lang.String): BazingaTranslator = js.native
  def reset(): scala.Unit = js.native
  /**
    * Translates the given message.
    *
    * @param {String} id               The message id
    * @param {Object} [parameters]     An array of parameters for the message
    * @param {String} [domain]         The domain for the message or null to guess it
    * @param {String} [locale]         The locale or null to use the default
    *
    * @return {String}                 The translated string
    */
  def trans(id: java.lang.String): java.lang.String = js.native
  def trans(id: java.lang.String, parameters: js.Any): java.lang.String = js.native
  def trans(id: java.lang.String, parameters: js.Any, domain: java.lang.String): java.lang.String = js.native
  def trans(id: java.lang.String, parameters: js.Any, domain: java.lang.String, locale: java.lang.String): java.lang.String = js.native
  /**
    * Translates the given choice message by choosing a translation according to a number.
    *
    * @param {String} id               The message id
    * @param {Number} number           The number to use to find the indice of the message
    * @param {Object} [parameters]     An array of parameters for the message
    * @param {String} [domain]         The domain for the message or null to guess it
    * @param {String} [locale]         The locale or null to use the default
    *
    * @return {String}                 The translated string
    */
  def transChoice(id: java.lang.String, number: scala.Double): java.lang.String = js.native
  def transChoice(id: java.lang.String, number: scala.Double, parameters: js.Any): java.lang.String = js.native
  def transChoice(id: java.lang.String, number: scala.Double, parameters: js.Any, domain: java.lang.String): java.lang.String = js.native
  def transChoice(
    id: java.lang.String,
    number: scala.Double,
    parameters: js.Any,
    domain: java.lang.String,
    locale: java.lang.String
  ): java.lang.String = js.native
}

