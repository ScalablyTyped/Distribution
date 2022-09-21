package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This Push API interface represents a push message that has been received. This event is sent to the global scope of a ServiceWorker. It contains the information sent from an application server to a PushSubscription.
  * Available only in secure contexts.
  */
@js.native
trait PushEvent
  extends StObject
     with ExtendableEvent {
  
  val data: PushMessageData | Null = js.native
}
