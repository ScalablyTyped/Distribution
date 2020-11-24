package typings.clipboard

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clipboardStrings {
  
  @scala.inline
  def copy: copy = "copy".asInstanceOf[copy]
  
  @scala.inline
  def cut: cut = "cut".asInstanceOf[cut]
  
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  
  @scala.inline
  def success: success = "success".asInstanceOf[success]
  
  @js.native
  sealed trait copy extends js.Object
  
  @js.native
  sealed trait cut extends js.Object
  
  @js.native
  sealed trait error extends js.Object
  
  @js.native
  sealed trait success extends js.Object
}
