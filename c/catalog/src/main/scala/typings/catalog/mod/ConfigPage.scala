package typings.catalog.mod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfigPage
  extends StObject
     with ConfigPageOrGroup {
  
  var content: js.UndefOr[ComponentType[js.Object]] = js.undefined
  
  var hideFromMenu: js.UndefOr[Boolean] = js.undefined
  
  var imports: js.UndefOr[StringDictionary[Any]] = js.undefined
  
  var path: String
  
  var scripts: js.UndefOr[js.Array[String]] = js.undefined
  
  var styles: js.UndefOr[js.Array[String]] = js.undefined
  
  var title: String
}
object ConfigPage {
  
  inline def apply(path: String, title: String): ConfigPage = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigPage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConfigPage] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ComponentType[js.Object]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setHideFromMenu(value: Boolean): Self = StObject.set(x, "hideFromMenu", value.asInstanceOf[js.Any])
    
    inline def setHideFromMenuUndefined: Self = StObject.set(x, "hideFromMenu", js.undefined)
    
    inline def setImports(value: StringDictionary[Any]): Self = StObject.set(x, "imports", value.asInstanceOf[js.Any])
    
    inline def setImportsUndefined: Self = StObject.set(x, "imports", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setScripts(value: js.Array[String]): Self = StObject.set(x, "scripts", value.asInstanceOf[js.Any])
    
    inline def setScriptsUndefined: Self = StObject.set(x, "scripts", js.undefined)
    
    inline def setScriptsVarargs(value: String*): Self = StObject.set(x, "scripts", js.Array(value*))
    
    inline def setStyles(value: js.Array[String]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    
    inline def setStylesVarargs(value: String*): Self = StObject.set(x, "styles", js.Array(value*))
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
