package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StopTimecode extends StObject {
  
  /**
    * If you specify a StopTimecode in an input (in order to clip the file), you can specify if you want the clip to exclude (the default) or include the frame specified by the timecode.
    */
  var LastFrameClippingBehavior: js.UndefOr[typings.awsSdk.medialiveMod.LastFrameClippingBehavior] = js.native
  
  /**
    * The timecode for the frame where you want to stop the clip. Optional; if not specified, the clip continues to the end of the file. Enter the timecode as HH:MM:SS:FF or HH:MM:SS;FF.
    */
  var Timecode: js.UndefOr[string] = js.native
}
object StopTimecode {
  
  @scala.inline
  def apply(): StopTimecode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StopTimecode]
  }
  
  @scala.inline
  implicit class StopTimecodeMutableBuilder[Self <: StopTimecode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLastFrameClippingBehavior(value: LastFrameClippingBehavior): Self = StObject.set(x, "LastFrameClippingBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastFrameClippingBehaviorUndefined: Self = StObject.set(x, "LastFrameClippingBehavior", js.undefined)
    
    @scala.inline
    def setTimecode(value: string): Self = StObject.set(x, "Timecode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimecodeUndefined: Self = StObject.set(x, "Timecode", js.undefined)
  }
}
