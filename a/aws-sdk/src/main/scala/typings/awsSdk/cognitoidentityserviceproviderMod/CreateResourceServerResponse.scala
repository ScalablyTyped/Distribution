package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateResourceServerResponse extends js.Object {
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
}

