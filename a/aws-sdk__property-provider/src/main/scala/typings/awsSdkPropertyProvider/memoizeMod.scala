package typings.awsSdkPropertyProvider

import typings.awsSdkTypes.utilMod.Provider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object memoizeMod {
  
  @JSImport("@aws-sdk/property-provider/dist/cjs/memoize", "memoize")
  @js.native
  val memoize: MemoizeOverload = js.native
  
  @js.native
  trait MemoizeOverload extends StObject {
    
    /**
      *
      * Decorates a provider function with either static memoization.
      *
      * To create a statically memoized provider, supply a provider as the only
      * argument to this function. The provider will be invoked once, and all
      * invocations of the provider returned by `memoize` will return the same
      * promise object.
      *
      * @param provider The provider whose result should be cached indefinitely.
      */
    def apply[T](provider: Provider[T]): Provider[T] = js.native
    /**
      * Decorates a provider function with refreshing memoization.
      *
      * @param provider          The provider whose result should be cached.
      * @param isExpired         A function that will evaluate the resolved value and
      *                          determine if it is expired. For example, when
      *                          memoizing AWS credential providers, this function
      *                          should return `true` when the credential's
      *                          expiration is in the past (or very near future) and
      *                          `false` otherwise.
      * @param requiresRefresh   A function that will evaluate the resolved value and
      *                          determine if it represents static value or one that
      *                          will eventually need to be refreshed. For example,
      *                          AWS credentials that have no defined expiration will
      *                          never need to be refreshed, so this function would
      *                          return `true` if the credentials resolved by the
      *                          underlying provider had an expiration and `false`
      *                          otherwise.
      */
    def apply[T](provider: Provider[T], isExpired: js.Function1[/* resolved */ T, Boolean]): Provider[T] = js.native
    def apply[T](
      provider: Provider[T],
      isExpired: js.Function1[/* resolved */ T, Boolean],
      requiresRefresh: js.Function1[/* resolved */ T, Boolean]
    ): Provider[T] = js.native
  }
}
