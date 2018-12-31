package typings
package azureLib.azureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("azure", "SharedKeyTable")
@js.native
class SharedKeyTable protected () extends js.Object {
  def this(storageAccount: java.lang.String, storageAccessKey: java.lang.String, usePathStyleUri: scala.Boolean) = this()
  var signer: HmacSha256Sign = js.native
  var storageAccessKey: java.lang.String = js.native
  var storageAccount: java.lang.String = js.native
  var usePathStyleUri: java.lang.String = js.native
  /**
    * Retrieves the webresource's canonicalized resource string.
    */
  def _getCanonicalizedResource(webResource: WebResource): java.lang.String = js.native
  /**
    * Signs a request with the Authentication header.
    */
  def signRequest(webResource: WebResource, callback: ErrorCallback): scala.Unit = js.native
}

