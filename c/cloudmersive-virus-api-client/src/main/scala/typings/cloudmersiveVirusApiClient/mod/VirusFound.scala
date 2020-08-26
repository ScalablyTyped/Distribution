package typings.cloudmersiveVirusApiClient.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VirusFound extends js.Object {
  /**
    * @param FileName string
    * Name of the file containing the virus
    */
  var FileName: String = js.native
  /**
    * @param VirusName string
    * Name of the virus that was found
    */
  var VirusName: String = js.native
}

@JSImport("cloudmersive-virus-api-client", "VirusFound")
@js.native
object VirusFound extends TopLevel[VirusFound]

