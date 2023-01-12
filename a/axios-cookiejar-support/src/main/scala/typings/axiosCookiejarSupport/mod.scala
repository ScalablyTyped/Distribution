package typings.axiosCookiejarSupport

import typings.axios.mod.AxiosInstance
import typings.axios.mod.AxiosStatic
import typings.toughCookie.mod.CookieJar
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("axios-cookiejar-support", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def wrapper(axios: AxiosInstance): AxiosInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("wrapper")(axios.asInstanceOf[js.Any]).asInstanceOf[AxiosInstance]
  inline def wrapper(axios: AxiosStatic): AxiosStatic = ^.asInstanceOf[js.Dynamic].applyDynamic("wrapper")(axios.asInstanceOf[js.Any]).asInstanceOf[AxiosStatic]
  
  /* augmented module */
  object axiosAugmentingMod {
    
    trait AxiosRequestConfig extends StObject {
      
      var jar: js.UndefOr[CookieJar] = js.undefined
    }
    object AxiosRequestConfig {
      
      inline def apply(): AxiosRequestConfig = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[AxiosRequestConfig]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: AxiosRequestConfig] (val x: Self) extends AnyVal {
        
        inline def setJar(value: CookieJar): Self = StObject.set(x, "jar", value.asInstanceOf[js.Any])
        
        inline def setJarUndefined: Self = StObject.set(x, "jar", js.undefined)
      }
    }
  }
}
