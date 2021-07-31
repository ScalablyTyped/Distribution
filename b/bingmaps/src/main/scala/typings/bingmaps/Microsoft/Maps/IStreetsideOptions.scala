package typings.bingmaps.Microsoft.Maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IStreetsideOptions extends StObject {
  
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
  def apply(): IStreetsideOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IStreetsideOptions]
  }
  
  @scala.inline
  implicit class IStreetsideOptionsMutableBuilder[Self <: IStreetsideOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisablePanoramaNavigation(value: Boolean): Self = StObject.set(x, "disablePanoramaNavigation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisablePanoramaNavigationUndefined: Self = StObject.set(x, "disablePanoramaNavigation", js.undefined)
    
    @scala.inline
    def setLocationToLookAt(value: Location): Self = StObject.set(x, "locationToLookAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationToLookAtUndefined: Self = StObject.set(x, "locationToLookAt", js.undefined)
    
    @scala.inline
    def setOnErrorLoading(value: () => Unit): Self = StObject.set(x, "onErrorLoading", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnErrorLoadingUndefined: Self = StObject.set(x, "onErrorLoading", js.undefined)
    
    @scala.inline
    def setOnSuccessLoading(value: () => Unit): Self = StObject.set(x, "onSuccessLoading", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnSuccessLoadingUndefined: Self = StObject.set(x, "onSuccessLoading", js.undefined)
    
    @scala.inline
    def setOverviewMapMode(value: OverviewMapMode): Self = StObject.set(x, "overviewMapMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverviewMapModeUndefined: Self = StObject.set(x, "overviewMapMode", js.undefined)
    
    @scala.inline
    def setPanoramaInfo(value: IPanoramaInfo): Self = StObject.set(x, "panoramaInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPanoramaInfoUndefined: Self = StObject.set(x, "panoramaInfo", js.undefined)
    
    @scala.inline
    def setPanoramaLookupRadius(value: Double): Self = StObject.set(x, "panoramaLookupRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPanoramaLookupRadiusUndefined: Self = StObject.set(x, "panoramaLookupRadius", js.undefined)
    
    @scala.inline
    def setShowCurrentAddress(value: Boolean): Self = StObject.set(x, "showCurrentAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowCurrentAddressUndefined: Self = StObject.set(x, "showCurrentAddress", js.undefined)
    
    @scala.inline
    def setShowExitButton(value: Boolean): Self = StObject.set(x, "showExitButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowExitButtonUndefined: Self = StObject.set(x, "showExitButton", js.undefined)
    
    @scala.inline
    def setShowHeadingCompass(value: Boolean): Self = StObject.set(x, "showHeadingCompass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowHeadingCompassUndefined: Self = StObject.set(x, "showHeadingCompass", js.undefined)
    
    @scala.inline
    def setShowProblemReporting(value: Boolean): Self = StObject.set(x, "showProblemReporting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowProblemReportingUndefined: Self = StObject.set(x, "showProblemReporting", js.undefined)
    
    @scala.inline
    def setShowZoomButtons(value: Boolean): Self = StObject.set(x, "showZoomButtons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowZoomButtonsUndefined: Self = StObject.set(x, "showZoomButtons", js.undefined)
  }
}
