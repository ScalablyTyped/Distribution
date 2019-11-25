package typings.atAwsDashSdkClientDashLambdaDashNode.typesGetAliasOutputMod

import typings.atAwsDashSdkClientDashLambdaDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashLambdaDashNode.typesUnderscoreAliasRoutingConfigurationMod._UnmarshalledAliasRoutingConfiguration
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetAliasOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
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
  var RoutingConfig: js.UndefOr[_UnmarshalledAliasRoutingConfiguration] = js.undefined
}

object GetAliasOutput {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    AliasArn: String = null,
    Description: String = null,
    FunctionVersion: String = null,
    Name: String = null,
    RevisionId: String = null,
    RoutingConfig: _UnmarshalledAliasRoutingConfiguration = null
  ): GetAliasOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (AliasArn != null) __obj.updateDynamic("AliasArn")(AliasArn.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (FunctionVersion != null) __obj.updateDynamic("FunctionVersion")(FunctionVersion.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (RevisionId != null) __obj.updateDynamic("RevisionId")(RevisionId.asInstanceOf[js.Any])
    if (RoutingConfig != null) __obj.updateDynamic("RoutingConfig")(RoutingConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAliasOutput]
  }
}

