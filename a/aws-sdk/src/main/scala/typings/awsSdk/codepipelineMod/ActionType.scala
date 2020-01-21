package typings.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionType extends js.Object {
  /**
    * The configuration properties for the action type.
    */
  var actionConfigurationProperties: js.UndefOr[ActionConfigurationPropertyList] = js.native
  /**
    * Represents information about an action type.
    */
  var id: ActionTypeId = js.native
  /**
    * The details of the input artifact for the action, such as its commit ID.
    */
  var inputArtifactDetails: ArtifactDetails = js.native
  /**
    * The details of the output artifact of the action, such as its commit ID.
    */
  var outputArtifactDetails: ArtifactDetails = js.native
  /**
    * The settings for the action type.
    */
  var settings: js.UndefOr[ActionTypeSettings] = js.native
}

object ActionType {
  @scala.inline
  def apply(
    id: ActionTypeId,
    inputArtifactDetails: ArtifactDetails,
    outputArtifactDetails: ArtifactDetails,
    actionConfigurationProperties: ActionConfigurationPropertyList = null,
    settings: ActionTypeSettings = null
  ): ActionType = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], inputArtifactDetails = inputArtifactDetails.asInstanceOf[js.Any], outputArtifactDetails = outputArtifactDetails.asInstanceOf[js.Any])
    if (actionConfigurationProperties != null) __obj.updateDynamic("actionConfigurationProperties")(actionConfigurationProperties.asInstanceOf[js.Any])
    if (settings != null) __obj.updateDynamic("settings")(settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionType]
  }
}

