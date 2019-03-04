package typings
package babylonjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Screen extends js.Object {
  val mozOrientation: java.lang.String
  val orientation: java.lang.String
}

object Screen {
  @scala.inline
  def apply(mozOrientation: java.lang.String, orientation: java.lang.String): Screen = {
    val __obj = js.Dynamic.literal(mozOrientation = mozOrientation, orientation = orientation)
  
    __obj.asInstanceOf[Screen]
  }
}

