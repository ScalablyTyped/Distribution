package typings.chayns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// chayns.setSubTapp()
trait SubTappConfig extends StObject {
  
  var boldText: js.UndefOr[Boolean] = js.undefined
  
  var buttonName: String
  
  var callbackURL: js.UndefOr[js.Function1[/* result */ js.Any, js.Any]] = js.undefined
  
  var color: String
  
  var colorText: js.UndefOr[String] = js.undefined
  
  var icon: String
  
  var isExclusiveView: js.UndefOr[Boolean] = js.undefined
  
  var name: String
  
  var replaceParent: js.UndefOr[Boolean] = js.undefined
  
  var sortID: Double
  
  var tappID: Double
  
  var url: String
}
object SubTappConfig {
  
  inline def apply(
    buttonName: String,
    color: String,
    icon: String,
    name: String,
    sortID: Double,
    tappID: Double,
    url: String
  ): SubTappConfig = {
    val __obj = js.Dynamic.literal(buttonName = buttonName.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], sortID = sortID.asInstanceOf[js.Any], tappID = tappID.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubTappConfig]
  }
  
  extension [Self <: SubTappConfig](x: Self) {
    
    inline def setBoldText(value: Boolean): Self = StObject.set(x, "boldText", value.asInstanceOf[js.Any])
    
    inline def setBoldTextUndefined: Self = StObject.set(x, "boldText", js.undefined)
    
    inline def setButtonName(value: String): Self = StObject.set(x, "buttonName", value.asInstanceOf[js.Any])
    
    inline def setCallbackURL(value: /* result */ js.Any => js.Any): Self = StObject.set(x, "callbackURL", js.Any.fromFunction1(value))
    
    inline def setCallbackURLUndefined: Self = StObject.set(x, "callbackURL", js.undefined)
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorText(value: String): Self = StObject.set(x, "colorText", value.asInstanceOf[js.Any])
    
    inline def setColorTextUndefined: Self = StObject.set(x, "colorText", js.undefined)
    
    inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIsExclusiveView(value: Boolean): Self = StObject.set(x, "isExclusiveView", value.asInstanceOf[js.Any])
    
    inline def setIsExclusiveViewUndefined: Self = StObject.set(x, "isExclusiveView", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setReplaceParent(value: Boolean): Self = StObject.set(x, "replaceParent", value.asInstanceOf[js.Any])
    
    inline def setReplaceParentUndefined: Self = StObject.set(x, "replaceParent", js.undefined)
    
    inline def setSortID(value: Double): Self = StObject.set(x, "sortID", value.asInstanceOf[js.Any])
    
    inline def setTappID(value: Double): Self = StObject.set(x, "tappID", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
