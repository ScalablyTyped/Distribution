package typings.babylonjs.legacyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Legacy/legacy", "Observable")
@js.native
/**
  * Creates a new observable
  * @param onObserverAdded defines a callback to call when a new observer is added
  */
class Observable[T] ()
  extends typings.babylonjs.indexMod.Observable[T] {
  def this(onObserverAdded: js.Function1[/* observer */ typings.babylonjs.observableMod.Observer[T], Unit]) = this()
}

