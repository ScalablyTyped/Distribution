package typings.baconjs.optionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @hidden */
@JSImport("baconjs/types/optional", "Some")
@js.native
class Some[V] protected () extends Option[V] {
  def this(value: V) = this()
  
  var _isSome: Boolean = js.native
  
  var value: V = js.native
}
