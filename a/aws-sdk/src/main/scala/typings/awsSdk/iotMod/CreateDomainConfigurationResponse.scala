package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDomainConfigurationResponse extends js.Object {
  /**
    * The ARN of the domain configuration.
    */
  var domainConfigurationArn: js.UndefOr[DomainConfigurationArn] = js.native
  /**
    * The name of the domain configuration.
    */
  var domainConfigurationName: js.UndefOr[DomainConfigurationName] = js.native
}

object CreateDomainConfigurationResponse {
  @scala.inline
  def apply(): CreateDomainConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDomainConfigurationResponse]
  }
  @scala.inline
  implicit class CreateDomainConfigurationResponseOps[Self <: CreateDomainConfigurationResponse] (val x: Self) extends AnyVal {
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
    def setDomainConfigurationArn(value: DomainConfigurationArn): Self = this.set("domainConfigurationArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomainConfigurationArn: Self = this.set("domainConfigurationArn", js.undefined)
    @scala.inline
    def setDomainConfigurationName(value: DomainConfigurationName): Self = this.set("domainConfigurationName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomainConfigurationName: Self = this.set("domainConfigurationName", js.undefined)
  }
  
}

