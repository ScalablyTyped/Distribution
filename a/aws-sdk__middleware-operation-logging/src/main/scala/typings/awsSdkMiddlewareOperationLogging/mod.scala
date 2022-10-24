package typings.awsSdkMiddlewareOperationLogging

import typings.awsSdkTypes.distTypesMiddlewareMod.Handler
import typings.awsSdkTypes.distTypesMiddlewareMod.HandlerExecutionContext
import typings.awsSdkTypes.distTypesResponseMod.MetadataBearer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/middleware-operation-logging", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def logOperationInfoMiddleware[Input /* <: js.Object */, Output /* <: MetadataBearer */](next: Handler[Input, Output], param1: HandlerExecutionContext): js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HandlerArguments<Input> */ /* args */ Any, 
    js.Promise[Output]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("logOperationInfoMiddleware")(next.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HandlerArguments<Input> */ /* args */ Any, 
    js.Promise[Output]
  ]]
}
