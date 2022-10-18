package typings.baseui.anon

import typings.baseui.mapMarkerTypesMod.BadgeEnhancerSize
import typings.baseui.mapMarkerTypesMod.BadgePosition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Position extends StObject {
  
  @JSName("$position")
  var $position: BadgePosition
  
  @JSName("$size")
  var $size: BadgeEnhancerSize
}
object Position {
  
  inline def apply($position: BadgePosition, $size: BadgeEnhancerSize): Position = {
    val __obj = js.Dynamic.literal($position = $position.asInstanceOf[js.Any], $size = $size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Position]
  }
  
  extension [Self <: Position](x: Self) {
    
    inline def set$position(value: BadgePosition): Self = StObject.set(x, "$position", value.asInstanceOf[js.Any])
    
    inline def set$size(value: BadgeEnhancerSize): Self = StObject.set(x, "$size", value.asInstanceOf[js.Any])
  }
}
