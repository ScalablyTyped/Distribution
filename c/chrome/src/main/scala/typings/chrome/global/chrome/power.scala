package typings.chrome.global.chrome

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////
// Power
////////////////////
/**
  * Use the chrome.power API to override the system's power management features.
  * Permissions:  "power"
  * @since Chrome 27.
  */
object power {
  
  @JSGlobal("chrome.power")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def releaseKeepAwake(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("releaseKeepAwake")().asInstanceOf[Unit]
  
  @scala.inline
  def requestKeepAwake(level: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("requestKeepAwake")(level.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
