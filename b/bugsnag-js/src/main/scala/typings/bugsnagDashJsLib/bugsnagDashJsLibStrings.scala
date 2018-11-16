package typings
package bugsnagDashJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object bugsnagDashJsLibStrings {
  @js.native
  sealed trait error extends js.Object
  
  @js.native
  sealed trait info extends js.Object
  
  @js.native
  sealed trait warning extends js.Object
  
  def error: error = "error".asInstanceOf[error]
  def info: info = "info".asInstanceOf[info]
  def warning: warning = "warning".asInstanceOf[warning]
}

