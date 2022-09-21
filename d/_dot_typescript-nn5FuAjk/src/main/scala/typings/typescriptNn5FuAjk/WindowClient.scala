package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This ServiceWorker API interface represents the scope of a service worker client that is a document in a browser context, controlled by an active worker. The service worker client independently selects and uses a service worker for its own loading and sub-resources. */
@js.native
trait WindowClient
  extends StObject
     with Client {
  
  def focus(): Promise[WindowClient] = js.native
  
  val focused: scala.Boolean = js.native
  
  def navigate(url: java.lang.String): Promise[WindowClient | Null] = js.native
  def navigate(url: URL): Promise[WindowClient | Null] = js.native
  
  val visibilityState: DocumentVisibilityState = js.native
}
