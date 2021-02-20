package typings.datatablesNetButtons.DataTables

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ButtonDomSettings extends StObject {
  
  var button: js.UndefOr[ButtonDomButtomButton] = js.native
  
  var buttonContainer: js.UndefOr[ButtonDomButtomCommon] = js.native
  
  var buttonLiner: js.UndefOr[ButtonDomButtomCommon] = js.native
  
  var collection: js.UndefOr[ButtonDomButtomCommon] = js.native
  
  var container: js.UndefOr[ButtonDomButtomCommon] = js.native
}
object ButtonDomSettings {
  
  @scala.inline
  def apply(): ButtonDomSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ButtonDomSettings]
  }
  
  @scala.inline
  implicit class ButtonDomSettingsMutableBuilder[Self <: ButtonDomSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setButton(value: ButtonDomButtomButton): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonContainer(value: ButtonDomButtomCommon): Self = StObject.set(x, "buttonContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonContainerUndefined: Self = StObject.set(x, "buttonContainer", js.undefined)
    
    @scala.inline
    def setButtonLiner(value: ButtonDomButtomCommon): Self = StObject.set(x, "buttonLiner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonLinerUndefined: Self = StObject.set(x, "buttonLiner", js.undefined)
    
    @scala.inline
    def setButtonUndefined: Self = StObject.set(x, "button", js.undefined)
    
    @scala.inline
    def setCollection(value: ButtonDomButtomCommon): Self = StObject.set(x, "collection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollectionUndefined: Self = StObject.set(x, "collection", js.undefined)
    
    @scala.inline
    def setContainer(value: ButtonDomButtomCommon): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
  }
}
