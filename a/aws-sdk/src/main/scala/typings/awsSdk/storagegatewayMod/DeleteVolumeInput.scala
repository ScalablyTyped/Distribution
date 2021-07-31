package typings.awsSdk.storagegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteVolumeInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the volume. Use the ListVolumes operation to return a list of gateway volumes.
    */
  var VolumeARN: typings.awsSdk.storagegatewayMod.VolumeARN
}
object DeleteVolumeInput {
  
  @scala.inline
  def apply(VolumeARN: VolumeARN): DeleteVolumeInput = {
    val __obj = js.Dynamic.literal(VolumeARN = VolumeARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteVolumeInput]
  }
  
  @scala.inline
  implicit class DeleteVolumeInputMutableBuilder[Self <: DeleteVolumeInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVolumeARN(value: VolumeARN): Self = StObject.set(x, "VolumeARN", value.asInstanceOf[js.Any])
  }
}
