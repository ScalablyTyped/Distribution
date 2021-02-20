package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateResourceServerResponse extends StObject {
  
  /**
    * The resource server.
    */
  var ResourceServer: ResourceServerType = js.native
}
object UpdateResourceServerResponse {
  
  @scala.inline
  def apply(ResourceServer: ResourceServerType): UpdateResourceServerResponse = {
    val __obj = js.Dynamic.literal(ResourceServer = ResourceServer.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateResourceServerResponse]
  }
  
  @scala.inline
  implicit class UpdateResourceServerResponseMutableBuilder[Self <: UpdateResourceServerResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceServer(value: ResourceServerType): Self = StObject.set(x, "ResourceServer", value.asInstanceOf[js.Any])
  }
}
