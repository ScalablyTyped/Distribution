package typings.blackEngine

import typings.blackEngine.fontStyleMod.FontStyle
import typings.blackEngine.fontWeightMod.FontWeight
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textStyleMod {
  
  @JSImport("black-engine/display/text/TextStyle", "TextStyle")
  @js.native
  open class TextStyle protected () extends StObject {
    def this(
      family: js.UndefOr[String],
      color: js.UndefOr[Double],
      size: js.UndefOr[Double],
      style: js.UndefOr[FontStyle],
      weight: js.UndefOr[FontWeight],
      strokeThickness: js.UndefOr[Double],
      strokeColor: js.UndefOr[Double]
    ) = this()
    
    var alpha: Double = js.native
    
    def clone(
      family: js.UndefOr[Any],
      color: js.UndefOr[Double],
      size: js.UndefOr[Double],
      style: js.UndefOr[Any],
      weight: js.UndefOr[Any],
      strokeThickness: js.UndefOr[Double],
      strokeColor: js.UndefOr[Double]
    ): TextStyle = js.native
    
    var color: Double = js.native
    
    var dropShadow: Boolean = js.native
    
    var family: String = js.native
    
    var name: String = js.native
    
    var shadowAlpha: Double = js.native
    
    var shadowBlur: Double = js.native
    
    var shadowColor: Double = js.native
    
    var shadowDistanceX: Double = js.native
    
    var shadowDistanceY: Double = js.native
    
    var size: Double = js.native
    
    var strokeAlpha: Double = js.native
    
    var strokeColor: Double = js.native
    
    var strokeThickness: Double = js.native
    
    var style: FontStyle = js.native
    
    var weight: FontWeight = js.native
  }
}
