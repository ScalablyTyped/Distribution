package typings.awsSdk.elastictranscoderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PresetWatermark extends StObject {
  
  /**
    * The horizontal position of the watermark unless you specify a non-zero value for HorizontalOffset:     Left: The left edge of the watermark is aligned with the left border of the video.    Right: The right edge of the watermark is aligned with the right border of the video.    Center: The watermark is centered between the left and right borders.  
    */
  var HorizontalAlign: js.UndefOr[typings.awsSdk.elastictranscoderMod.HorizontalAlign] = js.undefined
  
  /**
    * The amount by which you want the horizontal position of the watermark to be offset from the position specified by HorizontalAlign:    number of pixels (px): The minimum value is 0 pixels, and the maximum value is the value of MaxWidth.   integer percentage (%): The range of valid values is 0 to 100.   For example, if you specify Left for HorizontalAlign and 5px for HorizontalOffset, the left side of the watermark appears 5 pixels from the left border of the output video.  HorizontalOffset is only valid when the value of HorizontalAlign is Left or Right. If you specify an offset that causes the watermark to extend beyond the left or right border and Elastic Transcoder has not added black bars, the watermark is cropped. If Elastic Transcoder has added black bars, the watermark extends into the black bars. If the watermark extends beyond the black bars, it is cropped. Use the value of Target to specify whether you want to include the black bars that are added by Elastic Transcoder, if any, in the offset calculation.
    */
  var HorizontalOffset: js.UndefOr[PixelsOrPercent] = js.undefined
  
  /**
    *  A unique identifier for the settings for one watermark. The value of Id can be up to 40 characters long. 
    */
  var Id: js.UndefOr[PresetWatermarkId] = js.undefined
  
  /**
    * The maximum height of the watermark in one of the following formats:    number of pixels (px): The minimum value is 16 pixels, and the maximum value is the value of MaxHeight.   integer percentage (%): The range of valid values is 0 to 100. Use the value of Target to specify whether you want Elastic Transcoder to include the black bars that are added by Elastic Transcoder, if any, in the calculation.   If you specify the value in pixels, it must be less than or equal to the value of MaxHeight.
    */
  var MaxHeight: js.UndefOr[PixelsOrPercent] = js.undefined
  
  /**
    * The maximum width of the watermark in one of the following formats:    number of pixels (px): The minimum value is 16 pixels, and the maximum value is the value of MaxWidth.   integer percentage (%): The range of valid values is 0 to 100. Use the value of Target to specify whether you want Elastic Transcoder to include the black bars that are added by Elastic Transcoder, if any, in the calculation. If you specify the value in pixels, it must be less than or equal to the value of MaxWidth.  
    */
  var MaxWidth: js.UndefOr[PixelsOrPercent] = js.undefined
  
  /**
    * A percentage that indicates how much you want a watermark to obscure the video in the location where it appears. Valid values are 0 (the watermark is invisible) to 100 (the watermark completely obscures the video in the specified location). The datatype of Opacity is float. Elastic Transcoder supports transparent .png graphics. If you use a transparent .png, the transparent portion of the video appears as if you had specified a value of 0 for Opacity. The .jpg file format doesn't support transparency.
    */
  var Opacity: js.UndefOr[typings.awsSdk.elastictranscoderMod.Opacity] = js.undefined
  
  /**
    * A value that controls scaling of the watermark:     Fit: Elastic Transcoder scales the watermark so it matches the value that you specified in either MaxWidth or MaxHeight without exceeding the other value.    Stretch: Elastic Transcoder stretches the watermark to match the values that you specified for MaxWidth and MaxHeight. If the relative proportions of the watermark and the values of MaxWidth and MaxHeight are different, the watermark will be distorted.    ShrinkToFit: Elastic Transcoder scales the watermark down so that its dimensions match the values that you specified for at least one of MaxWidth and MaxHeight without exceeding either value. If you specify this option, Elastic Transcoder does not scale the watermark up.  
    */
  var SizingPolicy: js.UndefOr[WatermarkSizingPolicy] = js.undefined
  
  /**
    * A value that determines how Elastic Transcoder interprets values that you specified for HorizontalOffset, VerticalOffset, MaxWidth, and MaxHeight:    Content: HorizontalOffset and VerticalOffset values are calculated based on the borders of the video excluding black bars added by Elastic Transcoder, if any. In addition, MaxWidth and MaxHeight, if specified as a percentage, are calculated based on the borders of the video excluding black bars added by Elastic Transcoder, if any.    Frame: HorizontalOffset and VerticalOffset values are calculated based on the borders of the video including black bars added by Elastic Transcoder, if any. In addition, MaxWidth and MaxHeight, if specified as a percentage, are calculated based on the borders of the video including black bars added by Elastic Transcoder, if any.  
    */
  var Target: js.UndefOr[typings.awsSdk.elastictranscoderMod.Target] = js.undefined
  
  /**
    * The vertical position of the watermark unless you specify a non-zero value for VerticalOffset:     Top: The top edge of the watermark is aligned with the top border of the video.    Bottom: The bottom edge of the watermark is aligned with the bottom border of the video.    Center: The watermark is centered between the top and bottom borders.  
    */
  var VerticalAlign: js.UndefOr[typings.awsSdk.elastictranscoderMod.VerticalAlign] = js.undefined
  
  /**
    *  VerticalOffset  The amount by which you want the vertical position of the watermark to be offset from the position specified by VerticalAlign:   number of pixels (px): The minimum value is 0 pixels, and the maximum value is the value of MaxHeight.   integer percentage (%): The range of valid values is 0 to 100.   For example, if you specify Top for VerticalAlign and 5px for VerticalOffset, the top of the watermark appears 5 pixels from the top border of the output video.  VerticalOffset is only valid when the value of VerticalAlign is Top or Bottom. If you specify an offset that causes the watermark to extend beyond the top or bottom border and Elastic Transcoder has not added black bars, the watermark is cropped. If Elastic Transcoder has added black bars, the watermark extends into the black bars. If the watermark extends beyond the black bars, it is cropped. Use the value of Target to specify whether you want Elastic Transcoder to include the black bars that are added by Elastic Transcoder, if any, in the offset calculation.
    */
  var VerticalOffset: js.UndefOr[PixelsOrPercent] = js.undefined
}
object PresetWatermark {
  
