package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Logger extends StObject {
  
  def close(): Unit = js.native
  
  def endGroup(): Unit = js.native
  
  def getLogFileName(): js.UndefOr[String] = js.native
  
  def hasLevel(level: LogLevel): Boolean = js.native
  
  def info(s: String): Unit = js.native
  
  def loggingEnabled(): Boolean = js.native
  
  def msg(s: String): Unit = js.native
  def msg(s: String, `type`: Msg): Unit = js.native
  
  def perftrc(s: String): Unit = js.native
  
  def startGroup(): Unit = js.native
}
