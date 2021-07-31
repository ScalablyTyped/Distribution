package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteKeyPairRequest extends StObject {
  
  /**
    * The name of the key pair to delete.
    */
  var keyPairName: ResourceName
}
object DeleteKeyPairRequest {
  
  @scala.inline
  def apply(keyPairName: ResourceName): DeleteKeyPairRequest = {
    val __obj = js.Dynamic.literal(keyPairName = keyPairName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteKeyPairRequest]
  }
  
  @scala.inline
  implicit class DeleteKeyPairRequestMutableBuilder[Self <: DeleteKeyPairRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKeyPairName(value: ResourceName): Self = StObject.set(x, "keyPairName", value.asInstanceOf[js.Any])
  }
}
