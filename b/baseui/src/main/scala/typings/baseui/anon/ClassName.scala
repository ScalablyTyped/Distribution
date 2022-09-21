package typings.baseui.anon

import typings.styletronStandard.mod.StyleObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClassName[P /* <: js.Object */] extends StObject {
  
  @JSName("$style")
  var $style: js.UndefOr[StyleObject | (js.Function1[/* props */ P, StyleObject])] = js.undefined
  
  var className: js.UndefOr[String] = js.undefined
}
object ClassName {
  
  inline def apply[P /* <: js.Object */](): ClassName[P] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClassName[P]]
  }
  
  extension [Self <: ClassName[?], P /* <: js.Object */](x: Self & ClassName[P]) {
    
    inline def set$style(value: StyleObject | (js.Function1[/* props */ P, StyleObject])): Self = StObject.set(x, "$style", value.asInstanceOf[js.Any])
    
    inline def set$styleFunction1(value: /* props */ P => StyleObject): Self = StObject.set(x, "$style", js.Any.fromFunction1(value))
    
    inline def set$styleUndefined: Self = StObject.set(x, "$style", js.undefined)
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
  }
}
