package typings.awsSdkClientLambdaNode

import typings.awsSdkClientLambdaNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-lambda-node/types/InvokeAsyncOutput", JSImport.Namespace)
@js.native
object typesInvokeAsyncOutputMod extends js.Object {
  @js.native
  trait InvokeAsyncOutput extends OutputTypesUnion {
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    /**
      * <p>It will be 202 upon success.</p>
      */
    var Status: js.UndefOr[Double] = js.native
  }
  
}

