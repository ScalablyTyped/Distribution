package typings.ckeditorCkeditor5Engine.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RenderUnsafeAttributes extends StObject {
  
  var id: js.UndefOr[String] = js.undefined
  
  var priority: js.UndefOr[Double] = js.undefined
  
  var renderUnsafeAttributes: js.UndefOr[js.Array[String]] = js.undefined
}
object RenderUnsafeAttributes {
  
  inline def apply(): RenderUnsafeAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RenderUnsafeAttributes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RenderUnsafeAttributes] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setRenderUnsafeAttributes(value: js.Array[String]): Self = StObject.set(x, "renderUnsafeAttributes", value.asInstanceOf[js.Any])
    
    inline def setRenderUnsafeAttributesUndefined: Self = StObject.set(x, "renderUnsafeAttributes", js.undefined)
    
    inline def setRenderUnsafeAttributesVarargs(value: String*): Self = StObject.set(x, "renderUnsafeAttributes", js.Array(value*))
  }
}
