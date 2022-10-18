package typings.awsSdkSigningMiddleware

import typings.awsSdkTypes.distTypesSignatureMod.RequestSigner
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/signing-middleware", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def signingMiddleware[Input /* <: js.Object */, Output /* <: js.Object */, Stream](signer: RequestSigner): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("signingMiddleware")(signer.asInstanceOf[js.Any]).asInstanceOf[Any]
}
