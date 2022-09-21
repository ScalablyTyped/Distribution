package typings.axios.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("axios", "AxiosError")
@js.native
open class AxiosError[T, D] ()
  extends StObject
     with Error {
  def this(message: String) = this()
  def this(message: String, code: String) = this()
  def this(message: Unit, code: String) = this()
  def this(message: String, code: String, config: AxiosRequestConfig[D]) = this()
  def this(message: String, code: Unit, config: AxiosRequestConfig[D]) = this()
  def this(message: Unit, code: String, config: AxiosRequestConfig[D]) = this()
  def this(message: Unit, code: Unit, config: AxiosRequestConfig[D]) = this()
  def this(message: String, code: String, config: Unit, request: Any) = this()
  def this(message: String, code: String, config: AxiosRequestConfig[D], request: Any) = this()
  def this(message: String, code: Unit, config: Unit, request: Any) = this()
  def this(message: String, code: Unit, config: AxiosRequestConfig[D], request: Any) = this()
  def this(message: Unit, code: String, config: Unit, request: Any) = this()
  def this(message: Unit, code: String, config: AxiosRequestConfig[D], request: Any) = this()
  def this(message: Unit, code: Unit, config: Unit, request: Any) = this()
  def this(message: Unit, code: Unit, config: AxiosRequestConfig[D], request: Any) = this()
  def this(message: String, code: String, config: Unit, request: Any, response: AxiosResponse[T, D]) = this()
  def this(message: String, code: String, config: Unit, request: Unit, response: AxiosResponse[T, D]) = this()
  def this(
    message: String,
    code: String,
    config: AxiosRequestConfig[D],
    request: Any,
    response: AxiosResponse[T, D]
  ) = this()
  def this(
    message: String,
    code: String,
    config: AxiosRequestConfig[D],
    request: Unit,
    response: AxiosResponse[T, D]
  ) = this()
  def this(message: String, code: Unit, config: Unit, request: Any, response: AxiosResponse[T, D]) = this()
  def this(message: String, code: Unit, config: Unit, request: Unit, response: AxiosResponse[T, D]) = this()
  def this(
    message: String,
    code: Unit,
    config: AxiosRequestConfig[D],
    request: Any,
    response: AxiosResponse[T, D]
  ) = this()
  def this(
    message: String,
    code: Unit,
    config: AxiosRequestConfig[D],
    request: Unit,
    response: AxiosResponse[T, D]
  ) = this()
  def this(message: Unit, code: String, config: Unit, request: Any, response: AxiosResponse[T, D]) = this()
  def this(message: Unit, code: String, config: Unit, request: Unit, response: AxiosResponse[T, D]) = this()
  def this(
    message: Unit,
    code: String,
    config: AxiosRequestConfig[D],
    request: Any,
    response: AxiosResponse[T, D]
  ) = this()
  def this(
    message: Unit,
    code: String,
    config: AxiosRequestConfig[D],
    request: Unit,
    response: AxiosResponse[T, D]
  ) = this()
  def this(message: Unit, code: Unit, config: Unit, request: Any, response: AxiosResponse[T, D]) = this()
  def this(message: Unit, code: Unit, config: Unit, request: Unit, response: AxiosResponse[T, D]) = this()
  def this(
    message: Unit,
    code: Unit,
    config: AxiosRequestConfig[D],
    request: Any,
    response: AxiosResponse[T, D]
  ) = this()
  def this(
    message: Unit,
    code: Unit,
    config: AxiosRequestConfig[D],
    request: Unit,
    response: AxiosResponse[T, D]
  ) = this()
  
  var code: js.UndefOr[String] = js.native
  
  var config: AxiosRequestConfig[D] = js.native
  
  var isAxiosError: Boolean = js.native
  
  /* standard es5 */
  /* CompleteClass */
  var message: String = js.native
  
  /* standard es5 */
  /* CompleteClass */
  var name: String = js.native
  
  var request: js.UndefOr[Any] = js.native
  
  var response: js.UndefOr[AxiosResponse[T, D]] = js.native
  
  var status: js.UndefOr[String] = js.native
  
  def toJSON(): js.Object = js.native
}
/* static members */
object AxiosError {
  
  @JSImport("axios", "AxiosError.ECONNABORTED")
  @js.native
  val ECONNABORTED: /* "ECONNABORTED" */ String = js.native
  
  @JSImport("axios", "AxiosError.ERR_BAD_OPTION")
  @js.native
  val ERR_BAD_OPTION: /* "ERR_BAD_OPTION" */ String = js.native
  
  @JSImport("axios", "AxiosError.ERR_BAD_OPTION_VALUE")
  @js.native
  val ERR_BAD_OPTION_VALUE: /* "ERR_BAD_OPTION_VALUE" */ String = js.native
  
  @JSImport("axios", "AxiosError.ERR_BAD_REQUEST")
  @js.native
  val ERR_BAD_REQUEST: /* "ERR_BAD_REQUEST" */ String = js.native
  
  @JSImport("axios", "AxiosError.ERR_BAD_RESPONSE")
  @js.native
  val ERR_BAD_RESPONSE: /* "ERR_BAD_RESPONSE" */ String = js.native
  
  @JSImport("axios", "AxiosError.ERR_CANCELED")
  @js.native
  val ERR_CANCELED: /* "ERR_CANCELED" */ String = js.native
  
  @JSImport("axios", "AxiosError.ERR_DEPRECATED")
  @js.native
  val ERR_DEPRECATED: /* "ERR_DEPRECATED" */ String = js.native
  
  @JSImport("axios", "AxiosError.ERR_FR_TOO_MANY_REDIRECTS")
  @js.native
  val ERR_FR_TOO_MANY_REDIRECTS: /* "ERR_FR_TOO_MANY_REDIRECTS" */ String = js.native
  
  @JSImport("axios", "AxiosError.ERR_NETWORK")
  @js.native
  val ERR_NETWORK: /* "ERR_NETWORK" */ String = js.native
  
  @JSImport("axios", "AxiosError.ETIMEDOUT")
  @js.native
  val ETIMEDOUT: /* "ETIMEDOUT" */ String = js.native
}
