package typings.baseui.ratingMod

import typings.react.mod.Component
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baseui/rating", "StarRating")
@js.native
class StarRating ()
  extends Component[StarRatingProps, RatingState, js.Any] {
  def renderRatingContents(): js.Array[ReactNode] = js.native
  def selectItem(value: Double): Unit = js.native
  def updatePreview(): Unit = js.native
  def updatePreview(previewIndex: Double): Unit = js.native
}

