package typings.baseui.ratingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StyledRatingItemProps extends js.Object {
  @JSName("$index")
  var $index: Double
  @JSName("$isActive")
  var $isActive: Boolean
  @JSName("$isSelected")
  var $isSelected: Boolean
  @JSName("$theme")
  var $theme: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Theme */ js.Any
}

object StyledRatingItemProps {
  @scala.inline
  def apply(
    $index: Double,
    $isActive: Boolean,
    $isSelected: Boolean,
    $theme: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Theme */ js.Any
  ): StyledRatingItemProps = {
    val __obj = js.Dynamic.literal($index = $index.asInstanceOf[js.Any], $isActive = $isActive.asInstanceOf[js.Any], $isSelected = $isSelected.asInstanceOf[js.Any], $theme = $theme.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StyledRatingItemProps]
  }
}

