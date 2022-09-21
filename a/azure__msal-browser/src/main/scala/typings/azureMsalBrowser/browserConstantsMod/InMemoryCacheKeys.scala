package typings.azureMsalBrowser.browserConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait InMemoryCacheKeys extends StObject
@JSImport("@azure/msal-browser/dist/utils/BrowserConstants", "InMemoryCacheKeys")
@js.native
object InMemoryCacheKeys extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[InMemoryCacheKeys & String] = js.native
  
  @js.native
  sealed trait WRAPPER_SKU
    extends StObject
       with InMemoryCacheKeys
  /* "wrapper.sku" */ val WRAPPER_SKU: typings.azureMsalBrowser.browserConstantsMod.InMemoryCacheKeys.WRAPPER_SKU & String = js.native
  
  @js.native
  sealed trait WRAPPER_VER
    extends StObject
       with InMemoryCacheKeys
  /* "wrapper.version" */ val WRAPPER_VER: typings.azureMsalBrowser.browserConstantsMod.InMemoryCacheKeys.WRAPPER_VER & String = js.native
}
