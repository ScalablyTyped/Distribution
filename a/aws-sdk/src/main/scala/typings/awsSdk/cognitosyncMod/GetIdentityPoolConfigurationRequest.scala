package typings.awsSdk.cognitosyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetIdentityPoolConfigurationRequest extends js.Object {
  /**
    * A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon Cognito. This is the ID of the pool for which to return a configuration.
    */
  var IdentityPoolId: typings.awsSdk.cognitosyncMod.IdentityPoolId = js.native
}

object GetIdentityPoolConfigurationRequest {
  @scala.inline
  def apply(IdentityPoolId: IdentityPoolId): GetIdentityPoolConfigurationRequest = {
    val __obj = js.Dynamic.literal(IdentityPoolId = IdentityPoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetIdentityPoolConfigurationRequest]
  }
  @scala.inline
  implicit class GetIdentityPoolConfigurationRequestOps[Self <: GetIdentityPoolConfigurationRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setIdentityPoolId(value: IdentityPoolId): Self = this.set("IdentityPoolId", value.asInstanceOf[js.Any])
  }
  
}

