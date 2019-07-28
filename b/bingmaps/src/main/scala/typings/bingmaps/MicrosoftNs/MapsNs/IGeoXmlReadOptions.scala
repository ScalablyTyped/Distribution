package typings.bingmaps.MicrosoftNs.MapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGeoXmlReadOptions extends js.Object {
  /** Specifies if KML ScreenOverlays should be read or ignored. Default: true */
  var allowKmlScreenOverlays: js.UndefOr[Boolean] = js.undefined
  /**
    * Specifies wether the individual waypoint data of a GPX Route or Track should be captured.
    * If set to true, the shape will have a metadata.waypoints property that is an array of
    * pushpins that contains the details of each waypoint along the track. Default: false
    */
  var captureGpxPathWaypoints: js.UndefOr[Boolean] = js.undefined
  /** The default styles to apply to shapes that don't have a defined style in the XML. */
  var defaultStyles: js.UndefOr[IStylesOptions] = js.undefined
  /**
    * A callback function that is triggered when an error occurs when reading an XML document.
    */
  var error: js.UndefOr[js.Function1[/* msg */ String, Unit]] = js.undefined
  /** Specifies if shapes visible tags should be used to set the visible property of it's equivalent Bing Maps shape. Default: true */
  var ignoreVisibility: js.UndefOr[Boolean] = js.undefined
  /**
    * The maximium depth of network links in a KML file. Default: 3
    * Example: when set to 3; file1 links to file2 which links to file3 but won't open links in file3.
    */
  var maxNetworkLinkDepth: js.UndefOr[Double] = js.undefined
  /**
    * The maximium number of network links that a single KML file can have. Default: 10.
    */
  var maxNetworkLinks: js.UndefOr[Double] = js.undefined
  /** Indicates if the pushpin title should be displayed on the map if a valid title or name value exits in the shapes metadata. Default: true */
  var setPushpinTitles: js.UndefOr[Boolean] = js.undefined
}

object IGeoXmlReadOptions {
  @scala.inline
  def apply(
    allowKmlScreenOverlays: js.UndefOr[Boolean] = js.undefined,
    captureGpxPathWaypoints: js.UndefOr[Boolean] = js.undefined,
    defaultStyles: IStylesOptions = null,
    error: /* msg */ String => Unit = null,
    ignoreVisibility: js.UndefOr[Boolean] = js.undefined,
    maxNetworkLinkDepth: Int | Double = null,
    maxNetworkLinks: Int | Double = null,
    setPushpinTitles: js.UndefOr[Boolean] = js.undefined
  ): IGeoXmlReadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowKmlScreenOverlays)) __obj.updateDynamic("allowKmlScreenOverlays")(allowKmlScreenOverlays)
    if (!js.isUndefined(captureGpxPathWaypoints)) __obj.updateDynamic("captureGpxPathWaypoints")(captureGpxPathWaypoints)
    if (defaultStyles != null) __obj.updateDynamic("defaultStyles")(defaultStyles)
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction1(error))
    if (!js.isUndefined(ignoreVisibility)) __obj.updateDynamic("ignoreVisibility")(ignoreVisibility)
    if (maxNetworkLinkDepth != null) __obj.updateDynamic("maxNetworkLinkDepth")(maxNetworkLinkDepth.asInstanceOf[js.Any])
    if (maxNetworkLinks != null) __obj.updateDynamic("maxNetworkLinks")(maxNetworkLinks.asInstanceOf[js.Any])
    if (!js.isUndefined(setPushpinTitles)) __obj.updateDynamic("setPushpinTitles")(setPushpinTitles)
    __obj.asInstanceOf[IGeoXmlReadOptions]
  }
}

