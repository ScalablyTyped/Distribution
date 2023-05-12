package typings.awsSdk.clientsTransferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportHostKeyRequest extends StObject {
  
  /**
    * The text description that identifies this host key.
    */
  var Description: js.UndefOr[HostKeyDescription] = js.undefined
  
  /**
    * The private key portion of an SSH key pair. Transfer Family accepts RSA, ECDSA, and ED25519 keys.
    */
  var HostKeyBody: HostKey
  
  /**
    * The identifier of the server that contains the host key that you are importing.
    */
  var ServerId: typings.awsSdk.clientsTransferMod.ServerId
  
  /**
    * Key-value pairs that can be used to group and search for host keys.
    */
  var Tags: js.UndefOr[typings.awsSdk.clientsTransferMod.Tags] = js.undefined
}
object ImportHostKeyRequest {
  
  inline def apply(HostKeyBody: HostKey, ServerId: ServerId): ImportHostKeyRequest = {
    val __obj = js.Dynamic.literal(HostKeyBody = HostKeyBody.asInstanceOf[js.Any], ServerId = ServerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportHostKeyRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImportHostKeyRequest] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: HostKeyDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setHostKeyBody(value: HostKey): Self = StObject.set(x, "HostKeyBody", value.asInstanceOf[js.Any])
    
    inline def setServerId(value: ServerId): Self = StObject.set(x, "ServerId", value.asInstanceOf[js.Any])
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
