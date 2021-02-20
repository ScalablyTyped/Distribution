package typings.chromeLauncher

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chromeFinderMod {
  
  @JSImport("chrome-launcher/dist/chrome-finder", "darwin")
  @js.native
  def darwin(): js.Array[String] = js.native
  
  @JSImport("chrome-launcher/dist/chrome-finder", "darwinFast")
  @js.native
  def darwinFast(): js.UndefOr[String] = js.native
  
  @JSImport("chrome-launcher/dist/chrome-finder", "linux")
  @js.native
  def linux(): js.Array[String] = js.native
  
  @JSImport("chrome-launcher/dist/chrome-finder", "win32")
  @js.native
  def win32(): js.Array[String] = js.native
  
  @JSImport("chrome-launcher/dist/chrome-finder", "wsl")
  @js.native
  def wsl(): js.Array[String] = js.native
}
