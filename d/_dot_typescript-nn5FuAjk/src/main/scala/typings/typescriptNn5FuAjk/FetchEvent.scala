package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This is the event type for fetch events dispatched on the service worker global scope. It contains information about the fetch, including the request and how the receiver will treat the response. It provides the event.respondWith() method, which allows us to provide a response to this fetch. */
@js.native
trait FetchEvent
  extends StObject
     with ExtendableEvent {
  
  val clientId: java.lang.String = js.native
  
  val handled: Promise[Unit] = js.native
  
  val preloadResponse: Promise[Any] = js.native
  
  val request: Request = js.native
  
  def respondWith(r: PromiseLike[Response]): Unit = js.native
  def respondWith(r: Response): Unit = js.native
  
  val resultingClientId: java.lang.String = js.native
}
