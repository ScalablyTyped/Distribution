package typings.awsSdkRetryMiddleware

import typings.awsSdkTypes.middlewareMod.FinalizeHandler
import typings.awsSdkTypes.responseMod.MetadataBearer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/retry-middleware", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def defaultDelayDecider(delayBase: Double, attempts: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultDelayDecider")(delayBase.asInstanceOf[js.Any], attempts.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def defaultRetryDecider(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultRetryDecider")().asInstanceOf[js.Any]
  inline def defaultRetryDecider(retryClockSkewErrors: Boolean): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultRetryDecider")(retryClockSkewErrors.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  inline def retryMiddleware(maxRetries: Double): js.Function1[
    /* next */ FinalizeHandler[js.Any, MetadataBearer], 
    FinalizeHandler[js.Any, MetadataBearer]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("retryMiddleware")(maxRetries.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* next */ FinalizeHandler[js.Any, MetadataBearer], 
    FinalizeHandler[js.Any, MetadataBearer]
  ]]
  inline def retryMiddleware(
    maxRetries: Double,
    retryDecider: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RetryDecider */ js.Any
  ): js.Function1[
    /* next */ FinalizeHandler[js.Any, MetadataBearer], 
    FinalizeHandler[js.Any, MetadataBearer]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("retryMiddleware")(maxRetries.asInstanceOf[js.Any], retryDecider.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* next */ FinalizeHandler[js.Any, MetadataBearer], 
    FinalizeHandler[js.Any, MetadataBearer]
  ]]
  inline def retryMiddleware(
    maxRetries: Double,
    retryDecider: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RetryDecider */ js.Any,
    delayDecider: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DelayDecider */ js.Any
  ): js.Function1[
    /* next */ FinalizeHandler[js.Any, MetadataBearer], 
    FinalizeHandler[js.Any, MetadataBearer]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("retryMiddleware")(maxRetries.asInstanceOf[js.Any], retryDecider.asInstanceOf[js.Any], delayDecider.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* next */ FinalizeHandler[js.Any, MetadataBearer], 
    FinalizeHandler[js.Any, MetadataBearer]
  ]]
  inline def retryMiddleware(
    maxRetries: Double,
    retryDecider: Unit,
    delayDecider: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DelayDecider */ js.Any
  ): js.Function1[
    /* next */ FinalizeHandler[js.Any, MetadataBearer], 
    FinalizeHandler[js.Any, MetadataBearer]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("retryMiddleware")(maxRetries.asInstanceOf[js.Any], retryDecider.asInstanceOf[js.Any], delayDecider.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* next */ FinalizeHandler[js.Any, MetadataBearer], 
    FinalizeHandler[js.Any, MetadataBearer]
  ]]
}
