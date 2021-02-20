package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SheetStyle extends StObject {
  
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
  implicit class SheetStyleMutableBuilder[Self <: SheetStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTile(value: TileStyle): Self = StObject.set(x, "Tile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTileLayout(value: TileLayoutStyle): Self = StObject.set(x, "TileLayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTileLayoutUndefined: Self = StObject.set(x, "TileLayout", js.undefined)
    
    @scala.inline
    def setTileUndefined: Self = StObject.set(x, "Tile", js.undefined)
  }
}
