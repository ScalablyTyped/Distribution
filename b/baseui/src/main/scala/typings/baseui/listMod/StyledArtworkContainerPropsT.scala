package typings.baseui.listMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StyledArtworkContainerPropsT extends js.Object {
  @JSName("$artworkSize")
  var $artworkSize: ArtworkSizesT = js.native
  @JSName("$sublist")
  var $sublist: js.UndefOr[Boolean] = js.native
}

object StyledArtworkContainerPropsT {
  @scala.inline
  def apply($artworkSize: ArtworkSizesT): StyledArtworkContainerPropsT = {
    val __obj = js.Dynamic.literal($artworkSize = $artworkSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyledArtworkContainerPropsT]
  }
  @scala.inline
  implicit class StyledArtworkContainerPropsTOps[Self <: StyledArtworkContainerPropsT] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def set$artworkSize(value: ArtworkSizesT): Self = this.set("$artworkSize", value.asInstanceOf[js.Any])
    @scala.inline
    def set$sublist(value: Boolean): Self = this.set("$sublist", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$sublist: Self = this.set("$sublist", js.undefined)
  }
  
}

