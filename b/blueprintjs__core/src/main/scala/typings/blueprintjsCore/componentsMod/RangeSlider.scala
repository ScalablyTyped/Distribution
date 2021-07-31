package typings.blueprintjsCore.componentsMod

import typings.blueprintjsCore.rangeSliderMod.IRangeSliderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/core/lib/esm/components", "RangeSlider")
@js.native
class RangeSlider protected ()
  extends typings.blueprintjsCore.rangeSliderMod.RangeSlider {
  def this(props: IRangeSliderProps) = this()
  def this(props: IRangeSliderProps, context: js.Any) = this()
}
/* static members */
object RangeSlider {
  
  @JSImport("@blueprintjs/core/lib/esm/components", "RangeSlider")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@blueprintjs/core/lib/esm/components", "RangeSlider.defaultProps")
  @js.native
  def defaultProps: IRangeSliderProps = js.native
  @scala.inline
  def defaultProps_=(x: IRangeSliderProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("@blueprintjs/core/lib/esm/components", "RangeSlider.displayName")
  @js.native
  def displayName: String = js.native
  @scala.inline
  def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
}
