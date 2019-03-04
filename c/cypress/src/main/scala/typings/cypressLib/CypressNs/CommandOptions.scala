package typings
package cypressLib.CypressNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandOptions extends js.Object {
  var prevSubject: scala.Boolean | PrevSubject | js.Array[PrevSubject]
}

object CommandOptions {
  @scala.inline
  def apply(prevSubject: scala.Boolean | PrevSubject | js.Array[PrevSubject]): CommandOptions = {
    val __obj = js.Dynamic.literal(prevSubject = prevSubject.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CommandOptions]
  }
}

