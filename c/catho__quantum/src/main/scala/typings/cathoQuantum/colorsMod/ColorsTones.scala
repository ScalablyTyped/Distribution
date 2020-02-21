package typings.cathoQuantum.colorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorsTones extends js.Object {
  var `100`: String
  var `300`: String
  var `500`: String
  var `700`: String
  var `900`: String
}

object ColorsTones {
  @scala.inline
  def apply(`100`: String, `300`: String, `500`: String, `700`: String, `900`: String): ColorsTones = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("100")(`100`.asInstanceOf[js.Any])
    __obj.updateDynamic("300")(`300`.asInstanceOf[js.Any])
    __obj.updateDynamic("500")(`500`.asInstanceOf[js.Any])
    __obj.updateDynamic("700")(`700`.asInstanceOf[js.Any])
    __obj.updateDynamic("900")(`900`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorsTones]
  }
}

