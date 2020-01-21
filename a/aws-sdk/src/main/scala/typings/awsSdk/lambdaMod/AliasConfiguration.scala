package typings.awsSdk.lambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AliasConfiguration extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the alias.
    */
  var AliasArn: js.UndefOr[FunctionArn] = js.native
  /**
    * A description of the alias.
    */
  var Description: js.UndefOr[typings.awsSdk.lambdaMod.Description] = js.native
  /**
    * The function version that the alias invokes.
    */
  var FunctionVersion: js.UndefOr[Version] = js.native
  /**
    * The name of the alias.
    */
  var Name: js.UndefOr[Alias] = js.native
  /**
    * A unique identifier that changes when you update the alias.
    */
  var RevisionId: js.UndefOr[String] = js.native
  /**
    * The routing configuration of the alias.
    */
  var RoutingConfig: js.UndefOr[AliasRoutingConfiguration] = js.native
}

object AliasConfiguration {
  @scala.inline
  def apply(
    AliasArn: FunctionArn = null,
    Description: Description = null,
    FunctionVersion: Version = null,
    Name: Alias = null,
    RevisionId: String = null,
    RoutingConfig: AliasRoutingConfiguration = null
  ): AliasConfiguration = {
    val __obj = js.Dynamic.literal()
    if (AliasArn != null) __obj.updateDynamic("AliasArn")(AliasArn.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (FunctionVersion != null) __obj.updateDynamic("FunctionVersion")(FunctionVersion.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (RevisionId != null) __obj.updateDynamic("RevisionId")(RevisionId.asInstanceOf[js.Any])
    if (RoutingConfig != null) __obj.updateDynamic("RoutingConfig")(RoutingConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[AliasConfiguration]
  }
}

