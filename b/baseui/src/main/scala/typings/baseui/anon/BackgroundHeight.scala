package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackgroundHeight extends StObject {
  
  @JSName("$background")
  var $background: js.UndefOr[String] = js.undefined
  
  @JSName("$height")
  var $height: Double
}
object BackgroundHeight {
  
  inline def apply($height: Double): BackgroundHeight = {
    val __obj = js.Dynamic.literal($height = $height.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackgroundHeight]
  }
  
  extension [Self <: BackgroundHeight](x: Self) {
    
    inline def set$background(value: String): Self = StObject.set(x, "$background", value.asInstanceOf[js.Any])
    
    inline def set$backgroundUndefined: Self = StObject.set(x, "$background", js.undefined)
    
    inline def set$height(value: Double): Self = StObject.set(x, "$height", value.asInstanceOf[js.Any])
  }
}
