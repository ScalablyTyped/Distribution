package typings
package delayLib.delayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Delay extends js.Object {
  /**
  	Create a promise which resolves after the specified `milliseconds`.
  	@param milliseconds - Milliseconds to delay the promise.
  	@returns A promise which resolves after the specified `milliseconds`.
  	*/
  def apply(milliseconds: scala.Double): ClearablePromise[scala.Unit] = js.native
  def apply(milliseconds: scala.Double, options: Options): ClearablePromise[scala.Unit] = js.native
  /**
  	Create a promise which rejects after the specified `milliseconds`.
  	@param milliseconds - Milliseconds to delay the promise.
  	@returns A promise which rejects after the specified `milliseconds`.
  	*/
  // TODO: Allow providing value type after https://github.com/Microsoft/TypeScript/issues/5413 will be resolved.
  def reject(milliseconds: scala.Double): ClearablePromise[scala.Nothing] = js.native
  def reject(milliseconds: scala.Double, options: Options with delayLib.Anon_ValueUnknown): ClearablePromise[scala.Nothing] = js.native
}

