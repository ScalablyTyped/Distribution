package typings.chayns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// chayns.setSubTapp()
@js.native
trait SubTappConfig extends StObject {
  
  var boldText: js.UndefOr[Boolean] = js.native
  
  var buttonName: String = js.native
  
  var callbackURL: js.UndefOr[js.Function1[/* result */ js.Any, _]] = js.native
  
  var color: String = js.native
  
  var colorText: js.UndefOr[String] = js.native
  
  var icon: String = js.native
  
  var isExclusiveView: js.UndefOr[Boolean] = js.native
  
  var name: String = js.native
  
  var replaceParent: js.UndefOr[Boolean] = js.native
  
  var sortID: Double = js.native
  
  var tappID: Double = js.native
  
  var url: String = js.native
}
object SubTappConfig {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class SubTappConfigMutableBuilder[Self <: SubTappConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBoldText(value: Boolean): Self = StObject.set(x, "boldText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoldTextUndefined: Self = StObject.set(x, "boldText", js.undefined)
    
    @scala.inline
    def setButtonName(value: String): Self = StObject.set(x, "buttonName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallbackURL(value: /* result */ js.Any => _): Self = StObject.set(x, "callbackURL", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCallbackURLUndefined: Self = StObject.set(x, "callbackURL", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorText(value: String): Self = StObject.set(x, "colorText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorTextUndefined: Self = StObject.set(x, "colorText", js.undefined)
    
    @scala.inline
    def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsExclusiveView(value: Boolean): Self = StObject.set(x, "isExclusiveView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsExclusiveViewUndefined: Self = StObject.set(x, "isExclusiveView", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplaceParent(value: Boolean): Self = StObject.set(x, "replaceParent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplaceParentUndefined: Self = StObject.set(x, "replaceParent", js.undefined)
    
    @scala.inline
    def setSortID(value: Double): Self = StObject.set(x, "sortID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTappID(value: Double): Self = StObject.set(x, "tappID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
