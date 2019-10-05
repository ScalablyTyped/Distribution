package typings.decorum.decorumMod

import typings.std.PropertyDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("decorum", "Alpha")
@js.native
object Alpha extends js.Object {
  def apply(): PropertyDecorator = js.native
  def apply(message: String): PropertyDecorator = js.native
  def apply(message: MessageHandler[PatternValidator]): PropertyDecorator = js.native
}

