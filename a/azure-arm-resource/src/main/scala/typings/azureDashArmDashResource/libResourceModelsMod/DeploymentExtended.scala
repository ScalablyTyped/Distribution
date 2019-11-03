package typings.azureDashArmDashResource.libResourceModelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeploymentExtended
  extends typings.msDashRestDashAzure.msDashRestDashAzureMod.BaseResource {
  /**
    * The ID of the deployment.
    */
  val id: js.UndefOr[String] = js.native
  /**
    * the location of the deployment.
    */
  var location: js.UndefOr[String] = js.native
  /**
    * The name of the deployment.
    */
  val name: js.UndefOr[String] = js.native
  /**
    * Deployment properties.
    */
  var properties: js.UndefOr[DeploymentPropertiesExtended] = js.native
  /**
    * The type of the deployment.
    */
  val `type`: js.UndefOr[String] = js.native
}

