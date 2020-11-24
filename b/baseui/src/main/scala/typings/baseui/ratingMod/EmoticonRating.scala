package typings.baseui.ratingMod

import typings.react.mod.Component
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("baseui/rating", "EmoticonRating")
@js.native
class EmoticonRating ()
  extends Component[EmoticonRatingProps, RatingState, js.Any] {
  
  def renderRatingContents(): js.Array[ReactNode] = js.native
  
  def selectItem(value: Double): Unit = js.native
  
  def updatePreview(): Unit = js.native
  def updatePreview(previewIndex: Double): Unit = js.native
}
