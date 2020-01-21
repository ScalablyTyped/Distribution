package typings.baconjs

import typings.baconjs.transformMod.Transformer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs/types/doaction", JSImport.Namespace)
@js.native
object doactionMod extends js.Object {
  def default[V](f: js.Function1[/* value */ V, _]): Transformer[V, V] = js.native
}

