package typings.awsSdkTokenProviders

import typings.awsSdkTokenProviders.distTypesFromSsoMod.FromSsoInit
import typings.awsSdkTypes.distTypesTokenMod.TokenProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesNodeProviderMod {
  
  @JSImport("@aws-sdk/token-providers/dist-types/nodeProvider", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def nodeProvider(): TokenProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("nodeProvider")().asInstanceOf[TokenProvider]
  inline def nodeProvider(init: FromSsoInit): TokenProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("nodeProvider")(init.asInstanceOf[js.Any]).asInstanceOf[TokenProvider]
}
