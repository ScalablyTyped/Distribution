package typings
package colorDashCheckLib.colorDashCheckMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RGB extends js.Object {
  var b: java.lang.String | scala.Double
  var g: java.lang.String | scala.Double
  var r: java.lang.String | scala.Double
}

object RGB {
  @scala.inline
  def apply(
    b: java.lang.String | scala.Double,
    g: java.lang.String | scala.Double,
    r: java.lang.String | scala.Double
  ): RGB = {
    val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RGB]
  }
}

