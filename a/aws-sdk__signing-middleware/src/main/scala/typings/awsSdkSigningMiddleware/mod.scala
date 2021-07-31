package typings.awsSdkSigningMiddleware

import typings.awsSdkTypes.signatureMod.RequestSigner
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/signing-middleware", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def signingMiddleware[Input /* <: js.Object */, Output /* <: js.Object */, Stream](signer: RequestSigner): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("signingMiddleware")(signer.asInstanceOf[js.Any]).asInstanceOf[js.Any]
}
