package typings.blueprintjsCore.mod

import typings.blueprintjsCore.rangeSliderMod.IRangeSliderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/core", "RangeSlider")
@js.native
class RangeSlider protected ()
  extends typings.blueprintjsCore.componentsMod.RangeSlider {
  def this(props: IRangeSliderProps) = this()
  def this(props: IRangeSliderProps, context: js.Any) = this()
}
/* static members */
object RangeSlider {
  
  @JSImport("@blueprintjs/core", "RangeSlider")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@blueprintjs/core", "RangeSlider.defaultProps")
  @js.native
  def defaultProps: IRangeSliderProps = js.native
  @scala.inline
  def defaultProps_=(x: IRangeSliderProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("@blueprintjs/core", "RangeSlider.displayName")
  @js.native
  def displayName: String = js.native
  @scala.inline
  def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
}
