package typings.cloudinaryUploadwidgetBrowser

import typings.cloudinaryUploadwidgetBrowser.cloudinaryUploadwidgetBrowserStrings.custom
import typings.cloudinaryUploadwidgetBrowser.cloudinaryUploadwidgetBrowserStrings.face
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CroppingParameters extends StObject {
  
  var cropping: js.UndefOr[Boolean] = js.undefined
  
  var croppingAspectRatio: js.UndefOr[Double | Null] = js.undefined
  
  var croppingCoordinatesMode: js.UndefOr[custom | face] = js.undefined
  
  var croppingDefaultSelectionRatio: js.UndefOr[Double] = js.undefined
  
  var croppingShowBackButton: js.UndefOr[Boolean] = js.undefined
  
  var croppingShowDimensions: js.UndefOr[Boolean] = js.undefined
  
  var showSkipCropButton: js.UndefOr[Boolean] = js.undefined
}
object CroppingParameters {
  
  inline def apply(): CroppingParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CroppingParameters]
  }
  
  extension [Self <: CroppingParameters](x: Self) {
    
    inline def setCropping(value: Boolean): Self = StObject.set(x, "cropping", value.asInstanceOf[js.Any])
    
    inline def setCroppingAspectRatio(value: Double): Self = StObject.set(x, "croppingAspectRatio", value.asInstanceOf[js.Any])
    
    inline def setCroppingAspectRatioNull: Self = StObject.set(x, "croppingAspectRatio", null)
    
    inline def setCroppingAspectRatioUndefined: Self = StObject.set(x, "croppingAspectRatio", js.undefined)
    
    inline def setCroppingCoordinatesMode(value: custom | face): Self = StObject.set(x, "croppingCoordinatesMode", value.asInstanceOf[js.Any])
    
    inline def setCroppingCoordinatesModeUndefined: Self = StObject.set(x, "croppingCoordinatesMode", js.undefined)
    
    inline def setCroppingDefaultSelectionRatio(value: Double): Self = StObject.set(x, "croppingDefaultSelectionRatio", value.asInstanceOf[js.Any])
    
    inline def setCroppingDefaultSelectionRatioUndefined: Self = StObject.set(x, "croppingDefaultSelectionRatio", js.undefined)
    
    inline def setCroppingShowBackButton(value: Boolean): Self = StObject.set(x, "croppingShowBackButton", value.asInstanceOf[js.Any])
    
    inline def setCroppingShowBackButtonUndefined: Self = StObject.set(x, "croppingShowBackButton", js.undefined)
    
    inline def setCroppingShowDimensions(value: Boolean): Self = StObject.set(x, "croppingShowDimensions", value.asInstanceOf[js.Any])
    
    inline def setCroppingShowDimensionsUndefined: Self = StObject.set(x, "croppingShowDimensions", js.undefined)
    
    inline def setCroppingUndefined: Self = StObject.set(x, "cropping", js.undefined)
    
    inline def setShowSkipCropButton(value: Boolean): Self = StObject.set(x, "showSkipCropButton", value.asInstanceOf[js.Any])
    
    inline def setShowSkipCropButtonUndefined: Self = StObject.set(x, "showSkipCropButton", js.undefined)
  }
}
