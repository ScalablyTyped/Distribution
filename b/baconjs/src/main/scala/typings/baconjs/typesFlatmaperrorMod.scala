package typings.baconjs

import typings.baconjs.typesFlatmapUnderscoreMod.EventOrValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs/types/flatmaperror", JSImport.Namespace)
@js.native
object typesFlatmaperrorMod extends js.Object {
  def default[V, V2](
    src: typings.baconjs.typesObservableMod.default[V],
    f: js.Function1[
      /* error */ js.Any, 
      typings.baconjs.typesObservableMod.default[V2] | EventOrValue[V2]
    ]
  ): typings.baconjs.typesObservableMod.default[V | V2] = js.native
}

