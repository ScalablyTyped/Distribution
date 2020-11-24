package typings.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EBSOptions extends js.Object {
  
  /**
    * Specifies whether EBS-based storage is enabled.
    */
  var EBSEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Specifies the IOPD for a Provisioned IOPS EBS volume (SSD).
    */
  var Iops: js.UndefOr[IntegerClass] = js.native
  
  /**
    *  Integer to specify the size of an EBS volume.
    */
  var VolumeSize: js.UndefOr[IntegerClass] = js.native
  
  /**
    *  Specifies the volume type for EBS-based storage.
    */
  var VolumeType: js.UndefOr[typings.awsSdk.esMod.VolumeType] = js.native
}
object EBSOptions {
  
  @scala.inline
  def apply(): EBSOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EBSOptions]
  }
  
  @scala.inline
  implicit class EBSOptionsOps[Self <: EBSOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEBSEnabled(value: Boolean): Self = this.set("EBSEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEBSEnabled: Self = this.set("EBSEnabled", js.undefined)
    
    @scala.inline
    def setIops(value: IntegerClass): Self = this.set("Iops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIops: Self = this.set("Iops", js.undefined)
    
    @scala.inline
    def setVolumeSize(value: IntegerClass): Self = this.set("VolumeSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVolumeSize: Self = this.set("VolumeSize", js.undefined)
    
    @scala.inline
    def setVolumeType(value: VolumeType): Self = this.set("VolumeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVolumeType: Self = this.set("VolumeType", js.undefined)
  }
}
