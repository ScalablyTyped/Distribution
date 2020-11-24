package typings.awsSdkClientKmsNode.kmsconfigurationMod

import typings.awsSdkTypes.serdeMod.RequestSerializer
import typings.awsSdkTypes.utilMod.Provider
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KMSResolvableConfiguration extends KMSConfiguration {
  
  /**
    * Whether the HTTP handler was injected by the user and should thus not be destroyed when this client is
    */
  var _user_injected_http_handler: js.Any = js.native
  
  /**
    * A function that can calculate the length of a request body.
    */
  def bodyLengthChecker(body: js.Any): js.UndefOr[Double] = js.native
  
  /**
    * The parser to use when converting HTTP responses to SDK output types
    */
  var parser: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.ResponseParser<_stream.Readable> */ js.Any = js.native
  
  /**
    * The serializer to use when converting SDK input to HTTP requests
    */
  def serializer(): js.Promise[RequestSerializer[Readable, _]] = js.native
  /**
    * The serializer to use when converting SDK input to HTTP requests
    */
  @JSName("serializer")
  var serializer_Original: Provider[RequestSerializer[Readable, _]] = js.native
}
