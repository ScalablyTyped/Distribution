package typings.cordovaPluginFile

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This interface represents a file system. */
trait FileSystem extends StObject {
  
  /* The name of the file system, unique across the list of exposed file systems. */
  var name: String
  
  /** The root directory of the file system. */
  var root: DirectoryEntry
}
object FileSystem {
  
  @scala.inline
  def apply(name: String, root: DirectoryEntry): FileSystem = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileSystem]
  }
  
  @scala.inline
  implicit class FileSystemMutableBuilder[Self <: FileSystem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoot(value: DirectoryEntry): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
  }
}
