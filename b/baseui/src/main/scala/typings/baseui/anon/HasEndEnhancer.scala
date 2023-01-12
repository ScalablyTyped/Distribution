package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HasEndEnhancer extends StObject {
  
  @JSName("$hasEndEnhancer")
  var $hasEndEnhancer: Boolean
  
  @JSName("$orientation")
  var $orientation: typings.baseui.tabsMotionTypesMod.Orientation
}
object HasEndEnhancer {
  
  inline def apply($hasEndEnhancer: Boolean, $orientation: typings.baseui.tabsMotionTypesMod.Orientation): HasEndEnhancer = {
    val __obj = js.Dynamic.literal($hasEndEnhancer = $hasEndEnhancer.asInstanceOf[js.Any], $orientation = $orientation.asInstanceOf[js.Any])
    __obj.asInstanceOf[HasEndEnhancer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HasEndEnhancer] (val x: Self) extends AnyVal {
    
    inline def set$hasEndEnhancer(value: Boolean): Self = StObject.set(x, "$hasEndEnhancer", value.asInstanceOf[js.Any])
    
    inline def set$orientation(value: typings.baseui.tabsMotionTypesMod.Orientation): Self = StObject.set(x, "$orientation", value.asInstanceOf[js.Any])
  }
}
