package typings.baseui.anon

import typings.baseui.mapMarkerTypesMod.BadgeEnhancerSize
import typings.baseui.mapMarkerTypesMod.BadgePosition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PositionSize extends StObject {
  
  @JSName("$position")
  var $position: BadgePosition
  
  @JSName("$size")
  var $size: BadgeEnhancerSize
}
object PositionSize {
  
  inline def apply($position: BadgePosition, $size: BadgeEnhancerSize): PositionSize = {
    val __obj = js.Dynamic.literal($position = $position.asInstanceOf[js.Any], $size = $size.asInstanceOf[js.Any])
    __obj.asInstanceOf[PositionSize]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PositionSize] (val x: Self) extends AnyVal {
    
    inline def set$position(value: BadgePosition): Self = StObject.set(x, "$position", value.asInstanceOf[js.Any])
    
    inline def set$size(value: BadgeEnhancerSize): Self = StObject.set(x, "$size", value.asInstanceOf[js.Any])
  }
}
