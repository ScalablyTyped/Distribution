package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorHidden extends StObject {
  
  @JSName("$color")
  var $color: typings.baseui.badgeTypesMod.Color
  
  @JSName("$hidden")
  var $hidden: js.UndefOr[Boolean] = js.undefined
}
object ColorHidden {
  
  inline def apply($color: typings.baseui.badgeTypesMod.Color): ColorHidden = {
    val __obj = js.Dynamic.literal($color = $color.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorHidden]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ColorHidden] (val x: Self) extends AnyVal {
    
    inline def set$color(value: typings.baseui.badgeTypesMod.Color): Self = StObject.set(x, "$color", value.asInstanceOf[js.Any])
    
    inline def set$hidden(value: Boolean): Self = StObject.set(x, "$hidden", value.asInstanceOf[js.Any])
    
    inline def set$hiddenUndefined: Self = StObject.set(x, "$hidden", js.undefined)
  }
}
