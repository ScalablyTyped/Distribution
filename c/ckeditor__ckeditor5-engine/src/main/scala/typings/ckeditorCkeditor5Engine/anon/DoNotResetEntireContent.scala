package typings.ckeditorCkeditor5Engine.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DoNotResetEntireContent extends StObject {
  
  var doNotResetEntireContent: Boolean
  
  var leaveUnmerged: Boolean
}
object DoNotResetEntireContent {
  
  inline def apply(doNotResetEntireContent: Boolean, leaveUnmerged: Boolean): DoNotResetEntireContent = {
    val __obj = js.Dynamic.literal(doNotResetEntireContent = doNotResetEntireContent.asInstanceOf[js.Any], leaveUnmerged = leaveUnmerged.asInstanceOf[js.Any])
    __obj.asInstanceOf[DoNotResetEntireContent]
  }
  
  extension [Self <: DoNotResetEntireContent](x: Self) {
    
    inline def setDoNotResetEntireContent(value: Boolean): Self = StObject.set(x, "doNotResetEntireContent", value.asInstanceOf[js.Any])
    
    inline def setLeaveUnmerged(value: Boolean): Self = StObject.set(x, "leaveUnmerged", value.asInstanceOf[js.Any])
  }
}
