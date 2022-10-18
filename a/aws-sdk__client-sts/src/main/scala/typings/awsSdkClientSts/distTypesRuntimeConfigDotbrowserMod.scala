package typings.awsSdkClientSts

import typings.awsSdkClientSts.anon.ApiVersion
import typings.awsSdkClientSts.distTypesStsclientMod.STSClientConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesRuntimeConfigDotbrowserMod {
  
  @JSImport("@aws-sdk/client-sts/dist-types/runtimeConfig.browser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getRuntimeConfig(config: STSClientConfig): ApiVersion = ^.asInstanceOf[js.Dynamic].applyDynamic("getRuntimeConfig")(config.asInstanceOf[js.Any]).asInstanceOf[ApiVersion]
}
