package typings.baseui.anon

import typings.react.mod.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait As[C /* <: ElementType[Any] */] extends StObject {
  
  @JSName("$as")
  var $as: js.UndefOr[C] = js.undefined
}
object As {
  
  inline def apply[C /* <: ElementType[Any] */](): As[C] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[As[C]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: As[?], C /* <: ElementType[Any] */] (val x: Self & As[C]) extends AnyVal {
    
    inline def set$as(value: C): Self = StObject.set(x, "$as", value.asInstanceOf[js.Any])
    
    inline def set$asUndefined: Self = StObject.set(x, "$as", js.undefined)
  }
}
