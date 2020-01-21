package typings.awsSdkClientKinesisBrowser

import typings.awsSdkClientKinesisBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kinesis-browser/types/ListStreamsOutput", JSImport.Namespace)
@js.native
object typesListStreamsOutputMod extends js.Object {
  @js.native
  trait ListStreamsOutput extends OutputTypesUnion {
    /**
      * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
      */
    @JSName("$metadata")
    var $metadata: ResponseMetadata = js.native
    /**
      * <p>If set to <code>true</code>, there are more streams available to list.</p>
      */
    var HasMoreStreams: Boolean = js.native
    /**
      * <p>The names of the streams that are associated with the AWS account making the <code>ListStreams</code> request.</p>
      */
    var StreamNames: js.Array[String] = js.native
  }
  
}

