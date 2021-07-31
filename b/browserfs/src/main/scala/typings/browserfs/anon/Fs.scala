package typings.browserfs.anon

import typings.browserfs.fileSystemMod.FileSystem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Fs extends StObject {
  
  var fs: FileSystem
  
  var path: String
}
object Fs {
  
  @scala.inline
  def apply(fs: FileSystem, path: String): Fs = {
    val __obj = js.Dynamic.literal(fs = fs.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fs]
  }
  
  @scala.inline
  implicit class FsMutableBuilder[Self <: Fs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFs(value: FileSystem): Self = StObject.set(x, "fs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
