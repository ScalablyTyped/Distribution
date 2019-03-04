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
    val __obj = js.Dynamic.literal(capacity = capacity, is32Bits = is32Bits, references = references)
  
    __obj.asInstanceOf[WebGLBuffer]
  }
}

