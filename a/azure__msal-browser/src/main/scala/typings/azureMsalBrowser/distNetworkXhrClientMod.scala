package typings.azureMsalBrowser

import typings.azureMsalCommon.distNetworkInetworkmoduleMod.INetworkModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNetworkXhrClientMod {
  
  @JSImport("@azure/msal-browser/dist/network/XhrClient", "XhrClient")
  @js.native
  open class XhrClient ()
    extends StObject
       with INetworkModule {
    
    /**
      * Gets a string map of the headers received in the response.
      *
      * Algorithm comes from https://developer.mozilla.org/en-US/docs/Web/API/XMLHttpRequest/getAllResponseHeaders
      * @param xhr
      */
    /* private */ var getHeaderDict: Any = js.native
    
    /**
      * Helper for XhrClient requests.
      * @param url
      * @param method
      * @param options
      */
    /* private */ var sendRequestAsync: Any = js.native
    
    /**
      * Helper to set XHR headers for request.
      * @param xhr
      * @param options
      */
    /* private */ var setXhrHeaders: Any = js.native
  }
}
