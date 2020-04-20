package typings.cloudmersiveVirusApiClient.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VirusFound extends js.Object {
  /**
    * @param FileName string
    * Name of the file containing the virus
    */
  var FileName: String
  /**
    * @param VirusName string
    * Name of the virus that was found
    */
  var VirusName: String
}

@JSImport("cloudmersive-virus-api-client", "VirusFound")
@js.native
object VirusFound extends TopLevel[VirusFound]

