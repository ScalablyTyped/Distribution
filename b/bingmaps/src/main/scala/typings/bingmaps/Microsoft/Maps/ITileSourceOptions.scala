package typings.bingmaps.Microsoft.Maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITileSourceOptions extends StObject {
  
  /**
    * A bounding box that specifies where tiles are available.
    * Note: This will not crop tiles to the specific bounding box, it limits the tiles it loads to those that intersect this bounding box.
    */
  var bounds: js.UndefOr[LocationRect] = js.native
  
  /** The maximum zoom level tiles that tiles should be rendered at. */
  var maxZoom: js.UndefOr[Double] = js.native
  
  /** The minimum zoom level tiles that tiles should be rendered at. */
  var minZoom: js.UndefOr[Double] = js.native
  
  /**
    * Required. This can be a string or a callback function that constructs the URLs used to retrieve tiles from the tile source.
    * When using a string, the uriConstructor will allow you to specify placeholders that will be replaced with the tiles value (i.e. {quadkey}).
    * See the Tile URL Parameters section for a list of supported parameters.
    * Besides using formatted tile URLs, you can also specify a callback function as the uriConstructor. This is useful if you need to be able to
    * build custom tile URL’s that may require some additional calculations for a tile.
    */
  var uriConstructor: String | (js.Function1[/* tile */ PyramidTileId, String]) = js.native
}
object ITileSourceOptions {
  
  @scala.inline
  def apply(uriConstructor: String | (js.Function1[/* tile */ PyramidTileId, String])): ITileSourceOptions = {
    val __obj = js.Dynamic.literal(uriConstructor = uriConstructor.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITileSourceOptions]
  }
  
  @scala.inline
  implicit class ITileSourceOptionsMutableBuilder[Self <: ITileSourceOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBounds(value: LocationRect): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
    
    @scala.inline
    def setMaxZoom(value: Double): Self = StObject.set(x, "maxZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxZoomUndefined: Self = StObject.set(x, "maxZoom", js.undefined)
    
    @scala.inline
    def setMinZoom(value: Double): Self = StObject.set(x, "minZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinZoomUndefined: Self = StObject.set(x, "minZoom", js.undefined)
    
    @scala.inline
    def setUriConstructor(value: String | (js.Function1[/* tile */ PyramidTileId, String])): Self = StObject.set(x, "uriConstructor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUriConstructorFunction1(value: /* tile */ PyramidTileId => String): Self = StObject.set(x, "uriConstructor", js.Any.fromFunction1(value))
  }
}
