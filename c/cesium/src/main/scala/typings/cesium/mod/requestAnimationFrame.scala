package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object requestAnimationFrame {
  
  @JSImport("cesium", "requestAnimationFrame")
  @js.native
  def apply(callback: Callback): Double = js.native
  
  type Callback = js.Function1[/* timestamp */ Double, Unit]
}
