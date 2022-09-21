package typings.azureCoreHttp

import typings.azureCoreHttp.anon.AUTHORIZATION
import typings.azureCoreHttp.anon.HttpVerbs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object constantsMod {
  
  object Constants {
    
    @JSImport("@azure/core-http/types/latest/src/util/constants", "Constants")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Specifies ALL Proxy.
      */
    @JSImport("@azure/core-http/types/latest/src/util/constants", "Constants.ALL_PROXY")
    @js.native
    def ALL_PROXY: String = js.native
    inline def ALL_PROXY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ALL_PROXY")(x.asInstanceOf[js.Any])
    
    /**
      * Specifies HTTP.
      */
    @JSImport("@azure/core-http/types/latest/src/util/constants", "Constants.HTTP")
    @js.native
    def HTTP: String = js.native
    
    /**
      * Specifies HTTPS.
      */
    @JSImport("@azure/core-http/types/latest/src/util/constants", "Constants.HTTPS")
    @js.native
    def HTTPS: String = js.native
    inline def HTTPS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HTTPS")(x.asInstanceOf[js.Any])
    
    /**
      * Specifies HTTPS Proxy.
      */
    @JSImport("@azure/core-http/types/latest/src/util/constants", "Constants.HTTPS_PROXY")
    @js.native
    def HTTPS_PROXY: String = js.native
    inline def HTTPS_PROXY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HTTPS_PROXY")(x.asInstanceOf[js.Any])
    
    inline def HTTP_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HTTP")(x.asInstanceOf[js.Any])
    
    /**
      * Specifies HTTP Proxy.
      */
    @JSImport("@azure/core-http/types/latest/src/util/constants", "Constants.HTTP_PROXY")
    @js.native
    def HTTP_PROXY: String = js.native
    inline def HTTP_PROXY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HTTP_PROXY")(x.asInstanceOf[js.Any])
    
    /**
      * Defines constants for use with HTTP headers.
      */
    @JSImport("@azure/core-http/types/latest/src/util/constants", "Constants.HeaderConstants")
    @js.native
    def HeaderConstants: AUTHORIZATION = js.native
    inline def HeaderConstants_=(x: AUTHORIZATION): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HeaderConstants")(x.asInstanceOf[js.Any])
    
    @JSImport("@azure/core-http/types/latest/src/util/constants", "Constants.HttpConstants")
    @js.native
    def HttpConstants: HttpVerbs = js.native
    inline def HttpConstants_=(x: HttpVerbs): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HttpConstants")(x.asInstanceOf[js.Any])
    
    /**
      * Specifies NO Proxy.
      */
    @JSImport("@azure/core-http/types/latest/src/util/constants", "Constants.NO_PROXY")
    @js.native
    def NO_PROXY: String = js.native
    inline def NO_PROXY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NO_PROXY")(x.asInstanceOf[js.Any])
    
    /**
      * The core-http version
      */
    @JSImport("@azure/core-http/types/latest/src/util/constants", "Constants.coreHttpVersion")
    @js.native
    def coreHttpVersion: String = js.native
    inline def coreHttpVersion_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("coreHttpVersion")(x.asInstanceOf[js.Any])
  }
}
