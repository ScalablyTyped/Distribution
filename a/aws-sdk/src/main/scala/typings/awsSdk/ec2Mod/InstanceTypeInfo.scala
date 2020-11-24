package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstanceTypeInfo extends js.Object {
  
  /**
    * Indicates whether auto recovery is supported.
    */
  var AutoRecoverySupported: js.UndefOr[AutoRecoveryFlag] = js.native
  
  /**
    * Indicates whether the instance is a bare metal instance type.
    */
  var BareMetal: js.UndefOr[BareMetalFlag] = js.native
  
  /**
    * Indicates whether the instance type is a burstable performance instance type.
    */
  var BurstablePerformanceSupported: js.UndefOr[BurstablePerformanceFlag] = js.native
  
  /**
    * Indicates whether the instance type is current generation.
    */
  var CurrentGeneration: js.UndefOr[CurrentGenerationFlag] = js.native
  
  /**
    * Indicates whether Dedicated Hosts are supported on the instance type.
    */
  var DedicatedHostsSupported: js.UndefOr[DedicatedHostFlag] = js.native
  
  /**
    * Describes the Amazon EBS settings for the instance type.
    */
  var EbsInfo: js.UndefOr[typings.awsSdk.ec2Mod.EbsInfo] = js.native
  
  /**
    * Describes the FPGA accelerator settings for the instance type.
    */
  var FpgaInfo: js.UndefOr[typings.awsSdk.ec2Mod.FpgaInfo] = js.native
  
  /**
    * Indicates whether the instance type is eligible for the free tier.
    */
  var FreeTierEligible: js.UndefOr[FreeTierEligibleFlag] = js.native
  
  /**
    * Describes the GPU accelerator settings for the instance type.
    */
  var GpuInfo: js.UndefOr[typings.awsSdk.ec2Mod.GpuInfo] = js.native
  
  /**
    * Indicates whether On-Demand hibernation is supported.
    */
  var HibernationSupported: js.UndefOr[HibernationFlag] = js.native
  
  /**
    * The hypervisor for the instance type.
    */
  var Hypervisor: js.UndefOr[InstanceTypeHypervisor] = js.native
  
  /**
    * Describes the Inference accelerator settings for the instance type.
    */
  var InferenceAcceleratorInfo: js.UndefOr[typings.awsSdk.ec2Mod.InferenceAcceleratorInfo] = js.native
  
  /**
    * Describes the instance storage for the instance type.
    */
  var InstanceStorageInfo: js.UndefOr[typings.awsSdk.ec2Mod.InstanceStorageInfo] = js.native
  
  /**
    * Indicates whether instance storage is supported.
    */
  var InstanceStorageSupported: js.UndefOr[InstanceStorageFlag] = js.native
  
  /**
    * The instance type. For more information, see Instance Types in the Amazon Elastic Compute Cloud User Guide.
    */
  var InstanceType: js.UndefOr[typings.awsSdk.ec2Mod.InstanceType] = js.native
  
  /**
    * Describes the memory for the instance type.
    */
  var MemoryInfo: js.UndefOr[typings.awsSdk.ec2Mod.MemoryInfo] = js.native
  
  /**
    * Describes the network settings for the instance type.
    */
  var NetworkInfo: js.UndefOr[typings.awsSdk.ec2Mod.NetworkInfo] = js.native
  
  /**
    * Describes the placement group settings for the instance type.
    */
  var PlacementGroupInfo: js.UndefOr[typings.awsSdk.ec2Mod.PlacementGroupInfo] = js.native
  
  /**
    * Describes the processor.
    */
  var ProcessorInfo: js.UndefOr[typings.awsSdk.ec2Mod.ProcessorInfo] = js.native
  
  /**
    * The supported root device types.
    */
  var SupportedRootDeviceTypes: js.UndefOr[RootDeviceTypeList] = js.native
  
  /**
    * Indicates whether the instance type is offered for spot or On-Demand.
    */
  var SupportedUsageClasses: js.UndefOr[UsageClassTypeList] = js.native
  
  /**
    * The supported virtualization types.
    */
  var SupportedVirtualizationTypes: js.UndefOr[VirtualizationTypeList] = js.native
  
  /**
    * Describes the vCPU configurations for the instance type.
    */
  var VCpuInfo: js.UndefOr[typings.awsSdk.ec2Mod.VCpuInfo] = js.native
}
object InstanceTypeInfo {
  
