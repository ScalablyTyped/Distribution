package typings.ckeditorCkeditor5Engine.anon

import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.backward
import typings.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.forward
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Direction extends StObject {
  
  var direction: js.UndefOr[forward | backward] = js.undefined
  
  var doNotAutoparagraph: js.UndefOr[Boolean] = js.undefined
  
  var doNotResetEntireContent: js.UndefOr[Boolean] = js.undefined
  
  var leaveUnmerged: js.UndefOr[Boolean] = js.undefined
}
object Direction {
  
  inline def apply(): Direction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Direction]
  }
  
  extension [Self <: Direction](x: Self) {
    
    inline def setDirection(value: forward | backward): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setDoNotAutoparagraph(value: Boolean): Self = StObject.set(x, "doNotAutoparagraph", value.asInstanceOf[js.Any])
    
    inline def setDoNotAutoparagraphUndefined: Self = StObject.set(x, "doNotAutoparagraph", js.undefined)
    
    inline def setDoNotResetEntireContent(value: Boolean): Self = StObject.set(x, "doNotResetEntireContent", value.asInstanceOf[js.Any])
    
    inline def setDoNotResetEntireContentUndefined: Self = StObject.set(x, "doNotResetEntireContent", js.undefined)
    
    inline def setLeaveUnmerged(value: Boolean): Self = StObject.set(x, "leaveUnmerged", value.asInstanceOf[js.Any])
    
    inline def setLeaveUnmergedUndefined: Self = StObject.set(x, "leaveUnmerged", js.undefined)
  }
}
