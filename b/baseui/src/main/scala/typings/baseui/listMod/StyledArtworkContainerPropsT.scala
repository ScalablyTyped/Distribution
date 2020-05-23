package typings.baseui.listMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StyledArtworkContainerPropsT extends js.Object {
  @JSName("$artworkSize")
  var $artworkSize: ArtworkSizesT
  @JSName("$sublist")
  var $sublist: js.UndefOr[Boolean] = js.undefined
}

object StyledArtworkContainerPropsT {
  @scala.inline
  def apply($artworkSize: ArtworkSizesT, $sublist: js.UndefOr[Boolean] = js.undefined): StyledArtworkContainerPropsT = {
    val __obj = js.Dynamic.literal($artworkSize = $artworkSize.asInstanceOf[js.Any])
    if (!js.isUndefined($sublist)) __obj.updateDynamic("$sublist")($sublist.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyledArtworkContainerPropsT]
  }
}

