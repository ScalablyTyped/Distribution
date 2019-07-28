package typings.d3pie

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Background extends js.Object {
  var background: js.UndefOr[String] = js.undefined
  var segmentStroke: js.UndefOr[String] = js.undefined
  var segments: js.UndefOr[js.Array[String]] = js.undefined
}

object Anon_Background {
  @scala.inline
  def apply(background: String = null, segmentStroke: String = null, segments: js.Array[String] = null): Anon_Background = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background)
    if (segmentStroke != null) __obj.updateDynamic("segmentStroke")(segmentStroke)
    if (segments != null) __obj.updateDynamic("segments")(segments)
    __obj.asInstanceOf[Anon_Background]
  }
}

