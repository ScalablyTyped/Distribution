package typings
package azureLib.azureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("azure", "SharedKey")
@js.native
class SharedKey protected () extends js.Object {
  def this(storageAccount: java.lang.String, storageAccessKey: java.lang.String, usePathStyleUri: scala.Boolean) = this()
  var signer: HmacSha256Sign = js.native
  var storageAccessKey: java.lang.String = js.native
  var storageAccount: java.lang.String = js.native
  var usePathStyleUri: java.lang.String = js.native
  /**
       * Constructs the Canonicalized Headers string.
       *
       * To construct the CanonicalizedHeaders portion of the signature string,
       * follow these steps: 1. Retrieve all headers for the resource that begin
       * with x-ms-, including the x-ms-date header. 2. Convert each HTTP header
       * name to lowercase. 3. Sort the headers lexicographically by header name,
       * in ascending order. Each header may appear only once in the
       * string. 4. Unfold the string by replacing any breaking white space with a
       * single space. 5. Trim any white space around the colon in the header. 6.
       * Finally, append a new line character to each canonicalized header in the
       * resulting list. Construct the CanonicalizedHeaders string by
       * concatenating all headers in this list into a single string.
       */
  def _getCanonicalizedHeaders(webResource: WebResource): java.lang.String = js.native
  /**
       * Retrieves the webresource's canonicalized resource string.
       */
  def _getCanonicalizedResource(webResource: WebResource): java.lang.String = js.native
  /**
       * Signs a request with the Authentication header.
       */
  def signRequest(webResource: WebResource, callback: ErrorCallback): scala.Unit = js.native
}

