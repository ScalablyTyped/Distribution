package typings.colorDashCheck.colorDashCheckMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RGB extends js.Object {
  var b: String | Double
  var g: String | Double
  var r: String | Double
}

object RGB {
  @scala.inline
  def apply(b: String | Double, g: String | Double, r: String | Double): RGB = {
    val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RGB]
  }
}

