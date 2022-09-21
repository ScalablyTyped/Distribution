package typings.baseui

import typings.baseui.sliderTypesMod.StatefulSliderProps
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object statefulSliderMod {
  
  @JSImport("baseui/slider/stateful-slider", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: StatefulSliderProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
}
