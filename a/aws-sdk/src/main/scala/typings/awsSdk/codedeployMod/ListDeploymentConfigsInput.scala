package typings.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDeploymentConfigsInput extends js.Object {
  /**
    * An identifier returned from the previous ListDeploymentConfigs call. It can be used to return the next set of deployment configurations in the list. 
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object ListDeploymentConfigsInput {
  @scala.inline
  def apply(nextToken: NextToken = null): ListDeploymentConfigsInput = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDeploymentConfigsInput]
  }
}

