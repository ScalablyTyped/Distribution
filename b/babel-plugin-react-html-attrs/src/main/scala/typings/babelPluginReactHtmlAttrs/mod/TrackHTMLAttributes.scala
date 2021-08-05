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
  
  inline def apply[T](): TrackHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrackHTMLAttributes[T]]
  }
  
  extension [Self <: TrackHTMLAttributes[?], T](x: Self & TrackHTMLAttributes[T]) {
    
    inline def setDefault(value: Boolean | String): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    inline def setSrcLang(value: String): Self = StObject.set(x, "srcLang", value.asInstanceOf[js.Any])
    
    inline def setSrcLangUndefined: Self = StObject.set(x, "srcLang", js.undefined)
    
    inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
  }
}
