package typings.decorum.mod

import typings.std.PropertyDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("decorum", "Length")
@js.native
object Length extends js.Object {
  
  def apply(length: Double): PropertyDecorator = js.native
  def apply(length: Double, message: String): PropertyDecorator = js.native
  def apply(length: Double, message: MessageHandler[LengthValidator]): PropertyDecorator = js.native
}
