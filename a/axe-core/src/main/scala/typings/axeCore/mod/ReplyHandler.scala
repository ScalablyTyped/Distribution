package typings.axeCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 
NOTE: Rewritten from type alias:
{{{
type ReplyHandler = (message : any | std.Error, keepalive : boolean, responder : axe-core.axe-core.Responder): void
}}}
to avoid circular code involving: 
- axe-core.axe-core.ReplyHandler
- axe-core.axe-core.Responder
- axe-core.axe-core.TopicHandler
*/
@js.native
trait ReplyHandler extends StObject {
  
  def apply(message: js.Error, keepalive: Boolean, responder: Responder): Unit = js.native
  def apply(message: Any, keepalive: Boolean, responder: Responder): Unit = js.native
}
