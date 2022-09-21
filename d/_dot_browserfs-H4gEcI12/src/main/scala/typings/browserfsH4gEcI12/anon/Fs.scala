package typings.browserfsH4gEcI12.anon

import typings.browserfsH4gEcI12.fileSystemDTsMod.FileSystem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Fs extends StObject {
  
  var fs: FileSystem
  
  var path: String
}
object Fs {
  
  inline def apply(fs: FileSystem, path: String): Fs = {
    val __obj = js.Dynamic.literal(fs = fs.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fs]
  }
  
  extension [Self <: Fs](x: Self) {
    
    inline def setFs(value: FileSystem): Self = StObject.set(x, "fs", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
