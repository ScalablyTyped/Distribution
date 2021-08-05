package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportKeyPairRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A unique name for the key pair.
    */
  var KeyName: String
  
  /**
    * The public key. For API calls, the text must be base64-encoded. For command line tools, base64 encoding is performed for you.
    */
  var PublicKeyMaterial: _Blob
  
  /**
    * The tags to apply to the imported key pair.
    */
  var TagSpecifications: js.UndefOr[TagSpecificationList] = js.undefined
}
object ImportKeyPairRequest {
  
  inline def apply(KeyName: String, PublicKeyMaterial: _Blob): ImportKeyPairRequest = {
    val __obj = js.Dynamic.literal(KeyName = KeyName.asInstanceOf[js.Any], PublicKeyMaterial = PublicKeyMaterial.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportKeyPairRequest]
  }
  
  extension [Self <: ImportKeyPairRequest](x: Self) {
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setKeyName(value: String): Self = StObject.set(x, "KeyName", value.asInstanceOf[js.Any])
    
    inline def setPublicKeyMaterial(value: _Blob): Self = StObject.set(x, "PublicKeyMaterial", value.asInstanceOf[js.Any])
    
    inline def setTagSpecifications(value: TagSpecificationList): Self = StObject.set(x, "TagSpecifications", value.asInstanceOf[js.Any])
    
    inline def setTagSpecificationsUndefined: Self = StObject.set(x, "TagSpecifications", js.undefined)
    
    inline def setTagSpecificationsVarargs(value: TagSpecification*): Self = StObject.set(x, "TagSpecifications", js.Array(value :_*))
  }
}
