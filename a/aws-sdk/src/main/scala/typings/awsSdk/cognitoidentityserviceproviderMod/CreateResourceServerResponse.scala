package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateResourceServerResponse extends StObject {
  
  /**
    * The newly created resource server.
    */
  var ResourceServer: ResourceServerType = js.native
}
object CreateResourceServerResponse {
  
  @scala.inline
  def apply(ResourceServer: ResourceServerType): CreateResourceServerResponse = {
    val __obj = js.Dynamic.literal(ResourceServer = ResourceServer.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateResourceServerResponse]
  }
  
  @scala.inline
  implicit class CreateResourceServerResponseMutableBuilder[Self <: CreateResourceServerResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceServer(value: ResourceServerType): Self = StObject.set(x, "ResourceServer", value.asInstanceOf[js.Any])
  }
}
