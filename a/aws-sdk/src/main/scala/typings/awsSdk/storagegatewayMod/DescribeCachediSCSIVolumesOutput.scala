package typings.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeCachediSCSIVolumesOutput extends js.Object {
  
  /**
    * An array of objects where each object contains metadata about one cached volume.
    */
  var CachediSCSIVolumes: js.UndefOr[typings.awsSdk.storagegatewayMod.CachediSCSIVolumes] = js.native
}
object DescribeCachediSCSIVolumesOutput {
  
  @scala.inline
  def apply(): DescribeCachediSCSIVolumesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeCachediSCSIVolumesOutput]
  }
  
  @scala.inline
  implicit class DescribeCachediSCSIVolumesOutputOps[Self <: DescribeCachediSCSIVolumesOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCachediSCSIVolumesVarargs(value: CachediSCSIVolume*): Self = this.set("CachediSCSIVolumes", js.Array(value :_*))
    
    @scala.inline
    def setCachediSCSIVolumes(value: CachediSCSIVolumes): Self = this.set("CachediSCSIVolumes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCachediSCSIVolumes: Self = this.set("CachediSCSIVolumes", js.undefined)
  }
}
