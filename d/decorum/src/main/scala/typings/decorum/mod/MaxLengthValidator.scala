package typings.decorum.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("decorum", "MaxLengthValidator")
@js.native
class MaxLengthValidator protected () extends BaseValidator {
  def this(maxLength: Double) = this()
  def this(maxLength: Double, message: String) = this()
  def this(maxLength: Double, message: MessageHandler[MaxLengthValidator]) = this()
  
  def isValid(value: String): Boolean = js.native
  
  var maxLength: Double = js.native
}
