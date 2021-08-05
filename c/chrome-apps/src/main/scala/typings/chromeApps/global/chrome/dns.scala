package typings.chromeApps.global.chrome

import typings.chromeApps.chrome.dns.ResolveCallbackResolveInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// #endregion
// #region chrome.dns
/////////
// DNS //
/////////
/**
  * @requires(CrOS) Only Chrome OS. Crashes app on Windows.
  * @requires Permissions: 'diagnostics'
  * @description
  * Use the *chrome.dns* API for dns resolution.
  */
object dns {
  
  @JSGlobal("chrome.dns")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Resolves the given hostname or IP address literal.
    * @param hostname The hostname to resolve.
    * @param callback Called when the resolution operation completes.
    */
  inline def resolve(hostname: String, callback: js.Function1[/* resolveInfo */ ResolveCallbackResolveInfo, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(hostname.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
