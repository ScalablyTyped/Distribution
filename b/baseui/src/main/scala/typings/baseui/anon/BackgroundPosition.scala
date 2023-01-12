package typings.baseui.anon

import typings.baseui.baseuiStrings.top
import typings.baseui.baseuiStrings.trailing
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackgroundPosition extends StObject {
  
  @JSName("$backgroundPosition")
  var $backgroundPosition: String
  
  @JSName("$imageLayout")
  var $imageLayout: /* keyof baseui.anon.Readonlyreadonlytoptoprea */ top | trailing
  
  @JSName("$src")
  var $src: String
}
object BackgroundPosition {
  
  inline def apply(
    $backgroundPosition: String,
    $imageLayout: /* keyof baseui.anon.Readonlyreadonlytoptoprea */ top | trailing,
    $src: String
  ): BackgroundPosition = {
    val __obj = js.Dynamic.literal($backgroundPosition = $backgroundPosition.asInstanceOf[js.Any], $imageLayout = $imageLayout.asInstanceOf[js.Any], $src = $src.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackgroundPosition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BackgroundPosition] (val x: Self) extends AnyVal {
    
    inline def set$backgroundPosition(value: String): Self = StObject.set(x, "$backgroundPosition", value.asInstanceOf[js.Any])
    
    inline def set$imageLayout(value: /* keyof baseui.anon.Readonlyreadonlytoptoprea */ top | trailing): Self = StObject.set(x, "$imageLayout", value.asInstanceOf[js.Any])
    
    inline def set$src(value: String): Self = StObject.set(x, "$src", value.asInstanceOf[js.Any])
  }
}
