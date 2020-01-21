package typings.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpgradeElasticsearchDomainRequest extends js.Object {
  var DomainName: typings.awsSdk.esMod.DomainName = js.native
  /**
    *  This flag, when set to True, indicates that an Upgrade Eligibility Check needs to be performed. This will not actually perform the Upgrade. 
    */
  var PerformCheckOnly: js.UndefOr[Boolean] = js.native
  /**
    * The version of Elasticsearch that you intend to upgrade the domain to.
    */
  var TargetVersion: ElasticsearchVersionString = js.native
}

object UpgradeElasticsearchDomainRequest {
  @scala.inline
  def apply(
    DomainName: DomainName,
    TargetVersion: ElasticsearchVersionString,
    PerformCheckOnly: js.UndefOr[scala.Boolean] = js.undefined
  ): UpgradeElasticsearchDomainRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any], TargetVersion = TargetVersion.asInstanceOf[js.Any])
    if (!js.isUndefined(PerformCheckOnly)) __obj.updateDynamic("PerformCheckOnly")(PerformCheckOnly.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpgradeElasticsearchDomainRequest]
  }
}

