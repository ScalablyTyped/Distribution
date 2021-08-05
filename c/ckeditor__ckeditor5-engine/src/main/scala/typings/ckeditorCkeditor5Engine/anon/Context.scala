package typings.ckeditorCkeditor5Engine.anon

import typings.ckeditorCkeditor5Engine.mod.model.Node
import typings.ckeditorCkeditor5Engine.mod.model.SchemaContextDefinition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Context extends StObject {
  
  var context: js.UndefOr[SchemaContextDefinition] = js.undefined
  
  var lastRangeBackward: js.UndefOr[Boolean] = js.undefined
  
  var selectionAttributes: js.UndefOr[js.Array[js.Object]] = js.undefined
}
object Context {
  
  inline def apply(): Context = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Context]
  }
  
  extension [Self <: Context](x: Self) {
    
    inline def setContext(value: SchemaContextDefinition): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setContextVarargs(value: (String | Node)*): Self = StObject.set(x, "context", js.Array(value :_*))
    
    inline def setLastRangeBackward(value: Boolean): Self = StObject.set(x, "lastRangeBackward", value.asInstanceOf[js.Any])
    
    inline def setLastRangeBackwardUndefined: Self = StObject.set(x, "lastRangeBackward", js.undefined)
    
    inline def setSelectionAttributes(value: js.Array[js.Object]): Self = StObject.set(x, "selectionAttributes", value.asInstanceOf[js.Any])
    
    inline def setSelectionAttributesUndefined: Self = StObject.set(x, "selectionAttributes", js.undefined)
    
    inline def setSelectionAttributesVarargs(value: js.Object*): Self = StObject.set(x, "selectionAttributes", js.Array(value :_*))
  }
}
