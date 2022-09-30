package typings.awsSdkMiddlewareEndpoint

import typings.awsSdkMiddlewareEndpoint.endpointMiddlewareMod.PreviouslyResolvedServiceId
import typings.awsSdkMiddlewareEndpoint.resolveEndpointConfigMod.EndpointResolvedConfig
import typings.awsSdkMiddlewareEndpoint.typesMod.EndpointParameterInstructions
import typings.awsSdkTypes.endpointMod.EndpointParameters
import typings.awsSdkTypes.middlewareMod.HandlerExecutionContext
import typings.awsSdkTypes.middlewareMod.SerializeHandlerArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object s3Mod {
  
  @JSImport("@aws-sdk/middleware-endpoint/dist-types/service-customizations/s3", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@aws-sdk/middleware-endpoint/dist-types/service-customizations/s3", "DOT_PATTERN")
  @js.native
  val DOT_PATTERN: js.RegExp = js.native
  
  @JSImport("@aws-sdk/middleware-endpoint/dist-types/service-customizations/s3", "S3_HOSTNAME_PATTERN")
  @js.native
  val S3_HOSTNAME_PATTERN: js.RegExp = js.native
  
  inline def isDnsCompatibleBucketName(bucketName: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDnsCompatibleBucketName")(bucketName.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def s3Customizations[T /* <: EndpointParameters */](
    config: EndpointResolvedConfig[T] & PreviouslyResolvedServiceId,
    instructions: EndpointParameterInstructions,
    args: SerializeHandlerArguments[Any],
    context: HandlerExecutionContext
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("s3Customizations")(config.asInstanceOf[js.Any], instructions.asInstanceOf[js.Any], args.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
