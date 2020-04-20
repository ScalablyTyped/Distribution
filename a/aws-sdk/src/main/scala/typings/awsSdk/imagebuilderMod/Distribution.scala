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
  def apply(
    region: NonEmptyString,
    amiDistributionConfiguration: AmiDistributionConfiguration = null,
    licenseConfigurationArns: ArnList = null
  ): Distribution = {
    val __obj = js.Dynamic.literal(region = region.asInstanceOf[js.Any])
    if (amiDistributionConfiguration != null) __obj.updateDynamic("amiDistributionConfiguration")(amiDistributionConfiguration.asInstanceOf[js.Any])
    if (licenseConfigurationArns != null) __obj.updateDynamic("licenseConfigurationArns")(licenseConfigurationArns.asInstanceOf[js.Any])
    __obj.asInstanceOf[Distribution]
  }
}

