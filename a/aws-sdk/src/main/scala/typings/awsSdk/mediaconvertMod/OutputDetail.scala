package typings.awsSdk.mediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutputDetail extends StObject {
  
  /**
    * Duration in milliseconds
    */
  var DurationInMs: js.UndefOr[integer] = js.undefined
  
  /**
    * Contains details about the output's video stream
    */
  var VideoDetails: js.UndefOr[VideoDetail] = js.undefined
}
object OutputDetail {
  
  inline def apply(): OutputDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutputDetail]
  }
  
  extension [Self <: OutputDetail](x: Self) {
    
    inline def setDurationInMs(value: integer): Self = StObject.set(x, "DurationInMs", value.asInstanceOf[js.Any])
    
    inline def setDurationInMsUndefined: Self = StObject.set(x, "DurationInMs", js.undefined)
    
    inline def setVideoDetails(value: VideoDetail): Self = StObject.set(x, "VideoDetails", value.asInstanceOf[js.Any])
    
    inline def setVideoDetailsUndefined: Self = StObject.set(x, "VideoDetails", js.undefined)
  }
}
