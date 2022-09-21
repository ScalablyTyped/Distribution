package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The storage for Cache objects.
  * Available only in secure contexts.
  */
@js.native
trait CacheStorage extends StObject {
  
  def delete(cacheName: java.lang.String): Promise[scala.Boolean] = js.native
  
  def has(cacheName: java.lang.String): Promise[scala.Boolean] = js.native
  
  def keys(): Promise[Array[java.lang.String]] = js.native
  
  def `match`(request: RequestInfo): Promise[js.UndefOr[Response]] = js.native
  def `match`(request: RequestInfo, options: MultiCacheQueryOptions): Promise[js.UndefOr[Response]] = js.native
  def `match`(request: URL): Promise[js.UndefOr[Response]] = js.native
  def `match`(request: URL, options: MultiCacheQueryOptions): Promise[js.UndefOr[Response]] = js.native
  
  def open(cacheName: java.lang.String): Promise[Cache] = js.native
}
