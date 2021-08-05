package typings.ckeditor.CKEDITOR

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait pluginDefinition extends StObject {
  
  var afterInit: js.UndefOr[js.Function1[/* editor */ editor, js.Any]] = js.undefined
  
  var beforeInit: js.UndefOr[js.Function1[/* editor */ editor, js.Any]] = js.undefined
  
  var hidpi: js.UndefOr[Boolean] = js.undefined
  
  var init: js.UndefOr[js.Function1[/* editor */ editor, Unit]] = js.undefined
  
  var lang: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var onLoad: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
  var requires: js.UndefOr[String | js.Array[String]] = js.undefined
}
object pluginDefinition {
  
  inline def apply(): pluginDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[pluginDefinition]
  }
  
  extension [Self <: pluginDefinition](x: Self) {
    
    inline def setAfterInit(value: /* editor */ editor => js.Any): Self = StObject.set(x, "afterInit", js.Any.fromFunction1(value))
    
    inline def setAfterInitUndefined: Self = StObject.set(x, "afterInit", js.undefined)
    
    inline def setBeforeInit(value: /* editor */ editor => js.Any): Self = StObject.set(x, "beforeInit", js.Any.fromFunction1(value))
    
    inline def setBeforeInitUndefined: Self = StObject.set(x, "beforeInit", js.undefined)
    
    inline def setHidpi(value: Boolean): Self = StObject.set(x, "hidpi", value.asInstanceOf[js.Any])
    
    inline def setHidpiUndefined: Self = StObject.set(x, "hidpi", js.undefined)
    
    inline def setInit(value: /* editor */ editor => Unit): Self = StObject.set(x, "init", js.Any.fromFunction1(value))
    
    inline def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
    
    inline def setLang(value: String | js.Array[String]): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
    
    inline def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
    
    inline def setLangVarargs(value: String*): Self = StObject.set(x, "lang", js.Array(value :_*))
    
    inline def setOnLoad(value: () => js.Any): Self = StObject.set(x, "onLoad", js.Any.fromFunction0(value))
    
    inline def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
    
    inline def setRequires(value: String | js.Array[String]): Self = StObject.set(x, "requires", value.asInstanceOf[js.Any])
    
    inline def setRequiresUndefined: Self = StObject.set(x, "requires", js.undefined)
    
    inline def setRequiresVarargs(value: String*): Self = StObject.set(x, "requires", js.Array(value :_*))
  }
}
