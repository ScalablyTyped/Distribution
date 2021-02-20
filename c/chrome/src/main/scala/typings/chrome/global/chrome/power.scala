package typings.chrome.global.chrome

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  
  @JSGlobal("chrome.power.releaseKeepAwake")
  @js.native
  def releaseKeepAwake(): Unit = js.native
  
  @JSGlobal("chrome.power.requestKeepAwake")
  @js.native
  def requestKeepAwake(level: String): Unit = js.native
}
