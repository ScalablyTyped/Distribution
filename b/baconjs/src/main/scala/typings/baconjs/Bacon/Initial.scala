package typings.baconjs.Bacon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class Initial
  * @augments Bacon.Event
  * @description The initial (current) value of a [Property]{@link Bacon.Property}. Call [Event.isInitial]{@link Bacon.Event#isInitial} to distinguish from other events. Only sent immediately after subscription to a Property.
  * */
@JSGlobal("Bacon.Initial")
@js.native
class Initial[A] protected () extends Event[A] {
  /**
    * @constructor
    * @constructs Bacon.Initial
    * @param {A} value
    * */
  def this(value: A) = this()
}

