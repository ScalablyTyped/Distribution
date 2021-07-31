package typings.awsSdkRetryMiddleware

import typings.awsSdkTypes.middlewareMod.FinalizeHandler
import typings.awsSdkTypes.responseMod.MetadataBearer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object retryMiddlewareMod {
  
  @JSImport("@aws-sdk/retry-middleware/build/retryMiddleware", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def retryMiddleware(maxRetries: Double): js.Function1[
    /* next */ FinalizeHandler[js.Any, MetadataBearer], 
    FinalizeHandler[js.Any, MetadataBearer]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("retryMiddleware")(maxRetries.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* next */ FinalizeHandler[js.Any, MetadataBearer], 
    FinalizeHandler[js.Any, MetadataBearer]
  ]]
  @scala.inline
  def retryMiddleware(
    maxRetries: Double,
    retryDecider: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RetryDecider */ js.Any
  ): js.Function1[
    /* next */ FinalizeHandler[js.Any, MetadataBearer], 
    FinalizeHandler[js.Any, MetadataBearer]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("retryMiddleware")(maxRetries.asInstanceOf[js.Any], retryDecider.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* next */ FinalizeHandler[js.Any, MetadataBearer], 
    FinalizeHandler[js.Any, MetadataBearer]
  ]]
  @scala.inline
  def retryMiddleware(
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
  @scala.inline
  def retryMiddleware(
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
