package typings
package decorumLib.decorumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("decorum", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var MessageHandlers: IMessageHandlerMap = js.native
  def Alpha(): stdLib.PropertyDecorator = js.native
  def Alpha(message: MessageHandler[PatternValidator]): stdLib.PropertyDecorator = js.native
  def Alpha(message: java.lang.String): stdLib.PropertyDecorator = js.native
  def AlphaNumeric(): stdLib.PropertyDecorator = js.native
  def AlphaNumeric(message: MessageHandler[PatternValidator]): stdLib.PropertyDecorator = js.native
  def AlphaNumeric(message: java.lang.String): stdLib.PropertyDecorator = js.native
  def Email(): stdLib.PropertyDecorator = js.native
  def Email(message: MessageHandler[EmailValidator]): stdLib.PropertyDecorator = js.native
  def Email(message: java.lang.String): stdLib.PropertyDecorator = js.native
  def FieldName(name: java.lang.String): stdLib.PropertyDecorator = js.native
  def Length(length: scala.Double): stdLib.PropertyDecorator = js.native
  def Length(length: scala.Double, message: MessageHandler[LengthValidator]): stdLib.PropertyDecorator = js.native
  def Length(length: scala.Double, message: java.lang.String): stdLib.PropertyDecorator = js.native
  def MaxLength(maxLength: scala.Double): stdLib.PropertyDecorator = js.native
  def MaxLength(maxLength: scala.Double, message: MessageHandler[MaxLengthValidator]): stdLib.PropertyDecorator = js.native
  def MaxLength(maxLength: scala.Double, message: java.lang.String): stdLib.PropertyDecorator = js.native
  def MinLength(minLength: scala.Double): stdLib.PropertyDecorator = js.native
  def MinLength(minLength: scala.Double, message: MessageHandler[MinLengthValidator]): stdLib.PropertyDecorator = js.native
  def MinLength(minLength: scala.Double, message: java.lang.String): stdLib.PropertyDecorator = js.native
  def Pattern(regex: stdLib.RegExp): stdLib.PropertyDecorator = js.native
  def Pattern(regex: stdLib.RegExp, message: MessageHandler[PatternValidator]): stdLib.PropertyDecorator = js.native
  def Pattern(regex: stdLib.RegExp, message: java.lang.String): stdLib.PropertyDecorator = js.native
  def Required(): stdLib.PropertyDecorator = js.native
  def Required(message: MessageHandler[RequiredFieldValidator]): stdLib.PropertyDecorator = js.native
  def Required(message: java.lang.String): stdLib.PropertyDecorator = js.native
  def Validation[TModel](
    message: MessageHandler[CustomValidator[TModel]],
    predicate: js.Function2[/* value */ js.Any, /* model */ TModel, scala.Boolean]
  ): stdLib.PropertyDecorator = js.native
  def Validation[TModel](
    message: java.lang.String,
    predicate: js.Function2[/* value */ js.Any, /* model */ TModel, scala.Boolean]
  ): stdLib.PropertyDecorator = js.native
}

