package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VideoSelectorPid extends StObject {
  
  /**
    * Selects a specific PID from within a video source.
    */
  var Pid: js.UndefOr[integerMin0Max8191] = js.native
}
object VideoSelectorPid {
  
  @scala.inline
  def apply(): VideoSelectorPid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoSelectorPid]
  }
  
  @scala.inline
  implicit class VideoSelectorPidMutableBuilder[Self <: VideoSelectorPid] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPid(value: integerMin0Max8191): Self = StObject.set(x, "Pid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPidUndefined: Self = StObject.set(x, "Pid", js.undefined)
  }
}
