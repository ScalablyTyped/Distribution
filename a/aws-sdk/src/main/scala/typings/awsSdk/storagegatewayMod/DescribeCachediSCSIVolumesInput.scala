package typings.awsSdk.storagegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeCachediSCSIVolumesInput extends StObject {
  
  /**
    * An array of strings where each string represents the Amazon Resource Name (ARN) of a cached volume. All of the specified cached volumes must be from the same gateway. Use ListVolumes to get volume ARNs for a gateway.
    */
  var VolumeARNs: typings.awsSdk.storagegatewayMod.VolumeARNs = js.native
}
object DescribeCachediSCSIVolumesInput {
  
  @scala.inline
  def apply(VolumeARNs: VolumeARNs): DescribeCachediSCSIVolumesInput = {
    val __obj = js.Dynamic.literal(VolumeARNs = VolumeARNs.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeCachediSCSIVolumesInput]
  }
  
  @scala.inline
  implicit class DescribeCachediSCSIVolumesInputMutableBuilder[Self <: DescribeCachediSCSIVolumesInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVolumeARNs(value: VolumeARNs): Self = StObject.set(x, "VolumeARNs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeARNsVarargs(value: VolumeARN*): Self = StObject.set(x, "VolumeARNs", js.Array(value :_*))
  }
}
