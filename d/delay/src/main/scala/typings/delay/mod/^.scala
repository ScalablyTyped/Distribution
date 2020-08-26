package typings.delay.mod

import typings.delay.anon.ClearTimeout
import typings.delay.anon.Optionsvalueunknownundefi
import typings.delay.anon.Value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("delay", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  // TODO: Remove this for the next major release.
  var default: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof delay */ js.Any = js.native
  /**
  	Create a promise which resolves after the specified `milliseconds`.
  	@param milliseconds - Milliseconds to delay the promise.
  	@returns A promise which resolves after the specified `milliseconds`.
  	*/
  def apply(milliseconds: Double): ClearablePromise[Unit] = js.native
  def apply(milliseconds: Double, options: Options): ClearablePromise[Unit] = js.native
  def createWithTimers(timers: ClearTimeout): Delay = js.native
  /**
  	Create a promise which resolves after a random amount of milliseconds between `minimum` and `maximum` has passed.
  	Useful for tests and web scraping since they can have unpredictable performance. For example, if you have a test that asserts a method should not take longer than a certain amount of time, and then run it on a CI, it could take longer. So with `.range()`, you could give it a threshold instead.
  	@param minimum - Minimum amount of milliseconds to delay the promise.
  	@param maximum - Maximum amount of milliseconds to delay the promise.
  	@returns A promise which resolves after a random amount of milliseconds between `maximum` and `maximum` has passed.
  	*/
  def range[T](minimum: Double, maximum: Double): ClearablePromise[T] = js.native
  def range[T](minimum: Double, maximum: Double, options: Options with Value[T]): ClearablePromise[T] = js.native
  // TODO: Allow providing value type after https://github.com/Microsoft/TypeScript/issues/5413 is resolved.
  /**
  	Create a promise which rejects after the specified `milliseconds`.
  	@param milliseconds - Milliseconds to delay the promise.
  	@returns A promise which rejects after the specified `milliseconds`.
  	*/
  def reject(milliseconds: Double): ClearablePromise[scala.Nothing] = js.native
  def reject(milliseconds: Double, options: Optionsvalueunknownundefi): ClearablePromise[scala.Nothing] = js.native
}

