package typings.contentfulManagement.anon

import typings.axios.mod.AxiosInstance
import typings.axios.mod.AxiosPromise
import typings.axios.mod.AxiosRequestConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EntityPathHttp extends StObject {
  
  var entityPath: String
  
  def http(config: AxiosRequestConfig): AxiosPromise[js.Any]
  def http(url: String): AxiosPromise[js.Any]
  def http(url: String, config: AxiosRequestConfig): AxiosPromise[js.Any]
  @JSName("http")
  var http_Original: AxiosInstance
}
object EntityPathHttp {
  
  inline def apply(entityPath: String, http: AxiosInstance): EntityPathHttp = {
    val __obj = js.Dynamic.literal(entityPath = entityPath.asInstanceOf[js.Any], http = http.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntityPathHttp]
  }
  
  extension [Self <: EntityPathHttp](x: Self) {
    
    inline def setEntityPath(value: String): Self = StObject.set(x, "entityPath", value.asInstanceOf[js.Any])
    
    inline def setHttp(value: AxiosInstance): Self = StObject.set(x, "http", value.asInstanceOf[js.Any])
  }
}
