package typings.awsSdk.mediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OutputDetail extends StObject {
  
  /**
    * Duration in milliseconds
    */
  var DurationInMs: js.UndefOr[integer] = js.native
  
  /**
    * Contains details about the output's video stream
    */
  var VideoDetails: js.UndefOr[VideoDetail] = js.native
}
object OutputDetail {
  
  @scala.inline
  def apply(): OutputDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutputDetail]
  }
  
  @scala.inline
  implicit class OutputDetailMutableBuilder[Self <: OutputDetail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDurationInMs(value: integer): Self = StObject.set(x, "DurationInMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationInMsUndefined: Self = StObject.set(x, "DurationInMs", js.undefined)
    
    @scala.inline
    def setVideoDetails(value: VideoDetail): Self = StObject.set(x, "VideoDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoDetailsUndefined: Self = StObject.set(x, "VideoDetails", js.undefined)
  }
}
