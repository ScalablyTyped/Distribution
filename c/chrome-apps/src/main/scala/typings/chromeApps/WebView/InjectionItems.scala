package typings.chromeApps.WebView

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The type of injection item: code or a set of files. */
trait InjectionItems extends StObject {
  
  /** JavaScript code or CSS to be injected into matching pages. */
  var code: js.UndefOr[String] = js.undefined
  
  /**
    * The list of JavaScript or CSS files to be injected into matching pages.
    * These are injected in the order they appear in this array.
    */
  var files: js.UndefOr[js.Array[js.Any]] = js.undefined
}
object InjectionItems {
  
  inline def apply(): InjectionItems = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InjectionItems]
  }
  
  extension [Self <: InjectionItems](x: Self) {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setFiles(value: js.Array[js.Any]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
    
    inline def setFilesVarargs(value: js.Any*): Self = StObject.set(x, "files", js.Array(value :_*))
  }
}
