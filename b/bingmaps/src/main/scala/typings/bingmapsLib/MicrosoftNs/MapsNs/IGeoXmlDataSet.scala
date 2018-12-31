package typings
package bingmapsLib.MicrosoftNs.MapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGeoXmlDataSet extends js.Object {
  /**
    * An array of layers that are in the XML document.
    * In shapes in KML that are in a child documents and folders of the main document or folder are grouped together in a data Layer.
    * KML also supports GroundOverlay.
    */
  var layers: js.UndefOr[js.Array[Layer | GroundOverlay]] = js.undefined
  /**
    * An array of screen overlays that have been parsed from a KML file.
    */
  var screenOverlays: js.UndefOr[js.Array[KmlScreenOverlay]] = js.undefined
  /** An array of shapes that are in the XML document. */
  var shapes: js.UndefOr[js.Array[IPrimitive]] = js.undefined
  /**
    * Statistics about the content and processing time of a XML feed.
    */
  var stats: js.UndefOr[IGeoXmlStats] = js.undefined
  /**
    * Summary metadata provided at the document level of the XML feed data set.
    */
  var summary: js.UndefOr[IGeoXmlSummaryMetadata] = js.undefined
}

