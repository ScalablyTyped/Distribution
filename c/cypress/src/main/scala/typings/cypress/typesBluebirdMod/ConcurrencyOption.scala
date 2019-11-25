package typings.cypress.typesBluebirdMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConcurrencyOption extends js.Object {
  var concurrency: Double
}

object ConcurrencyOption {
  @scala.inline
  def apply(concurrency: Double): ConcurrencyOption = {
    val __obj = js.Dynamic.literal(concurrency = concurrency.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ConcurrencyOption]
  }
}

