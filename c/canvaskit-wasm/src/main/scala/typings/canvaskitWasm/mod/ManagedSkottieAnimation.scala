package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ManagedSkottieAnimation
  extends StObject
     with SkottieAnimation {
  
  def getColorProps(): js.Array[ColorProperty] = js.native
  
  def getMarkers(): js.Array[AnimationMarker] = js.native
  
  def getOpacityProps(): js.Array[OpacityProperty] = js.native
  
  def getTextProps(): js.Array[TextProperty] = js.native
  
  def setColor(key: String, color: InputColor): Boolean = js.native
  
  def setOpacity(key: String, opacity: Double): Boolean = js.native
  
  def setText(key: String, text: String, size: Double): Boolean = js.native
}
