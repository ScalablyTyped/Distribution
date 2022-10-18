package typings.awsSdkRetryMiddleware

import typings.awsSdkTypes.distTypesMiddlewareMod.FinalizeHandler
import typings.awsSdkTypes.distTypesResponseMod.MetadataBearer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/retry-middleware", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def defaultDelayDecider(delayBase: Double, attempts: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultDelayDecider")(delayBase.asInstanceOf[js.Any], attempts.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def defaultRetryDecider(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultRetryDecider")().asInstanceOf[Any]
  inline def defaultRetryDecider(retryClockSkewErrors: Boolean): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultRetryDecider")(retryClockSkewErrors.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def retryMiddleware(maxRetries: Double): js.Function1[
    /* next */ FinalizeHandler[Any, MetadataBearer], 
    FinalizeHandler[Any, MetadataBearer]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("retryMiddleware")(maxRetries.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* next */ FinalizeHandler[Any, MetadataBearer], 
    FinalizeHandler[Any, MetadataBearer]
  ]]
  inline def retryMiddleware(
    maxRetries: Double,
    retryDecider: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RetryDecider */ Any
  ): js.Function1[
    /* next */ FinalizeHandler[Any, MetadataBearer], 
    FinalizeHandler[Any, MetadataBearer]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("retryMiddleware")(maxRetries.asInstanceOf[js.Any], retryDecider.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* next */ FinalizeHandler[Any, MetadataBearer], 
    FinalizeHandler[Any, MetadataBearer]
  ]]
  inline def retryMiddleware(
    maxRetries: Double,
    retryDecider: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RetryDecider */ Any,
    delayDecider: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DelayDecider */ Any
  ): js.Function1[
    /* next */ FinalizeHandler[Any, MetadataBearer], 
    FinalizeHandler[Any, MetadataBearer]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("retryMiddleware")(maxRetries.asInstanceOf[js.Any], retryDecider.asInstanceOf[js.Any], delayDecider.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* next */ FinalizeHandler[Any, MetadataBearer], 
    FinalizeHandler[Any, MetadataBearer]
  ]]
  inline def retryMiddleware(
    maxRetries: Double,
    retryDecider: Unit,
    delayDecider: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DelayDecider */ Any
  ): js.Function1[
    /* next */ FinalizeHandler[Any, MetadataBearer], 
    FinalizeHandler[Any, MetadataBearer]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("retryMiddleware")(maxRetries.asInstanceOf[js.Any], retryDecider.asInstanceOf[js.Any], delayDecider.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* next */ FinalizeHandler[Any, MetadataBearer], 
    FinalizeHandler[Any, MetadataBearer]
  ]]
}
