package typings.bunyan

import typings.bunyan.mod.LogLevelString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bunyanStrings {
  
  @js.native
  sealed trait debug extends LogLevelString
  @scala.inline
  def debug: debug = "debug".asInstanceOf[debug]
  
  @js.native
  sealed trait error extends LogLevelString
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait fatal extends LogLevelString
  @scala.inline
  def fatal: fatal = "fatal".asInstanceOf[fatal]
  
  @js.native
  sealed trait info extends LogLevelString
  @scala.inline
  def info: info = "info".asInstanceOf[info]
  
  @js.native
  sealed trait trace extends LogLevelString
  @scala.inline
  def trace: trace = "trace".asInstanceOf[trace]
  
  @js.native
  sealed trait warn extends LogLevelString
  @scala.inline
  def warn: warn = "warn".asInstanceOf[warn]
}
