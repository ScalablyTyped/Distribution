package typings.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetLoggerDefinitionVersionResponse extends js.Object {
  /**
    * The ARN of the logger definition version.
    */
  var Arn: js.UndefOr[string] = js.native
  /**
    * The time, in milliseconds since the epoch, when the logger definition version was created.
    */
  var CreationTimestamp: js.UndefOr[string] = js.native
  /**
    * Information about the logger definition version.
    */
  var Definition: js.UndefOr[LoggerDefinitionVersion] = js.native
  /**
    * The ID of the logger definition version.
    */
  var Id: js.UndefOr[string] = js.native
  /**
    * The version of the logger definition version.
    */
  var Version: js.UndefOr[string] = js.native
}

object GetLoggerDefinitionVersionResponse {
  @scala.inline
  def apply(
    Arn: string = null,
    CreationTimestamp: string = null,
    Definition: LoggerDefinitionVersion = null,
    Id: string = null,
    Version: string = null
  ): GetLoggerDefinitionVersionResponse = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn.asInstanceOf[js.Any])
    if (CreationTimestamp != null) __obj.updateDynamic("CreationTimestamp")(CreationTimestamp.asInstanceOf[js.Any])
    if (Definition != null) __obj.updateDynamic("Definition")(Definition.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (Version != null) __obj.updateDynamic("Version")(Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLoggerDefinitionVersionResponse]
  }
}

