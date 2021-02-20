package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteKeyPairRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  
  /**
    * The name of the key pair.
    */
  var KeyName: js.UndefOr[KeyPairName] = js.native
  
  /**
    * The ID of the key pair.
    */
  var KeyPairId: js.UndefOr[typings.awsSdk.ec2Mod.KeyPairId] = js.native
}
object DeleteKeyPairRequest {
  
  @scala.inline
  def apply(): DeleteKeyPairRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteKeyPairRequest]
  }
  
  @scala.inline
  implicit class DeleteKeyPairRequestMutableBuilder[Self <: DeleteKeyPairRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    @scala.inline
    def setKeyName(value: KeyPairName): Self = StObject.set(x, "KeyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyNameUndefined: Self = StObject.set(x, "KeyName", js.undefined)
    
    @scala.inline
    def setKeyPairId(value: KeyPairId): Self = StObject.set(x, "KeyPairId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyPairIdUndefined: Self = StObject.set(x, "KeyPairId", js.undefined)
  }
}
