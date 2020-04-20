package typings.cloudmersiveVirusApiClient.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VirusScanResult extends js.Object {
  /**
    * @param CleanResult boolean
    * True if the scan contained no viruses, false otherwise
    */
  var CleanResult: Boolean
  /**
    * @param FoundViruses null | IVirusFound
    * Array of viruses found, if any
    */
  var FoundViruses: Null | js.Array[VirusFound]
}

@JSImport("cloudmersive-virus-api-client", "VirusScanResult")
@js.native
object VirusScanResult extends TopLevel[VirusScanResult]

