package typings.awsSdkClientLambdaNode

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkClientLambdaNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientLambdaNode.typesConcurrencyMod.UnmarshalledConcurrency
import typings.awsSdkClientLambdaNode.typesFunctionCodeLocationMod.UnmarshalledFunctionCodeLocation
import typings.awsSdkClientLambdaNode.typesFunctionConfigurationMod.UnmarshalledFunctionConfiguration
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-lambda-node/types/GetFunctionOutput", JSImport.Namespace)
@js.native
object typesGetFunctionOutputMod extends js.Object {
  @js.native
  trait GetFunctionOutput extends OutputTypesUnion {
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    /**
      * <p>The function's code.</p>
      */
    var Code: js.UndefOr[UnmarshalledFunctionCodeLocation] = js.native
    /**
      * <p>The concurrent execution limit set for this function. For more information, see <a href="http://docs.aws.amazon.com/lambda/latest/dg/concurrent-executions.html">Managing Concurrency</a>.</p>
      */
    var Concurrency: js.UndefOr[UnmarshalledConcurrency] = js.native
    /**
      * <p>The function's configuration.</p>
      */
    var Configuration: js.UndefOr[UnmarshalledFunctionConfiguration] = js.native
    /**
      * <p>Returns the list of tags associated with the function. For more information, see <a href="http://docs.aws.amazon.com/lambda/latest/dg/tagging.html">Tagging Lambda Functions</a> in the <b>AWS Lambda Developer Guide</b>.</p>
      */
    var Tags: js.UndefOr[StringDictionary[String]] = js.native
  }
  
}

