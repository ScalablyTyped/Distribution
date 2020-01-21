package typings.canvaskitWasm

import typings.canvaskitWasm.mod.SkPointMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLines extends js.Object {
  var Lines: SkPointMode
  var Points: SkPointMode
  var Polygon: SkPointMode
}

object AnonLines {
  @scala.inline
  def apply(Lines: SkPointMode, Points: SkPointMode, Polygon: SkPointMode): AnonLines = {
    val __obj = js.Dynamic.literal(Lines = Lines.asInstanceOf[js.Any], Points = Points.asInstanceOf[js.Any], Polygon = Polygon.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonLines]
  }
}

