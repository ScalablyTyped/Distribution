package typings.baconjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("baconjs", "Observable")
@js.native
abstract class Observable[V] protected ()
  extends typings.baconjs.observableMod.Observable[V] {
  def this(desc: typings.baconjs.describeMod.Desc) = this()
}
