package typings.chromeApps.chrome.fileSystem

import typings.chromeApps.chromeAppsBooleans.`true`
import typings.chromeApps.chromeAppsStrings.openDirectory
import typings.chromeApps.chromeAppsStrings.openFile
import typings.chromeApps.chromeAppsStrings.openWritableFile
import typings.chromeApps.chromeAppsStrings.saveFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.chromeApps.chrome.fileSystem.ChooseFileEntryOptions
  - typings.chromeApps.chrome.fileSystem.ChooseSaveFileEntryOptions
  - typings.chromeApps.chrome.fileSystem.ChooseMultipleFilesEntryOptions
  - typings.chromeApps.chrome.fileSystem.ChooseDirectoryEntryOptions
  - typings.chromeApps.chrome.fileSystem.ChooseEntryOptionsBase
*/
trait ChooseEntryOptions extends js.Object
object ChooseEntryOptions {
  
  @scala.inline
  def ChooseMultipleFilesEntryOptions(acceptsMultiple: `true`, `type`: openFile | openWritableFile): ChooseEntryOptions = {
    val __obj = js.Dynamic.literal(acceptsMultiple = acceptsMultiple.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChooseEntryOptions]
  }
  
  @scala.inline
  def ChooseSaveFileEntryOptions(`type`: saveFile): ChooseEntryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChooseEntryOptions]
  }
  
  @scala.inline
  def ChooseDirectoryEntryOptions(`type`: openDirectory): ChooseEntryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChooseEntryOptions]
  }
  
  @scala.inline
  def ChooseEntryOptionsBase(): ChooseEntryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChooseEntryOptions]
  }
  
  @scala.inline
  def ChooseFileEntryOptions(`type`: openFile | openWritableFile): ChooseEntryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChooseEntryOptions]
  }
}
