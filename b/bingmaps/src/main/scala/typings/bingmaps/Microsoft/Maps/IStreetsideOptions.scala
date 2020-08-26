package typings.bingmaps.Microsoft.Maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStreetsideOptions extends js.Object {
  /** A boolean indicating if the ability to navigate between image bubbles should be disabled in streetside map mode. Default: false */
  var disablePanoramaNavigation: js.UndefOr[Boolean] = js.native
  /** The location that the streetside panorama should be looking towards. This can be used instead of a heading. */
  var locationToLookAt: js.UndefOr[Location] = js.native
  /** A callback function that is triggered after the streetside view has not loaded successfully. */
  var onErrorLoading: js.UndefOr[js.Function0[Unit]] = js.native
  /** A callback function that is triggered after the streetside view has loaded successfully. */
  var onSuccessLoading: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Specifies how to render the overview map when in streetside mode.
    * Default: Microsoft.Maps.OverviewMapMode.expanded
    */
  var overviewMapMode: js.UndefOr[OverviewMapMode] = js.native
  /**
    * Information for a streetside panorama scene to load.
    */
  var panoramaInfo: js.UndefOr[IPanoramaInfo] = js.native
  /** The radius to search in for available streetside panoramas. */
  var panoramaLookupRadius: js.UndefOr[Double] = js.native
  /** A boolean indicating if the current address being viewed should be hidden when in streetside map mode. Default: true */
  var showCurrentAddress: js.UndefOr[Boolean] = js.native
  /** A boolean indicating if the exit button should be hidden when in streetside map mode. Default: true */
  var showExitButton: js.UndefOr[Boolean] = js.native
  /** A boolean indicating if the heading compass button is hidden when in streetside map mode. Default: true */
  var showHeadingCompass: js.UndefOr[Boolean] = js.native
  /** A boolean indicating if the link to report a problem with a streetside image is hidden when in streetside map mode. Default: true */
  var showProblemReporting: js.UndefOr[Boolean] = js.native
  /** A boolean indicating if the zoom buttons should be displayed when in streetside map mode. Default: true */
  var showZoomButtons: js.UndefOr[Boolean] = js.native
}

object IStreetsideOptions {
  @scala.inline
  def apply(): IStreetsideOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IStreetsideOptions]
  }
  @scala.inline
  implicit class IStreetsideOptionsOps[Self <: IStreetsideOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDisablePanoramaNavigation(value: Boolean): Self = this.set("disablePanoramaNavigation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisablePanoramaNavigation: Self = this.set("disablePanoramaNavigation", js.undefined)
    @scala.inline
    def setLocationToLookAt(value: Location): Self = this.set("locationToLookAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocationToLookAt: Self = this.set("locationToLookAt", js.undefined)
    @scala.inline
    def setOnErrorLoading(value: () => Unit): Self = this.set("onErrorLoading", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnErrorLoading: Self = this.set("onErrorLoading", js.undefined)
    @scala.inline
    def setOnSuccessLoading(value: () => Unit): Self = this.set("onSuccessLoading", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnSuccessLoading: Self = this.set("onSuccessLoading", js.undefined)
    @scala.inline
    def setOverviewMapMode(value: OverviewMapMode): Self = this.set("overviewMapMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverviewMapMode: Self = this.set("overviewMapMode", js.undefined)
    @scala.inline
    def setPanoramaInfo(value: IPanoramaInfo): Self = this.set("panoramaInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePanoramaInfo: Self = this.set("panoramaInfo", js.undefined)
    @scala.inline
    def setPanoramaLookupRadius(value: Double): Self = this.set("panoramaLookupRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePanoramaLookupRadius: Self = this.set("panoramaLookupRadius", js.undefined)
    @scala.inline
    def setShowCurrentAddress(value: Boolean): Self = this.set("showCurrentAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowCurrentAddress: Self = this.set("showCurrentAddress", js.undefined)
    @scala.inline
    def setShowExitButton(value: Boolean): Self = this.set("showExitButton", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowExitButton: Self = this.set("showExitButton", js.undefined)
    @scala.inline
    def setShowHeadingCompass(value: Boolean): Self = this.set("showHeadingCompass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowHeadingCompass: Self = this.set("showHeadingCompass", js.undefined)
    @scala.inline
    def setShowProblemReporting(value: Boolean): Self = this.set("showProblemReporting", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowProblemReporting: Self = this.set("showProblemReporting", js.undefined)
    @scala.inline
    def setShowZoomButtons(value: Boolean): Self = this.set("showZoomButtons", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowZoomButtons: Self = this.set("showZoomButtons", js.undefined)
  }
  
}

