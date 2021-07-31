package typings.ckeditor.CKEDITOR

import typings.ckeditor.CKEDITOR.filter.allowedContentRule
import typings.ckeditor.CKEDITOR.filter.allowedContentRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait feature extends StObject {
  
  var allowedContent: js.UndefOr[allowedContentRules] = js.undefined
  
  var contentForms: js.UndefOr[js.Any] = js.undefined
  
  var contentTransformations: js.UndefOr[js.Any] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var requiredContent: js.UndefOr[String | style] = js.undefined
  
  var toFeature: js.UndefOr[js.Function0[this.type]] = js.undefined
}
object feature {
  
  @scala.inline
  def apply(): feature = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[feature]
  }
  
  @scala.inline
  implicit class featureMutableBuilder[Self <: feature] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowedContent(value: allowedContentRules): Self = StObject.set(x, "allowedContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowedContentUndefined: Self = StObject.set(x, "allowedContent", js.undefined)
    
    @scala.inline
    def setAllowedContentVarargs(value: allowedContentRule*): Self = StObject.set(x, "allowedContent", js.Array(value :_*))
    
    @scala.inline
    def setContentForms(value: js.Any): Self = StObject.set(x, "contentForms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentFormsUndefined: Self = StObject.set(x, "contentForms", js.undefined)
    
    @scala.inline
    def setContentTransformations(value: js.Any): Self = StObject.set(x, "contentTransformations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentTransformationsUndefined: Self = StObject.set(x, "contentTransformations", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setRequiredContent(value: String | style): Self = StObject.set(x, "requiredContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredContentUndefined: Self = StObject.set(x, "requiredContent", js.undefined)
    
    @scala.inline
    def setToFeature(value: () => feature): Self = StObject.set(x, "toFeature", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToFeatureUndefined: Self = StObject.set(x, "toFeature", js.undefined)
  }
}
