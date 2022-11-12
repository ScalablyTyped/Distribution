package typings.awsSdkTokenProviders

import typings.awsSdkTokenProviders.distTypesFromSsoMod.FromSsoInit
import typings.awsSdkTokenProviders.distTypesFromStaticMod.FromStaticInit
import typings.awsSdkTypes.distTypesTokenMod.TokenProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/token-providers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromSso(): TokenProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("fromSso")().asInstanceOf[TokenProvider]
  inline def fromSso(init: FromSsoInit): TokenProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("fromSso")(init.asInstanceOf[js.Any]).asInstanceOf[TokenProvider]
  
  inline def fromStatic(param0: FromStaticInit): TokenProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("fromStatic")(param0.asInstanceOf[js.Any]).asInstanceOf[TokenProvider]
  
  inline def nodeProvider(): TokenProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("nodeProvider")().asInstanceOf[TokenProvider]
  inline def nodeProvider(init: FromSsoInit): TokenProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("nodeProvider")(init.asInstanceOf[js.Any]).asInstanceOf[TokenProvider]
}
