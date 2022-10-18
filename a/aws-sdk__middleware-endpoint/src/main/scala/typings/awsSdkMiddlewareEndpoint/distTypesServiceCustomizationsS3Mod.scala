package typings.awsSdkMiddlewareEndpoint

import typings.awsSdkTypes.distTypesEndpointMod.EndpointParameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesServiceCustomizationsS3Mod {
  
  @JSImport("@aws-sdk/middleware-endpoint/dist-types/service-customizations/s3", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@aws-sdk/middleware-endpoint/dist-types/service-customizations/s3", "DOT_PATTERN")
  @js.native
  val DOT_PATTERN: js.RegExp = js.native
  
  @JSImport("@aws-sdk/middleware-endpoint/dist-types/service-customizations/s3", "S3_HOSTNAME_PATTERN")
  @js.native
  val S3_HOSTNAME_PATTERN: js.RegExp = js.native
  
  inline def isArnBucketName(bucketName: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArnBucketName")(bucketName.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isDnsCompatibleBucketName(bucketName: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDnsCompatibleBucketName")(bucketName.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def resolveParamsForS3(endpointParams: EndpointParameters): js.Promise[EndpointParameters] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveParamsForS3")(endpointParams.asInstanceOf[js.Any]).asInstanceOf[js.Promise[EndpointParameters]]
}
