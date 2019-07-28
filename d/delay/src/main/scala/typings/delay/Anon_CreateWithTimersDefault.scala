package typings.delay

import typings.delay.delayMod.ClearablePromise
import typings.delay.delayMod.Delay
import typings.delay.delayMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_CreateWithTimersDefault extends js.Object {
  // TODO: Remove this for the next major release
  @JSName("default")
  var default_Original: Delay with Anon_CreateWithTimers = js.native
  def createWithTimers(timers: Anon_ClearTimeout): Delay = js.native
  /**
  	Create a promise which resolves after the specified `milliseconds`.
  	@param milliseconds - Milliseconds to delay the promise.
  	@returns A promise which resolves after the specified `milliseconds`.
  	*/
  // TODO: Remove this for the next major release
  def default(milliseconds: Double): ClearablePromise[Unit] = js.native
  def default(milliseconds: Double, options: Options): ClearablePromise[Unit] = js.native
  /**
  	Create a promise which resolves after the specified `milliseconds`.
  	@param milliseconds - Milliseconds to delay the promise.
  	@returns A promise which resolves after the specified `milliseconds`.
  	*/
  // TODO: Remove this for the next major release
  @JSName("default")
  def default_T[T](milliseconds: Double): ClearablePromise[T] = js.native
  @JSName("default")
  def default_T[T](milliseconds: Double, options: Options with Anon_Value[T]): ClearablePromise[T] = js.native
}

