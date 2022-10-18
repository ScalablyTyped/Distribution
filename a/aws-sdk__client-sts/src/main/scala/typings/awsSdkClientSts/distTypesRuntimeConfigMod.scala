package typings.awsSdkClientSts

import typings.awsSdkClientSts.anon.Base64Decoder
import typings.awsSdkClientSts.distTypesStsclientMod.STSClientConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesRuntimeConfigMod {
  
  @JSImport("@aws-sdk/client-sts/dist-types/runtimeConfig", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getRuntimeConfig(config: STSClientConfig): Base64Decoder = ^.asInstanceOf[js.Dynamic].applyDynamic("getRuntimeConfig")(config.asInstanceOf[js.Any]).asInstanceOf[Base64Decoder]
}
