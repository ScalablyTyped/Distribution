package typings
package babylonjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebGLBuffer extends js.Object {
  var capacity: scala.Double
  var is32Bits: scala.Boolean
  var references: scala.Double
}

object WebGLBuffer {
  @scala.inline
  def apply(capacity: scala.Double, is32Bits: scala.Boolean, references: scala.Double): WebGLBuffer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("capacity")(capacity)
    __obj.updateDynamic("is32Bits")(is32Bits)
    __obj.updateDynamic("references")(references)
    __obj.asInstanceOf[WebGLBuffer]
  }
}

