package typings.catalog.mod

import org.scalablytyped.runtime.StringDictionary
import typings.catalog.anon.PartialTheme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Config extends StObject {
  
  var basePath: js.UndefOr[String] = js.undefined
  
  var imports: js.UndefOr[StringDictionary[Any]] = js.undefined
  
  var logoSrc: js.UndefOr[String] = js.undefined
  
  var pages: js.Array[ConfigPageOrGroup]
  
  var responsiveSizes: js.UndefOr[js.Array[ConfigResponsiveSize]] = js.undefined
  
  var scripts: js.UndefOr[js.Array[String]] = js.undefined
  
  var styles: js.UndefOr[js.Array[String]] = js.undefined
  
  var theme: js.UndefOr[PartialTheme] = js.undefined
  
  var title: String
  
  var useBrowserHistory: js.UndefOr[Boolean] = js.undefined
}
object Config {
  
  inline def apply(pages: js.Array[ConfigPageOrGroup], title: String): Config = {
    val __obj = js.Dynamic.literal(pages = pages.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
    
    inline def setBasePath(value: String): Self = StObject.set(x, "basePath", value.asInstanceOf[js.Any])
    
    inline def setBasePathUndefined: Self = StObject.set(x, "basePath", js.undefined)
    
    inline def setImports(value: StringDictionary[Any]): Self = StObject.set(x, "imports", value.asInstanceOf[js.Any])
    
    inline def setImportsUndefined: Self = StObject.set(x, "imports", js.undefined)
    
    inline def setLogoSrc(value: String): Self = StObject.set(x, "logoSrc", value.asInstanceOf[js.Any])
    
    inline def setLogoSrcUndefined: Self = StObject.set(x, "logoSrc", js.undefined)
    
    inline def setPages(value: js.Array[ConfigPageOrGroup]): Self = StObject.set(x, "pages", value.asInstanceOf[js.Any])
    
    inline def setPagesVarargs(value: ConfigPageOrGroup*): Self = StObject.set(x, "pages", js.Array(value*))
    
    inline def setResponsiveSizes(value: js.Array[ConfigResponsiveSize]): Self = StObject.set(x, "responsiveSizes", value.asInstanceOf[js.Any])
    
    inline def setResponsiveSizesUndefined: Self = StObject.set(x, "responsiveSizes", js.undefined)
    
    inline def setResponsiveSizesVarargs(value: ConfigResponsiveSize*): Self = StObject.set(x, "responsiveSizes", js.Array(value*))
    
    inline def setScripts(value: js.Array[String]): Self = StObject.set(x, "scripts", value.asInstanceOf[js.Any])
    
    inline def setScriptsUndefined: Self = StObject.set(x, "scripts", js.undefined)
    
    inline def setScriptsVarargs(value: String*): Self = StObject.set(x, "scripts", js.Array(value*))
    
    inline def setStyles(value: js.Array[String]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    
    inline def setStylesVarargs(value: String*): Self = StObject.set(x, "styles", js.Array(value*))
    
    inline def setTheme(value: PartialTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setUseBrowserHistory(value: Boolean): Self = StObject.set(x, "useBrowserHistory", value.asInstanceOf[js.Any])
    
    inline def setUseBrowserHistoryUndefined: Self = StObject.set(x, "useBrowserHistory", js.undefined)
  }
}
