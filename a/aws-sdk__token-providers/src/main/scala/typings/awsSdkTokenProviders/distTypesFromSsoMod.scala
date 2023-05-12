package typings.awsSdkTokenProviders

import typings.awsSdkSharedIniFileLoader.distTypesParseKnownFilesMod.SourceProfileInit
import typings.awsSdkTypes.distTypesIdentityTokenIdentityMod.TokenIdentityProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesFromSsoMod {
  
  @JSImport("@aws-sdk/token-providers/dist-types/fromSso", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromSso(): TokenIdentityProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("fromSso")().asInstanceOf[TokenIdentityProvider]
  inline def fromSso(init: FromSsoInit): TokenIdentityProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("fromSso")(init.asInstanceOf[js.Any]).asInstanceOf[TokenIdentityProvider]
  
  type FromSsoInit = SourceProfileInit
}
