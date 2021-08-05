package typings.ckeditorCkeditor5Engine.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LeaveUnmerged extends StObject {
  
  var doNotResetEntireContent: js.UndefOr[Boolean] = js.undefined
  
  var leaveUnmerged: js.UndefOr[Boolean] = js.undefined
}
object LeaveUnmerged {
  
  inline def apply(): LeaveUnmerged = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LeaveUnmerged]
  }
  
  extension [Self <: LeaveUnmerged](x: Self) {
    
    inline def setDoNotResetEntireContent(value: Boolean): Self = StObject.set(x, "doNotResetEntireContent", value.asInstanceOf[js.Any])
    
    inline def setDoNotResetEntireContentUndefined: Self = StObject.set(x, "doNotResetEntireContent", js.undefined)
    
    inline def setLeaveUnmerged(value: Boolean): Self = StObject.set(x, "leaveUnmerged", value.asInstanceOf[js.Any])
    
    inline def setLeaveUnmergedUndefined: Self = StObject.set(x, "leaveUnmerged", js.undefined)
  }
}
