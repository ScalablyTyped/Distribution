package typings.azureDashArmDashResource.libModelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Appliance extends GenericResource {
  /**
    * The fully qualified path of appliance definition Id.
    */
  var applianceDefinitionId: js.UndefOr[String] = js.native
  /**
    * The kind of the appliance. Allowed values are MarketPlace and ServiceCatalog.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The managed resource group Id.
    */
  var managedResourceGroupId: String = js.native
  /**
    * Name and value pairs that define the appliance outputs.
    */
  val outputs: js.UndefOr[js.Any] = js.native
  /**
    * Name and value pairs that define the appliance parameters. It can be a JObject or a well
    * formed JSON string.
    */
  var parameters: js.UndefOr[js.Any] = js.native
  /**
    * The plan information.
    */
  var plan: js.UndefOr[Plan] = js.native
  /**
    * The appliance provisioning state. Possible values include: 'Accepted', 'Running', 'Ready',
    * 'Creating', 'Created', 'Deleting', 'Deleted', 'Canceled', 'Failed', 'Succeeded', 'Updating'
    */
  val provisioningState: js.UndefOr[String] = js.native
  /**
    * The blob URI where the UI definition file is located.
    */
  var uiDefinitionUri: js.UndefOr[String] = js.native
}

