package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides access to Client objects. Access it via self.clients within a service worker. */
@js.native
trait Clients extends StObject {
  
  def claim(): Promise[Unit] = js.native
  
  def get(id: java.lang.String): Promise[js.UndefOr[Client]] = js.native
  
  def matchAll[T /* <: ClientQueryOptions */](): Promise[ReadonlyArray[Client | WindowClient]] = js.native
  def matchAll[T /* <: ClientQueryOptions */](options: T): Promise[ReadonlyArray[Client | WindowClient]] = js.native
  
  def openWindow(url: java.lang.String): Promise[WindowClient | Null] = js.native
  def openWindow(url: URL): Promise[WindowClient | Null] = js.native
}
