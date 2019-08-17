package typings.atAwsDashSdkAddDashGlacierDashChecksumDashHeadersDashNode

import typings.atAwsDashSdkTypes.buildCryptoMod.HashConstructor
import typings.atAwsDashSdkTypes.buildMiddlewareMod.BuildHandler
import typings.atAwsDashSdkTypes.buildMiddlewareMod.BuildHandlerArguments
import typings.atAwsDashSdkTypes.buildUtilMod.Decoder
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/add-glacier-checksum-headers-node", JSImport.Namespace)
@js.native
object atAwsDashSdkAddDashGlacierDashChecksumDashHeadersDashNodeMod extends js.Object {
  def addChecksumHeaders(Sha256: HashConstructor, fromUtf8: Decoder): js.Function1[
    /* next */ BuildHandler[_, _, Readable], 
    js.Function1[/* hasRequestRest */ BuildHandlerArguments[_, Readable], js.Promise[_]]
  ] = js.native
}

