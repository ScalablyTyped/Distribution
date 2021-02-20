package typings.ckeditorCkeditor5Engine.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DoNotResetEntireContent extends StObject {
  
  var doNotResetEntireContent: Boolean = js.native
  
  var leaveUnmerged: Boolean = js.native
}
object DoNotResetEntireContent {
  
  @scala.inline
  def apply(doNotResetEntireContent: Boolean, leaveUnmerged: Boolean): DoNotResetEntireContent = {
    val __obj = js.Dynamic.literal(doNotResetEntireContent = doNotResetEntireContent.asInstanceOf[js.Any], leaveUnmerged = leaveUnmerged.asInstanceOf[js.Any])
    __obj.asInstanceOf[DoNotResetEntireContent]
  }
  
  @scala.inline
  implicit class DoNotResetEntireContentMutableBuilder[Self <: DoNotResetEntireContent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDoNotResetEntireContent(value: Boolean): Self = StObject.set(x, "doNotResetEntireContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeaveUnmerged(value: Boolean): Self = StObject.set(x, "leaveUnmerged", value.asInstanceOf[js.Any])
  }
}
