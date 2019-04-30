package typings
package cesiumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Heading extends js.Object {
  var heading: scala.Double
  var pitch: scala.Double
  var roll: scala.Double
}

object Anon_Heading {
  @scala.inline
  def apply(heading: scala.Double, pitch: scala.Double, roll: scala.Double): Anon_Heading = {
    val __obj = js.Dynamic.literal(heading = heading, pitch = pitch, roll = roll)
  
    __obj.asInstanceOf[Anon_Heading]
  }
}

