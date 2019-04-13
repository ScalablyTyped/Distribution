package typings
package bluebirdDashLstLib.bluebirdDashLstMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Resolver[R] extends js.Object {
  /**
    * Returns a reference to the controlled promise that can be passed to clients.
    */
  var promise: Bluebird[R] = js.native
  /**
    * Gives you a callback representation of the `PromiseResolver`. Note that this is not a method but a property. The callback accepts error object in first argument and success values on the 2nd parameter and the rest, I.E. node js conventions.
    *
    * If the the callback is called with multiple success values, the resolver fullfills its promise with an array of the values.
    */
  // TODO specify resolver callback
  def callback(err: js.Any, value: R, values: R*): scala.Unit = js.native
  /**
    * Reject the underlying promise with `reason` as the rejection reason.
    */
  def reject(reason: js.Any): scala.Unit = js.native
  def resolve(): scala.Unit = js.native
  /**
    * Resolve the underlying promise with `value` as the resolution value. If `value` is a thenable or a promise, the underlying promise will assume its state.
    */
  def resolve(value: R): scala.Unit = js.native
}

