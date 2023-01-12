package typings.bullBoard.anon

import typings.bullBoard.distUiHooksUseDetailsTabsMod.TabsType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsActive extends StObject {
  
  var isActive: Boolean
  
  def selectTab(): Unit
  
  var title: TabsType
}
object IsActive {
  
  inline def apply(isActive: Boolean, selectTab: () => Unit, title: TabsType): IsActive = {
    val __obj = js.Dynamic.literal(isActive = isActive.asInstanceOf[js.Any], selectTab = js.Any.fromFunction0(selectTab), title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsActive]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IsActive] (val x: Self) extends AnyVal {
    
    inline def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
    
    inline def setSelectTab(value: () => Unit): Self = StObject.set(x, "selectTab", js.Any.fromFunction0(value))
    
    inline def setTitle(value: TabsType): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
