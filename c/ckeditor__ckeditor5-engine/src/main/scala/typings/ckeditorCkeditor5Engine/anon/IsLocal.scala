package typings.ckeditorCkeditor5Engine.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsLocal extends StObject {
  
  var isLocal: js.UndefOr[Boolean] = js.undefined
  
  var isTyping: js.UndefOr[Boolean] = js.undefined
  
  var isUndo: js.UndefOr[Boolean] = js.undefined
  
  var isUndoable: js.UndefOr[Boolean] = js.undefined
}
object IsLocal {
  
  inline def apply(): IsLocal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsLocal]
  }
  
  extension [Self <: IsLocal](x: Self) {
    
    inline def setIsLocal(value: Boolean): Self = StObject.set(x, "isLocal", value.asInstanceOf[js.Any])
    
    inline def setIsLocalUndefined: Self = StObject.set(x, "isLocal", js.undefined)
    
    inline def setIsTyping(value: Boolean): Self = StObject.set(x, "isTyping", value.asInstanceOf[js.Any])
    
    inline def setIsTypingUndefined: Self = StObject.set(x, "isTyping", js.undefined)
    
    inline def setIsUndo(value: Boolean): Self = StObject.set(x, "isUndo", value.asInstanceOf[js.Any])
    
    inline def setIsUndoUndefined: Self = StObject.set(x, "isUndo", js.undefined)
    
    inline def setIsUndoable(value: Boolean): Self = StObject.set(x, "isUndoable", value.asInstanceOf[js.Any])
    
    inline def setIsUndoableUndefined: Self = StObject.set(x, "isUndoable", js.undefined)
  }
}
