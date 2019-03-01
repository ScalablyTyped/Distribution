package typings
package babylonjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Capacity extends js.Object {
  var capacity: scala.Double
  var randomTextureSize: scala.Double
}

object Anon_Capacity {
  @scala.inline
  def apply(capacity: scala.Double, randomTextureSize: scala.Double): Anon_Capacity = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("capacity")(capacity)
    __obj.updateDynamic("randomTextureSize")(randomTextureSize)
    __obj.asInstanceOf[Anon_Capacity]
  }
}

