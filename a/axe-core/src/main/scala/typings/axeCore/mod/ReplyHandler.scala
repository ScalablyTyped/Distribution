package typings.axeCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReplyHandler extends StObject {
  
  def apply(message: js.Error, keepalive: Boolean, responder: Responder): Unit = js.native
  def apply(message: Any, keepalive: Boolean, responder: Responder): Unit = js.native
}
