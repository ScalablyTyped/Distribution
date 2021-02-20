package typings.chayns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// chayns.dialog.select()
@js.native
trait DialogSelectConfig extends StObject {
  
  var buttons: js.UndefOr[js.Array[_]] = js.native
  
  // TODO interface for buttons
  var list: js.Array[DialogSelectConfigItem] = js.native
  
  var message: js.UndefOr[String] = js.native
  
  var multiselect: js.UndefOr[Boolean] = js.native
  
  var quickfind: js.UndefOr[Boolean] = js.native
  
  var title: String = js.native
}
object DialogSelectConfig {
  
  @scala.inline
  def apply(list: js.Array[DialogSelectConfigItem], title: String): DialogSelectConfig = {
    val __obj = js.Dynamic.literal(list = list.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogSelectConfig]
  }
  
  @scala.inline
  implicit class DialogSelectConfigMutableBuilder[Self <: DialogSelectConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setButtons(value: js.Array[_]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
    
    @scala.inline
    def setButtonsVarargs(value: js.Any*): Self = StObject.set(x, "buttons", js.Array(value :_*))
    
    @scala.inline
    def setList(value: js.Array[DialogSelectConfigItem]): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListVarargs(value: DialogSelectConfigItem*): Self = StObject.set(x, "list", js.Array(value :_*))
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    @scala.inline
    def setMultiselect(value: Boolean): Self = StObject.set(x, "multiselect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiselectUndefined: Self = StObject.set(x, "multiselect", js.undefined)
    
    @scala.inline
    def setQuickfind(value: Boolean): Self = StObject.set(x, "quickfind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuickfindUndefined: Self = StObject.set(x, "quickfind", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
