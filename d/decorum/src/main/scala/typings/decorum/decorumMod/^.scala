package typings.decorum.decorumMod

import typings.std.PropertyDecorator
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("decorum", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var MessageHandlers: IMessageHandlerMap = js.native
  def Alpha(): PropertyDecorator = js.native
  def Alpha(message: String): PropertyDecorator = js.native
  def Alpha(message: MessageHandler[PatternValidator]): PropertyDecorator = js.native
  def AlphaNumeric(): PropertyDecorator = js.native
  def AlphaNumeric(message: String): PropertyDecorator = js.native
  def AlphaNumeric(message: MessageHandler[PatternValidator]): PropertyDecorator = js.native
  def Email(): PropertyDecorator = js.native
  def Email(message: String): PropertyDecorator = js.native
  def Email(message: MessageHandler[EmailValidator]): PropertyDecorator = js.native
  def FieldName(name: String): PropertyDecorator = js.native
  def Length(length: Double): PropertyDecorator = js.native
  def Length(length: Double, message: String): PropertyDecorator = js.native
  def Length(length: Double, message: MessageHandler[LengthValidator]): PropertyDecorator = js.native
  def MaxLength(maxLength: Double): PropertyDecorator = js.native
  def MaxLength(maxLength: Double, message: String): PropertyDecorator = js.native
  def MaxLength(maxLength: Double, message: MessageHandler[MaxLengthValidator]): PropertyDecorator = js.native
  def MinLength(minLength: Double): PropertyDecorator = js.native
  def MinLength(minLength: Double, message: String): PropertyDecorator = js.native
  def MinLength(minLength: Double, message: MessageHandler[MinLengthValidator]): PropertyDecorator = js.native
  def Pattern(regex: RegExp): PropertyDecorator = js.native
  def Pattern(regex: RegExp, message: String): PropertyDecorator = js.native
  def Pattern(regex: RegExp, message: MessageHandler[PatternValidator]): PropertyDecorator = js.native
  def Required(): PropertyDecorator = js.native
  def Required(message: String): PropertyDecorator = js.native
  def Required(message: MessageHandler[RequiredFieldValidator]): PropertyDecorator = js.native
  def Validation[TModel](message: String, predicate: js.Function2[/* value */ js.Any, /* model */ TModel, Boolean]): PropertyDecorator = js.native
  def Validation[TModel](
    message: MessageHandler[CustomValidator[TModel]],
    predicate: js.Function2[/* value */ js.Any, /* model */ TModel, Boolean]
  ): PropertyDecorator = js.native
}

