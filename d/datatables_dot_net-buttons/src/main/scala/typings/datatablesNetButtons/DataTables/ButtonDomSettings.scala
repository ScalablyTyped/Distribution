package typings.datatablesNetButtons.DataTables

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ButtonDomSettings extends StObject {
  
  var button: js.UndefOr[ButtonDomButtomButton] = js.undefined
  
  var buttonContainer: js.UndefOr[ButtonDomButtomCommon] = js.undefined
  
  var buttonLiner: js.UndefOr[ButtonDomButtomCommon] = js.undefined
  
  var collection: js.UndefOr[ButtonDomButtomCommon] = js.undefined
  
  var container: js.UndefOr[ButtonDomButtomCommon] = js.undefined
}
object ButtonDomSettings {
  
  inline def apply(): ButtonDomSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ButtonDomSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ButtonDomSettings] (val x: Self) extends AnyVal {
    
    inline def setButton(value: ButtonDomButtomButton): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
    
    inline def setButtonContainer(value: ButtonDomButtomCommon): Self = StObject.set(x, "buttonContainer", value.asInstanceOf[js.Any])
    
    inline def setButtonContainerUndefined: Self = StObject.set(x, "buttonContainer", js.undefined)
    
    inline def setButtonLiner(value: ButtonDomButtomCommon): Self = StObject.set(x, "buttonLiner", value.asInstanceOf[js.Any])
    
    inline def setButtonLinerUndefined: Self = StObject.set(x, "buttonLiner", js.undefined)
    
    inline def setButtonUndefined: Self = StObject.set(x, "button", js.undefined)
    
    inline def setCollection(value: ButtonDomButtomCommon): Self = StObject.set(x, "collection", value.asInstanceOf[js.Any])
    
    inline def setCollectionUndefined: Self = StObject.set(x, "collection", js.undefined)
    
    inline def setContainer(value: ButtonDomButtomCommon): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
  }
}
