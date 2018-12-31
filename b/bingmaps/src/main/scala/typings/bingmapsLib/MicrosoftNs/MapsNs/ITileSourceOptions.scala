package typings
package bingmapsLib.MicrosoftNs.MapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITileSourceOptions extends js.Object {
  /**
    * A bounding box that specifies where tiles are available.
    * Note: This will not crop tiles to the specific bounding box, it limits the tiles it loads to those that intersect this bounding box.
    */
  var bounds: js.UndefOr[LocationRect] = js.undefined
  /** The maximum zoom level tiles that tiles should be rendered at. */
  var maxZoom: js.UndefOr[scala.Double] = js.undefined
  /** The minimum zoom level tiles that tiles should be rendered at. */
  var minZoom: js.UndefOr[scala.Double] = js.undefined
  /**
    * Required. This can be a string or a callback function that constructs the URLs used to retrieve tiles from the tile source.
    * When using a string, the uriConstructor will allow you to specify placeholders that will be replaced with the tiles value (i.e. {quadkey}).
    * See the Tile URL Parameters section for a list of supported parameters.
    * Besides using formatted tile URLs, you can also specify a callback function as the uriConstructor. This is useful if you need to be able to
    * build custom tile URL’s that may require some additional calculations for a tile.
    */
  var uriConstructor: java.lang.String | (js.Function1[/* tile */ PyramidTileId, java.lang.String])
}

