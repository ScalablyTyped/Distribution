package typings.atAwsDashSdkClientDashLambdaDashNode

import typings.atAwsDashSdkClientDashLambdaDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashLambdaDashNode.typesUnderscoreFunctionConfigurationMod._UnmarshalledFunctionConfiguration
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
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
    var Functions: js.UndefOr[js.Array[_UnmarshalledFunctionConfiguration]] = js.native
    /**
      * <p>A string, present if there are more functions.</p>
      */
    var NextMarker: js.UndefOr[String] = js.native
  }
  
}