  @scala.inline
  def apply(): InstanceTypeInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceTypeInfo]
  }
  
  @scala.inline
  implicit class InstanceTypeInfoOps[Self <: InstanceTypeInfo] (val x: Self) extends AnyVal {
    
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
    def setAutoRecoverySupported(value: AutoRecoveryFlag): Self = this.set("AutoRecoverySupported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoRecoverySupported: Self = this.set("AutoRecoverySupported", js.undefined)
    
    @scala.inline
    def setBareMetal(value: BareMetalFlag): Self = this.set("BareMetal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBareMetal: Self = this.set("BareMetal", js.undefined)
    
    @scala.inline
    def setBurstablePerformanceSupported(value: BurstablePerformanceFlag): Self = this.set("BurstablePerformanceSupported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBurstablePerformanceSupported: Self = this.set("BurstablePerformanceSupported", js.undefined)
    
    @scala.inline
    def setCurrentGeneration(value: CurrentGenerationFlag): Self = this.set("CurrentGeneration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrentGeneration: Self = this.set("CurrentGeneration", js.undefined)
    
    @scala.inline
    def setDedicatedHostsSupported(value: DedicatedHostFlag): Self = this.set("DedicatedHostsSupported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDedicatedHostsSupported: Self = this.set("DedicatedHostsSupported", js.undefined)
    
    @scala.inline
    def setEbsInfo(value: EbsInfo): Self = this.set("EbsInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEbsInfo: Self = this.set("EbsInfo", js.undefined)
    
    @scala.inline
    def setFpgaInfo(value: FpgaInfo): Self = this.set("FpgaInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFpgaInfo: Self = this.set("FpgaInfo", js.undefined)
    
    @scala.inline
    def setFreeTierEligible(value: FreeTierEligibleFlag): Self = this.set("FreeTierEligible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFreeTierEligible: Self = this.set("FreeTierEligible", js.undefined)
    
    @scala.inline
    def setGpuInfo(value: GpuInfo): Self = this.set("GpuInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGpuInfo: Self = this.set("GpuInfo", js.undefined)
    
    @scala.inline
    def setHibernationSupported(value: HibernationFlag): Self = this.set("HibernationSupported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHibernationSupported: Self = this.set("HibernationSupported", js.undefined)
    
    @scala.inline
    def setHypervisor(value: InstanceTypeHypervisor): Self = this.set("Hypervisor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHypervisor: Self = this.set("Hypervisor", js.undefined)
    
    @scala.inline
    def setInferenceAcceleratorInfo(value: InferenceAcceleratorInfo): Self = this.set("InferenceAcceleratorInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInferenceAcceleratorInfo: Self = this.set("InferenceAcceleratorInfo", js.undefined)
    
    @scala.inline
    def setInstanceStorageInfo(value: InstanceStorageInfo): Self = this.set("InstanceStorageInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceStorageInfo: Self = this.set("InstanceStorageInfo", js.undefined)
    
    @scala.inline
    def setInstanceStorageSupported(value: InstanceStorageFlag): Self = this.set("InstanceStorageSupported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceStorageSupported: Self = this.set("InstanceStorageSupported", js.undefined)
    
    @scala.inline
    def setInstanceType(value: InstanceType): Self = this.set("InstanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceType: Self = this.set("InstanceType", js.undefined)
    
    @scala.inline
    def setMemoryInfo(value: MemoryInfo): Self = this.set("MemoryInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMemoryInfo: Self = this.set("MemoryInfo", js.undefined)
    
    @scala.inline
    def setNetworkInfo(value: NetworkInfo): Self = this.set("NetworkInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkInfo: Self = this.set("NetworkInfo", js.undefined)
    
    @scala.inline
    def setPlacementGroupInfo(value: PlacementGroupInfo): Self = this.set("PlacementGroupInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlacementGroupInfo: Self = this.set("PlacementGroupInfo", js.undefined)
    
    @scala.inline
    def setProcessorInfo(value: ProcessorInfo): Self = this.set("ProcessorInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProcessorInfo: Self = this.set("ProcessorInfo", js.undefined)
    
    @scala.inline
    def setSupportedRootDeviceTypesVarargs(value: RootDeviceType*): Self = this.set("SupportedRootDeviceTypes", js.Array(value :_*))
    
    @scala.inline
    def setSupportedRootDeviceTypes(value: RootDeviceTypeList): Self = this.set("SupportedRootDeviceTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupportedRootDeviceTypes: Self = this.set("SupportedRootDeviceTypes", js.undefined)
    
    @scala.inline
    def setSupportedUsageClassesVarargs(value: UsageClassType*): Self = this.set("SupportedUsageClasses", js.Array(value :_*))
    
    @scala.inline
    def setSupportedUsageClasses(value: UsageClassTypeList): Self = this.set("SupportedUsageClasses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupportedUsageClasses: Self = this.set("SupportedUsageClasses", js.undefined)
    
    @scala.inline
    def setSupportedVirtualizationTypesVarargs(value: VirtualizationType*): Self = this.set("SupportedVirtualizationTypes", js.Array(value :_*))
    
    @scala.inline
    def setSupportedVirtualizationTypes(value: VirtualizationTypeList): Self = this.set("SupportedVirtualizationTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupportedVirtualizationTypes: Self = this.set("SupportedVirtualizationTypes", js.undefined)
    
    @scala.inline
    def setVCpuInfo(value: VCpuInfo): Self = this.set("VCpuInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVCpuInfo: Self = this.set("VCpuInfo", js.undefined)
  }
}
