package typings.babylonjs.indexMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "Observable")
@js.native
/**
  * Creates a new observable
  * @param onObserverAdded defines a callback to call when a new observer is added
  */
class Observable[T] ()
  extends typings.babylonjs.miscIndexMod.Observable[T] {
  def this(onObserverAdded: js.Function1[/* observer */ typings.babylonjs.observableMod.Observer[T], Unit]) = this()
}
