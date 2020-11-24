package typings.cloudmersiveVirusApiClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScanFileAdvancedOptions extends js.Object {
  
  /**
    * @param allowExecutables boolean
    * Set to false to block executable files (program code) from being allowed in the input file.
    * Default is false (recommended).
    */
  var allowExecutables: Boolean = js.native
  
  /**
    * @param allowInvalidFiles boolean
    * Set to false to block invalid files, such as a PDF file that is not really a valid PDF file,
    * or a Word Document that is not a valid Word Document.
    * Default is false (recommended).
    */
  var allowInvalidFiles: Boolean = js.native
  
  /**
    * @param allowScripts boolean
    * Set to false to block script files, such as a PHP files, Pythong scripts, and other malicious
    * content or security threats that can be embedded in the file. Set to true to allow these
    * file types.
    * Default is false (recommended).
    */
  var allowScripts: Boolean = js.native
  
  /**
    * @param restrictFileTypes string
    * Specify a restricted set of file formats to allow as clean as a comma-separated list of
    * file formats, such as .pdf,.docx,.png would allow only PDF, PNG and Word document files.
    *  All files must pass content verification against this list of file formats, if they do
    * not, then the result will be returned as CleanResult=false.
    * Set restrictFileTypes parameter to null or empty string to disable;
    * default is disabled.
    */
  var restrictFileTypes: String = js.native
}
object ScanFileAdvancedOptions {
  
  @scala.inline
  def apply(
    allowExecutables: Boolean,
    allowInvalidFiles: Boolean,
    allowScripts: Boolean,
    restrictFileTypes: String
  ): ScanFileAdvancedOptions = {
    val __obj = js.Dynamic.literal(allowExecutables = allowExecutables.asInstanceOf[js.Any], allowInvalidFiles = allowInvalidFiles.asInstanceOf[js.Any], allowScripts = allowScripts.asInstanceOf[js.Any], restrictFileTypes = restrictFileTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScanFileAdvancedOptions]
  }
  
  @scala.inline
  implicit class ScanFileAdvancedOptionsOps[Self <: ScanFileAdvancedOptions] (val x: Self) extends AnyVal {
    
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
    def setAllowExecutables(value: Boolean): Self = this.set("allowExecutables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowInvalidFiles(value: Boolean): Self = this.set("allowInvalidFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowScripts(value: Boolean): Self = this.set("allowScripts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestrictFileTypes(value: String): Self = this.set("restrictFileTypes", value.asInstanceOf[js.Any])
  }
}
