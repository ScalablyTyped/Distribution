package typings.chromeApps.anon

import typings.chromeApps.chromeAppsStrings.openDirectory
import typings.chromeApps.chromeAppsStrings.openFile
import typings.chromeApps.chromeAppsStrings.openWritableFile
import typings.chromeApps.chromeAppsStrings.saveFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OPENDIRECTORY extends StObject {
  
  var OPEN_DIRECTORY: openDirectory = js.native
  
  var OPEN_FILE: openFile = js.native
  
  var OPEN_WRITABLE_FILE: openWritableFile = js.native
  
  var SAVE_FILE: saveFile = js.native
}
object OPENDIRECTORY {
  
  @scala.inline
  def apply(
    OPEN_DIRECTORY: openDirectory,
    OPEN_FILE: openFile,
    OPEN_WRITABLE_FILE: openWritableFile,
    SAVE_FILE: saveFile
  ): OPENDIRECTORY = {
    val __obj = js.Dynamic.literal(OPEN_DIRECTORY = OPEN_DIRECTORY.asInstanceOf[js.Any], OPEN_FILE = OPEN_FILE.asInstanceOf[js.Any], OPEN_WRITABLE_FILE = OPEN_WRITABLE_FILE.asInstanceOf[js.Any], SAVE_FILE = SAVE_FILE.asInstanceOf[js.Any])
    __obj.asInstanceOf[OPENDIRECTORY]
  }
  
  @scala.inline
  implicit class OPENDIRECTORYMutableBuilder[Self <: OPENDIRECTORY] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOPEN_DIRECTORY(value: openDirectory): Self = StObject.set(x, "OPEN_DIRECTORY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOPEN_FILE(value: openFile): Self = StObject.set(x, "OPEN_FILE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOPEN_WRITABLE_FILE(value: openWritableFile): Self = StObject.set(x, "OPEN_WRITABLE_FILE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSAVE_FILE(value: saveFile): Self = StObject.set(x, "SAVE_FILE", value.asInstanceOf[js.Any])
  }
}
