package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Wrapper class for promise with external resolve and reject.
  */
@JSGlobal("BABYLON.Deferred")
@js.native
/**
  * Constructor for this deferred object.
  */
class Deferred[T] () extends js.Object {
  var _reject: js.Any = js.native
  var _resolve: js.Any = js.native
  /**
    * The promise associated with this deferred object.
    */
  val promise: js.Promise[T] = js.native
  /**
    * The reject method of the promise associated with this deferred object.
    */
  def reject(): scala.Unit = js.native
  def reject(reason: js.Any): scala.Unit = js.native
  /**
    * The resolve method of the promise associated with this deferred object.
    */
  def resolve(): scala.Unit = js.native
  def resolve(value: T): scala.Unit = js.native
  def resolve(value: js.Thenable[T]): scala.Unit = js.native
}

