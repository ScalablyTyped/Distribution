package typings.cloudmersiveVirusApiClient.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VirusScanAdvancedResult extends VirusScanResult {
  /**
    * @param ContainsExecutable boolean
    * True if the scan contained an executable (application code),
    * which can be a significant risk factor
    */
  var ContainsExecutable: Boolean
  /**
    * @param ContainsInvalidFile boolean
    * True if the scan contained an invalid file (such as a PDF that is not a valid PDF,
    * Word Document that is not a valid Word Document, etc.), which can be a significant risk facto
    */
  var ContainsInvalidFile: Boolean
  /**
    * @param ContainsRestrictedFileFormat boolean
    * True if the uploaded file is of a type that is not allowed based on the optional
    * restrictFileTypes parameter, false otherwise;
    * if restrictFileTypes is not set, this will always be false
    */
  var ContainsRestrictedFileFormat: Boolean
  /**
    * @param ContainsScript boolean
    * True if the scan contained a script (such as a PHP script, Python script, etc.) which can
    * be a significant risk factor
    */
  var ContainsScript: Boolean
  /**
    * @param VerifiedFileFormat string
    * For file format verification-supported file formats, the contents-verified file format
    *  of the file. Null indicates that the file format is not supported for contents verification.
    *  If a Virus or Malware is found, this field will always be set to Null.
    */
  var VerifiedFileFormat: String
}

@JSImport("cloudmersive-virus-api-client", "VirusScanAdvancedResult")
@js.native
object VirusScanAdvancedResult extends TopLevel[VirusScanAdvancedResult]

