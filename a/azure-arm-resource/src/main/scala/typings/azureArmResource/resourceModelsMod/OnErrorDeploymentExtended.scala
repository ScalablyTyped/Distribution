package typings.azureArmResource.resourceModelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnErrorDeploymentExtended extends js.Object {
  /**
    * The deployment to be used on error case.
    */
  var deploymentName: js.UndefOr[String] = js.undefined
  /**
    * The state of the provisioning for the on error deployment.
    */
  val provisioningState: js.UndefOr[String] = js.undefined
  /**
    * The deployment on error behavior type. Possible values are LastSuccessful and
    * SpecificDeployment. Possible values include: 'LastSuccessful', 'SpecificDeployment'
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object OnErrorDeploymentExtended {
  @scala.inline
  def apply(deploymentName: String = null, provisioningState: String = null, `type`: String = null): OnErrorDeploymentExtended = {
    val __obj = js.Dynamic.literal()
    if (deploymentName != null) __obj.updateDynamic("deploymentName")(deploymentName.asInstanceOf[js.Any])
    if (provisioningState != null) __obj.updateDynamic("provisioningState")(provisioningState.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnErrorDeploymentExtended]
  }
}

