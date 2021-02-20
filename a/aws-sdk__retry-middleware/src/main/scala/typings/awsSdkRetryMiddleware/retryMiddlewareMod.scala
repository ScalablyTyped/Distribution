package typings.awsSdkRetryMiddleware

import typings.awsSdkTypes.middlewareMod.FinalizeHandler
import typings.awsSdkTypes.responseMod.MetadataBearer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object retryMiddlewareMod {
  
  @JSImport("@aws-sdk/retry-middleware/build/retryMiddleware", "retryMiddleware")
  @js.native
  def retryMiddleware(maxRetries: Double): js.Function1[/* next */ FinalizeHandler[_, MetadataBearer], FinalizeHandler[_, MetadataBearer]] = js.native
  @JSImport("@aws-sdk/retry-middleware/build/retryMiddleware", "retryMiddleware")
  @js.native
  def retryMiddleware(
    maxRetries: Double,
    retryDecider: js.UndefOr[scala.Nothing],
    delayDecider: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DelayDecider */ js.Any
  ): js.Function1[/* next */ FinalizeHandler[_, MetadataBearer], FinalizeHandler[_, MetadataBearer]] = js.native
  @JSImport("@aws-sdk/retry-middleware/build/retryMiddleware", "retryMiddleware")
  @js.native
  def retryMiddleware(
    maxRetries: Double,
    retryDecider: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RetryDecider */ js.Any
  ): js.Function1[/* next */ FinalizeHandler[_, MetadataBearer], FinalizeHandler[_, MetadataBearer]] = js.native
  @JSImport("@aws-sdk/retry-middleware/build/retryMiddleware", "retryMiddleware")
  @js.native
  def retryMiddleware(
    maxRetries: Double,
    retryDecider: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RetryDecider */ js.Any,
    delayDecider: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DelayDecider */ js.Any
  ): js.Function1[/* next */ FinalizeHandler[_, MetadataBearer], FinalizeHandler[_, MetadataBearer]] = js.native
}
