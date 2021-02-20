package typings.awsSdk.storagegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DetachVolumeInput extends StObject {
  
  /**
    * Set to true to forcibly remove the iSCSI connection of the target volume and detach the volume. The default is false. If this value is set to false, you must manually disconnect the iSCSI connection from the target volume. Valid Values: true | false 
    */
  var ForceDetach: js.UndefOr[Boolean] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the volume to detach from the gateway.
    */
  var VolumeARN: typings.awsSdk.storagegatewayMod.VolumeARN = js.native
}
object DetachVolumeInput {
  
  @scala.inline
  def apply(VolumeARN: VolumeARN): DetachVolumeInput = {
    val __obj = js.Dynamic.literal(VolumeARN = VolumeARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetachVolumeInput]
  }
  
  @scala.inline
  implicit class DetachVolumeInputMutableBuilder[Self <: DetachVolumeInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setForceDetach(value: Boolean): Self = StObject.set(x, "ForceDetach", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceDetachUndefined: Self = StObject.set(x, "ForceDetach", js.undefined)
    
    @scala.inline
    def setVolumeARN(value: VolumeARN): Self = StObject.set(x, "VolumeARN", value.asInstanceOf[js.Any])
  }
}
