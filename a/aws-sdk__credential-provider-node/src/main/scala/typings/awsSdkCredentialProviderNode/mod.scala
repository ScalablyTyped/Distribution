package typings.awsSdkCredentialProviderNode

import typings.awsSdkCredentialProviderNode.distTypesDefaultProviderMod.DefaultProviderInit
import typings.awsSdkTypes.distTypesCredentialsMod.Credentials
import typings.awsSdkTypes.distTypesUtilMod.MemoizedProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/credential-provider-node", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def defaultProvider(): MemoizedProvider[Credentials] = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultProvider")().asInstanceOf[MemoizedProvider[Credentials]]
  inline def defaultProvider(init: DefaultProviderInit): MemoizedProvider[Credentials] = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultProvider")(init.asInstanceOf[js.Any]).asInstanceOf[MemoizedProvider[Credentials]]
}
