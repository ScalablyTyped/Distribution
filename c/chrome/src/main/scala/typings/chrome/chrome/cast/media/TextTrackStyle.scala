package typings.chrome.chrome.cast.media

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextTrackStyle extends StObject {
  
  var backgroundColor: String
  
  var customData: js.Object
  
  var edgeColor: String
  
  var edgeType: TextTrackEdgeType
  
  var fontFamily: String
  
  var fontGenericFamily: TextTrackFontGenericFamily
  
  var fontScale: Double
  
  var fontStyle: TextTrackFontStyle
  
  var foregroundColor: String
  
  var windowColor: String
  
  var windowRoundedCornerRadius: Double
  
  var windowType: TextTrackWindowType
}
object TextTrackStyle {
  
  inline def apply(
    backgroundColor: String,
    customData: js.Object,
    edgeColor: String,
    edgeType: TextTrackEdgeType,
    fontFamily: String,
    fontGenericFamily: TextTrackFontGenericFamily,
    fontScale: Double,
    fontStyle: TextTrackFontStyle,
    foregroundColor: String,
    windowColor: String,
    windowRoundedCornerRadius: Double,
    windowType: TextTrackWindowType
  ): TextTrackStyle = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], customData = customData.asInstanceOf[js.Any], edgeColor = edgeColor.asInstanceOf[js.Any], edgeType = edgeType.asInstanceOf[js.Any], fontFamily = fontFamily.asInstanceOf[js.Any], fontGenericFamily = fontGenericFamily.asInstanceOf[js.Any], fontScale = fontScale.asInstanceOf[js.Any], fontStyle = fontStyle.asInstanceOf[js.Any], foregroundColor = foregroundColor.asInstanceOf[js.Any], windowColor = windowColor.asInstanceOf[js.Any], windowRoundedCornerRadius = windowRoundedCornerRadius.asInstanceOf[js.Any], windowType = windowType.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextTrackStyle]
  }
  
  extension [Self <: TextTrackStyle](x: Self) {
    
    inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setCustomData(value: js.Object): Self = StObject.set(x, "customData", value.asInstanceOf[js.Any])
    
    inline def setEdgeColor(value: String): Self = StObject.set(x, "edgeColor", value.asInstanceOf[js.Any])
    
    inline def setEdgeType(value: TextTrackEdgeType): Self = StObject.set(x, "edgeType", value.asInstanceOf[js.Any])
    
    inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
    
    inline def setFontGenericFamily(value: TextTrackFontGenericFamily): Self = StObject.set(x, "fontGenericFamily", value.asInstanceOf[js.Any])
    
    inline def setFontScale(value: Double): Self = StObject.set(x, "fontScale", value.asInstanceOf[js.Any])
    
    inline def setFontStyle(value: TextTrackFontStyle): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
    
    inline def setForegroundColor(value: String): Self = StObject.set(x, "foregroundColor", value.asInstanceOf[js.Any])
    
    inline def setWindowColor(value: String): Self = StObject.set(x, "windowColor", value.asInstanceOf[js.Any])
    
    inline def setWindowRoundedCornerRadius(value: Double): Self = StObject.set(x, "windowRoundedCornerRadius", value.asInstanceOf[js.Any])
    
    inline def setWindowType(value: TextTrackWindowType): Self = StObject.set(x, "windowType", value.asInstanceOf[js.Any])
  }
}
