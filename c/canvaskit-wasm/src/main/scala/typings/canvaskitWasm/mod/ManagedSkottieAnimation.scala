package typings.canvaskitWasm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ManagedSkottieAnimation extends SkottieAnimation {
  
  def getColorProps(): js.Array[js.Object] = js.native
  
  def getMarkers(): js.Array[js.Object] = js.native
  
  def getOpacityProps(): js.Array[js.Object] = js.native
  
  def setColor(key: String, color: InputColor): Unit = js.native
  
  def setOpacity(key: String, opacity: Double): Unit = js.native
}
