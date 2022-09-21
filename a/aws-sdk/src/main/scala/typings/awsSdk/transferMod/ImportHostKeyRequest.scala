package typings.awsSdk.transferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportHostKeyRequest extends StObject {
  
  /**
    * Enter a text description to identify this host key.
    */
  var Description: js.UndefOr[HostKeyDescription] = js.undefined
  
  /**
    * The public key portion of an SSH key pair. Transfer Family accepts RSA, ECDSA, and ED25519 keys.
    */
  var HostKeyBody: HostKey
  
  /**
    * Provide the ID of the server that contains the host key that you are importing.
    */
  var ServerId: typings.awsSdk.transferMod.ServerId
  
  /**
    * Key-value pairs that can be used to group and search for host keys.
    */
  var Tags: js.UndefOr[typings.awsSdk.transferMod.Tags] = js.undefined
}
object ImportHostKeyRequest {
  
  inline def apply(HostKeyBody: HostKey, ServerId: ServerId): ImportHostKeyRequest = {
    val __obj = js.Dynamic.literal(HostKeyBody = HostKeyBody.asInstanceOf[js.Any], ServerId = ServerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportHostKeyRequest]
  }
  
  extension [Self <: ImportHostKeyRequest](x: Self) {
    
    inline def setDescription(value: HostKeyDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setHostKeyBody(value: HostKey): Self = StObject.set(x, "HostKeyBody", value.asInstanceOf[js.Any])
    
    inline def setServerId(value: ServerId): Self = StObject.set(x, "ServerId", value.asInstanceOf[js.Any])
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
