package typings.chrome.chrome.tabs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TabHighlightInfo extends StObject {
  
  var tabIds: js.Array[Double] = js.native
  
  var windowId: Double = js.native
}
object TabHighlightInfo {
  
  @scala.inline
  def apply(tabIds: js.Array[Double], windowId: Double): TabHighlightInfo = {
    val __obj = js.Dynamic.literal(tabIds = tabIds.asInstanceOf[js.Any], windowId = windowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabHighlightInfo]
  }
  
  @scala.inline
  implicit class TabHighlightInfoMutableBuilder[Self <: TabHighlightInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTabIds(value: js.Array[Double]): Self = StObject.set(x, "tabIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabIdsVarargs(value: Double*): Self = StObject.set(x, "tabIds", js.Array(value :_*))
    
    @scala.inline
    def setWindowId(value: Double): Self = StObject.set(x, "windowId", value.asInstanceOf[js.Any])
  }
}
