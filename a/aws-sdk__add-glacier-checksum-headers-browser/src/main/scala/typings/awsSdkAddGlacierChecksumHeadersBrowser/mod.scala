package typings.awsSdkAddGlacierChecksumHeadersBrowser

import typings.awsSdkTypes.distTypesCryptoMod.HashConstructor
import typings.awsSdkTypes.distTypesMiddlewareMod.BuildHandler
import typings.awsSdkTypes.distTypesMiddlewareMod.BuildHandlerArguments
import typings.awsSdkTypes.distTypesUtilMod.Decoder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/add-glacier-checksum-headers-browser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addChecksumHeaders(Sha256: HashConstructor, fromUtf8: Decoder): js.Function1[
    /* next */ BuildHandler[Any, Any], 
    js.Function1[/* param0 */ BuildHandlerArguments[Any], js.Promise[Any]]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("addChecksumHeaders")(Sha256.asInstanceOf[js.Any], fromUtf8.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* next */ BuildHandler[Any, Any], 
    js.Function1[/* param0 */ BuildHandlerArguments[Any], js.Promise[Any]]
  ]]
}
