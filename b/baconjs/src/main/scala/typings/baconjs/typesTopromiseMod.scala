package typings.baconjs

import typings.baconjs.typesObservableMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs/types/topromise", JSImport.Namespace)
@js.native
object typesTopromiseMod extends js.Object {
  def firstToPromise[V](src: default[V]): js.Promise[V] = js.native
  def firstToPromise[V](src: default[V], PromiseCtr: js.Function): js.Promise[V] = js.native
  def toPromise[V](src: default[V]): js.Promise[V] = js.native
  def toPromise[V](src: default[V], PromiseCtr: js.Function): js.Promise[V] = js.native
}

