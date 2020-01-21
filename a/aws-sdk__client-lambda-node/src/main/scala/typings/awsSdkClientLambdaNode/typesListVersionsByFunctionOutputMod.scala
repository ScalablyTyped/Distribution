package typings.awsSdkClientLambdaNode

import typings.awsSdkClientLambdaNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientLambdaNode.typesFunctionConfigurationMod.UnmarshalledFunctionConfiguration
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-lambda-node/types/ListVersionsByFunctionOutput", JSImport.Namespace)
@js.native
object typesListVersionsByFunctionOutputMod extends js.Object {
  @js.native
  trait ListVersionsByFunctionOutput extends OutputTypesUnion {
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    /**
      * <p>A string, present if there are more function versions.</p>
      */
    var NextMarker: js.UndefOr[String] = js.native
    /**
      * <p>A list of Lambda function versions.</p>
      */
    var Versions: js.UndefOr[js.Array[UnmarshalledFunctionConfiguration]] = js.native
  }
  
}

