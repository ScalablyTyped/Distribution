package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorHidden extends StObject {
  
  @JSName("$color")
  var $color: js.UndefOr[typings.baseui.badgeTypesMod.Color] = js.undefined
  
  @JSName("$hidden")
  var $hidden: js.UndefOr[Boolean] = js.undefined
}
object ColorHidden {
  
  inline def apply(): ColorHidden = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorHidden]
  }
  
  extension [Self <: ColorHidden](x: Self) {
    
    inline def set$color(value: typings.baseui.badgeTypesMod.Color): Self = StObject.set(x, "$color", value.asInstanceOf[js.Any])
    
    inline def set$colorUndefined: Self = StObject.set(x, "$color", js.undefined)
    
    inline def set$hidden(value: Boolean): Self = StObject.set(x, "$hidden", value.asInstanceOf[js.Any])
    
    inline def set$hiddenUndefined: Self = StObject.set(x, "$hidden", js.undefined)
  }
}
