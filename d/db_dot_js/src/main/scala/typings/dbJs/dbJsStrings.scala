package typings.dbJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object dbJsStrings {
  @js.native
  sealed trait abort extends js.Object
  
  @js.native
  sealed trait error extends js.Object
  
  @js.native
  sealed trait versionchange extends js.Object
  
  @scala.inline
  def abort: abort = "abort".asInstanceOf[abort]
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  @scala.inline
  def versionchange: versionchange = "versionchange".asInstanceOf[versionchange]
}

