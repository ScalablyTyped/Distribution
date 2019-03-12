package typings
package bingmapsLib.MicrosoftNs.MapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStreetsideOptions extends js.Object {
  /** A boolean indicating if the ability to navigate between image bubbles should be disabled in streetside map mode. Default: false */
  var disablePanoramaNavigation: js.UndefOr[scala.Boolean] = js.undefined
  /** The location that the streetside panorama should be looking towards. This can be used instead of a heading. */
  var locationToLookAt: js.UndefOr[Location] = js.undefined
  /** A callback function that is triggered after the streetside view has not loaded successfully. */
  var onErrorLoading: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** A callback function that is triggered after the streetside view has loaded successfully. */
  var onSuccessLoading: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * Specifies how to render the overview map when in streetside mode.
    * Default: Microsoft.Maps.OverviewMapMode.expanded
    */
  var overviewMapMode: js.UndefOr[OverviewMapMode] = js.undefined
  /**
    * Information for a streetside panorama scene to load.
    */
  var panoramaInfo: js.UndefOr[IPanoramaInfo] = js.undefined
  /** The radius to search in for available streetside panoramas. */
  var panoramaLookupRadius: js.UndefOr[scala.Double] = js.undefined
  /** A boolean indicating if the current address being viewed should be hidden when in streetside map mode. Default: true */
  var showCurrentAddress: js.UndefOr[scala.Boolean] = js.undefined
  /** A boolean indicating if the exit button should be hidden when in streetside map mode. Default: true */
  var showExitButton: js.UndefOr[scala.Boolean] = js.undefined
  /** A boolean indicating if the heading compass button is hidden when in streetside map mode. Default: true */
  var showHeadingCompass: js.UndefOr[scala.Boolean] = js.undefined
  /** A boolean indicating if the link to report a problem with a streetside image is hidden when in streetside map mode. Default: true */
  var showProblemReporting: js.UndefOr[scala.Boolean] = js.undefined
  /** A boolean indicating if the zoom buttons should be displayed when in streetside map mode. Default: true */
  var showZoomButtons: js.UndefOr[scala.Boolean] = js.undefined
}

object IStreetsideOptions {
  @scala.inline
  def apply(
    disablePanoramaNavigation: js.UndefOr[scala.Boolean] = js.undefined,
    locationToLookAt: Location = null,
    onErrorLoading: () => scala.Unit = null,
    onSuccessLoading: () => scala.Unit = null,
    overviewMapMode: OverviewMapMode = null,
    panoramaInfo: IPanoramaInfo = null,
    panoramaLookupRadius: scala.Int | scala.Double = null,
    showCurrentAddress: js.UndefOr[scala.Boolean] = js.undefined,
    showExitButton: js.UndefOr[scala.Boolean] = js.undefined,
    showHeadingCompass: js.UndefOr[scala.Boolean] = js.undefined,
    showProblemReporting: js.UndefOr[scala.Boolean] = js.undefined,
    showZoomButtons: js.UndefOr[scala.Boolean] = js.undefined
  ): IStreetsideOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disablePanoramaNavigation)) __obj.updateDynamic("disablePanoramaNavigation")(disablePanoramaNavigation)
    if (locationToLookAt != null) __obj.updateDynamic("locationToLookAt")(locationToLookAt)
    if (onErrorLoading != null) __obj.updateDynamic("onErrorLoading")(js.Any.fromFunction0(onErrorLoading))
    if (onSuccessLoading != null) __obj.updateDynamic("onSuccessLoading")(js.Any.fromFunction0(onSuccessLoading))
    if (overviewMapMode != null) __obj.updateDynamic("overviewMapMode")(overviewMapMode)
    if (panoramaInfo != null) __obj.updateDynamic("panoramaInfo")(panoramaInfo)
    if (panoramaLookupRadius != null) __obj.updateDynamic("panoramaLookupRadius")(panoramaLookupRadius.asInstanceOf[js.Any])
    if (!js.isUndefined(showCurrentAddress)) __obj.updateDynamic("showCurrentAddress")(showCurrentAddress)
    if (!js.isUndefined(showExitButton)) __obj.updateDynamic("showExitButton")(showExitButton)
    if (!js.isUndefined(showHeadingCompass)) __obj.updateDynamic("showHeadingCompass")(showHeadingCompass)
    if (!js.isUndefined(showProblemReporting)) __obj.updateDynamic("showProblemReporting")(showProblemReporting)
    if (!js.isUndefined(showZoomButtons)) __obj.updateDynamic("showZoomButtons")(showZoomButtons)
    __obj.asInstanceOf[IStreetsideOptions]
  }
}

