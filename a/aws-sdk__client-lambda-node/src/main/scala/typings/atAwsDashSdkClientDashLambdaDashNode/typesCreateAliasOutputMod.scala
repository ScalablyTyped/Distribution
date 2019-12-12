package typings.atAwsDashSdkClientDashLambdaDashNode

import typings.atAwsDashSdkClientDashLambdaDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashLambdaDashNode.typesUnderscoreAliasRoutingConfigurationMod._UnmarshalledAliasRoutingConfiguration
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-lambda-node/types/CreateAliasOutput", JSImport.Namespace)
@js.native
object typesCreateAliasOutputMod extends js.Object {
  @js.native
  trait CreateAliasOutput extends OutputTypesUnion {
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    /**
      * <p>Lambda function ARN that is qualified using the alias name as the suffix. For example, if you create an alias called <code>BETA</code> that points to a helloworld function version, the ARN is <code>arn:aws:lambda:aws-regions:acct-id:function:helloworld:BETA</code>.</p>
      */
    var AliasArn: js.UndefOr[String] = js.native
    /**
      * <p>Alias description.</p>
      */
    var Description: js.UndefOr[String] = js.native
    /**
      * <p>Function version to which the alias points.</p>
      */
    var FunctionVersion: js.UndefOr[String] = js.native
    /**
      * <p>Alias name.</p>
      */
    var Name: js.UndefOr[String] = js.native
    /**
      * <p>Represents the latest updated revision of the function or alias.</p>
      */
    var RevisionId: js.UndefOr[String] = js.native
    /**
      * <p>Specifies an additional function versions the alias points to, allowing you to dictate what percentage of traffic will invoke each version.</p>
      */
    var RoutingConfig: js.UndefOr[_UnmarshalledAliasRoutingConfiguration] = js.native
  }
  
}

