package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetPublicKeyConfigRequest extends StObject {
  
  /**
    * The identifier of the public key whose configuration you are getting.
    */
  var Id: String = js.native
}
object GetPublicKeyConfigRequest {
  
  @scala.inline
  def apply(Id: String): GetPublicKeyConfigRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPublicKeyConfigRequest]
  }
  
  @scala.inline
  implicit class GetPublicKeyConfigRequestMutableBuilder[Self <: GetPublicKeyConfigRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
