package typings.baconjs.baconjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class Initial
  * @augments Bacon.Event
  * @description The initial (current) value of a [Property]{@link Bacon.Property}. Call [Event.isInitial]{@link Bacon.Event#isInitial} to distinguish from other events. Only sent immediately after subscription to a Property.
  * */
@JSImport("baconjs", "Initial")
@js.native
class Initial[A] protected ()
  extends typings.baconjs.Bacon.Initial[A] {
  /**
    * @constructor
    * @constructs Bacon.Initial
    * @param {A} value
    * */
  def this(value: A) = this()
}

