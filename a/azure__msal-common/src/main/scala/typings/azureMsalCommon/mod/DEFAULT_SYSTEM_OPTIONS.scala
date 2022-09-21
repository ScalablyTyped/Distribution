package typings.azureMsalCommon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Required<@azure/msal-common.@azure/msal-common/dist/config/ClientConfiguration.SystemOptions> */
object DEFAULT_SYSTEM_OPTIONS {
  
  @JSImport("@azure/msal-common", "DEFAULT_SYSTEM_OPTIONS")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@azure/msal-common", "DEFAULT_SYSTEM_OPTIONS.preventCorsPreflight")
  @js.native
  def preventCorsPreflight: Boolean = js.native
  inline def preventCorsPreflight_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("preventCorsPreflight")(x.asInstanceOf[js.Any])
  
  @JSImport("@azure/msal-common", "DEFAULT_SYSTEM_OPTIONS.proxyUrl")
  @js.native
  def proxyUrl: String = js.native
  inline def proxyUrl_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("proxyUrl")(x.asInstanceOf[js.Any])
  
  @JSImport("@azure/msal-common", "DEFAULT_SYSTEM_OPTIONS.tokenRenewalOffsetSeconds")
  @js.native
  def tokenRenewalOffsetSeconds: Double = js.native
  inline def tokenRenewalOffsetSeconds_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tokenRenewalOffsetSeconds")(x.asInstanceOf[js.Any])
}
