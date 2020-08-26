package typings.chrome.chrome.cast.media

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextTrackStyle extends js.Object {
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
  implicit class TextTrackStyleOps[Self <: TextTrackStyle] (val x: Self) extends AnyVal {
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
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setCustomData(value: js.Object): Self = this.set("customData", value.asInstanceOf[js.Any])
    @scala.inline
    def setEdgeColor(value: String): Self = this.set("edgeColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setEdgeType(value: TextTrackEdgeType): Self = this.set("edgeType", value.asInstanceOf[js.Any])
    @scala.inline
    def setFontFamily(value: String): Self = this.set("fontFamily", value.asInstanceOf[js.Any])
    @scala.inline
    def setFontGenericFamily(value: TextTrackFontGenericFamily): Self = this.set("fontGenericFamily", value.asInstanceOf[js.Any])
    @scala.inline
    def setFontScale(value: Double): Self = this.set("fontScale", value.asInstanceOf[js.Any])
    @scala.inline
    def setFontStyle(value: TextTrackFontStyle): Self = this.set("fontStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def setForegroundColor(value: String): Self = this.set("foregroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setWindowColor(value: String): Self = this.set("windowColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setWindowRoundedCornerRadius(value: Double): Self = this.set("windowRoundedCornerRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def setWindowType(value: TextTrackWindowType): Self = this.set("windowType", value.asInstanceOf[js.Any])
  }
  
}

