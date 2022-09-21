package typings.baseui

import typings.baseui.layerTypesMod.NormalizedOffset
import typings.baseui.layerTypesMod.PopperOffset
import typings.baseui.layerTypesMod.TetherPlacement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object layerUtilsMod {
  
  @JSImport("baseui/layer/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parsePopperOffset(offset: PopperOffset): NormalizedOffset = ^.asInstanceOf[js.Dynamic].applyDynamic("parsePopperOffset")(offset.asInstanceOf[js.Any]).asInstanceOf[NormalizedOffset]
  
  inline def toPopperPlacement(placement: TetherPlacement): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toPopperPlacement")(placement.asInstanceOf[js.Any]).asInstanceOf[String]
}
