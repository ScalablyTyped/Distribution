package typings.cloudmersiveVirusApiClient.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cloudmersive-virus-api-client", "ScanApi")
@js.native
class ScanApi () extends js.Object {
  def this(apiClient: ApiClient) = this()
  /**
    * Advanced Scan a file for viruses
    * Advanced Scan files with 360-degree Content Protection across Viruses and Malware,
    * executables, invalid files, scripts, and even restrictions on accepted file types
    * with complete content verification. Customize threat rules to your needs.
    * Leverage continuously updated signatures for millions of threats,
    * and advanced high-performance scanning capabilities.
    * Over 17 million virus and malware signatures.
    * Continuous cloud-based updates.
    * Block threats beyond viruses including executables, scripts, invalid files, and more.
    * Optionally limit input files to a specific set of file types(eg PDF and Word Documents only).
    *  Wide file format support including Office, PDF, HTML, Flash.
    * Zip support including .Zip, .Rar, .DMG, .Tar, and other archive formats.
    * Multi-threat scanning across viruses, malware, trojans, ransomware, and spyware.
    * High-speed in-memory scanning delivers subsecond typical response time.
    * @param inputFile buffer - Input file to perform the operation on.
    * @param opts object - Optional parameters
    * @param opts.allowExecutables boolean - Set to false to block executable files (program code)
    * from being allowed in the input file.  Default is false (recommended).
    * @param opts.allowInvalidFiles boolean - Set to false to block invalid files, such as a
    * PDF file that is not really a valid PDF file, or a Word Document that is not a
    * valid Word Document.
    * Default is false (recommended).
    * @param opts.allowScripts boolean - Set to false to block script files, such as a
    * PHP files, Python scripts, and other malicious content or security threats that
    * can be embedded in the file.
    * Set to true to allow these file types.  Default is false (recommended).
    * @param opts.restrictFileTypes boolean - Specify a restricted set of file formats to
    * allow as clean as a comma-separated list of file formats, such as .pdf,.docx,.png
    * would allow only PDF, PNG and Word document files.  All files must pass content
    * verification against this list of file formats, if they do not, then the result
    * will be returned as CleanResult&#x3D;false. Set restrictFileTypes parameter to null or
    * empty string to disable; default is disabled.
    * @param callback function - The callback function, accepting three arguments:
    * error, data, response
    */
  @JSName("scanFileAdvanced")
  var scanFileAdvanced_Original: ScanFileAdvanced = js.native
  /**
    * Scan a file for viruses
    * Scan files and content for viruses.
    * Leverage continuously updated signatures for millions of threats, and advanced
    * high-performance scanning capabilities.  Over 17 million virus and malware signatures.
    * Continuous cloud-based updates.  Wide file format support including Office, PDF, HTML, Flash.
    * Zip support including .Zip, .Rar, .DMG, .Tar, and other archive formats.
    * Multi-threat scanning across viruses, malware, trojans, ransomware, and spyware.
    * High-speed in-memory scanning delivers subsecond typical response time.
    * @param inputFile buffer - Input file to perform the operation on.
    * @param callback function - The callback function, accepting three arguments:
    * error, data, response
    */
  @JSName("scanFile")
  var scanFile_Original: ScanFile = js.native
  /**
    * Scan a website for malicious content and threats
    * Operation includes scanning the content of the URL for various types
    * of malicious content and threats, including viruses and threats (including Phishing).
    * @param input string - URL of the website to scan; should begin with http:// or https://
    * @param callback function - The callback function, accepting three arguments:
    * error, data, response
    */
  @JSName("scanWebsite")
  var scanWebsite_Original: ScanWebsite = js.native
  /**
    * Scan a file for viruses
    * Scan files and content for viruses.
    * Leverage continuously updated signatures for millions of threats, and advanced
    * high-performance scanning capabilities.  Over 17 million virus and malware signatures.
    * Continuous cloud-based updates.  Wide file format support including Office, PDF, HTML, Flash.
    * Zip support including .Zip, .Rar, .DMG, .Tar, and other archive formats.
    * Multi-threat scanning across viruses, malware, trojans, ransomware, and spyware.
    * High-speed in-memory scanning delivers subsecond typical response time.
    * @param inputFile buffer - Input file to perform the operation on.
    * @param callback function - The callback function, accepting three arguments:
    * error, data, response
    */
  def scanFile(
    inputFile: Buffer,
    callback: js.Function3[/* error */ js.Any, /* data */ VirusScanResult, /* response */ js.Any, _]
  ): js.Any = js.native
  /**
    * Advanced Scan a file for viruses
    * Advanced Scan files with 360-degree Content Protection across Viruses and Malware,
    * executables, invalid files, scripts, and even restrictions on accepted file types
    * with complete content verification. Customize threat rules to your needs.
    * Leverage continuously updated signatures for millions of threats,
    * and advanced high-performance scanning capabilities.
    * Over 17 million virus and malware signatures.
    * Continuous cloud-based updates.
    * Block threats beyond viruses including executables, scripts, invalid files, and more.
    * Optionally limit input files to a specific set of file types(eg PDF and Word Documents only).
    *  Wide file format support including Office, PDF, HTML, Flash.
    * Zip support including .Zip, .Rar, .DMG, .Tar, and other archive formats.
    * Multi-threat scanning across viruses, malware, trojans, ransomware, and spyware.
    * High-speed in-memory scanning delivers subsecond typical response time.
    * @param inputFile buffer - Input file to perform the operation on.
    * @param opts object - Optional parameters
    * @param opts.allowExecutables boolean - Set to false to block executable files (program code)
    * from being allowed in the input file.  Default is false (recommended).
    * @param opts.allowInvalidFiles boolean - Set to false to block invalid files, such as a
    * PDF file that is not really a valid PDF file, or a Word Document that is not a
    * valid Word Document.
    * Default is false (recommended).
    * @param opts.allowScripts boolean - Set to false to block script files, such as a
    * PHP files, Python scripts, and other malicious content or security threats that
    * can be embedded in the file.
    * Set to true to allow these file types.  Default is false (recommended).
    * @param opts.restrictFileTypes boolean - Specify a restricted set of file formats to
    * allow as clean as a comma-separated list of file formats, such as .pdf,.docx,.png
    * would allow only PDF, PNG and Word document files.  All files must pass content
    * verification against this list of file formats, if they do not, then the result
    * will be returned as CleanResult&#x3D;false. Set restrictFileTypes parameter to null or
    * empty string to disable; default is disabled.
    * @param callback function - The callback function, accepting three arguments:
    * error, data, response
    */
  def scanFileAdvanced(
    inputFile: Buffer,
    opts: ScanFileAdvancedOptions,
    callback: js.Function3[/* error */ js.Any, /* data */ VirusScanAdvancedResult, /* response */ js.Any, _]
  ): js.Any = js.native
  /**
    * Scan a website for malicious content and threats
    * Operation includes scanning the content of the URL for various types
    * of malicious content and threats, including viruses and threats (including Phishing).
    * @param input string - URL of the website to scan; should begin with http:// or https://
    * @param callback function - The callback function, accepting three arguments:
    * error, data, response
    */
  def scanWebsite(
    input: String,
    callback: js.Function3[/* error */ js.Any, /* data */ WebsiteScanResult, /* response */ js.Any, _]
  ): js.Any = js.native
}

