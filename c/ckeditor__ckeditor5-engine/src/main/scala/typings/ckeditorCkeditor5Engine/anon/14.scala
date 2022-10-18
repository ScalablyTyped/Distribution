package typings.ckeditorCkeditor5Engine.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `14` extends StObject {
  
  var renderUnsafeAttributes: js.UndefOr[js.Array[String]] = js.undefined
}
object `14` {
  
  inline def apply(): `14` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`14`]
  }
  
  extension [Self <: `14`](x: Self) {
    
    inline def setRenderUnsafeAttributes(value: js.Array[String]): Self = StObject.set(x, "renderUnsafeAttributes", value.asInstanceOf[js.Any])
    
    inline def setRenderUnsafeAttributesUndefined: Self = StObject.set(x, "renderUnsafeAttributes", js.undefined)
    
    inline def setRenderUnsafeAttributesVarargs(value: String*): Self = StObject.set(x, "renderUnsafeAttributes", js.Array(value*))
  }
}
