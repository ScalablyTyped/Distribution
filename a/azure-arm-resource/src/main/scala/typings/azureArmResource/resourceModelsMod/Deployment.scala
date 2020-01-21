package typings.azureArmResource.resourceModelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Deployment extends js.Object {
  /**
    * The location to store the deployment data.
    */
  var location: js.UndefOr[String] = js.undefined
  /**
    * The deployment properties.
    */
  var properties: DeploymentProperties
}

object Deployment {
  @scala.inline
  def apply(properties: DeploymentProperties, location: String = null): Deployment = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    __obj.asInstanceOf[Deployment]
  }
}

