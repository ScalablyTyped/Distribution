package typings.baconjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("baconjs", "Value")
@js.native
abstract class Value[V] protected ()
  extends typings.baconjs.eventMod.Value[V] {
  def this(value: V) = this()
}
