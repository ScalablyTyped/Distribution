package typings.azure.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("azure", "SharedKeyTable")
@js.native
class SharedKeyTable protected () extends StObject {
  def this(storageAccount: String, storageAccessKey: String, usePathStyleUri: Boolean) = this()
  
  /**
    * Retrieves the webresource's canonicalized resource string.
    */
  def _getCanonicalizedResource(webResource: WebResource): String = js.native
  
  /**
    * Signs a request with the Authentication header.
    */
  def signRequest(webResource: WebResource, callback: ErrorCallback): Unit = js.native
  
  var signer: HmacSha256Sign = js.native
  
  var storageAccessKey: String = js.native
  
  var storageAccount: String = js.native
  
  var usePathStyleUri: String = js.native
}
