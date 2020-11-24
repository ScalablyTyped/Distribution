package typings.chromeApps.chrome.fileSystem

import typings.chromeApps.chromeAppsBooleans.`true`
import typings.chromeApps.chromeAppsStrings.openFile
import typings.chromeApps.chromeAppsStrings.openWritableFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.chromeApps.chrome.fileSystem.ChooseEntryOptions because Already inherited */ @js.native
trait ChooseMultipleFilesEntryOptions extends ChooseEntryOptionsBase {
  
  /**
    * Whether to accept multiple files. This is only supported for openFile and openWritableFile.
    * The callback to chooseEntry will be called with a list of entries if this is set to true.
    * Otherwise it will be called with a single Entry.
    * @default false
    * @since Chrome 30.
    */
  var acceptsMultiple: `true` = js.native
  
  var `type`: openFile | openWritableFile = js.native
}
object ChooseMultipleFilesEntryOptions {
  
  @scala.inline
  def apply(acceptsMultiple: `true`, `type`: openFile | openWritableFile): ChooseMultipleFilesEntryOptions = {
    val __obj = js.Dynamic.literal(acceptsMultiple = acceptsMultiple.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChooseMultipleFilesEntryOptions]
  }
  
  @scala.inline
  implicit class ChooseMultipleFilesEntryOptionsOps[Self <: ChooseMultipleFilesEntryOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAcceptsMultiple(value: `true`): Self = this.set("acceptsMultiple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: openFile | openWritableFile): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
