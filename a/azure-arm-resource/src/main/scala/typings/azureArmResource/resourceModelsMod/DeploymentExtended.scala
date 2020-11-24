package typings.azureArmResource.resourceModelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeploymentExtended
  extends typings.msRestAzure.mod.BaseResource {
  
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
