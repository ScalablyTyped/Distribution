package typings.chrome.chrome.cast.media

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextTrackStyle extends js.Object {
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
}

