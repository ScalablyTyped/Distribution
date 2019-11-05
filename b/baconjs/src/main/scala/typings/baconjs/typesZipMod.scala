package typings.baconjs

import typings.baconjs.typesObservableMod.EventStream
import typings.baconjs.typesObservableMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs/types/zip", JSImport.Namespace)
@js.native
object typesZipMod extends js.Object {
  def zip[V, V2, Out](left: default[V], right: default[V2], f: js.Function2[/* left */ V, /* right */ V2, Out]): EventStream[Out] = js.native
  def zipAsArray[V](args: (default[V] | js.Array[default[V]])*): default[js.Array[V]] = js.native
  def zipWith[Out](f: js.Function1[/* repeated */ js.Any, Out], streams: default[_]*): EventStream[Out] = js.native
}

