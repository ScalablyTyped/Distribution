package typings.cloudmersiveVirusApiClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScanFileAdvancedOptions extends js.Object {
  /**
    * @param allowExecutables boolean
    * Set to false to block executable files (program code) from being allowed in the input file.
    * Default is false (recommended).
    */
  var allowExecutables: Boolean
  /**
    * @param allowInvalidFiles boolean
    * Set to false to block invalid files, such as a PDF file that is not really a valid PDF file,
    * or a Word Document that is not a valid Word Document.
    * Default is false (recommended).
    */
  var allowInvalidFiles: Boolean
  /**
    * @param allowScripts boolean
    * Set to false to block script files, such as a PHP files, Pythong scripts, and other malicious
    * content or security threats that can be embedded in the file. Set to true to allow these
    * file types.
    * Default is false (recommended).
    */
  var allowScripts: Boolean
  /**
    * @param restrictFileTypes string
    * Specify a restricted set of file formats to allow as clean as a comma-separated list of
    * file formats, such as .pdf,.docx,.png would allow only PDF, PNG and Word document files.
    *  All files must pass content verification against this list of file formats, if they do
    * not, then the result will be returned as CleanResult=false.
    * Set restrictFileTypes parameter to null or empty string to disable;
    * default is disabled.
    */
  var restrictFileTypes: String
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
}

