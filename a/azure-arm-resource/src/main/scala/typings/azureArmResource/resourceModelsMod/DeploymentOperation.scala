package typings.azureArmResource.resourceModelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeploymentOperation extends js.Object {
  /**
    * Full deployment operation ID.
    */
  val id: js.UndefOr[String] = js.undefined
  /**
    * Deployment operation ID.
    */
  val operationId: js.UndefOr[String] = js.undefined
  /**
    * Deployment properties.
    */
  var properties: js.UndefOr[DeploymentOperationProperties] = js.undefined
}

object DeploymentOperation {
  @scala.inline
  def apply(id: String = null, operationId: String = null, properties: DeploymentOperationProperties = null): DeploymentOperation = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (operationId != null) __obj.updateDynamic("operationId")(operationId.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentOperation]
  }
}

