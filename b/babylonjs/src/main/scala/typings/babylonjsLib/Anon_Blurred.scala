package typings
package babylonjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Blurred extends js.Object {
  var blurred: babylonjsLib.BABYLONNs.PostProcess
  var weight: scala.Double
}

object Anon_Blurred {
  @scala.inline
  def apply(blurred: babylonjsLib.BABYLONNs.PostProcess, weight: scala.Double): Anon_Blurred = {
    val __obj = js.Dynamic.literal(blurred = blurred, weight = weight)
  
    __obj.asInstanceOf[Anon_Blurred]
  }
}

