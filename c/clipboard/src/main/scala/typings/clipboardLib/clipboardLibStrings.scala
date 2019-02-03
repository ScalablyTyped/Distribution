package typings
package clipboardLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object clipboardLibStrings {
  @js.native
  sealed trait copy extends js.Object
  
  @js.native
  sealed trait cut extends js.Object
  
  @js.native
  sealed trait error extends js.Object
  
  @js.native
  sealed trait success extends js.Object
  
  @scala.inline
  def copy: copy = "copy".asInstanceOf[copy]
  @scala.inline
  def cut: cut = "cut".asInstanceOf[cut]
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  @scala.inline
  def success: success = "success".asInstanceOf[success]
}

