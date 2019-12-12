package typings.atAwsDashSdkClientDashLambdaDashNode

import typings.atAwsDashSdkClientDashLambdaDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashLambdaDashNode.typesUnderscoreAliasConfigurationMod._UnmarshalledAliasConfiguration
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-lambda-node/types/ListAliasesOutput", JSImport.Namespace)
@js.native
object typesListAliasesOutputMod extends js.Object {
  @js.native
  trait ListAliasesOutput extends OutputTypesUnion {
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    /**
      * <p>A list of aliases.</p>
      */
    var Aliases: js.UndefOr[js.Array[_UnmarshalledAliasConfiguration]] = js.native
    /**
      * <p>A string, present if there are more aliases.</p>
      */
    var NextMarker: js.UndefOr[String] = js.native
  }
  
}

