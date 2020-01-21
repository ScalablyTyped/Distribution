package typings.awsSdkClientLambdaNode

import typings.awsSdkClientLambdaNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientLambdaNode.typesFunctionConfigurationMod.UnmarshalledFunctionConfiguration
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-lambda-node/types/ListFunctionsOutput", JSImport.Namespace)
@js.native
object typesListFunctionsOutputMod extends js.Object {
  @js.native
  trait ListFunctionsOutput extends OutputTypesUnion {
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    /**
      * <p>A list of Lambda functions.</p>
      */
    var Functions: js.UndefOr[js.Array[UnmarshalledFunctionConfiguration]] = js.native
    /**
      * <p>A string, present if there are more functions.</p>
      */
    var NextMarker: js.UndefOr[String] = js.native
  }
  
}

