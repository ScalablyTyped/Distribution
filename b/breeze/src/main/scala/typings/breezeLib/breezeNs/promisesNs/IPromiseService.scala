package typings
package breezeLib.breezeNs.promisesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPromiseService extends js.Object {
  def defer[T](): IDeferred[T] = js.native
  def reject(): stdLib.Promise[_] = js.native
  def reject(reason: js.Any): stdLib.Promise[_] = js.native
  def resolve[T](`object`: T): stdLib.Promise[T] = js.native
  def resolve[T](`object`: stdLib.Promise[T]): stdLib.Promise[T] = js.native
}

