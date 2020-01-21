package typings.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListOnPremisesInstancesInput extends js.Object {
  /**
    * An identifier returned from the previous list on-premises instances call. It can be used to return the next set of on-premises instances in the list.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * The registration status of the on-premises instances:   Deregistered: Include deregistered on-premises instances in the resulting list.   Registered: Include registered on-premises instances in the resulting list.  
    */
  var registrationStatus: js.UndefOr[RegistrationStatus] = js.native
  /**
    * The on-premises instance tags that are used to restrict the on-premises instance names returned.
    */
  var tagFilters: js.UndefOr[TagFilterList] = js.native
}

object ListOnPremisesInstancesInput {
  @scala.inline
  def apply(
    nextToken: NextToken = null,
    registrationStatus: RegistrationStatus = null,
    tagFilters: TagFilterList = null
  ): ListOnPremisesInstancesInput = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (registrationStatus != null) __obj.updateDynamic("registrationStatus")(registrationStatus.asInstanceOf[js.Any])
    if (tagFilters != null) __obj.updateDynamic("tagFilters")(tagFilters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListOnPremisesInstancesInput]
  }
}

