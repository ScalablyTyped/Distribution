package typings.atAwsDashSdkClientDashLambdaDashNode.typesUnderscoreAliasConfigurationMod

import typings.atAwsDashSdkClientDashLambdaDashNode.typesUnderscoreAliasRoutingConfigurationMod._UnmarshalledAliasRoutingConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledAliasConfiguration extends _AliasConfiguration {
  /**
    * <p>Specifies an additional function versions the alias points to, allowing you to dictate what percentage of traffic will invoke each version.</p>
    */
  @JSName("RoutingConfig")
  var RoutingConfig__UnmarshalledAliasConfiguration: js.UndefOr[_UnmarshalledAliasRoutingConfiguration] = js.undefined
}

object _UnmarshalledAliasConfiguration {
  @scala.inline
  def apply(
    AliasArn: String = null,
    Description: String = null,
    FunctionVersion: String = null,
    Name: String = null,
    RevisionId: String = null,
    RoutingConfig: _UnmarshalledAliasRoutingConfiguration = null
  ): _UnmarshalledAliasConfiguration = {
    val __obj = js.Dynamic.literal()
    if (AliasArn != null) __obj.updateDynamic("AliasArn")(AliasArn)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (FunctionVersion != null) __obj.updateDynamic("FunctionVersion")(FunctionVersion)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (RevisionId != null) __obj.updateDynamic("RevisionId")(RevisionId)
    if (RoutingConfig != null) __obj.updateDynamic("RoutingConfig")(RoutingConfig)
    __obj.asInstanceOf[_UnmarshalledAliasConfiguration]
  }
}

