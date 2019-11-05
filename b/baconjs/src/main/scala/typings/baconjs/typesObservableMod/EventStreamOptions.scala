package typings.baconjs.typesObservableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventStreamOptions extends js.Object {
  var forceAsync: Boolean
}

object EventStreamOptions {
  @scala.inline
  def apply(forceAsync: Boolean): EventStreamOptions = {
    val __obj = js.Dynamic.literal(forceAsync = forceAsync)
  
    __obj.asInstanceOf[EventStreamOptions]
  }
}

