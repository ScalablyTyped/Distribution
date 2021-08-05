package typings.contentfulManagement.anon

import typings.axios.mod.AxiosInstance
import typings.axios.mod.AxiosPromise
import typings.axios.mod.AxiosRequestConfig
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EntityPath[T] extends StObject {
  
  var entityPath: String
  
  var headers: js.UndefOr[Record[String, js.Any]] = js.undefined
  
  def http(config: AxiosRequestConfig): AxiosPromise[js.Any]
  def http(url: String): AxiosPromise[js.Any]
  def http(url: String, config: AxiosRequestConfig): AxiosPromise[js.Any]
  @JSName("http")
  var http_Original: AxiosInstance
  
  def wrapperMethod(http: AxiosInstance, data: js.Any): T
  @JSName("wrapperMethod")
  var wrapperMethod_Original: typings.contentfulManagement.instanceActionsMod.WrapperMethod[T, AxiosInstance]
}
object EntityPath {
  
  inline def apply[T](entityPath: String, http: AxiosInstance, wrapperMethod: (AxiosInstance, /* data */ js.Any) => T): EntityPath[T] = {
    val __obj = js.Dynamic.literal(entityPath = entityPath.asInstanceOf[js.Any], http = http.asInstanceOf[js.Any], wrapperMethod = js.Any.fromFunction2(wrapperMethod))
    __obj.asInstanceOf[EntityPath[T]]
  }
  
  extension [Self <: EntityPath[?], T](x: Self & EntityPath[T]) {
    
    inline def setEntityPath(value: String): Self = StObject.set(x, "entityPath", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Record[String, js.Any]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setHttp(value: AxiosInstance): Self = StObject.set(x, "http", value.asInstanceOf[js.Any])
    
    inline def setWrapperMethod(value: (AxiosInstance, /* data */ js.Any) => T): Self = StObject.set(x, "wrapperMethod", js.Any.fromFunction2(value))
  }
}
