package typings.chromeApps.global.chrome

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// #endregion
// #region chrome.diagnostics
/////////////////
// Diagnostics //
/////////////////
/**
  * @requires(CrOS) Only Chrome OS. Crashes app on Windows.
  * @requires Permissions: 'diagnostics'
  */
object diagnostics {
  
  /** @todo TODO PROPER DOCS */
  @JSGlobal("chrome.diagnostics.sendPacket")
  @js.native
  def sendPacket(options: js.Object, callback: js.Function0[Unit]): Unit = js.native
}
