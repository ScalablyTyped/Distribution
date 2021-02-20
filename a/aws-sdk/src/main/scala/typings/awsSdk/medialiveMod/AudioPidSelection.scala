package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AudioPidSelection extends StObject {
  
  /**
    * Selects a specific PID from within a source.
    */
  var Pid: integerMin0Max8191 = js.native
}
object AudioPidSelection {
  
  @scala.inline
  def apply(Pid: integerMin0Max8191): AudioPidSelection = {
    val __obj = js.Dynamic.literal(Pid = Pid.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioPidSelection]
  }
  
  @scala.inline
  implicit class AudioPidSelectionMutableBuilder[Self <: AudioPidSelection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPid(value: integerMin0Max8191): Self = StObject.set(x, "Pid", value.asInstanceOf[js.Any])
  }
}
