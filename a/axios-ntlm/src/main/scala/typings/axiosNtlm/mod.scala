package typings.axiosNtlm

import typings.axios.mod.AxiosInstance
import typings.axios.mod.AxiosRequestConfig
import typings.axios.mod.AxiosResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("axios-ntlm", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("axios-ntlm", "AxiosError")
  @js.native
  open class AxiosError[T, D] ()
    extends typings.axios.mod.AxiosError[T, D] {
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
  }
  /* static members */
  object AxiosError {
    
    @JSImport("axios-ntlm", "AxiosError.ECONNABORTED")
    @js.native
    val ECONNABORTED: /* "ECONNABORTED" */ String = js.native
    
    @JSImport("axios-ntlm", "AxiosError.ERR_BAD_OPTION")
    @js.native
    val ERR_BAD_OPTION: /* "ERR_BAD_OPTION" */ String = js.native
    
    @JSImport("axios-ntlm", "AxiosError.ERR_BAD_OPTION_VALUE")
    @js.native
    val ERR_BAD_OPTION_VALUE: /* "ERR_BAD_OPTION_VALUE" */ String = js.native
    
    @JSImport("axios-ntlm", "AxiosError.ERR_BAD_REQUEST")
    @js.native
    val ERR_BAD_REQUEST: /* "ERR_BAD_REQUEST" */ String = js.native
    
    @JSImport("axios-ntlm", "AxiosError.ERR_BAD_RESPONSE")
    @js.native
    val ERR_BAD_RESPONSE: /* "ERR_BAD_RESPONSE" */ String = js.native
    
    @JSImport("axios-ntlm", "AxiosError.ERR_CANCELED")
    @js.native
    val ERR_CANCELED: /* "ERR_CANCELED" */ String = js.native
    
    @JSImport("axios-ntlm", "AxiosError.ERR_DEPRECATED")
    @js.native
    val ERR_DEPRECATED: /* "ERR_DEPRECATED" */ String = js.native
    
    @JSImport("axios-ntlm", "AxiosError.ERR_FR_TOO_MANY_REDIRECTS")
    @js.native
    val ERR_FR_TOO_MANY_REDIRECTS: /* "ERR_FR_TOO_MANY_REDIRECTS" */ String = js.native
    
    @JSImport("axios-ntlm", "AxiosError.ERR_INVALID_URL")
    @js.native
    val ERR_INVALID_URL: /* "ERR_INVALID_URL" */ String = js.native
    
    @JSImport("axios-ntlm", "AxiosError.ERR_NETWORK")
    @js.native
    val ERR_NETWORK: /* "ERR_NETWORK" */ String = js.native
    
    @JSImport("axios-ntlm", "AxiosError.ERR_NOT_SUPPORT")
    @js.native
    val ERR_NOT_SUPPORT: /* "ERR_NOT_SUPPORT" */ String = js.native
    
    @JSImport("axios-ntlm", "AxiosError.ETIMEDOUT")
    @js.native
    val ETIMEDOUT: /* "ETIMEDOUT" */ String = js.native
  }
  
  inline def NtlmClient(credentials: NtlmCredentials): AxiosInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("NtlmClient")(credentials.asInstanceOf[js.Any]).asInstanceOf[AxiosInstance]
  inline def NtlmClient(credentials: NtlmCredentials, AxiosConfig: AxiosRequestConfig[Any]): AxiosInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("NtlmClient")(credentials.asInstanceOf[js.Any], AxiosConfig.asInstanceOf[js.Any])).asInstanceOf[AxiosInstance]
  
  trait NtlmCredentials extends StObject {
    
    val domain: String
    
    val password: String
    
    val username: String
    
    val workstation: js.UndefOr[String] = js.undefined
  }
  object NtlmCredentials {
    
    inline def apply(domain: String, password: String, username: String): NtlmCredentials = {
      val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[NtlmCredentials]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NtlmCredentials] (val x: Self) extends AnyVal {
      
      inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      inline def setWorkstation(value: String): Self = StObject.set(x, "workstation", value.asInstanceOf[js.Any])
      
      inline def setWorkstationUndefined: Self = StObject.set(x, "workstation", js.undefined)
    }
  }
}
