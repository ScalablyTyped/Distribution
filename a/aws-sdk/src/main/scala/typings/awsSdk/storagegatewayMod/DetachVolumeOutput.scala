package typings.awsSdk.storagegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetachVolumeOutput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the volume that was detached.
    */
  var VolumeARN: js.UndefOr[typings.awsSdk.storagegatewayMod.VolumeARN] = js.undefined
}
object DetachVolumeOutput {
  
  @scala.inline
  def apply(): DetachVolumeOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetachVolumeOutput]
  }
  
  @scala.inline
  implicit class DetachVolumeOutputMutableBuilder[Self <: DetachVolumeOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVolumeARN(value: VolumeARN): Self = StObject.set(x, "VolumeARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeARNUndefined: Self = StObject.set(x, "VolumeARN", js.undefined)
  }
}
