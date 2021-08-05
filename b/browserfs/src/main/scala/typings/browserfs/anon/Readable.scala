package typings.browserfs.anon

import typings.browserfs.fileSystemMod.FileSystem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Readable extends StObject {
  
  var readable: FileSystem
  
  var writable: FileSystem
}
object Readable {
  
  inline def apply(readable: FileSystem, writable: FileSystem): Readable = {
    val __obj = js.Dynamic.literal(readable = readable.asInstanceOf[js.Any], writable = writable.asInstanceOf[js.Any])
    __obj.asInstanceOf[Readable]
  }
  
  extension [Self <: Readable](x: Self) {
    
    inline def setReadable(value: FileSystem): Self = StObject.set(x, "readable", value.asInstanceOf[js.Any])
    
    inline def setWritable(value: FileSystem): Self = StObject.set(x, "writable", value.asInstanceOf[js.Any])
  }
}
