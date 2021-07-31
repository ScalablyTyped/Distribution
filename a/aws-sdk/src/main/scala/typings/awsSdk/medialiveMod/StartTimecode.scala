package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartTimecode extends StObject {
  
  /**
    * The timecode for the frame where you want to start the clip. Optional; if not specified, the clip starts at first frame in the file. Enter the timecode as HH:MM:SS:FF or HH:MM:SS;FF.
    */
  var Timecode: js.UndefOr[string] = js.undefined
}
object StartTimecode {
  
  @scala.inline
  def apply(): StartTimecode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartTimecode]
  }
  
  @scala.inline
  implicit class StartTimecodeMutableBuilder[Self <: StartTimecode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTimecode(value: string): Self = StObject.set(x, "Timecode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimecodeUndefined: Self = StObject.set(x, "Timecode", js.undefined)
  }
}
