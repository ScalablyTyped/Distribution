package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SheetStyle extends js.Object {
  /**
    * The display options for tiles.
    */
  var Tile: js.UndefOr[TileStyle] = js.native
  /**
    * The layout options for tiles.
    */
  var TileLayout: js.UndefOr[TileLayoutStyle] = js.native
}

object SheetStyle {
  @scala.inline
  def apply(): SheetStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SheetStyle]
  }
  @scala.inline
  implicit class SheetStyleOps[Self <: SheetStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setTile(value: TileStyle): Self = this.set("Tile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTile: Self = this.set("Tile", js.undefined)
    @scala.inline
    def setTileLayout(value: TileLayoutStyle): Self = this.set("TileLayout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTileLayout: Self = this.set("TileLayout", js.undefined)
  }
  
}

