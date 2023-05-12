package typings.awsSdkClientDynamodb

import typings.awsSdkClientDynamodb.anon.ApiVersion
import typings.awsSdkClientDynamodb.distTypesDynamoDBClientMod.DynamoDBClientConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesRuntimeConfigDotbrowserMod {
  
  @JSImport("@aws-sdk/client-dynamodb/dist-types/runtimeConfig.browser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getRuntimeConfig(config: DynamoDBClientConfig): ApiVersion = ^.asInstanceOf[js.Dynamic].applyDynamic("getRuntimeConfig")(config.asInstanceOf[js.Any]).asInstanceOf[ApiVersion]
}
