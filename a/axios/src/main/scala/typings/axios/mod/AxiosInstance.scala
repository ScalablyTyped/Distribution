package typings.axios.mod

import typings.axios.anon.OmitAxiosDefaultsanyheade
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AxiosInstance extends Axios {
  
  def apply[T, R, D](config: AxiosRequestConfig[D]): js.Promise[R] = js.native
  def apply[T, R, D](url: String): js.Promise[R] = js.native
  def apply[T, R, D](url: String, config: AxiosRequestConfig[D]): js.Promise[R] = js.native
  
  @JSName("defaults")
  var defaults_AxiosInstance: OmitAxiosDefaultsanyheade = js.native
}
