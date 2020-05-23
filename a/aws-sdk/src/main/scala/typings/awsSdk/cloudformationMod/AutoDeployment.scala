package typings.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoDeployment extends js.Object {
  /**
    * If set to true, StackSets automatically deploys additional stack instances to AWS Organizations accounts that are added to a target organization or organizational unit (OU) in the specified Regions. If an account is removed from a target organization or OU, StackSets deletes stack instances from the account in the specified Regions.
    */
  var Enabled: js.UndefOr[AutoDeploymentNullable] = js.native
  /**
    * If set to true, stack resources are retained when an account is removed from a target organization or OU. If set to false, stack resources are deleted. Specify only if Enabled is set to True.
    */
  var RetainStacksOnAccountRemoval: js.UndefOr[RetainStacksOnAccountRemovalNullable] = js.native
}

object AutoDeployment {
  @scala.inline
  def apply(
    Enabled: js.UndefOr[AutoDeploymentNullable] = js.undefined,
    RetainStacksOnAccountRemoval: js.UndefOr[RetainStacksOnAccountRemovalNullable] = js.undefined
  ): AutoDeployment = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Enabled)) __obj.updateDynamic("Enabled")(Enabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(RetainStacksOnAccountRemoval)) __obj.updateDynamic("RetainStacksOnAccountRemoval")(RetainStacksOnAccountRemoval.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoDeployment]
  }
}

