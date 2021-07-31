package typings.awsSdk.storagegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateCachediSCSIVolumeOutput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the volume target, which includes the iSCSI name that initiators can use to connect to the target.
    */
  var TargetARN: js.UndefOr[typings.awsSdk.storagegatewayMod.TargetARN] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the configured volume.
    */
  var VolumeARN: js.UndefOr[typings.awsSdk.storagegatewayMod.VolumeARN] = js.undefined
}
object CreateCachediSCSIVolumeOutput {
  
  @scala.inline
  def apply(): CreateCachediSCSIVolumeOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateCachediSCSIVolumeOutput]
  }
  
  @scala.inline
  implicit class CreateCachediSCSIVolumeOutputMutableBuilder[Self <: CreateCachediSCSIVolumeOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTargetARN(value: TargetARN): Self = StObject.set(x, "TargetARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetARNUndefined: Self = StObject.set(x, "TargetARN", js.undefined)
    
    @scala.inline
    def setVolumeARN(value: VolumeARN): Self = StObject.set(x, "VolumeARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeARNUndefined: Self = StObject.set(x, "VolumeARN", js.undefined)
  }
}
