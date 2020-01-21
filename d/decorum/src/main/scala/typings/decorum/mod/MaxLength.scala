package typings.decorum.mod

import typings.std.PropertyDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("decorum", "MaxLength")
@js.native
object MaxLength extends js.Object {
  def apply(maxLength: Double): PropertyDecorator = js.native
  def apply(maxLength: Double, message: String): PropertyDecorator = js.native
  def apply(maxLength: Double, message: MessageHandler[MaxLengthValidator]): PropertyDecorator = js.native
}

