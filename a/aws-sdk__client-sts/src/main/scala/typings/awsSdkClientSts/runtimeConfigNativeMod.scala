package typings.awsSdkClientSts

import typings.awsSdkClientSts.anon.Base64Encoder
import typings.awsSdkClientSts.stsclientMod.STSClientConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object runtimeConfigNativeMod {
  
  @JSImport("@aws-sdk/client-sts/dist-types/runtimeConfig.native", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getRuntimeConfig(config: STSClientConfig): Base64Encoder = ^.asInstanceOf[js.Dynamic].applyDynamic("getRuntimeConfig")(config.asInstanceOf[js.Any]).asInstanceOf[Base64Encoder]
}
