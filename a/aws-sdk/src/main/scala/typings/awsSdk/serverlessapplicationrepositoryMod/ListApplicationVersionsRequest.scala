package typings.awsSdk.serverlessapplicationrepositoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListApplicationVersionsRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the application.
    */
  var ApplicationId: string = js.native
  /**
    * The total number of items to return.
    */
  var MaxItems: js.UndefOr[typings.awsSdk.serverlessapplicationrepositoryMod.MaxItems] = js.native
  /**
    * A token to specify where to start paginating.
    */
  var NextToken: js.UndefOr[string] = js.native
}

object ListApplicationVersionsRequest {
  @scala.inline
  def apply(ApplicationId: string, MaxItems: js.UndefOr[MaxItems] = js.undefined, NextToken: string = null): ListApplicationVersionsRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxItems)) __obj.updateDynamic("MaxItems")(MaxItems.get.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListApplicationVersionsRequest]
  }
}

