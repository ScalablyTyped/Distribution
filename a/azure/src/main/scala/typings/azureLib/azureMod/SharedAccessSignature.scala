package typings
package azureLib.azureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("azure", "SharedAccessSignature")
@js.native
class SharedAccessSignature protected () extends js.Object {
  def this(storageAccount: java.lang.String, storageAccessKey: java.lang.String, permissionSet: js.Array[java.lang.String]) = this()
  var permissionSet: js.Array[java.lang.String] = js.native
  var signer: HmacSha256Sign = js.native
  var storageAccessKey: java.lang.String = js.native
  var storageAccount: java.lang.String = js.native
  /**
       * Generates the shared access signature for a resource.
       */
  def _generateSignature(path: java.lang.String, resourceType: java.lang.String, sharedAccessPolicy: SharedAccessPolicy): java.lang.String = js.native
  /**
       * Generates the query string for a shared access signature signing.
       */
  def _permissionMatchesRequest(
    sharedAccessSignature: java.lang.String,
    webResource: WebResource,
    resourceType: java.lang.String,
    requiredPermissions: js.Array[java.lang.String]
  ): java.lang.String = js.native
  /**
       * Generates the query string for a shared access signature signing.
       */
  def generateSignedQueryString(
    path: java.lang.String,
    queryString: Dictionary[java.lang.String],
    resourceType: java.lang.String,
    sharedAccessPolicy: SharedAccessPolicy
  ): Dictionary[java.lang.String] = js.native
  /**
       * Signs a request with the signature header.
       */
  def signRequest(webResource: WebResource, callback: ErrorCallback): scala.Unit = js.native
}

