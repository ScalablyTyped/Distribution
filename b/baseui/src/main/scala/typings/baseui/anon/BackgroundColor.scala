package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackgroundColor extends StObject {
  
  @JSName("$backgroundColor")
  var $backgroundColor: String
  
  @JSName("$color")
  var $color: String
  
  @JSName("$nested")
  var $nested: Boolean
}
object BackgroundColor {
  
  inline def apply($backgroundColor: String, $color: String, $nested: Boolean): BackgroundColor = {
    val __obj = js.Dynamic.literal($backgroundColor = $backgroundColor.asInstanceOf[js.Any], $color = $color.asInstanceOf[js.Any], $nested = $nested.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackgroundColor]
  }
  
  extension [Self <: BackgroundColor](x: Self) {
    
    inline def set$backgroundColor(value: String): Self = StObject.set(x, "$backgroundColor", value.asInstanceOf[js.Any])
    
    inline def set$color(value: String): Self = StObject.set(x, "$color", value.asInstanceOf[js.Any])
    
    inline def set$nested(value: Boolean): Self = StObject.set(x, "$nested", value.asInstanceOf[js.Any])
  }
}
