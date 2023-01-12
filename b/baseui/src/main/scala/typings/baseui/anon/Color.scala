package typings.baseui.anon

import typings.baseui.badgeTypesMod.Hierarchy
import typings.baseui.badgeTypesMod.Shape
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Color extends StObject {
  
  @JSName("$color")
  var $color: js.UndefOr[typings.baseui.badgeTypesMod.Color] = js.undefined
  
  @JSName("$hidden")
  var $hidden: js.UndefOr[Boolean] = js.undefined
  
  @JSName("$hierarchy")
  var $hierarchy: js.UndefOr[Hierarchy] = js.undefined
  
  @JSName("$shape")
  var $shape: js.UndefOr[Shape] = js.undefined
}
object Color {
  
  inline def apply(): Color = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Color]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Color] (val x: Self) extends AnyVal {
    
    inline def set$color(value: typings.baseui.badgeTypesMod.Color): Self = StObject.set(x, "$color", value.asInstanceOf[js.Any])
    
    inline def set$colorUndefined: Self = StObject.set(x, "$color", js.undefined)
    
    inline def set$hidden(value: Boolean): Self = StObject.set(x, "$hidden", value.asInstanceOf[js.Any])
    
    inline def set$hiddenUndefined: Self = StObject.set(x, "$hidden", js.undefined)
    
    inline def set$hierarchy(value: Hierarchy): Self = StObject.set(x, "$hierarchy", value.asInstanceOf[js.Any])
    
    inline def set$hierarchyUndefined: Self = StObject.set(x, "$hierarchy", js.undefined)
    
    inline def set$shape(value: Shape): Self = StObject.set(x, "$shape", value.asInstanceOf[js.Any])
    
    inline def set$shapeUndefined: Self = StObject.set(x, "$shape", js.undefined)
  }
}
