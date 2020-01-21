package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListStackInstancesForProvisionedProductOutput extends js.Object {
  /**
    * The page token to use to retrieve the next set of results. If there are no additional results, this value is null.
    */
  var NextPageToken: js.UndefOr[PageToken] = js.native
  /**
    * List of stack instances.
    */
  var StackInstances: js.UndefOr[typings.awsSdk.servicecatalogMod.StackInstances] = js.native
}

object ListStackInstancesForProvisionedProductOutput {
  @scala.inline
  def apply(NextPageToken: PageToken = null, StackInstances: StackInstances = null): ListStackInstancesForProvisionedProductOutput = {
    val __obj = js.Dynamic.literal()
    if (NextPageToken != null) __obj.updateDynamic("NextPageToken")(NextPageToken.asInstanceOf[js.Any])
    if (StackInstances != null) __obj.updateDynamic("StackInstances")(StackInstances.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListStackInstancesForProvisionedProductOutput]
  }
}

