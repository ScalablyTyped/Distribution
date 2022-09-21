package typings.blueprintjsCore.mod

import typings.blueprintjsCore.rangeSliderMod.RangeSliderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/core", "RangeSlider")
@js.native
open class RangeSlider protected ()
  extends typings.blueprintjsCore.componentsMod.RangeSlider {
  def this(props: RangeSliderProps) = this()
  def this(props: RangeSliderProps, context: Any) = this()
}
/* static members */
object RangeSlider {
  
  @JSImport("@blueprintjs/core", "RangeSlider")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@blueprintjs/core", "RangeSlider.defaultProps")
  @js.native
  def defaultProps: RangeSliderProps = js.native
  inline def defaultProps_=(x: RangeSliderProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("@blueprintjs/core", "RangeSlider.displayName")
  @js.native
  def displayName: String = js.native
  inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
}
