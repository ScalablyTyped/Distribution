package typings
package bingmapsLib.MicrosoftNs.MapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IAnimatedTileLayerOptions extends js.Object {
  /** A boolean that specifies whether the animation should auto-start when it is added to the map or not. Default: true **/
  var autoPlay: js.UndefOr[scala.Boolean] = js.undefined
  /** The number of miliseconds between two layer frames. Default: 1000 **/
  var frameRate: js.UndefOr[scala.Double] = js.undefined
  /** A custom loading screen to show on the map when the map tiles are being fetched. **/
  var loadingScreen: js.UndefOr[CustomOverlay] = js.undefined
  /** The max amount of total loading time of all tiles in a viewport in milliseconds. Default: 15000 **/
  var maxTotalLoadTime: js.UndefOr[scala.Double] = js.undefined
  /** The array of tile layer sources to animate through. **/
  var mercator: js.Array[TileSource]
  /** A boolean specifying if the animated tile layer is visible or not. **/
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}

