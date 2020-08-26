package typings.baseui.listMod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PropsT extends js.Object {
  var artwork: js.UndefOr[ReactNode] = js.native
  var artworkSize: js.UndefOr[ArtworkSizesT | Double] = js.native
  var children: ReactNode = js.native
  var endEnhancer: js.UndefOr[ReactNode] = js.native
  var overrides: js.UndefOr[OverridesT] = js.native
  var sublist: js.UndefOr[Boolean] = js.native
}

object PropsT {
  @scala.inline
  def apply(): PropsT = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PropsT]
  }
  @scala.inline
  implicit class PropsTOps[Self <: PropsT] (val x: Self) extends AnyVal {
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
    def setArtwork(value: ReactNode): Self = this.set("artwork", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArtwork: Self = this.set("artwork", js.undefined)
    @scala.inline
    def setArtworkSize(value: ArtworkSizesT | Double): Self = this.set("artworkSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArtworkSize: Self = this.set("artworkSize", js.undefined)
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setEndEnhancer(value: ReactNode): Self = this.set("endEnhancer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndEnhancer: Self = this.set("endEnhancer", js.undefined)
    @scala.inline
    def setOverrides(value: OverridesT): Self = this.set("overrides", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverrides: Self = this.set("overrides", js.undefined)
    @scala.inline
    def setSublist(value: Boolean): Self = this.set("sublist", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSublist: Self = this.set("sublist", js.undefined)
  }
  
}

