package typings.awsSdkClientKinesisBrowser

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkClientKinesisBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkTypes.abortMod.AbortSignal
import typings.awsSdkTypes.httpMod.BrowserHttpOptions
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kinesis-browser/types/AddTagsToStreamInput", JSImport.Namespace)
@js.native
object typesAddTagsToStreamInputMod extends js.Object {
  @js.native
  trait AddTagsToStreamInput extends InputTypesUnion {
    /**
      * An object that may be queried to determine if the underlying operation has been aborted.
      *
      * @see https://developer.mozilla.org/en-US/docs/Web/API/AbortSignal
      */
    @JSName("$abortSignal")
    var $abortSignal: js.UndefOr[AbortSignal] = js.native
    /**
      * Per-request HTTP configuration options. If set, any options specified will override the corresponding HTTP option set on the client for this command.
      */
    @JSName("$httpOptions")
    var $httpOptions: js.UndefOr[BrowserHttpOptions] = js.native
    /**
      * The maximum number of times this operation should be retried. If set, this value will override the `maxRetries` configuration set on the client for this command.
      */
    @JSName("$maxRetries")
    var $maxRetries: js.UndefOr[Double] = js.native
    /**
      * <p>The name of the stream.</p>
      */
    var StreamName: String = js.native
    /**
      * <p>A set of up to 10 key-value pairs to use to create the tags.</p>
      */
    var Tags: StringDictionary[String] | (Iterable[js.Tuple2[String, String]]) = js.native
  }
  
}

