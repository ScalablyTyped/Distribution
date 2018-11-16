package typings
package cometdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object cometdLibStrings {
  @js.native
  sealed trait debug extends js.Object
  
  @js.native
  sealed trait error extends js.Object
  
  @js.native
  sealed trait info extends js.Object
  
  @js.native
  sealed trait warn extends js.Object
  
  def debug: debug = "debug".asInstanceOf[debug]
  def error: error = "error".asInstanceOf[error]
  def info: info = "info".asInstanceOf[info]
  def warn: warn = "warn".asInstanceOf[warn]
}

