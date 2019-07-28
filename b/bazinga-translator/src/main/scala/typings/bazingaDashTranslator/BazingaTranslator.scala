package typings.bazingaDashTranslator

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
  var defaultDomain: String = js.native
  /**
    * Fallback locale.
    *
    * @type {String}
    */
  var fallback: String = js.native
  /**
    * The current locale.
    *
    * @type {String}
    */
  var locale: String = js.native
  /**
    * Placeholder prefix.
    *
    * @type {String}
    */
  var placeHolderPrefix: String = js.native
  /**
    * Placeholder suffix.
    *
    * @type {String}
    */
  var placeHolderSuffix: String = js.native
  /**
    * Plural separator.
    *
    * @type {String}
    */
  var pluralSeparator: String = js.native
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
  def add(id: String, message: String): BazingaTranslator = js.native
  def add(id: String, message: String, domain: String): BazingaTranslator = js.native
  def add(id: String, message: String, domain: String, locale: String): BazingaTranslator = js.native
  /**
    * Loads translations from JSON.
    *
    * @param {String} data     A JSON string or object literal
    *
    * @return {Object}         Translator
    */
  def fromJSON(data: String): BazingaTranslator = js.native
  def reset(): Unit = js.native
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
  def trans(id: String): String = js.native
  def trans(id: String, parameters: js.Any): String = js.native
  def trans(id: String, parameters: js.Any, domain: String): String = js.native
  def trans(id: String, parameters: js.Any, domain: String, locale: String): String = js.native
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
  def transChoice(id: String, number: Double): String = js.native
  def transChoice(id: String, number: Double, parameters: js.Any): String = js.native
  def transChoice(id: String, number: Double, parameters: js.Any, domain: String): String = js.native
  def transChoice(id: String, number: Double, parameters: js.Any, domain: String, locale: String): String = js.native
}

