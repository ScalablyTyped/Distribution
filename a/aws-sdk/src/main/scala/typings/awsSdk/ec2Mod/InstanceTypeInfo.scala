package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceTypeInfo extends js.Object {
  /**
    * Indicates whether auto recovery is supported.
    */
  var AutoRecoverySupported: js.UndefOr[AutoRecoveryFlag] = js.native
  /**
    * Indicates whether the instance is bare metal.
    */
  var BareMetal: js.UndefOr[BareMetalFlag] = js.native
  /**
    * Indicates whether the instance type is a burstable performance instance type.
    */
  var BurstablePerformanceSupported: js.UndefOr[BurstablePerformanceFlag] = js.native
  /**
    * Indicates whether the instance type is a current generation.
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
    * Indicates the hypervisor used for the instance type.
    */
  var Hypervisor: js.UndefOr[InstanceTypeHypervisor] = js.native
  /**
    * Describes the Inference accelerator settings for the instance type.
    */
  var InferenceAcceleratorInfo: js.UndefOr[typings.awsSdk.ec2Mod.InferenceAcceleratorInfo] = js.native
  /**
    * Describes the disks for the instance type.
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
    * Indicates the supported root device types.
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
  def apply(
    AutoRecoverySupported: js.UndefOr[AutoRecoveryFlag] = js.undefined,
    BareMetal: js.UndefOr[BareMetalFlag] = js.undefined,
    BurstablePerformanceSupported: js.UndefOr[BurstablePerformanceFlag] = js.undefined,
    CurrentGeneration: js.UndefOr[CurrentGenerationFlag] = js.undefined,
    DedicatedHostsSupported: js.UndefOr[DedicatedHostFlag] = js.undefined,
    EbsInfo: EbsInfo = null,
    FpgaInfo: FpgaInfo = null,
    FreeTierEligible: js.UndefOr[FreeTierEligibleFlag] = js.undefined,
    GpuInfo: GpuInfo = null,
    HibernationSupported: js.UndefOr[HibernationFlag] = js.undefined,
    Hypervisor: InstanceTypeHypervisor = null,
    InferenceAcceleratorInfo: InferenceAcceleratorInfo = null,
    InstanceStorageInfo: InstanceStorageInfo = null,
    InstanceStorageSupported: js.UndefOr[InstanceStorageFlag] = js.undefined,
    InstanceType: InstanceType = null,
    MemoryInfo: MemoryInfo = null,
    NetworkInfo: NetworkInfo = null,
    PlacementGroupInfo: PlacementGroupInfo = null,
    ProcessorInfo: ProcessorInfo = null,
    SupportedRootDeviceTypes: RootDeviceTypeList = null,
    SupportedUsageClasses: UsageClassTypeList = null,
    SupportedVirtualizationTypes: VirtualizationTypeList = null,
    VCpuInfo: VCpuInfo = null
  ): InstanceTypeInfo = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(AutoRecoverySupported)) __obj.updateDynamic("AutoRecoverySupported")(AutoRecoverySupported.get.asInstanceOf[js.Any])
    if (!js.isUndefined(BareMetal)) __obj.updateDynamic("BareMetal")(BareMetal.get.asInstanceOf[js.Any])
    if (!js.isUndefined(BurstablePerformanceSupported)) __obj.updateDynamic("BurstablePerformanceSupported")(BurstablePerformanceSupported.get.asInstanceOf[js.Any])
    if (!js.isUndefined(CurrentGeneration)) __obj.updateDynamic("CurrentGeneration")(CurrentGeneration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(DedicatedHostsSupported)) __obj.updateDynamic("DedicatedHostsSupported")(DedicatedHostsSupported.get.asInstanceOf[js.Any])
    if (EbsInfo != null) __obj.updateDynamic("EbsInfo")(EbsInfo.asInstanceOf[js.Any])
    if (FpgaInfo != null) __obj.updateDynamic("FpgaInfo")(FpgaInfo.asInstanceOf[js.Any])
    if (!js.isUndefined(FreeTierEligible)) __obj.updateDynamic("FreeTierEligible")(FreeTierEligible.get.asInstanceOf[js.Any])
    if (GpuInfo != null) __obj.updateDynamic("GpuInfo")(GpuInfo.asInstanceOf[js.Any])
    if (!js.isUndefined(HibernationSupported)) __obj.updateDynamic("HibernationSupported")(HibernationSupported.get.asInstanceOf[js.Any])
    if (Hypervisor != null) __obj.updateDynamic("Hypervisor")(Hypervisor.asInstanceOf[js.Any])
    if (InferenceAcceleratorInfo != null) __obj.updateDynamic("InferenceAcceleratorInfo")(InferenceAcceleratorInfo.asInstanceOf[js.Any])
    if (InstanceStorageInfo != null) __obj.updateDynamic("InstanceStorageInfo")(InstanceStorageInfo.asInstanceOf[js.Any])
    if (!js.isUndefined(InstanceStorageSupported)) __obj.updateDynamic("InstanceStorageSupported")(InstanceStorageSupported.get.asInstanceOf[js.Any])
    if (InstanceType != null) __obj.updateDynamic("InstanceType")(InstanceType.asInstanceOf[js.Any])
    if (MemoryInfo != null) __obj.updateDynamic("MemoryInfo")(MemoryInfo.asInstanceOf[js.Any])
    if (NetworkInfo != null) __obj.updateDynamic("NetworkInfo")(NetworkInfo.asInstanceOf[js.Any])
    if (PlacementGroupInfo != null) __obj.updateDynamic("PlacementGroupInfo")(PlacementGroupInfo.asInstanceOf[js.Any])
    if (ProcessorInfo != null) __obj.updateDynamic("ProcessorInfo")(ProcessorInfo.asInstanceOf[js.Any])
    if (SupportedRootDeviceTypes != null) __obj.updateDynamic("SupportedRootDeviceTypes")(SupportedRootDeviceTypes.asInstanceOf[js.Any])
    if (SupportedUsageClasses != null) __obj.updateDynamic("SupportedUsageClasses")(SupportedUsageClasses.asInstanceOf[js.Any])
    if (SupportedVirtualizationTypes != null) __obj.updateDynamic("SupportedVirtualizationTypes")(SupportedVirtualizationTypes.asInstanceOf[js.Any])
    if (VCpuInfo != null) __obj.updateDynamic("VCpuInfo")(VCpuInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceTypeInfo]
  }
}

