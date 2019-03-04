package typings
package baconjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Error[E] extends js.Object {
  var error: E
  var retriesDone: scala.Double
}

object Anon_Error {
  @scala.inline
  def apply[E](error: E, retriesDone: scala.Double): Anon_Error[E] = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], retriesDone = retriesDone)
  
    __obj.asInstanceOf[Anon_Error[E]]
  }
}

