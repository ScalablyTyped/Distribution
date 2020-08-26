package typings.awsSdk.imagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteInfrastructureConfigurationResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the infrastructure configuration that was deleted. 
    */
  var infrastructureConfigurationArn: js.UndefOr[InfrastructureConfigurationArn] = js.native
  /**
    * The request ID that uniquely identifies this request. 
    */
  var requestId: js.UndefOr[NonEmptyString] = js.native
}

object DeleteInfrastructureConfigurationResponse {
  @scala.inline
  def apply(): DeleteInfrastructureConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteInfrastructureConfigurationResponse]
  }
  @scala.inline
  implicit class DeleteInfrastructureConfigurationResponseOps[Self <: DeleteInfrastructureConfigurationResponse] (val x: Self) extends AnyVal {
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
    def setInfrastructureConfigurationArn(value: InfrastructureConfigurationArn): Self = this.set("infrastructureConfigurationArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInfrastructureConfigurationArn: Self = this.set("infrastructureConfigurationArn", js.undefined)
    @scala.inline
    def setRequestId(value: NonEmptyString): Self = this.set("requestId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestId: Self = this.set("requestId", js.undefined)
  }
  
}

