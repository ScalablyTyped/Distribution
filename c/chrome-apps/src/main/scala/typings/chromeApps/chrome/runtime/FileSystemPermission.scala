package typings.chromeApps.chrome.runtime

import typings.chromeApps.chromeAppsStrings.directory
import typings.chromeApps.chromeAppsStrings.requestFileSystem
import typings.chromeApps.chromeAppsStrings.retainEntries
import typings.chromeApps.chromeAppsStrings.write_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileSystemPermission
  extends StObject
     with ChromeOSOnlyPermissions {
  
  /**
    * @requires 'requestFileSystem' is only for ChromeOS
    */
  var fileSystem: js.Array[write_ | retainEntries | directory | requestFileSystem]
}
object FileSystemPermission {
  
  inline def apply(fileSystem: js.Array[write_ | retainEntries | directory | requestFileSystem]): FileSystemPermission = {
    val __obj = js.Dynamic.literal(fileSystem = fileSystem.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileSystemPermission]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FileSystemPermission] (val x: Self) extends AnyVal {
    
    inline def setFileSystem(value: js.Array[write_ | retainEntries | directory | requestFileSystem]): Self = StObject.set(x, "fileSystem", value.asInstanceOf[js.Any])
    
    inline def setFileSystemVarargs(value: (write_ | retainEntries | directory | requestFileSystem)*): Self = StObject.set(x, "fileSystem", js.Array(value*))
  }
}
