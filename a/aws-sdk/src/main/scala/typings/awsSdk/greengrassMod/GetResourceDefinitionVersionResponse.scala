package typings.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetResourceDefinitionVersionResponse extends js.Object {
  /**
    * Arn of the resource definition version.
    */
  var Arn: js.UndefOr[string] = js.native
  /**
    * The time, in milliseconds since the epoch, when the resource definition version was created.
    */
  var CreationTimestamp: js.UndefOr[string] = js.native
  /**
    * Information about the definition.
    */
  var Definition: js.UndefOr[ResourceDefinitionVersion] = js.native
  /**
    * The ID of the resource definition version.
    */
  var Id: js.UndefOr[string] = js.native
  /**
    * The version of the resource definition version.
    */
  var Version: js.UndefOr[string] = js.native
}

object GetResourceDefinitionVersionResponse {
  @scala.inline
  def apply(
    Arn: string = null,
    CreationTimestamp: string = null,
    Definition: ResourceDefinitionVersion = null,
    Id: string = null,
    Version: string = null
  ): GetResourceDefinitionVersionResponse = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn.asInstanceOf[js.Any])
    if (CreationTimestamp != null) __obj.updateDynamic("CreationTimestamp")(CreationTimestamp.asInstanceOf[js.Any])
    if (Definition != null) __obj.updateDynamic("Definition")(Definition.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (Version != null) __obj.updateDynamic("Version")(Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResourceDefinitionVersionResponse]
  }
}

