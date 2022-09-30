package typings.axios.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AxiosInstance extends Axios {
  
  def apply(config: AxiosRequestConfig[Any]): js.Promise[AxiosResponse[Any, Any]] = js.native
  def apply(url: String): js.Promise[AxiosResponse[Any, Any]] = js.native
  def apply(url: String, config: AxiosRequestConfig[Any]): js.Promise[AxiosResponse[Any, Any]] = js.native
}