  inline def apply(): PresetWatermark = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PresetWatermark]
  }
  
  extension [Self <: PresetWatermark](x: Self) {
    
    inline def setHorizontalAlign(value: HorizontalAlign): Self = StObject.set(x, "HorizontalAlign", value.asInstanceOf[js.Any])
    
    inline def setHorizontalAlignUndefined: Self = StObject.set(x, "HorizontalAlign", js.undefined)
    
    inline def setHorizontalOffset(value: PixelsOrPercent): Self = StObject.set(x, "HorizontalOffset", value.asInstanceOf[js.Any])
    
    inline def setHorizontalOffsetUndefined: Self = StObject.set(x, "HorizontalOffset", js.undefined)
    
    inline def setId(value: PresetWatermarkId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setMaxHeight(value: PixelsOrPercent): Self = StObject.set(x, "MaxHeight", value.asInstanceOf[js.Any])
    
    inline def setMaxHeightUndefined: Self = StObject.set(x, "MaxHeight", js.undefined)
    
    inline def setMaxWidth(value: PixelsOrPercent): Self = StObject.set(x, "MaxWidth", value.asInstanceOf[js.Any])
    
    inline def setMaxWidthUndefined: Self = StObject.set(x, "MaxWidth", js.undefined)
    
    inline def setOpacity(value: Opacity): Self = StObject.set(x, "Opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "Opacity", js.undefined)
    
    inline def setSizingPolicy(value: WatermarkSizingPolicy): Self = StObject.set(x, "SizingPolicy", value.asInstanceOf[js.Any])
    
    inline def setSizingPolicyUndefined: Self = StObject.set(x, "SizingPolicy", js.undefined)
    
    inline def setTarget(value: Target): Self = StObject.set(x, "Target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "Target", js.undefined)
    
    inline def setVerticalAlign(value: VerticalAlign): Self = StObject.set(x, "VerticalAlign", value.asInstanceOf[js.Any])
    
    inline def setVerticalAlignUndefined: Self = StObject.set(x, "VerticalAlign", js.undefined)
    
    inline def setVerticalOffset(value: PixelsOrPercent): Self = StObject.set(x, "VerticalOffset", value.asInstanceOf[js.Any])
    
    inline def setVerticalOffsetUndefined: Self = StObject.set(x, "VerticalOffset", js.undefined)
  }
}
