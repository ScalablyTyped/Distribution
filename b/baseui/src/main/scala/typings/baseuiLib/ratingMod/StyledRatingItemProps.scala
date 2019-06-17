package typings
package baseuiLib.ratingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StyledRatingItemProps extends js.Object {
  @JSName("$index")
  var $index: scala.Double
  @JSName("$isActive")
  var $isActive: scala.Boolean
  @JSName("$isSelected")
  var $isSelected: scala.Boolean
  @JSName("$theme")
  var $theme: baseuiLib.Theme
}

object StyledRatingItemProps {
  @scala.inline
  def apply(
    $index: scala.Double,
    $isActive: scala.Boolean,
    $isSelected: scala.Boolean,
    $theme: baseuiLib.Theme
  ): StyledRatingItemProps = {
    val __obj = js.Dynamic.literal($index = $index, $isActive = $isActive, $isSelected = $isSelected, $theme = $theme)
  
    __obj.asInstanceOf[StyledRatingItemProps]
  }
}

