package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetPublicKeyRequest extends StObject {
  
  /**
    * The identifier of the public key you are getting.
    */
  var Id: String = js.native
}
object GetPublicKeyRequest {
  
  @scala.inline
  def apply(Id: String): GetPublicKeyRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPublicKeyRequest]
  }
  
  @scala.inline
  implicit class GetPublicKeyRequestMutableBuilder[Self <: GetPublicKeyRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
