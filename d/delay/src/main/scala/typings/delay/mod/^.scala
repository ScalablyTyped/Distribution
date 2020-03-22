package typings.delay.mod

import typings.delay.AnonClearTimeout
import typings.delay.Optionsvalueunknown
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("delay", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  // TODO: Remove this for the next major release
  var default: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof delay */ js.Any = js.native
  /**
  	Create a promise which resolves after the specified `milliseconds`.
  	@param milliseconds - Milliseconds to delay the promise.
  	@returns A promise which resolves after the specified `milliseconds`.
  	*/
  def apply(milliseconds: Double): ClearablePromise[Unit] = js.native
  def apply(milliseconds: Double, options: Options): ClearablePromise[Unit] = js.native
  def createWithTimers(timers: AnonClearTimeout): Delay = js.native
  /**
  	Create a promise which rejects after the specified `milliseconds`.
  	@param milliseconds - Milliseconds to delay the promise.
  	@returns A promise which rejects after the specified `milliseconds`.
  	*/
  // TODO: Allow providing value type after https://github.com/Microsoft/TypeScript/issues/5413 will be resolved.
  def reject(milliseconds: Double): ClearablePromise[scala.Nothing] = js.native
  def reject(milliseconds: Double, options: Optionsvalueunknown): ClearablePromise[scala.Nothing] = js.native
}

