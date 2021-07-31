package typings.chrome.chrome.tabs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TabAttachInfo extends StObject {
  
  var newPosition: Double
  
  var newWindowId: Double
}
object TabAttachInfo {
  
  @scala.inline
  def apply(newPosition: Double, newWindowId: Double): TabAttachInfo = {
    val __obj = js.Dynamic.literal(newPosition = newPosition.asInstanceOf[js.Any], newWindowId = newWindowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabAttachInfo]
  }
  
  @scala.inline
  implicit class TabAttachInfoMutableBuilder[Self <: TabAttachInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNewPosition(value: Double): Self = StObject.set(x, "newPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewWindowId(value: Double): Self = StObject.set(x, "newWindowId", value.asInstanceOf[js.Any])
  }
}
