package typings.baseui.anon

import typings.react.mod.ElementType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `19` extends StObject {
  
  @JSName("$as")
  var $as: js.UndefOr[ElementType[Any]] = js.undefined
}
object `19` {
  
  inline def apply(): `19` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`19`]
  }
  
  extension [Self <: `19`](x: Self) {
    
    inline def set$as(value: ElementType[Any]): Self = StObject.set(x, "$as", value.asInstanceOf[js.Any])
    
    inline def set$asUndefined: Self = StObject.set(x, "$as", js.undefined)
  }
}
