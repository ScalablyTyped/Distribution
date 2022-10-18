package typings.dcpClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoadOptions extends StObject {
  
  /**
    * Override paths.
    */
  var dir: js.UndefOr[String] = js.undefined
  
  /**
    * The keystore filename.
    */
  var filename: js.UndefOr[String] = js.undefined
  
  /**
    * The keystore label or filename.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    *  Override the default keystore directory search path (Node.js Only). This must be a complete pathname.
    */
  var paths: js.UndefOr[js.Array[String] | String] = js.undefined
}
object LoadOptions {
  
  inline def apply(): LoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadOptions]
  }
  
  extension [Self <: LoadOptions](x: Self) {
    
    inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
    
    inline def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
    
    inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPaths(value: js.Array[String] | String): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
    
    inline def setPathsUndefined: Self = StObject.set(x, "paths", js.undefined)
    
    inline def setPathsVarargs(value: String*): Self = StObject.set(x, "paths", js.Array(value*))
  }
}
