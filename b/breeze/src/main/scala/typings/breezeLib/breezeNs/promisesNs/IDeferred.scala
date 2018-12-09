package typings
package breezeLib.breezeNs.promisesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IDeferred[T] extends js.Object {
  var promise: js.Promise[T]
  def reject(reason: js.Any): scala.Unit
  def resolve(value: T): scala.Unit
}

