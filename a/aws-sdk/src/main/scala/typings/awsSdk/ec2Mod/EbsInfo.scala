package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EbsInfo extends js.Object {
  /**
    * Describes the optimized EBS performance for the instance type.
    */
  var EbsOptimizedInfo: js.UndefOr[typings.awsSdk.ec2Mod.EbsOptimizedInfo] = js.native
  /**
    * Indicates that the instance type is Amazon EBS-optimized. For more information, see Amazon EBS-Optimized Instances in Amazon EC2 User Guide for Linux Instances.
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
  def apply(
    EbsOptimizedInfo: EbsOptimizedInfo = null,
    EbsOptimizedSupport: EbsOptimizedSupport = null,
    EncryptionSupport: EbsEncryptionSupport = null,
    NvmeSupport: EbsNvmeSupport = null
  ): EbsInfo = {
    val __obj = js.Dynamic.literal()
    if (EbsOptimizedInfo != null) __obj.updateDynamic("EbsOptimizedInfo")(EbsOptimizedInfo.asInstanceOf[js.Any])
    if (EbsOptimizedSupport != null) __obj.updateDynamic("EbsOptimizedSupport")(EbsOptimizedSupport.asInstanceOf[js.Any])
    if (EncryptionSupport != null) __obj.updateDynamic("EncryptionSupport")(EncryptionSupport.asInstanceOf[js.Any])
    if (NvmeSupport != null) __obj.updateDynamic("NvmeSupport")(NvmeSupport.asInstanceOf[js.Any])
    __obj.asInstanceOf[EbsInfo]
  }
}

