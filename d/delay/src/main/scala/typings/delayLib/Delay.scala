package typings
package delayLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Delay extends js.Object {
  /**
  	 * Create a promise which resolves after the specified `milliseconds`.
  	 *
  	 * @param milliseconds - Milliseconds to delay the promise.
  	 * @returns A promise which resolves after the specified `milliseconds`.
  	 */
  def apply(milliseconds: scala.Double): js.Any = js.native
  def apply(
    milliseconds: scala.Double,
    options: /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Options */ js.Any
  ): js.Any = js.native
  /**
  	 * Create a promise which rejects after the specified `milliseconds`.
  	 *
  	 * @param milliseconds - Milliseconds to delay the promise.
  	 * @returns A promise which rejects after the specified `milliseconds`.
  	 */
  // TODO: Allow providing value type after https://github.com/Microsoft/TypeScript/issues/5413 will be resolved.
  def reject(milliseconds: scala.Double): js.Any = js.native
  def reject(
    milliseconds: scala.Double,
    options: (/* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Options */ js.Any) with Anon_ValueAny
  ): js.Any = js.native
}

