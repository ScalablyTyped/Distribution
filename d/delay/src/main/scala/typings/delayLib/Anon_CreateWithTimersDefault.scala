package typings
package delayLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_CreateWithTimersDefault extends js.Object {
  // TODO: Remove this for the next major release
  @JSName("default")
  var default_Original: delayLib.delayMod.Delay with Anon_CreateWithTimers = js.native
  def createWithTimers(timers: Anon_ClearTimeout): delayLib.delayMod.Delay = js.native
  /**
  	Create a promise which resolves after the specified `milliseconds`.
  	@param milliseconds - Milliseconds to delay the promise.
  	@returns A promise which resolves after the specified `milliseconds`.
  	*/
  // TODO: Remove this for the next major release
  def default(milliseconds: scala.Double): delayLib.delayMod.ClearablePromise[scala.Unit] = js.native
  def default(milliseconds: scala.Double, options: delayLib.delayMod.Options): delayLib.delayMod.ClearablePromise[scala.Unit] = js.native
  /**
  	Create a promise which resolves after the specified `milliseconds`.
  	@param milliseconds - Milliseconds to delay the promise.
  	@returns A promise which resolves after the specified `milliseconds`.
  	*/
  // TODO: Remove this for the next major release
  @JSName("default")
  def default_T[T](milliseconds: scala.Double): delayLib.delayMod.ClearablePromise[T] = js.native
  @JSName("default")
  def default_T[T](milliseconds: scala.Double, options: delayLib.delayMod.Options with Anon_Value[T]): delayLib.delayMod.ClearablePromise[T] = js.native
}

