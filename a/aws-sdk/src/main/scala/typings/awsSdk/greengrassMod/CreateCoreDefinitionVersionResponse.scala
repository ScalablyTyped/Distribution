package typings.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateCoreDefinitionVersionResponse extends js.Object {
  /**
    * The ARN of the version.
    */
  var Arn: js.UndefOr[string] = js.native
  /**
    * The time, in milliseconds since the epoch, when the version was created.
    */
  var CreationTimestamp: js.UndefOr[string] = js.native
  /**
    * The ID of the parent definition that the version is associated with.
    */
  var Id: js.UndefOr[string] = js.native
  /**
    * The ID of the version.
    */
  var Version: js.UndefOr[string] = js.native
}

object CreateCoreDefinitionVersionResponse {
  @scala.inline
  def apply(Arn: string = null, CreationTimestamp: string = null, Id: string = null, Version: string = null): CreateCoreDefinitionVersionResponse = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn.asInstanceOf[js.Any])
    if (CreationTimestamp != null) __obj.updateDynamic("CreationTimestamp")(CreationTimestamp.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (Version != null) __obj.updateDynamic("Version")(Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCoreDefinitionVersionResponse]
  }
}

