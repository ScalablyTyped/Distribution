package typings.ckeditor4.CKEDITOR

import typings.ckeditor4.CKEDITOR.filter.allowedContentRule
import typings.ckeditor4.CKEDITOR.filter.allowedContentRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait feature extends StObject {
  
  var allowedContent: js.UndefOr[allowedContentRules] = js.undefined
  
  var contentForms: js.UndefOr[Any] = js.undefined
  
  var contentTransformations: js.UndefOr[Any] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var requiredContent: js.UndefOr[String | style] = js.undefined
  
  var toFeature: js.UndefOr[js.Function0[this.type]] = js.undefined
}
object feature {
  
  inline def apply(): feature = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[feature]
  }
  
  extension [Self <: feature](x: Self) {
    
    inline def setAllowedContent(value: allowedContentRules): Self = StObject.set(x, "allowedContent", value.asInstanceOf[js.Any])
    
    inline def setAllowedContentUndefined: Self = StObject.set(x, "allowedContent", js.undefined)
    
    inline def setAllowedContentVarargs(value: allowedContentRule*): Self = StObject.set(x, "allowedContent", js.Array(value*))
    
    inline def setContentForms(value: Any): Self = StObject.set(x, "contentForms", value.asInstanceOf[js.Any])
    
    inline def setContentFormsUndefined: Self = StObject.set(x, "contentForms", js.undefined)
    
    inline def setContentTransformations(value: Any): Self = StObject.set(x, "contentTransformations", value.asInstanceOf[js.Any])
    
    inline def setContentTransformationsUndefined: Self = StObject.set(x, "contentTransformations", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequiredContent(value: String | style): Self = StObject.set(x, "requiredContent", value.asInstanceOf[js.Any])
    
    inline def setRequiredContentUndefined: Self = StObject.set(x, "requiredContent", js.undefined)
    
    inline def setToFeature(value: () => feature): Self = StObject.set(x, "toFeature", js.Any.fromFunction0(value))
    
    inline def setToFeatureUndefined: Self = StObject.set(x, "toFeature", js.undefined)
  }
}
