package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides a storage mechanism for Request / Response object pairs that are cached, for example as part of the ServiceWorker life cycle. Note that the Cache interface is exposed to windowed scopes as well as workers. You don't have to use it in conjunction with service workers, even though it is defined in the service worker spec.
  * Available only in secure contexts.
  */
/////////////////////////////
/// Worker Iterable APIs
/////////////////////////////
@js.native
trait Cache extends StObject {
  
  def add(request: RequestInfo): Promise[Unit] = js.native
  def add(request: URL): Promise[Unit] = js.native
  
  def addAll(requests: Array[RequestInfo]): Promise[Unit] = js.native
  def addAll(requests: Iterable[RequestInfo]): Promise[Unit] = js.native
  
  def delete(request: RequestInfo): Promise[scala.Boolean] = js.native
  def delete(request: RequestInfo, options: CacheQueryOptions): Promise[scala.Boolean] = js.native
  def delete(request: URL): Promise[scala.Boolean] = js.native
  def delete(request: URL, options: CacheQueryOptions): Promise[scala.Boolean] = js.native
  
  def keys(): Promise[ReadonlyArray[Request]] = js.native
  def keys(request: Unit, options: CacheQueryOptions): Promise[ReadonlyArray[Request]] = js.native
  def keys(request: RequestInfo): Promise[ReadonlyArray[Request]] = js.native
  def keys(request: RequestInfo, options: CacheQueryOptions): Promise[ReadonlyArray[Request]] = js.native
  def keys(request: URL): Promise[ReadonlyArray[Request]] = js.native
  def keys(request: URL, options: CacheQueryOptions): Promise[ReadonlyArray[Request]] = js.native
  
  def `match`(request: RequestInfo): Promise[js.UndefOr[Response]] = js.native
  def `match`(request: RequestInfo, options: CacheQueryOptions): Promise[js.UndefOr[Response]] = js.native
  def `match`(request: URL): Promise[js.UndefOr[Response]] = js.native
  def `match`(request: URL, options: CacheQueryOptions): Promise[js.UndefOr[Response]] = js.native
  
  def matchAll(): Promise[ReadonlyArray[Response]] = js.native
  def matchAll(request: Unit, options: CacheQueryOptions): Promise[ReadonlyArray[Response]] = js.native
  def matchAll(request: RequestInfo): Promise[ReadonlyArray[Response]] = js.native
  def matchAll(request: RequestInfo, options: CacheQueryOptions): Promise[ReadonlyArray[Response]] = js.native
  def matchAll(request: URL): Promise[ReadonlyArray[Response]] = js.native
  def matchAll(request: URL, options: CacheQueryOptions): Promise[ReadonlyArray[Response]] = js.native
  
  def put(request: RequestInfo, response: Response): Promise[Unit] = js.native
  def put(request: URL, response: Response): Promise[Unit] = js.native
}
