package typings.boom.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("boom", "unauthorized")
@js.native
object unauthorized extends js.Object {
  
  /**
    * Returns a 401 Unauthorized error
    * @param message optional message.
    * @param scheme can be one of the following:
    *      * an authentication scheme name
    *      * an array of string values. These values will be separated by ', ' and set to the 'WWW-Authenticate' header.
    * @param attributes an object of values to use while setting the 'WWW-Authenticate' header.
    * This value is only used when scheme is a string, otherwise it is ignored.
    * Every key/value pair will be included in the 'WWW-Authenticate' in the format of
    * 'key="value"' as well as in the response payload under the attributes key.
    * Alternatively value can be a string which is use to set the value of the scheme,
    * for example setting the token value for negotiate header.
    * If string is used message parameter must be null.
    * null and undefined will be replaced with an empty string. If attributes is set,
    * message will be used as the 'error' segment of the 'WWW-Authenticate' header.
    * If message is unset, the 'error' segment of the header will not be present and isMissing will be true on the error object.
    * @see {@link https://github.com/hapijs/boom#boomunauthorizedmessage-scheme-attributes}
    */
  def apply(): Boom[Null] = js.native
  def apply(message: js.UndefOr[scala.Nothing], scheme: js.UndefOr[scala.Nothing], attributes: String): Boom[Null] = js.native
  def apply(
    message: js.UndefOr[scala.Nothing],
    scheme: js.UndefOr[scala.Nothing],
    attributes: StringDictionary[String]
  ): Boom[Null] = js.native
  def apply(message: js.UndefOr[scala.Nothing], scheme: String): Boom[Null] = js.native
  def apply(message: js.UndefOr[scala.Nothing], scheme: String, attributes: String): Boom[Null] = js.native
  def apply(message: js.UndefOr[scala.Nothing], scheme: String, attributes: StringDictionary[String]): Boom[Null] = js.native
  def apply(message: js.UndefOr[scala.Nothing], scheme: js.Array[String]): Boom[Null] = js.native
  def apply(message: String): Boom[Null] = js.native
  def apply(message: String, scheme: js.UndefOr[scala.Nothing], attributes: StringDictionary[String]): Boom[Null] = js.native
  def apply(message: String, scheme: String): Boom[Null] = js.native
  def apply(message: String, scheme: String, attributes: StringDictionary[String]): Boom[Null] = js.native
  def apply(message: String, scheme: js.Array[String]): Boom[Null] = js.native
  def apply(message: Null, scheme: js.UndefOr[scala.Nothing], attributes: String): Boom[Null] = js.native
  def apply(message: Null, scheme: js.UndefOr[scala.Nothing], attributes: StringDictionary[String]): Boom[Null] = js.native
  def apply(message: Null, scheme: String): Boom[Null] = js.native
  def apply(message: Null, scheme: String, attributes: String): Boom[Null] = js.native
  def apply(message: Null, scheme: String, attributes: StringDictionary[String]): Boom[Null] = js.native
}
