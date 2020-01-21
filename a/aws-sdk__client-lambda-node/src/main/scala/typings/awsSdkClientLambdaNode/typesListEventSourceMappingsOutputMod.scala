package typings.awsSdkClientLambdaNode

import typings.awsSdkClientLambdaNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientLambdaNode.typesEventSourceMappingConfigurationMod.UnmarshalledEventSourceMappingConfiguration
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-lambda-node/types/ListEventSourceMappingsOutput", JSImport.Namespace)
@js.native
object typesListEventSourceMappingsOutputMod extends js.Object {
  @js.native
  trait ListEventSourceMappingsOutput extends OutputTypesUnion {
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    /**
      * <p>An array of <code>EventSourceMappingConfiguration</code> objects.</p>
      */
    var EventSourceMappings: js.UndefOr[js.Array[UnmarshalledEventSourceMappingConfiguration]] = js.native
    /**
      * <p>A string, present if there are more event source mappings.</p>
      */
    var NextMarker: js.UndefOr[String] = js.native
  }
  
}

