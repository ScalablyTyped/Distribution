package typings.blueprintjsCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SelectedTabId extends StObject {
  
  var selectedTabId: String | Double = js.native
}
object SelectedTabId {
  
  @scala.inline
  def apply(selectedTabId: String | Double): SelectedTabId = {
    val __obj = js.Dynamic.literal(selectedTabId = selectedTabId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectedTabId]
  }
  
  @scala.inline
  implicit class SelectedTabIdMutableBuilder[Self <: SelectedTabId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSelectedTabId(value: String | Double): Self = StObject.set(x, "selectedTabId", value.asInstanceOf[js.Any])
  }
}
