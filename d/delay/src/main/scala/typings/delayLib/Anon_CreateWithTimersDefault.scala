package typings
package delayLib

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
  def default(milliseconds: scala.Double): js.Any = js.native
  def default(
    milliseconds: scala.Double,
    options: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify delay.Options */ js.Any
  ): js.Any = js.native
  /**
  	Create a promise which resolves after the specified `milliseconds`.
  	@param milliseconds - Milliseconds to delay the promise.
  	@returns A promise which resolves after the specified `milliseconds`.
  	*/
  // TODO: Remove this for the next major release
  @JSName("default")
  def default_T[T](milliseconds: scala.Double): js.Any = js.native
  @JSName("default")
  def default_T[T](
    milliseconds: scala.Double,
    options: (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify delay.Options */ js.Any) with Anon_Value[T]
  ): js.Any = js.native
}

