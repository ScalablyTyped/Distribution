package typings.cloudinaryUploadwidgetBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientParameters extends StObject {
  
  var clientAllowedFormats: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  var croppingValidateDimensions: js.UndefOr[Boolean] = js.undefined
  
  var maxChunkSize: js.UndefOr[Double] = js.undefined
  
  var maxFileSize: js.UndefOr[Double] = js.undefined
  
  var maxImageFileSize: js.UndefOr[Double] = js.undefined
  
  var maxImageHeight: js.UndefOr[Double | Null] = js.undefined
  
  var maxImageWidth: js.UndefOr[Double | Null] = js.undefined
  
  var maxRawFileSize: js.UndefOr[Double] = js.undefined
  
  var maxVideoFileSize: js.UndefOr[Double] = js.undefined
  
  var minImageHeight: js.UndefOr[Double | Null] = js.undefined
  
  var minImageWidth: js.UndefOr[Double | Null] = js.undefined
  
  var validateMaxWidthHeight: js.UndefOr[Boolean] = js.undefined
}
object ClientParameters {
  
  inline def apply(): ClientParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientParameters]
  }
  
  extension [Self <: ClientParameters](x: Self) {
    
    inline def setClientAllowedFormats(value: js.Array[String]): Self = StObject.set(x, "clientAllowedFormats", value.asInstanceOf[js.Any])
    
    inline def setClientAllowedFormatsNull: Self = StObject.set(x, "clientAllowedFormats", null)
    
    inline def setClientAllowedFormatsUndefined: Self = StObject.set(x, "clientAllowedFormats", js.undefined)
    
    inline def setClientAllowedFormatsVarargs(value: String*): Self = StObject.set(x, "clientAllowedFormats", js.Array(value*))
    
    inline def setCroppingValidateDimensions(value: Boolean): Self = StObject.set(x, "croppingValidateDimensions", value.asInstanceOf[js.Any])
    
    inline def setCroppingValidateDimensionsUndefined: Self = StObject.set(x, "croppingValidateDimensions", js.undefined)
    
    inline def setMaxChunkSize(value: Double): Self = StObject.set(x, "maxChunkSize", value.asInstanceOf[js.Any])
    
    inline def setMaxChunkSizeUndefined: Self = StObject.set(x, "maxChunkSize", js.undefined)
    
    inline def setMaxFileSize(value: Double): Self = StObject.set(x, "maxFileSize", value.asInstanceOf[js.Any])
    
    inline def setMaxFileSizeUndefined: Self = StObject.set(x, "maxFileSize", js.undefined)
    
    inline def setMaxImageFileSize(value: Double): Self = StObject.set(x, "maxImageFileSize", value.asInstanceOf[js.Any])
    
    inline def setMaxImageFileSizeUndefined: Self = StObject.set(x, "maxImageFileSize", js.undefined)
    
    inline def setMaxImageHeight(value: Double): Self = StObject.set(x, "maxImageHeight", value.asInstanceOf[js.Any])
    
    inline def setMaxImageHeightNull: Self = StObject.set(x, "maxImageHeight", null)
    
    inline def setMaxImageHeightUndefined: Self = StObject.set(x, "maxImageHeight", js.undefined)
    
    inline def setMaxImageWidth(value: Double): Self = StObject.set(x, "maxImageWidth", value.asInstanceOf[js.Any])
    
    inline def setMaxImageWidthNull: Self = StObject.set(x, "maxImageWidth", null)
    
    inline def setMaxImageWidthUndefined: Self = StObject.set(x, "maxImageWidth", js.undefined)
    
    inline def setMaxRawFileSize(value: Double): Self = StObject.set(x, "maxRawFileSize", value.asInstanceOf[js.Any])
    
    inline def setMaxRawFileSizeUndefined: Self = StObject.set(x, "maxRawFileSize", js.undefined)
    
    inline def setMaxVideoFileSize(value: Double): Self = StObject.set(x, "maxVideoFileSize", value.asInstanceOf[js.Any])
    
    inline def setMaxVideoFileSizeUndefined: Self = StObject.set(x, "maxVideoFileSize", js.undefined)
    
    inline def setMinImageHeight(value: Double): Self = StObject.set(x, "minImageHeight", value.asInstanceOf[js.Any])
    
    inline def setMinImageHeightNull: Self = StObject.set(x, "minImageHeight", null)
    
    inline def setMinImageHeightUndefined: Self = StObject.set(x, "minImageHeight", js.undefined)
    
    inline def setMinImageWidth(value: Double): Self = StObject.set(x, "minImageWidth", value.asInstanceOf[js.Any])
    
    inline def setMinImageWidthNull: Self = StObject.set(x, "minImageWidth", null)
    
    inline def setMinImageWidthUndefined: Self = StObject.set(x, "minImageWidth", js.undefined)
    
    inline def setValidateMaxWidthHeight(value: Boolean): Self = StObject.set(x, "validateMaxWidthHeight", value.asInstanceOf[js.Any])
    
    inline def setValidateMaxWidthHeightUndefined: Self = StObject.set(x, "validateMaxWidthHeight", js.undefined)
  }
}
