package typings.baconjs.baconjsMod

import org.scalablytyped.runtime.StringDictionary
import typings.baconjs.Bacon.Observable
import typings.baconjs.Bacon.Property
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs", "combineTemplate")
@js.native
object combineTemplate extends js.Object {
  /**
    * @function
    * @description Combines [Property]{@link Bacon.Property}s, [EventStream]{@link Bacon.EventStream}s and constant values using a `template` object.
    * @param {{string:number|boolean|string|Object|Observable<E, *>}} template
    * @returns {Property<E, A>}
    */
  def apply[E, A](template: StringDictionary[Double | Boolean | String | js.Object | (Observable[E, _])]): Property[E, A] = js.native
}

