package typings.ckeditor.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TabId extends StObject {
  
  var tabId: js.UndefOr[String] = js.native
}
object TabId {
  
  @scala.inline
  def apply(): TabId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TabId]
  }
  
  @scala.inline
  implicit class TabIdMutableBuilder[Self <: TabId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTabId(value: String): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabIdUndefined: Self = StObject.set(x, "tabId", js.undefined)
  }
}
