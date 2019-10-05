package typings.decorum.decorumMod

import typings.std.PropertyDecorator
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("decorum", "Pattern")
@js.native
object Pattern extends js.Object {
  def apply(regex: RegExp): PropertyDecorator = js.native
  def apply(regex: RegExp, message: String): PropertyDecorator = js.native
  def apply(regex: RegExp, message: MessageHandler[PatternValidator]): PropertyDecorator = js.native
}

