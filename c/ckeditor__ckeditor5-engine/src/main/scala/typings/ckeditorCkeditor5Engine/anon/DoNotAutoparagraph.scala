package typings.ckeditorCkeditor5Engine.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DoNotAutoparagraph extends StObject {
  
  var doNotAutoparagraph: js.UndefOr[Boolean] = js.undefined
  
  var doNotResetEntireContent: js.UndefOr[Boolean] = js.undefined
  
  var leaveUnmerged: js.UndefOr[Boolean] = js.undefined
}
object DoNotAutoparagraph {
  
  inline def apply(): DoNotAutoparagraph = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DoNotAutoparagraph]
  }
  
  extension [Self <: DoNotAutoparagraph](x: Self) {
    
    inline def setDoNotAutoparagraph(value: Boolean): Self = StObject.set(x, "doNotAutoparagraph", value.asInstanceOf[js.Any])
    
    inline def setDoNotAutoparagraphUndefined: Self = StObject.set(x, "doNotAutoparagraph", js.undefined)
    
    inline def setDoNotResetEntireContent(value: Boolean): Self = StObject.set(x, "doNotResetEntireContent", value.asInstanceOf[js.Any])
    
    inline def setDoNotResetEntireContentUndefined: Self = StObject.set(x, "doNotResetEntireContent", js.undefined)
    
    inline def setLeaveUnmerged(value: Boolean): Self = StObject.set(x, "leaveUnmerged", value.asInstanceOf[js.Any])
    
    inline def setLeaveUnmergedUndefined: Self = StObject.set(x, "leaveUnmerged", js.undefined)
  }
}
