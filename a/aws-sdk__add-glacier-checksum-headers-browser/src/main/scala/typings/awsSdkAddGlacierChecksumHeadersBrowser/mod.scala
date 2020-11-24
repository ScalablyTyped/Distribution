package typings.awsSdkAddGlacierChecksumHeadersBrowser

import typings.awsSdkTypes.cryptoMod.HashConstructor
import typings.awsSdkTypes.middlewareMod.BuildHandler
import typings.awsSdkTypes.middlewareMod.BuildHandlerArguments
import typings.awsSdkTypes.utilMod.Decoder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/add-glacier-checksum-headers-browser", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def addChecksumHeaders(Sha256: HashConstructor, fromUtf8: Decoder): js.Function1[
    /* next */ BuildHandler[_, _], 
    js.Function1[/* hasRequestRest */ BuildHandlerArguments[_], js.Promise[_]]
  ] = js.native
}
