package typings.chromeApps.global.chrome

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// #endregion
// #region chrome.diagnostics
/////////////////
// Diagnostics //
/////////////////
/**
  * @requires Only Chrome OS. Crashes app on Windows.
  * @requires Permissions: 'diagnostics'
  */
object diagnostics {
  
  @JSGlobal("chrome.diagnostics")
  @js.native
  val ^ : js.Any = js.native
  
  /** @todo TODO PROPER DOCS */
  inline def sendPacket(options: js.Object, callback: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendPacket")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
