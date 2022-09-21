package typings.baseui.anon

import typings.baseui.layerTypesMod.TetherPlacement
import typings.baseui.popoverTypesMod.Offset
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined baseui.baseui/popover/types.ArrowStylePropsArg & {  $theme :baseui.baseui/styles/types.Theme} */
trait ArrowStylePropsArgthemeTh extends StObject {
  
  @JSName("$arrowOffset")
  var $arrowOffset: Offset
  
  @JSName("$placement")
  var $placement: TetherPlacement
  
  @JSName("$theme")
  var $theme: typings.baseui.stylesTypesMod.Theme
}
object ArrowStylePropsArgthemeTh {
  
  inline def apply($arrowOffset: Offset, $placement: TetherPlacement, $theme: typings.baseui.stylesTypesMod.Theme): ArrowStylePropsArgthemeTh = {
    val __obj = js.Dynamic.literal($arrowOffset = $arrowOffset.asInstanceOf[js.Any], $placement = $placement.asInstanceOf[js.Any], $theme = $theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrowStylePropsArgthemeTh]
  }
  
  extension [Self <: ArrowStylePropsArgthemeTh](x: Self) {
    
    inline def set$arrowOffset(value: Offset): Self = StObject.set(x, "$arrowOffset", value.asInstanceOf[js.Any])
    
    inline def set$placement(value: TetherPlacement): Self = StObject.set(x, "$placement", value.asInstanceOf[js.Any])
    
    inline def set$theme(value: typings.baseui.stylesTypesMod.Theme): Self = StObject.set(x, "$theme", value.asInstanceOf[js.Any])
  }
}
