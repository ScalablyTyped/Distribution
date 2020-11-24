package typings.decorum.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("decorum", "MinLengthValidator")
@js.native
class MinLengthValidator protected () extends BaseValidator {
  def this(minLength: Double) = this()
  def this(minLength: Double, message: String) = this()
  def this(minLength: Double, message: MessageHandler[MinLengthValidator]) = this()
  
  def isValid(value: String): Boolean = js.native
  
  var minLength: Double = js.native
}
