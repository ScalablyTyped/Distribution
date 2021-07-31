package typings.awsSdk.mediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VideoDetail extends StObject {
  
  /**
    * Height in pixels for the output
    */
  var HeightInPx: js.UndefOr[integer] = js.undefined
  
  /**
    * Width in pixels for the output
    */
  var WidthInPx: js.UndefOr[integer] = js.undefined
}
object VideoDetail {
  
  @scala.inline
  def apply(): VideoDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoDetail]
  }
  
  @scala.inline
  implicit class VideoDetailMutableBuilder[Self <: VideoDetail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeightInPx(value: integer): Self = StObject.set(x, "HeightInPx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightInPxUndefined: Self = StObject.set(x, "HeightInPx", js.undefined)
    
    @scala.inline
    def setWidthInPx(value: integer): Self = StObject.set(x, "WidthInPx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthInPxUndefined: Self = StObject.set(x, "WidthInPx", js.undefined)
  }
}
