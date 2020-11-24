package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EbsInfo extends js.Object {
  
  /**
    * Describes the optimized EBS performance for the instance type.
    */
  var EbsOptimizedInfo: js.UndefOr[typings.awsSdk.ec2Mod.EbsOptimizedInfo] = js.native
  
  /**
    * Indicates whether the instance type is Amazon EBS-optimized. For more information, see Amazon EBS-Optimized Instances in Amazon EC2 User Guide for Linux Instances.
    */
  var EbsOptimizedSupport: js.UndefOr[typings.awsSdk.ec2Mod.EbsOptimizedSupport] = js.native
  
  /**
    * Indicates whether Amazon EBS encryption is supported.
    */
  var EncryptionSupport: js.UndefOr[EbsEncryptionSupport] = js.native
  
  /**
    * Indicates whether non-volatile memory express (NVMe) is supported.
    */
  var NvmeSupport: js.UndefOr[EbsNvmeSupport] = js.native
}
object EbsInfo {
  
  @scala.inline
  def apply(): EbsInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EbsInfo]
  }
  
  @scala.inline
  implicit class EbsInfoOps[Self <: EbsInfo] (val x: Self) extends AnyVal {
    
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
    def setEbsOptimizedInfo(value: EbsOptimizedInfo): Self = this.set("EbsOptimizedInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEbsOptimizedInfo: Self = this.set("EbsOptimizedInfo", js.undefined)
    
    @scala.inline
    def setEbsOptimizedSupport(value: EbsOptimizedSupport): Self = this.set("EbsOptimizedSupport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEbsOptimizedSupport: Self = this.set("EbsOptimizedSupport", js.undefined)
    
    @scala.inline
    def setEncryptionSupport(value: EbsEncryptionSupport): Self = this.set("EncryptionSupport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncryptionSupport: Self = this.set("EncryptionSupport", js.undefined)
    
    @scala.inline
    def setNvmeSupport(value: EbsNvmeSupport): Self = this.set("NvmeSupport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNvmeSupport: Self = this.set("NvmeSupport", js.undefined)
  }
}
