package typings.awsSdkAddGlacierChecksumHeadersBrowser

import typings.awsSdkTypes.cryptoMod.HashConstructor
import typings.awsSdkTypes.middlewareMod.BuildHandler
import typings.awsSdkTypes.middlewareMod.BuildHandlerArguments
import typings.awsSdkTypes.utilMod.Decoder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/add-glacier-checksum-headers-browser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def addChecksumHeaders(Sha256: HashConstructor, fromUtf8: Decoder): js.Function1[
    /* next */ BuildHandler[js.Any, js.Any], 
    js.Function1[
      /* hasHasBodyHeadersRequestRestRest */ BuildHandlerArguments[js.Any], 
      js.Promise[js.Any]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("addChecksumHeaders")(Sha256.asInstanceOf[js.Any], fromUtf8.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* next */ BuildHandler[js.Any, js.Any], 
    js.Function1[
      /* hasHasBodyHeadersRequestRestRest */ BuildHandlerArguments[js.Any], 
      js.Promise[js.Any]
    ]
  ]]
}
