package typings.chayns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DialogFacebookOptions extends StObject {
  
  var button: js.UndefOr[js.Array[DialogFacebookButton]] = js.undefined
  
  var message: js.UndefOr[String] = js.undefined
  
  var multiselect: js.UndefOr[Double] = js.undefined
  
  var preSelected: js.Array[Double]
  
  var quickfind: js.UndefOr[Double] = js.undefined
  
  var title: String
}
object DialogFacebookOptions {
  
  @scala.inline
  def apply(preSelected: js.Array[Double], title: String): DialogFacebookOptions = {
    val __obj = js.Dynamic.literal(preSelected = preSelected.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogFacebookOptions]
  }
  
  @scala.inline
  implicit class DialogFacebookOptionsMutableBuilder[Self <: DialogFacebookOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setButton(value: js.Array[DialogFacebookButton]): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonUndefined: Self = StObject.set(x, "button", js.undefined)
    
    @scala.inline
    def setButtonVarargs(value: DialogFacebookButton*): Self = StObject.set(x, "button", js.Array(value :_*))
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    @scala.inline
    def setMultiselect(value: Double): Self = StObject.set(x, "multiselect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiselectUndefined: Self = StObject.set(x, "multiselect", js.undefined)
    
    @scala.inline
    def setPreSelected(value: js.Array[Double]): Self = StObject.set(x, "preSelected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreSelectedVarargs(value: Double*): Self = StObject.set(x, "preSelected", js.Array(value :_*))
    
    @scala.inline
    def setQuickfind(value: Double): Self = StObject.set(x, "quickfind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuickfindUndefined: Self = StObject.set(x, "quickfind", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
