package typings.webpackCdYQfbEx.webpackOptionsDTsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LibraryCustomUmdObject extends StObject {
  
  /**
  	 * Name of the exposed AMD library in the UMD
  	 */
  var amd: js.UndefOr[String] = js.undefined
  
  /**
  	 * Name of the exposed commonjs export in the UMD
  	 */
  var commonjs: js.UndefOr[String] = js.undefined
  
  /**
  	 * Name of the property exposed globally by a UMD library
  	 */
  var root: js.UndefOr[String | ArrayOfStringValues] = js.undefined
}
object LibraryCustomUmdObject {
  
  inline def apply(): LibraryCustomUmdObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LibraryCustomUmdObject]
  }
  
  extension [Self <: LibraryCustomUmdObject](x: Self) {
    
    inline def setAmd(value: String): Self = StObject.set(x, "amd", value.asInstanceOf[js.Any])
    
    inline def setAmdUndefined: Self = StObject.set(x, "amd", js.undefined)
    
    inline def setCommonjs(value: String): Self = StObject.set(x, "commonjs", value.asInstanceOf[js.Any])
    
    inline def setCommonjsUndefined: Self = StObject.set(x, "commonjs", js.undefined)
    
    inline def setRoot(value: String | ArrayOfStringValues): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    inline def setRootVarargs(value: String*): Self = StObject.set(x, "root", js.Array(value*))
  }
}
