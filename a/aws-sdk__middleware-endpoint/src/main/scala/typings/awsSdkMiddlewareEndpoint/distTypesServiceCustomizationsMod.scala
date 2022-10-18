package typings.awsSdkMiddlewareEndpoint

import typings.awsSdkTypes.distTypesEndpointMod.EndpointParameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesServiceCustomizationsMod {
  
  @JSImport("@aws-sdk/middleware-endpoint/dist-types/service-customizations", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@aws-sdk/middleware-endpoint/dist-types/service-customizations", "DOT_PATTERN")
  @js.native
  val DOT_PATTERN: js.RegExp = js.native
  
  @JSImport("@aws-sdk/middleware-endpoint/dist-types/service-customizations", "S3_HOSTNAME_PATTERN")
  @js.native
  val S3_HOSTNAME_PATTERN: js.RegExp = js.native
  
  inline def isArnBucketName(bucketName: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArnBucketName")(bucketName.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isDnsCompatibleBucketName(bucketName: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDnsCompatibleBucketName")(bucketName.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def resolveParamsForS3(endpointParams: EndpointParameters): js.Promise[EndpointParameters] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveParamsForS3")(endpointParams.asInstanceOf[js.Any]).asInstanceOf[js.Promise[EndpointParameters]]
}
