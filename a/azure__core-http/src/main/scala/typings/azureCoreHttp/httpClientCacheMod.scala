package typings.azureCoreHttp

import typings.azureCoreHttp.httpClientMod.HttpClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object httpClientCacheMod {
  
  @JSImport("@azure/core-http/types/latest/src/httpClientCache", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getCachedDefaultHttpClient(): HttpClient = ^.asInstanceOf[js.Dynamic].applyDynamic("getCachedDefaultHttpClient")().asInstanceOf[HttpClient]
}
