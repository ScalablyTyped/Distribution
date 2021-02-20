package typings.ckeditorCkeditor5Engine.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LeaveUnmerged extends StObject {
  
  var doNotResetEntireContent: js.UndefOr[Boolean] = js.native
  
  var leaveUnmerged: js.UndefOr[Boolean] = js.native
}
object LeaveUnmerged {
  
  @scala.inline
  def apply(): LeaveUnmerged = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LeaveUnmerged]
  }
  
  @scala.inline
  implicit class LeaveUnmergedMutableBuilder[Self <: LeaveUnmerged] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDoNotResetEntireContent(value: Boolean): Self = StObject.set(x, "doNotResetEntireContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoNotResetEntireContentUndefined: Self = StObject.set(x, "doNotResetEntireContent", js.undefined)
    
    @scala.inline
    def setLeaveUnmerged(value: Boolean): Self = StObject.set(x, "leaveUnmerged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeaveUnmergedUndefined: Self = StObject.set(x, "leaveUnmerged", js.undefined)
  }
}
