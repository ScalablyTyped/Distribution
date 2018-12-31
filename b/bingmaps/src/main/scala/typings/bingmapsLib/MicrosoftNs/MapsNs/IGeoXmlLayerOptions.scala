package typings
package bingmapsLib.MicrosoftNs.MapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGeoXmlLayerOptions extends IGeoXmlReadOptions {
  /** A boolean indicating if the map should automatically upate the view when a data set is loaded. Default: true */
  var autoUpdateMapView: js.UndefOr[scala.Boolean] = js.undefined
  /** Options used to customize how the default infobox renders. */
  var infoboxOptions: js.UndefOr[IInfoboxOptions] = js.undefined
  /** An optional name to identify the layer by. */
  var layerName: js.UndefOr[java.lang.String] = js.undefined
  /** A boolean indicating if infoboxes should automatically appear when shapes clicked. Default: false */
  var suppressInfoboxes: js.UndefOr[scala.Boolean] = js.undefined
  /** A boolean indicating if the layer is visible or not. Default: true */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}

