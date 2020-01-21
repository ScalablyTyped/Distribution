package typings.azureArmResource.libModelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplianceDefinition extends GenericResource {
  /**
    * The collection of appliance artifacts. The portal will use the files specified as artifacts to
    * construct the user experience of creating an appliance from an appliance definition.
    */
  var artifacts: js.UndefOr[js.Array[ApplianceArtifact]] = js.native
  /**
    * The appliance provider authorizations.
    */
  var authorizations: js.Array[ApplianceProviderAuthorization] = js.native
  /**
    * The appliance definition description.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The appliance definition display name.
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * The appliance lock level. Possible values include: 'CanNotDelete', 'ReadOnly', 'None'
    */
  var lockLevel: String = js.native
  /**
    * The appliance definition package file Uri.
    */
  var packageFileUri: String = js.native
}

