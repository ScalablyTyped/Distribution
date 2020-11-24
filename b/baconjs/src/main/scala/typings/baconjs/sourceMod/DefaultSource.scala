package typings.baconjs.sourceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("baconjs/types/internal/source", "DefaultSource")
@js.native
class DefaultSource[V] () extends Source[V, V] {
  
  var value: js.UndefOr[Event[V]] = js.native
}
