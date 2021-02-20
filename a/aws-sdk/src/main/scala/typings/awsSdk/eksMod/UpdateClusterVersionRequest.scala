package typings.awsSdk.eksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateClusterVersionRequest extends StObject {
  
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
    */
  var clientRequestToken: js.UndefOr[String] = js.native
  
  /**
    * The name of the Amazon EKS cluster to update.
    */
  var name: String = js.native
  
  /**
    * The desired Kubernetes version following a successful update.
    */
  var version: String = js.native
}
object UpdateClusterVersionRequest {
  
  @scala.inline
  def apply(name: String, version: String): UpdateClusterVersionRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateClusterVersionRequest]
  }
  
  @scala.inline
  implicit class UpdateClusterVersionRequestMutableBuilder[Self <: UpdateClusterVersionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientRequestToken(value: String): Self = StObject.set(x, "clientRequestToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientRequestTokenUndefined: Self = StObject.set(x, "clientRequestToken", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
