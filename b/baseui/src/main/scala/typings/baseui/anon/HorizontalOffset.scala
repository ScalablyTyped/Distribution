package typings.baseui.anon

import typings.baseui.badgeTypesMod.Role
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HorizontalOffset extends StObject {
  
  @JSName("$horizontalOffset")
  var $horizontalOffset: js.UndefOr[String | Null] = js.undefined
  
  @JSName("$placement")
  var $placement: typings.baseui.badgeTypesMod.Placement
  
  @JSName("$role")
  var $role: Role
  
  @JSName("$verticalOffset")
  var $verticalOffset: js.UndefOr[String | Null] = js.undefined
}
object HorizontalOffset {
  
  inline def apply($placement: typings.baseui.badgeTypesMod.Placement, $role: Role): HorizontalOffset = {
    val __obj = js.Dynamic.literal($placement = $placement.asInstanceOf[js.Any], $role = $role.asInstanceOf[js.Any])
    __obj.asInstanceOf[HorizontalOffset]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HorizontalOffset] (val x: Self) extends AnyVal {
    
    inline def set$horizontalOffset(value: String): Self = StObject.set(x, "$horizontalOffset", value.asInstanceOf[js.Any])
    
    inline def set$horizontalOffsetNull: Self = StObject.set(x, "$horizontalOffset", null)
    
    inline def set$horizontalOffsetUndefined: Self = StObject.set(x, "$horizontalOffset", js.undefined)
    
    inline def set$placement(value: typings.baseui.badgeTypesMod.Placement): Self = StObject.set(x, "$placement", value.asInstanceOf[js.Any])
    
    inline def set$role(value: Role): Self = StObject.set(x, "$role", value.asInstanceOf[js.Any])
    
    inline def set$verticalOffset(value: String): Self = StObject.set(x, "$verticalOffset", value.asInstanceOf[js.Any])
    
    inline def set$verticalOffsetNull: Self = StObject.set(x, "$verticalOffset", null)
    
    inline def set$verticalOffsetUndefined: Self = StObject.set(x, "$verticalOffset", js.undefined)
  }
}
