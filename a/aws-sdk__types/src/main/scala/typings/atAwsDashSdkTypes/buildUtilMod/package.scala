package typings.atAwsDashSdkTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildUtilMod {
  import typings.atAwsDashSdkTypes.Anon_ConnectionError
  import typings.atAwsDashSdkTypes.buildHttpMod.HttpEndpoint
  import typings.std.Error
  import typings.std.Uint8Array

  type BodyLengthCalculator = js.Function1[/* body */ js.Any, js.UndefOr[Double]]
  type Decoder = js.Function1[/* input */ String, Uint8Array]
  type DelayDecider = js.Function2[/* delayBase */ Double, /* attempts */ Double, Double]
  type Encoder = js.Function1[/* input */ Uint8Array, String]
  type Provider[T] = js.Function0[js.Promise[T]]
  type RetryDecider = js.Function1[/* error */ SdkError, Boolean]
  type SdkError = Error with Anon_ConnectionError
  type UrlParser = js.Function1[/* url */ String, HttpEndpoint]
}
