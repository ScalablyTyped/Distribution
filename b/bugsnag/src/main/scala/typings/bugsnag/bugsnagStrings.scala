package typings.bugsnag

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bugsnagStrings {
  
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  
  @scala.inline
  def info: info = "info".asInstanceOf[info]
  
  @scala.inline
  def warning: warning = "warning".asInstanceOf[warning]
  
  @js.native
  sealed trait error extends js.Object
  
  @js.native
  sealed trait info extends js.Object
  
  @js.native
  sealed trait warning extends js.Object
}
