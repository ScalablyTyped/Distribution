package typings.baseui.popoverTypesMod

import typings.baseui.layerTypesMod.TetherPlacement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArrowStylePropsArg extends StObject {
  
  @JSName("$arrowOffset")
  var $arrowOffset: Offset
  
  @JSName("$placement")
  var $placement: TetherPlacement
}
object ArrowStylePropsArg {
  
  inline def apply($arrowOffset: Offset, $placement: TetherPlacement): ArrowStylePropsArg = {
    val __obj = js.Dynamic.literal($arrowOffset = $arrowOffset.asInstanceOf[js.Any], $placement = $placement.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrowStylePropsArg]
  }
  
  extension [Self <: ArrowStylePropsArg](x: Self) {
    
    inline def set$arrowOffset(value: Offset): Self = StObject.set(x, "$arrowOffset", value.asInstanceOf[js.Any])
    
    inline def set$placement(value: TetherPlacement): Self = StObject.set(x, "$placement", value.asInstanceOf[js.Any])
  }
}
