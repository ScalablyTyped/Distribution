package typings.blueprintjsCore.mod

import typings.blueprintjsCore.sliderMod.SliderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/core", "Slider")
@js.native
open class Slider protected ()
  extends typings.blueprintjsCore.componentsMod.Slider {
  def this(props: SliderProps) = this()
  def this(props: SliderProps, context: Any) = this()
}
/* static members */
object Slider {
  
  @JSImport("@blueprintjs/core", "Slider")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@blueprintjs/core", "Slider.defaultProps")
  @js.native
  def defaultProps: SliderProps = js.native
  inline def defaultProps_=(x: SliderProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("@blueprintjs/core", "Slider.displayName")
  @js.native
  def displayName: String = js.native
  inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
}
