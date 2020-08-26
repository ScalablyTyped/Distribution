package typings.awsSdk.imagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Distribution extends js.Object {
  /**
    * The specific AMI settings (for example, launch permissions, AMI tags). 
    */
  var amiDistributionConfiguration: js.UndefOr[AmiDistributionConfiguration] = js.native
  /**
    * The License Manager Configuration to associate with the AMI in the specified Region.
    */
  var licenseConfigurationArns: js.UndefOr[ArnList] = js.native
  /**
    * The target Region. 
    */
  var region: NonEmptyString = js.native
}

object Distribution {
  @scala.inline
  def apply(region: NonEmptyString): Distribution = {
    val __obj = js.Dynamic.literal(region = region.asInstanceOf[js.Any])
    __obj.asInstanceOf[Distribution]
  }
  @scala.inline
  implicit class DistributionOps[Self <: Distribution] (val x: Self) extends AnyVal {
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
    def setRegion(value: NonEmptyString): Self = this.set("region", value.asInstanceOf[js.Any])
    @scala.inline
    def setAmiDistributionConfiguration(value: AmiDistributionConfiguration): Self = this.set("amiDistributionConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAmiDistributionConfiguration: Self = this.set("amiDistributionConfiguration", js.undefined)
    @scala.inline
    def setLicenseConfigurationArnsVarargs(value: Arn*): Self = this.set("licenseConfigurationArns", js.Array(value :_*))
    @scala.inline
    def setLicenseConfigurationArns(value: ArnList): Self = this.set("licenseConfigurationArns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLicenseConfigurationArns: Self = this.set("licenseConfigurationArns", js.undefined)
  }
  
}

