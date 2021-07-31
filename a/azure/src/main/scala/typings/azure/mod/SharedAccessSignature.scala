package typings.azure.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("azure", "SharedAccessSignature")
@js.native
class SharedAccessSignature protected () extends StObject {
  def this(storageAccount: String, storageAccessKey: String, permissionSet: js.Array[String]) = this()
  
  /**
    * Generates the shared access signature for a resource.
    */
  def _generateSignature(path: String, resourceType: String, sharedAccessPolicy: SharedAccessPolicy): String = js.native
  
  /**
    * Generates the query string for a shared access signature signing.
    */
  def _permissionMatchesRequest(
    sharedAccessSignature: String,
    webResource: WebResource,
    resourceType: String,
    requiredPermissions: js.Array[String]
  ): String = js.native
  
  /**
    * Generates the query string for a shared access signature signing.
    */
  def generateSignedQueryString(
    path: String,
    queryString: Dictionary[String],
    resourceType: String,
    sharedAccessPolicy: SharedAccessPolicy
  ): Dictionary[String] = js.native
  
  var permissionSet: js.Array[String] = js.native
  
  /**
    * Signs a request with the signature header.
    */
  def signRequest(webResource: WebResource, callback: ErrorCallback): Unit = js.native
  
  var signer: HmacSha256Sign = js.native
  
  var storageAccessKey: String = js.native
  
  var storageAccount: String = js.native
}
