package typings.babelPluginReactHtmlAttrs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TrackHTMLAttributes[T]
  extends StObject
     with HTMLAttributes[T] {
  
  var default: js.UndefOr[Boolean | String] = js.undefined
  
  var kind: js.UndefOr[String] = js.undefined
  
  var label: js.UndefOr[String] = js.undefined
  
  var src: js.UndefOr[String] = js.undefined
  
  var srcLang: js.UndefOr[String] = js.undefined
  
  var srclang: js.UndefOr[String] = js.undefined
}
object TrackHTMLAttributes {
  
  @scala.inline
  def apply[T](): TrackHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrackHTMLAttributes[T]]
  }
  
  @scala.inline
  implicit class TrackHTMLAttributesMutableBuilder[Self <: TrackHTMLAttributes[?], T] (val x: Self & TrackHTMLAttributes[T]) extends AnyVal {
    
    @scala.inline
    def setDefault(value: Boolean | String): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrcLang(value: String): Self = StObject.set(x, "srcLang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrcLangUndefined: Self = StObject.set(x, "srcLang", js.undefined)
    
    @scala.inline
    def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
  }
}
