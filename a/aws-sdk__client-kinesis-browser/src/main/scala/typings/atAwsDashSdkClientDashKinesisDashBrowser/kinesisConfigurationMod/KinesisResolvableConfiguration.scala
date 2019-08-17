package typings.atAwsDashSdkClientDashKinesisDashBrowser.kinesisConfigurationMod

import typings.atAwsDashSdkTypes.buildMarshallerMod.RequestSerializer
import typings.atAwsDashSdkTypes.buildUnmarshallerMod.ResponseParser
import typings.atAwsDashSdkTypes.buildUtilMod.Provider
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KinesisResolvableConfiguration extends KinesisConfiguration {
  /**
    * Whether the HTTP handler was injected by the user and should thus not be destroyed when this client is
    */
  var _user_injected_http_handler: js.Any = js.native
  /**
    * The parser to use when converting HTTP responses to SDK output types
    */
  var parser: ResponseParser[Blob] = js.native
  /**
    * The serializer to use when converting SDK input to HTTP requests
    */
  @JSName("serializer")
  var serializer_Original: Provider[RequestSerializer[Blob]] = js.native
  /**
    * A function that can calculate the length of a request body.
    */
  def bodyLengthChecker(body: js.Any): js.UndefOr[Double] = js.native
  /**
    * The serializer to use when converting SDK input to HTTP requests
    */
  def serializer(): js.Promise[RequestSerializer[Blob]] = js.native
}

