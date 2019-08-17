package typings.atAwsDashSdkClientDashLambdaDashNode.typesUnderscoreAliasConfigurationMod

import typings.atAwsDashSdkClientDashLambdaDashNode.typesUnderscoreAliasRoutingConfigurationMod._AliasRoutingConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _AliasConfiguration extends js.Object {
  /**
    * <p>Lambda function ARN that is qualified using the alias name as the suffix. For example, if you create an alias called <code>BETA</code> that points to a helloworld function version, the ARN is <code>arn:aws:lambda:aws-regions:acct-id:function:helloworld:BETA</code>.</p>
    */
  var AliasArn: js.UndefOr[String] = js.undefined
  /**
    * <p>Alias description.</p>
    */
  var Description: js.UndefOr[String] = js.undefined
  /**
    * <p>Function version to which the alias points.</p>
    */
  var FunctionVersion: js.UndefOr[String] = js.undefined
  /**
    * <p>Alias name.</p>
    */
  var Name: js.UndefOr[String] = js.undefined
  /**
    * <p>Represents the latest updated revision of the function or alias.</p>
    */
  var RevisionId: js.UndefOr[String] = js.undefined
  /**
    * <p>Specifies an additional function versions the alias points to, allowing you to dictate what percentage of traffic will invoke each version.</p>
    */
  var RoutingConfig: js.UndefOr[_AliasRoutingConfiguration] = js.undefined
}

object _AliasConfiguration {
  @scala.inline
  def apply(
    AliasArn: String = null,
    Description: String = null,
    FunctionVersion: String = null,
    Name: String = null,
    RevisionId: String = null,
    RoutingConfig: _AliasRoutingConfiguration = null
  ): _AliasConfiguration = {
    val __obj = js.Dynamic.literal()
    if (AliasArn != null) __obj.updateDynamic("AliasArn")(AliasArn)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (FunctionVersion != null) __obj.updateDynamic("FunctionVersion")(FunctionVersion)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (RevisionId != null) __obj.updateDynamic("RevisionId")(RevisionId)
    if (RoutingConfig != null) __obj.updateDynamic("RoutingConfig")(RoutingConfig)
    __obj.asInstanceOf[_AliasConfiguration]
  }
}

