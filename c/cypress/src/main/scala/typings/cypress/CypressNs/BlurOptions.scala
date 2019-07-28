package typings.cypress.CypressNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlurOptions
  extends Loggable
     with Forceable

object BlurOptions {
  @scala.inline
  def apply(force: Boolean, log: Boolean): BlurOptions = {
    val __obj = js.Dynamic.literal(force = force, log = log)
  
    __obj.asInstanceOf[BlurOptions]
  }
}

