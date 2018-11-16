package typings
package cropperjsLib.cropperjsMod.cropperjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CroppedCanvasOptions extends js.Object {
  /**
           * a color to fill any alpha values in the output canvas
           */
  var fillColor: js.UndefOr[java.lang.String] = js.undefined
  /**
           * the destination height of the output canvas
           */
  var height: js.UndefOr[scala.Double] = js.undefined
  /**
           * image smoothing
           */
  var imageSmoothingEnabled: js.UndefOr[scala.Boolean] = js.undefined
  var imageSmoothingQuality: js.UndefOr[
    cropperjsLib.cropperjsLibStrings.low | cropperjsLib.cropperjsLibStrings.medium | cropperjsLib.cropperjsLibStrings.high
  ] = js.undefined
  var maxHeight: js.UndefOr[scala.Double] = js.undefined
  var maxWidth: js.UndefOr[scala.Double] = js.undefined
  var minHeight: js.UndefOr[scala.Double] = js.undefined
  var minWidth: js.UndefOr[scala.Double] = js.undefined
  /**
           * the destination width of the output canvas
           */
  var width: js.UndefOr[scala.Double] = js.undefined
}

