package typings.bingmaps.Microsoft.Maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TileSource extends js.Object {
  
  /**
    * Gets the specified bounding box of the of the tile source.
    * @returns The specified bounding box of the of the tile source.
    */
  def getBounds(): LocationRect = js.native
  
  /**
    * Gets the pixel height of each tile in the tile source.
    * @returns The pixel height of each tile in the tile source.
    */
  def getHeight(): Double = js.native
  
  /**
    * Gets the maximum zoom level specified for the tile source.
    * @returns The maximum zoom level specified for the tile source.
    */
  def getMaxZoom(): Double = js.native
  
  /**
    * Gets the minimum zoom level specified for the tile source.
    * @returns The minimum zoom level specified for the tile source.
    */
  def getMinZoom(): Double = js.native
  
  /**
    * Gets a string that constructs tile URLs used to retrieve tiles for the tile layer.
    * @returns A string that constructs tile URLs used to retrieve tiles for the tile layer.
    */
  def getUriConstructor(): String | (js.Function1[/* tile */ PyramidTileId, String]) = js.native
  
  /**
    * Gets the pixel width of each tile in the tile source.
    * @returns The pixel width of each tile in the tile source.
    */
  def getWidth(): Double = js.native
}
object TileSource {
  
  @scala.inline
  def apply(
    getBounds: () => LocationRect,
    getHeight: () => Double,
    getMaxZoom: () => Double,
    getMinZoom: () => Double,
    getUriConstructor: () => String | (js.Function1[/* tile */ PyramidTileId, String]),
    getWidth: () => Double
  ): TileSource = {
    val __obj = js.Dynamic.literal(getBounds = js.Any.fromFunction0(getBounds), getHeight = js.Any.fromFunction0(getHeight), getMaxZoom = js.Any.fromFunction0(getMaxZoom), getMinZoom = js.Any.fromFunction0(getMinZoom), getUriConstructor = js.Any.fromFunction0(getUriConstructor), getWidth = js.Any.fromFunction0(getWidth))
    __obj.asInstanceOf[TileSource]
  }
  
  @scala.inline
  implicit class TileSourceOps[Self <: TileSource] (val x: Self) extends AnyVal {
    
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
    def setGetBounds(value: () => LocationRect): Self = this.set("getBounds", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetHeight(value: () => Double): Self = this.set("getHeight", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMaxZoom(value: () => Double): Self = this.set("getMaxZoom", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMinZoom(value: () => Double): Self = this.set("getMinZoom", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetUriConstructor(value: () => String | (js.Function1[/* tile */ PyramidTileId, String])): Self = this.set("getUriConstructor", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetWidth(value: () => Double): Self = this.set("getWidth", js.Any.fromFunction0(value))
  }
}
