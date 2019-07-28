package typings.calidation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object calidationStrings {
  @js.native
  sealed trait register extends js.Object
  
  @js.native
  sealed trait unregister extends js.Object
  
  @scala.inline
  def register: register = "register".asInstanceOf[register]
  @scala.inline
  def unregister: unregister = "unregister".asInstanceOf[unregister]
}

