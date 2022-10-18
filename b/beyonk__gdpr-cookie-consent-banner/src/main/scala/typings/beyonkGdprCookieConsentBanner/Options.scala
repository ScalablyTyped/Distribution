package typings.beyonkGdprCookieConsentBanner

import typings.beyonkGdprCookieConsentBanner.anon.Domain
import typings.beyonkGdprCookieConsentBanner.anon.PartialRecordCategoryChoi
import typings.beyonkGdprCookieConsentBanner.anon.PartialRecordCategoryvoid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Options extends StObject {
  
  var acceptLabel: js.UndefOr[String] = js.undefined
  
  var categories: js.UndefOr[PartialRecordCategoryvoid] = js.undefined
  
  var choices: js.UndefOr[PartialRecordCategoryChoi] = js.undefined
  
  var closeLabel: js.UndefOr[String] = js.undefined
  
  var cookieConfig: js.UndefOr[Domain] = js.undefined
  
  var cookieName: js.UndefOr[String] = js.undefined
  
  var description: js.UndefOr[String] = js.undefined
  
  var heading: js.UndefOr[String] = js.undefined
  
  var rejectLabel: js.UndefOr[String] = js.undefined
  
  var settingsLabel: js.UndefOr[String] = js.undefined
  
  var showEditIcon: js.UndefOr[Boolean] = js.undefined
}
object Options {
  
  inline def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  extension [Self <: Options](x: Self) {
    
    inline def setAcceptLabel(value: String): Self = StObject.set(x, "acceptLabel", value.asInstanceOf[js.Any])
    
    inline def setAcceptLabelUndefined: Self = StObject.set(x, "acceptLabel", js.undefined)
    
    inline def setCategories(value: PartialRecordCategoryvoid): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
    
    inline def setCategoriesUndefined: Self = StObject.set(x, "categories", js.undefined)
    
    inline def setChoices(value: PartialRecordCategoryChoi): Self = StObject.set(x, "choices", value.asInstanceOf[js.Any])
    
    inline def setChoicesUndefined: Self = StObject.set(x, "choices", js.undefined)
    
    inline def setCloseLabel(value: String): Self = StObject.set(x, "closeLabel", value.asInstanceOf[js.Any])
    
    inline def setCloseLabelUndefined: Self = StObject.set(x, "closeLabel", js.undefined)
    
    inline def setCookieConfig(value: Domain): Self = StObject.set(x, "cookieConfig", value.asInstanceOf[js.Any])
    
    inline def setCookieConfigUndefined: Self = StObject.set(x, "cookieConfig", js.undefined)
    
    inline def setCookieName(value: String): Self = StObject.set(x, "cookieName", value.asInstanceOf[js.Any])
    
    inline def setCookieNameUndefined: Self = StObject.set(x, "cookieName", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setHeading(value: String): Self = StObject.set(x, "heading", value.asInstanceOf[js.Any])
    
    inline def setHeadingUndefined: Self = StObject.set(x, "heading", js.undefined)
    
    inline def setRejectLabel(value: String): Self = StObject.set(x, "rejectLabel", value.asInstanceOf[js.Any])
    
    inline def setRejectLabelUndefined: Self = StObject.set(x, "rejectLabel", js.undefined)
    
    inline def setSettingsLabel(value: String): Self = StObject.set(x, "settingsLabel", value.asInstanceOf[js.Any])
    
    inline def setSettingsLabelUndefined: Self = StObject.set(x, "settingsLabel", js.undefined)
    
    inline def setShowEditIcon(value: Boolean): Self = StObject.set(x, "showEditIcon", value.asInstanceOf[js.Any])
    
    inline def setShowEditIconUndefined: Self = StObject.set(x, "showEditIcon", js.undefined)
  }
}
