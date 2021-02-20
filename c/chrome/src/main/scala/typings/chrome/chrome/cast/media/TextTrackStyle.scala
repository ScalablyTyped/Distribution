package typings.chrome.chrome.cast.media

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextTrackStyle extends StObject {
  
  var backgroundColor: String = js.native
  
  var customData: js.Object = js.native
  
  var edgeColor: String = js.native
  
  var edgeType: TextTrackEdgeType = js.native
  
  var fontFamily: String = js.native
  
  var fontGenericFamily: TextTrackFontGenericFamily = js.native
  
  var fontScale: Double = js.native
  
  var fontStyle: TextTrackFontStyle = js.native
  
  var foregroundColor: String = js.native
  
  var windowColor: String = js.native
  
  var windowRoundedCornerRadius: Double = js.native
  
  var windowType: TextTrackWindowType = js.native
}
object TextTrackStyle {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class TextTrackStyleMutableBuilder[Self <: TextTrackStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomData(value: js.Object): Self = StObject.set(x, "customData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEdgeColor(value: String): Self = StObject.set(x, "edgeColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEdgeType(value: TextTrackEdgeType): Self = StObject.set(x, "edgeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontGenericFamily(value: TextTrackFontGenericFamily): Self = StObject.set(x, "fontGenericFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontScale(value: Double): Self = StObject.set(x, "fontScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontStyle(value: TextTrackFontStyle): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForegroundColor(value: String): Self = StObject.set(x, "foregroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowColor(value: String): Self = StObject.set(x, "windowColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowRoundedCornerRadius(value: Double): Self = StObject.set(x, "windowRoundedCornerRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowType(value: TextTrackWindowType): Self = StObject.set(x, "windowType", value.asInstanceOf[js.Any])
  }
}
