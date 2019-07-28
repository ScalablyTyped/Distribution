package typings.breeze.breezeNs.promisesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPromiseService extends js.Object {
  def defer[T](): IDeferred[T] = js.native
  def reject(): js.Promise[_] = js.native
  def reject(reason: js.Any): js.Promise[_] = js.native
  def resolve[T](`object`: T): js.Promise[T] = js.native
  def resolve[T](`object`: js.Promise[T]): js.Promise[T] = js.native
}

