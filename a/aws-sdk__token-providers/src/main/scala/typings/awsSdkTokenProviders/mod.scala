package typings.awsSdkTokenProviders

import typings.awsSdkTokenProviders.distTypesFromSsoMod.FromSsoInit
import typings.awsSdkTokenProviders.distTypesFromStaticMod.FromStaticInit
import typings.awsSdkTypes.distTypesIdentityTokenIdentityMod.TokenIdentityProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/token-providers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromSso(): TokenIdentityProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("fromSso")().asInstanceOf[TokenIdentityProvider]
  inline def fromSso(init: FromSsoInit): TokenIdentityProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("fromSso")(init.asInstanceOf[js.Any]).asInstanceOf[TokenIdentityProvider]
  
  inline def fromStatic(param0: FromStaticInit): TokenIdentityProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("fromStatic")(param0.asInstanceOf[js.Any]).asInstanceOf[TokenIdentityProvider]
  
  inline def nodeProvider(): TokenIdentityProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("nodeProvider")().asInstanceOf[TokenIdentityProvider]
  inline def nodeProvider(init: FromSsoInit): TokenIdentityProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("nodeProvider")(init.asInstanceOf[js.Any]).asInstanceOf[TokenIdentityProvider]
}
