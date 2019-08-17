package typings.atAwsDashSdkAddDashGlacierDashChecksumDashHeadersDashBrowser

import typings.atAwsDashSdkTypes.buildCryptoMod.HashConstructor
import typings.atAwsDashSdkTypes.buildMiddlewareMod.BuildHandler
import typings.atAwsDashSdkTypes.buildMiddlewareMod.BuildHandlerArguments
import typings.atAwsDashSdkTypes.buildUtilMod.Decoder
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/add-glacier-checksum-headers-browser", JSImport.Namespace)
@js.native
object atAwsDashSdkAddDashGlacierDashChecksumDashHeadersDashBrowserMod extends js.Object {
  def addChecksumHeaders(Sha256: HashConstructor, fromUtf8: Decoder): js.Function1[
    /* next */ BuildHandler[_, _, Blob], 
    js.Function1[/* hasRequestRest */ BuildHandlerArguments[_, Blob], js.Promise[_]]
  ] = js.native
}

