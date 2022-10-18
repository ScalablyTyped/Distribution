package typings.axeCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Responder extends StObject {
  
  def apply(message: js.Error): Unit = js.native
  def apply(message: js.Error, keepalive: Boolean): Unit = js.native
  def apply(message: js.Error, keepalive: Boolean, replyHandler: ReplyHandler): Unit = js.native
  def apply(message: js.Error, keepalive: Unit, replyHandler: ReplyHandler): Unit = js.native
  def apply(message: Any): Unit = js.native
  def apply(message: Any, keepalive: Boolean): Unit = js.native
  def apply(message: Any, keepalive: Boolean, replyHandler: ReplyHandler): Unit = js.native
  def apply(message: Any, keepalive: Unit, replyHandler: ReplyHandler): Unit = js.native
}
