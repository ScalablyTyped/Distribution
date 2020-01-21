package typings.chromeApps.chrome.platformKeys

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.platformKeys.selectClientCertificates")
@js.native
object selectClientCertificates extends js.Object {
  /**
    * This function filters from a list of client certificates the ones that
    * are known to the platform, match *request* and for which the
    * app has permission to access the certificate and its private key.
    * If *interactive* is true, the user is presented a dialog where
    * they can select from matching certificates and grant the app access
    * to the certificate.
    * The selected / filtered client certificates will be passed to *callback*.
    * @param callback Will provide *matches*: The list of certificates that match the request, that the
    *                 app has permission for and, if *interactive* is true, that were selected by the user.
    */
  def apply(details: SelectDetails, callback: js.Function1[/* matches */ js.Array[Match], Unit]): Unit = js.native
}

