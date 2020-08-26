package typings.cloudmersiveVirusApiClient.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebsiteScanResult extends VirusScanResult {
  /**
    * @param WebsiteHttpResponseCode number (int32)
    * The remote server URL HTTP reasponse code; useful for debugging issues with scanning;
    * typically if the remote server returns a 200 or 300-series code this means a successful
    * response, while a 400 or 500 series code would represent an error returned from the
    * remote server for the provided URL.
    */
  var WebsiteHttpResponseCode: Double = js.native
  /**
    * @param WebsiteThreatType None, Malware, Phishing, ForcedDownload, UnableToConnect
    * Type of threat returned; can be None, Malware, ForcedDownload or Phishing
    */
  var WebsiteThreatType: typings.cloudmersiveVirusApiClient.mod.WebsiteThreatType = js.native
}

@JSImport("cloudmersive-virus-api-client", "WebsiteScanResult")
@js.native
object WebsiteScanResult extends TopLevel[WebsiteScanResult]

