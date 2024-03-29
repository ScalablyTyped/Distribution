package typings.awsSdkTokenProviders

import typings.awsSdkTypes.distTypesIdentityTokenIdentityMod.TokenIdentity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesValidateTokenExpiryMod {
  
  @JSImport("@aws-sdk/token-providers/dist-types/validateTokenExpiry", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def validateTokenExpiry(token: TokenIdentity): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("validateTokenExpiry")(token.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
