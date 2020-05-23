package typings.awsSdk.cloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeSuggestersRequest extends js.Object {
  /**
    * Whether to display the deployed configuration (true) or include any pending changes (false). Defaults to false.
    */
  var Deployed: js.UndefOr[Boolean] = js.native
  /**
    * The name of the domain you want to describe.
    */
  var DomainName: typings.awsSdk.cloudsearchMod.DomainName = js.native
  /**
    * The suggesters you want to describe.
    */
  var SuggesterNames: js.UndefOr[StandardNameList] = js.native
}

object DescribeSuggestersRequest {
  @scala.inline
  def apply(
    DomainName: DomainName,
    Deployed: js.UndefOr[Boolean] = js.undefined,
    SuggesterNames: StandardNameList = null
  ): DescribeSuggestersRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
    if (!js.isUndefined(Deployed)) __obj.updateDynamic("Deployed")(Deployed.get.asInstanceOf[js.Any])
    if (SuggesterNames != null) __obj.updateDynamic("SuggesterNames")(SuggesterNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeSuggestersRequest]
  }
}

