package typings.baconjs

import typings.baconjs.typesTransformMod.Transformer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs/types/maperror", JSImport.Namespace)
@js.native
object typesMaperrorMod extends js.Object {
  def default[V](f: V): Transformer[V, V] = js.native
  def default[V](f: js.Function1[/* error */ js.Any, V]): Transformer[V, V] = js.native
}

