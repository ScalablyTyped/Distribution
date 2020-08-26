package typings.bazingaTranslator.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BazingaTranslator extends js.Object {
  /**
    * Default domain.
    */
  var defaultDomain: String = js.native
  /**
    * Fallback locale.
    */
  var fallback: String = js.native
  /**
    * The current locale.
    */
  var locale: String = js.native
  /**
    * Placeholder prefix.
    */
  var placeHolderPrefix: String = js.native
  /**
    * Placeholder suffix.
    */
  var placeHolderSuffix: String = js.native
  /**
    * Plural separator.
    */
  var pluralSeparator: String = js.native
  /**
    * Adds a translation entry.
    *
    * @param id         The message id
    * @param message    The message to register for the given id
    * @param domain   The domain for the message or null to use the default
    * @param locale   The locale or null to use the default
    */
  def add(id: String, message: String): BazingaTranslator = js.native
  def add(id: String, message: String, domain: js.UndefOr[scala.Nothing], locale: String): BazingaTranslator = js.native
  def add(id: String, message: String, domain: String): BazingaTranslator = js.native
  def add(id: String, message: String, domain: String, locale: String): BazingaTranslator = js.native
  /**
    * Loads translations from JSON.
    *
    * @param data     A JSON string or object literal
    */
  def fromJSON(data: String): BazingaTranslator = js.native
  def reset(): Unit = js.native
  /**
    * Translates the given message.
    *
    * @param id               The message id
    * @param parameters     An array of parameters for the message
    * @param domain         The domain for the message or null to guess it
    * @param locale         The locale or null to use the default
    */
  def trans(id: String): String = js.native
  def trans(
    id: String,
    parameters: js.UndefOr[scala.Nothing],
    domain: js.UndefOr[scala.Nothing],
    locale: String
  ): String = js.native
  def trans(id: String, parameters: js.UndefOr[scala.Nothing], domain: String): String = js.native
  def trans(id: String, parameters: js.UndefOr[scala.Nothing], domain: String, locale: String): String = js.native
  def trans(id: String, parameters: js.Any): String = js.native
  def trans(id: String, parameters: js.Any, domain: js.UndefOr[scala.Nothing], locale: String): String = js.native
  def trans(id: String, parameters: js.Any, domain: String): String = js.native
  def trans(id: String, parameters: js.Any, domain: String, locale: String): String = js.native
  /**
    * Translates the given choice message by choosing a translation according to a number.
    *
    * @param id               The message id
    * @param number           The number to use to find the indice of the message
    * @param parameters     An array of parameters for the message
    * @param domain         The domain for the message or null to guess it
    * @param locale         The locale or null to use the default
    */
  def transChoice(id: String, number: Double): String = js.native
  def transChoice(
    id: String,
    number: Double,
    parameters: js.UndefOr[scala.Nothing],
    domain: js.UndefOr[scala.Nothing],
    locale: String
  ): String = js.native
  def transChoice(id: String, number: Double, parameters: js.UndefOr[scala.Nothing], domain: String): String = js.native
  def transChoice(id: String, number: Double, parameters: js.UndefOr[scala.Nothing], domain: String, locale: String): String = js.native
  def transChoice(id: String, number: Double, parameters: js.Any): String = js.native
  def transChoice(id: String, number: Double, parameters: js.Any, domain: js.UndefOr[scala.Nothing], locale: String): String = js.native
  def transChoice(id: String, number: Double, parameters: js.Any, domain: String): String = js.native
  def transChoice(id: String, number: Double, parameters: js.Any, domain: String, locale: String): String = js.native
}

