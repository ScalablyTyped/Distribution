package typings.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceQuotas extends js.Object {
  /**
    * The quota for applications in the AWS account.
    */
  var ApplicationQuota: js.UndefOr[ResourceQuota] = js.native
  /**
    * The quota for application versions in the AWS account.
    */
  var ApplicationVersionQuota: js.UndefOr[ResourceQuota] = js.native
  /**
    * The quota for configuration templates in the AWS account.
    */
  var ConfigurationTemplateQuota: js.UndefOr[ResourceQuota] = js.native
  /**
    * The quota for custom platforms in the AWS account.
    */
  var CustomPlatformQuota: js.UndefOr[ResourceQuota] = js.native
  /**
    * The quota for environments in the AWS account.
    */
  var EnvironmentQuota: js.UndefOr[ResourceQuota] = js.native
}

object ResourceQuotas {
  @scala.inline
  def apply(): ResourceQuotas = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceQuotas]
  }
  @scala.inline
  implicit class ResourceQuotasOps[Self <: ResourceQuotas] (val x: Self) extends AnyVal {
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
    def setApplicationQuota(value: ResourceQuota): Self = this.set("ApplicationQuota", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplicationQuota: Self = this.set("ApplicationQuota", js.undefined)
    @scala.inline
    def setApplicationVersionQuota(value: ResourceQuota): Self = this.set("ApplicationVersionQuota", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplicationVersionQuota: Self = this.set("ApplicationVersionQuota", js.undefined)
    @scala.inline
    def setConfigurationTemplateQuota(value: ResourceQuota): Self = this.set("ConfigurationTemplateQuota", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfigurationTemplateQuota: Self = this.set("ConfigurationTemplateQuota", js.undefined)
    @scala.inline
    def setCustomPlatformQuota(value: ResourceQuota): Self = this.set("CustomPlatformQuota", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomPlatformQuota: Self = this.set("CustomPlatformQuota", js.undefined)
    @scala.inline
    def setEnvironmentQuota(value: ResourceQuota): Self = this.set("EnvironmentQuota", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnvironmentQuota: Self = this.set("EnvironmentQuota", js.undefined)
  }
  
}

