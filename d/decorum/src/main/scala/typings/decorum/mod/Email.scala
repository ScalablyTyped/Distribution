package typings.decorum.mod

import typings.std.PropertyDecorator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("decorum", "Email")
@js.native
object Email extends js.Object {
  
  def apply(): PropertyDecorator = js.native
  def apply(message: String): PropertyDecorator = js.native
  def apply(message: MessageHandler[EmailValidator]): PropertyDecorator = js.native
}
