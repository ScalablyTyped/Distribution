package typings.azureArmResource.resourceModelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnErrorDeployment extends js.Object {
  /**
    * The deployment to be used on error case.
    */
  var deploymentName: js.UndefOr[String] = js.undefined
  /**
    * The deployment on error behavior type. Possible values are LastSuccessful and
    * SpecificDeployment. Possible values include: 'LastSuccessful', 'SpecificDeployment'
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object OnErrorDeployment {
  @scala.inline
  def apply(deploymentName: String = null, `type`: String = null): OnErrorDeployment = {
    val __obj = js.Dynamic.literal()
    if (deploymentName != null) __obj.updateDynamic("deploymentName")(deploymentName.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnErrorDeployment]
  }
}

