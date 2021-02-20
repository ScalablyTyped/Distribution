package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdatePublicKeyRequest extends StObject {
  
  /**
    * The identifier of the public key that you are updating.
    */
  var Id: String = js.native
  
  /**
    * The value of the ETag header that you received when retrieving the public key to update. For example: E2QWRUHAPOMQZL.
    */
  var IfMatch: js.UndefOr[String] = js.native
  
  /**
    * A public key configuration.
    */
  var PublicKeyConfig: typings.awsSdk.cloudfrontMod.PublicKeyConfig = js.native
}
object UpdatePublicKeyRequest {
  
  @scala.inline
  def apply(Id: String, PublicKeyConfig: PublicKeyConfig): UpdatePublicKeyRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], PublicKeyConfig = PublicKeyConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatePublicKeyRequest]
  }
  
  @scala.inline
  implicit class UpdatePublicKeyRequestMutableBuilder[Self <: UpdatePublicKeyRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIfMatch(value: String): Self = StObject.set(x, "IfMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIfMatchUndefined: Self = StObject.set(x, "IfMatch", js.undefined)
    
    @scala.inline
    def setPublicKeyConfig(value: PublicKeyConfig): Self = StObject.set(x, "PublicKeyConfig", value.asInstanceOf[js.Any])
  }
}
