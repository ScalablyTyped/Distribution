package typings.canvaskitWasm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SkGlyphPosition extends js.Object {
  var affinity: SkAffinity
  var pos: Double
}

object SkGlyphPosition {
  @scala.inline
  def apply(affinity: SkAffinity, pos: Double): SkGlyphPosition = {
    val __obj = js.Dynamic.literal(affinity = affinity.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SkGlyphPosition]
  }
}

