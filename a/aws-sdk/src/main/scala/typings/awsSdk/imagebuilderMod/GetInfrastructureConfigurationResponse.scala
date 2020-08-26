package typings.awsSdk.imagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetInfrastructureConfigurationResponse extends js.Object {
  /**
    * The infrastructure configuration object. 
    */
  var infrastructureConfiguration: js.UndefOr[InfrastructureConfiguration] = js.native
  /**
    * The request ID that uniquely identifies this request. 
    */
  var requestId: js.UndefOr[NonEmptyString] = js.native
}

object GetInfrastructureConfigurationResponse {
  @scala.inline
  def apply(): GetInfrastructureConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetInfrastructureConfigurationResponse]
  }
  @scala.inline
  implicit class GetInfrastructureConfigurationResponseOps[Self <: GetInfrastructureConfigurationResponse] (val x: Self) extends AnyVal {
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
    def setInfrastructureConfiguration(value: InfrastructureConfiguration): Self = this.set("infrastructureConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInfrastructureConfiguration: Self = this.set("infrastructureConfiguration", js.undefined)
    @scala.inline
    def setRequestId(value: NonEmptyString): Self = this.set("requestId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestId: Self = this.set("requestId", js.undefined)
  }
  
}

