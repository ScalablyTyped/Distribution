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
  @scala.inline
  implicit class CreateResourceServerResponseOps[Self <: CreateResourceServerResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setResourceServer(value: ResourceServerType): Self = this.set("ResourceServer", value.asInstanceOf[js.Any])
  }
  
}

