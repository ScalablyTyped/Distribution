package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CaptionRectangle extends StObject {
  
  /**
    * See the description in leftOffset.
  For height, specify the entire height of the rectangle as a percentage of the underlying frame height. For example, \"80\" means the rectangle height is 80% of the underlying frame height. The topOffset and rectangleHeight must add up to 100% or less.
  This field corresponds to tts:extent - Y in the TTML standard.
    */
  var Height: doubleMin0Max100
  
  /**
    * Applies only if you plan to convert these source captions to EBU-TT-D or TTML in an output. (Make sure to leave the default if you don't have either of these formats in the output.) You can define a display rectangle for the captions that is smaller than the underlying video frame. You define the rectangle by specifying the position of the left edge, top edge, bottom edge, and right edge of the rectangle, all within the underlying video frame. The units for the measurements are percentages.
  If you specify a value for one of these fields, you must specify a value for all of them.
  For leftOffset, specify the position of the left edge of the rectangle, as a percentage of the underlying frame width, and relative to the left edge of the frame. For example, \"10\" means the measurement is 10% of the underlying frame width. The rectangle left edge starts at that position from the left edge of the frame.
  This field corresponds to tts:origin - X in the TTML standard.
    */
  var LeftOffset: doubleMin0Max100
  
  /**
    * See the description in leftOffset.
  For topOffset, specify the position of the top edge of the rectangle, as a percentage of the underlying frame height, and relative to the top edge of the frame. For example, \"10\" means the measurement is 10% of the underlying frame height. The rectangle top edge starts at that position from the top edge of the frame.
  This field corresponds to tts:origin - Y in the TTML standard.
    */
  var TopOffset: doubleMin0Max100
  
  /**
    * See the description in leftOffset.
  For width, specify the entire width of the rectangle as a percentage of the underlying frame width. For example, \"80\" means the rectangle width is 80% of the underlying frame width. The leftOffset and rectangleWidth must add up to 100% or less.
  This field corresponds to tts:extent - X in the TTML standard.
    */
  var Width: doubleMin0Max100
}
object CaptionRectangle {
  
  inline def apply(
    Height: doubleMin0Max100,
    LeftOffset: doubleMin0Max100,
    TopOffset: doubleMin0Max100,
    Width: doubleMin0Max100
  ): CaptionRectangle = {
    val __obj = js.Dynamic.literal(Height = Height.asInstanceOf[js.Any], LeftOffset = LeftOffset.asInstanceOf[js.Any], TopOffset = TopOffset.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaptionRectangle]
  }
  
  extension [Self <: CaptionRectangle](x: Self) {
    
    inline def setHeight(value: doubleMin0Max100): Self = StObject.set(x, "Height", value.asInstanceOf[js.Any])
    
    inline def setLeftOffset(value: doubleMin0Max100): Self = StObject.set(x, "LeftOffset", value.asInstanceOf[js.Any])
    
    inline def setTopOffset(value: doubleMin0Max100): Self = StObject.set(x, "TopOffset", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: doubleMin0Max100): Self = StObject.set(x, "Width", value.asInstanceOf[js.Any])
  }
}
