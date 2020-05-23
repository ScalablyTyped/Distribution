package typings.bingmaps.Microsoft.Maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStreetsideOptions extends js.Object {
  /** A boolean indicating if the ability to navigate between image bubbles should be disabled in streetside map mode. Default: false */
  var disablePanoramaNavigation: js.UndefOr[Boolean] = js.undefined
  /** The location that the streetside panorama should be looking towards. This can be used instead of a heading. */
  var locationToLookAt: js.UndefOr[Location] = js.undefined
  /** A callback function that is triggered after the streetside view has not loaded successfully. */
  var onErrorLoading: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** A callback function that is triggered after the streetside view has loaded successfully. */
  var onSuccessLoading: js.UndefOr[js.Function0[Unit]] = js.undefined
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
  var panoramaLookupRadius: js.UndefOr[Double] = js.undefined
  /** A boolean indicating if the current address being viewed should be hidden when in streetside map mode. Default: true */
  var showCurrentAddress: js.UndefOr[Boolean] = js.undefined
  /** A boolean indicating if the exit button should be hidden when in streetside map mode. Default: true */
  var showExitButton: js.UndefOr[Boolean] = js.undefined
  /** A boolean indicating if the heading compass button is hidden when in streetside map mode. Default: true */
  var showHeadingCompass: js.UndefOr[Boolean] = js.undefined
  /** A boolean indicating if the link to report a problem with a streetside image is hidden when in streetside map mode. Default: true */
  var showProblemReporting: js.UndefOr[Boolean] = js.undefined
  /** A boolean indicating if the zoom buttons should be displayed when in streetside map mode. Default: true */
  var showZoomButtons: js.UndefOr[Boolean] = js.undefined
}

object IStreetsideOptions {
  @scala.inline
  def apply(
    disablePanoramaNavigation: js.UndefOr[Boolean] = js.undefined,
    locationToLookAt: Location = null,
    onErrorLoading: () => Unit = null,
    onSuccessLoading: () => Unit = null,
    overviewMapMode: OverviewMapMode = null,
    panoramaInfo: IPanoramaInfo = null,
    panoramaLookupRadius: js.UndefOr[Double] = js.undefined,
    showCurrentAddress: js.UndefOr[Boolean] = js.undefined,
    showExitButton: js.UndefOr[Boolean] = js.undefined,
    showHeadingCompass: js.UndefOr[Boolean] = js.undefined,
    showProblemReporting: js.UndefOr[Boolean] = js.undefined,
    showZoomButtons: js.UndefOr[Boolean] = js.undefined
  ): IStreetsideOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disablePanoramaNavigation)) __obj.updateDynamic("disablePanoramaNavigation")(disablePanoramaNavigation.get.asInstanceOf[js.Any])
    if (locationToLookAt != null) __obj.updateDynamic("locationToLookAt")(locationToLookAt.asInstanceOf[js.Any])
    if (onErrorLoading != null) __obj.updateDynamic("onErrorLoading")(js.Any.fromFunction0(onErrorLoading))
    if (onSuccessLoading != null) __obj.updateDynamic("onSuccessLoading")(js.Any.fromFunction0(onSuccessLoading))
    if (overviewMapMode != null) __obj.updateDynamic("overviewMapMode")(overviewMapMode.asInstanceOf[js.Any])
    if (panoramaInfo != null) __obj.updateDynamic("panoramaInfo")(panoramaInfo.asInstanceOf[js.Any])
    if (!js.isUndefined(panoramaLookupRadius)) __obj.updateDynamic("panoramaLookupRadius")(panoramaLookupRadius.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showCurrentAddress)) __obj.updateDynamic("showCurrentAddress")(showCurrentAddress.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showExitButton)) __obj.updateDynamic("showExitButton")(showExitButton.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showHeadingCompass)) __obj.updateDynamic("showHeadingCompass")(showHeadingCompass.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showProblemReporting)) __obj.updateDynamic("showProblemReporting")(showProblemReporting.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showZoomButtons)) __obj.updateDynamic("showZoomButtons")(showZoomButtons.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStreetsideOptions]
  }
}

