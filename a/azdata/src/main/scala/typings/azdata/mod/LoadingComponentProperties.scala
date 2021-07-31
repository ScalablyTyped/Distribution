package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoadingComponentProperties extends StObject {
  
  var loading: js.UndefOr[Boolean] = js.undefined
  
  var loadingCompletedText: js.UndefOr[String] = js.undefined
  
  var loadingText: js.UndefOr[String] = js.undefined
  
  var showText: js.UndefOr[Boolean] = js.undefined
}
object LoadingComponentProperties {
  
  @scala.inline
  def apply(): LoadingComponentProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadingComponentProperties]
  }
  
  @scala.inline
  implicit class LoadingComponentPropertiesMutableBuilder[Self <: LoadingComponentProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadingCompletedText(value: String): Self = StObject.set(x, "loadingCompletedText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadingCompletedTextUndefined: Self = StObject.set(x, "loadingCompletedText", js.undefined)
    
    @scala.inline
    def setLoadingText(value: String): Self = StObject.set(x, "loadingText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadingTextUndefined: Self = StObject.set(x, "loadingText", js.undefined)
    
    @scala.inline
    def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
    
    @scala.inline
    def setShowText(value: Boolean): Self = StObject.set(x, "showText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowTextUndefined: Self = StObject.set(x, "showText", js.undefined)
  }
}
