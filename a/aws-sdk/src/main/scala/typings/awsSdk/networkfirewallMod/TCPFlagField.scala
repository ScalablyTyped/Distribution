package typings.awsSdk.networkfirewallMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TCPFlagField extends StObject {
  
  /**
    * Used in conjunction with the Masks setting to define the flags that must be set and flags that must not be set in order for the packet to match. This setting can only specify values that are also specified in the Masks setting. For the flags that are specified in the masks setting, the following must be true for the packet to match:    The ones that are set in this flags setting must be set in the packet.    The ones that are not set in this flags setting must also not be set in the packet.   
    */
  var Flags: typings.awsSdk.networkfirewallMod.Flags = js.native
  
  /**
    * The set of flags to consider in the inspection. To inspect all flags in the valid values list, leave this with no setting.
    */
  var Masks: js.UndefOr[Flags] = js.native
}
object TCPFlagField {
  
  @scala.inline
  def apply(Flags: Flags): TCPFlagField = {
    val __obj = js.Dynamic.literal(Flags = Flags.asInstanceOf[js.Any])
    __obj.asInstanceOf[TCPFlagField]
  }
  
  @scala.inline
  implicit class TCPFlagFieldMutableBuilder[Self <: TCPFlagField] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFlags(value: Flags): Self = StObject.set(x, "Flags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlagsVarargs(value: TCPFlag*): Self = StObject.set(x, "Flags", js.Array(value :_*))
    
    @scala.inline
    def setMasks(value: Flags): Self = StObject.set(x, "Masks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMasksUndefined: Self = StObject.set(x, "Masks", js.undefined)
    
    @scala.inline
    def setMasksVarargs(value: TCPFlag*): Self = StObject.set(x, "Masks", js.Array(value :_*))
  }
}
