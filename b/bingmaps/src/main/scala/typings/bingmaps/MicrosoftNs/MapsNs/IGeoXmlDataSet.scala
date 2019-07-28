package typings.bingmaps.MicrosoftNs.MapsNs

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

object IGeoXmlDataSet {
  @scala.inline
  def apply(
    layers: js.Array[Layer | GroundOverlay] = null,
    screenOverlays: js.Array[KmlScreenOverlay] = null,
    shapes: js.Array[IPrimitive] = null,
    stats: IGeoXmlStats = null,
    summary: IGeoXmlSummaryMetadata = null
  ): IGeoXmlDataSet = {
    val __obj = js.Dynamic.literal()
    if (layers != null) __obj.updateDynamic("layers")(layers)
    if (screenOverlays != null) __obj.updateDynamic("screenOverlays")(screenOverlays)
    if (shapes != null) __obj.updateDynamic("shapes")(shapes)
    if (stats != null) __obj.updateDynamic("stats")(stats)
    if (summary != null) __obj.updateDynamic("summary")(summary)
    __obj.asInstanceOf[IGeoXmlDataSet]
  }
}

