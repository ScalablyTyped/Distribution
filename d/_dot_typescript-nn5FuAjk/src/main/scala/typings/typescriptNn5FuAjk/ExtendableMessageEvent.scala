package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This ServiceWorker API interface represents the event object of a message event fired on a service worker (when a channel message is received on the ServiceWorkerGlobalScope from another context) — extends the lifetime of such events. */
@js.native
trait ExtendableMessageEvent
  extends StObject
     with ExtendableEvent {
  
  val data: Any = js.native
  
  val lastEventId: java.lang.String = js.native
  
  val origin: java.lang.String = js.native
  
  val ports: ReadonlyArray[MessagePort] = js.native
  
  val source: Client | ServiceWorker | MessagePort | Null = js.native
}
