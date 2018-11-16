package typings
package dbDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object dbDotJsLibStrings {
  @js.native
  sealed trait abort extends js.Object
  
  @js.native
  sealed trait error extends js.Object
  
  @js.native
  sealed trait versionchange extends js.Object
  
  def abort: abort = "abort".asInstanceOf[abort]
  def error: error = "error".asInstanceOf[error]
  def versionchange: versionchange = "versionchange".asInstanceOf[versionchange]
}

