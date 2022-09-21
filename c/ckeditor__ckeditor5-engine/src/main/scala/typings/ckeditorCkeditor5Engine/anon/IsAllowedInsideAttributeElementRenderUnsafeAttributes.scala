package typings.ckeditorCkeditor5Engine.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsAllowedInsideAttributeElementRenderUnsafeAttributes extends StObject {
  
  var isAllowedInsideAttributeElement: js.UndefOr[Boolean] = js.undefined
  
  var renderUnsafeAttributes: js.UndefOr[js.Array[String]] = js.undefined
}
object IsAllowedInsideAttributeElementRenderUnsafeAttributes {
  
  inline def apply(): IsAllowedInsideAttributeElementRenderUnsafeAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsAllowedInsideAttributeElementRenderUnsafeAttributes]
  }
  
  extension [Self <: IsAllowedInsideAttributeElementRenderUnsafeAttributes](x: Self) {
    
    inline def setIsAllowedInsideAttributeElement(value: Boolean): Self = StObject.set(x, "isAllowedInsideAttributeElement", value.asInstanceOf[js.Any])
    
    inline def setIsAllowedInsideAttributeElementUndefined: Self = StObject.set(x, "isAllowedInsideAttributeElement", js.undefined)
    
    inline def setRenderUnsafeAttributes(value: js.Array[String]): Self = StObject.set(x, "renderUnsafeAttributes", value.asInstanceOf[js.Any])
    
    inline def setRenderUnsafeAttributesUndefined: Self = StObject.set(x, "renderUnsafeAttributes", js.undefined)
    
    inline def setRenderUnsafeAttributesVarargs(value: String*): Self = StObject.set(x, "renderUnsafeAttributes", js.Array(value*))
  }
}
