package typings.awsSdk.computeoptimizerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceRecommendationOption extends StObject {
  
  /**
    * The instance type of the instance recommendation.
    */
  var instanceType: js.UndefOr[InstanceType] = js.undefined
  
  /**
    * The level of effort required to migrate from the current instance type to the recommended instance type. For example, the migration effort is Low if Amazon EMR is the inferred workload type and an Amazon Web Services Graviton instance type is recommended. The migration effort is Medium if a workload type couldn't be inferred but an Amazon Web Services Graviton instance type is recommended. The migration effort is VeryLow if both the current and recommended instance types are of the same CPU architecture.
    */
  var migrationEffort: js.UndefOr[MigrationEffort] = js.undefined
  
  /**
    * The performance risk of the instance recommendation option. Performance risk indicates the likelihood of the recommended instance type not meeting the resource needs of your workload. Compute Optimizer calculates an individual performance risk score for each specification of the recommended instance, including CPU, memory, EBS throughput, EBS IOPS, disk throughput, disk IOPS, network throughput, and network PPS. The performance risk of the recommended instance is calculated as the maximum performance risk score across the analyzed resource specifications. The value ranges from 0 - 4, with 0 meaning that the recommended resource is predicted to always provide enough hardware capability. The higher the performance risk is, the more likely you should validate whether the recommendation will meet the performance requirements of your workload before migrating your resource.
    */
  var performanceRisk: js.UndefOr[PerformanceRisk] = js.undefined
  
  /**
    * Describes the configuration differences between the current instance and the recommended instance type. You should consider the configuration differences before migrating your workloads from the current instance to the recommended instance type. The Change the instance type guide for Linux and Change the instance type guide for Windows provide general guidance for getting started with an instance migration. Platform differences include:     Hypervisor  — The hypervisor of the recommended instance type is different than that of the current instance. For example, the recommended instance type uses a Nitro hypervisor and the current instance uses a Xen hypervisor. The differences that you should consider between these hypervisors are covered in the Nitro Hypervisor section of the Amazon EC2 frequently asked questions. For more information, see Instances built on the Nitro System in the Amazon EC2 User Guide for Linux, or Instances built on the Nitro System in the Amazon EC2 User Guide for Windows.     NetworkInterface  — The network interface of the recommended instance type is different than that of the current instance. For example, the recommended instance type supports enhanced networking and the current instance might not. To enable enhanced networking for the recommended instance type, you must install the Elastic Network Adapter (ENA) driver or the Intel 82599 Virtual Function driver. For more information, see Networking and storage features and Enhanced networking on Linux in the Amazon EC2 User Guide for Linux, or Networking and storage features and Enhanced networking on Windows in the Amazon EC2 User Guide for Windows.     StorageInterface  — The storage interface of the recommended instance type is different than that of the current instance. For example, the recommended instance type uses an NVMe storage interface and the current instance does not. To access NVMe volumes for the recommended instance type, you will need to install or upgrade the NVMe driver. For more information, see Networking and storage features and Amazon EBS and NVMe on Linux instances in the Amazon EC2 User Guide for Linux, or Networking and storage features and Amazon EBS and NVMe on Windows instances in the Amazon EC2 User Guide for Windows.     InstanceStoreAvailability  — The recommended instance type does not support instance store volumes and the current instance does. Before migrating, you might need to back up the data on your instance store volumes if you want to preserve them. For more information, see How do I back up an instance store volume on my Amazon EC2 instance to Amazon EBS? in the Amazon Web Services Premium Support Knowledge Base. For more information, see Networking and storage features and Amazon EC2 instance store in the Amazon EC2 User Guide for Linux, or see Networking and storage features and Amazon EC2 instance store in the Amazon EC2 User Guide for Windows.     VirtualizationType  — The recommended instance type uses the hardware virtual machine (HVM) virtualization type and the current instance uses the paravirtual (PV) virtualization type. For more information about the differences between these virtualization types, see Linux AMI virtualization types in the Amazon EC2 User Guide for Linux, or Windows AMI virtualization types in the Amazon EC2 User Guide for Windows.     Architecture  — The CPU architecture between the recommended instance type and the current instance is different. For example, the recommended instance type might use an Arm CPU architecture and the current instance type might use a different one, such as x86. Before migrating, you should consider recompiling the software on your instance for the new architecture. Alternatively, you might switch to an Amazon Machine Image (AMI) that supports the new architecture. For more information about the CPU architecture for each instance type, see Amazon EC2 Instance Types.  
    */
  var platformDifferences: js.UndefOr[PlatformDifferences] = js.undefined
  
  /**
    * An array of objects that describe the projected utilization metrics of the instance recommendation option.  The Cpu and Memory metrics are the only projected utilization metrics returned. Additionally, the Memory metric is returned only for resources that have the unified CloudWatch agent installed on them. For more information, see Enabling Memory Utilization with the CloudWatch Agent. 
    */
  var projectedUtilizationMetrics: js.UndefOr[ProjectedUtilizationMetrics] = js.undefined
  
  /**
    * The rank of the instance recommendation option. The top recommendation option is ranked as 1.
    */
  var rank: js.UndefOr[Rank] = js.undefined
  
  /**
    * An object that describes the savings opportunity for the instance recommendation option. Savings opportunity includes the estimated monthly savings amount and percentage.
    */
  var savingsOpportunity: js.UndefOr[SavingsOpportunity] = js.undefined
}
object InstanceRecommendationOption {
  
  inline def apply(): InstanceRecommendationOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceRecommendationOption]
  }
  
  extension [Self <: InstanceRecommendationOption](x: Self) {
    
    inline def setInstanceType(value: InstanceType): Self = StObject.set(x, "instanceType", value.asInstanceOf[js.Any])
    
    inline def setInstanceTypeUndefined: Self = StObject.set(x, "instanceType", js.undefined)
    
    inline def setMigrationEffort(value: MigrationEffort): Self = StObject.set(x, "migrationEffort", value.asInstanceOf[js.Any])
    
    inline def setMigrationEffortUndefined: Self = StObject.set(x, "migrationEffort", js.undefined)
    
    inline def setPerformanceRisk(value: PerformanceRisk): Self = StObject.set(x, "performanceRisk", value.asInstanceOf[js.Any])
    
    inline def setPerformanceRiskUndefined: Self = StObject.set(x, "performanceRisk", js.undefined)
    
    inline def setPlatformDifferences(value: PlatformDifferences): Self = StObject.set(x, "platformDifferences", value.asInstanceOf[js.Any])
    
    inline def setPlatformDifferencesUndefined: Self = StObject.set(x, "platformDifferences", js.undefined)
    
    inline def setPlatformDifferencesVarargs(value: PlatformDifference*): Self = StObject.set(x, "platformDifferences", js.Array(value*))
    
    inline def setProjectedUtilizationMetrics(value: ProjectedUtilizationMetrics): Self = StObject.set(x, "projectedUtilizationMetrics", value.asInstanceOf[js.Any])
    
    inline def setProjectedUtilizationMetricsUndefined: Self = StObject.set(x, "projectedUtilizationMetrics", js.undefined)
    
    inline def setProjectedUtilizationMetricsVarargs(value: UtilizationMetric*): Self = StObject.set(x, "projectedUtilizationMetrics", js.Array(value*))
    
    inline def setRank(value: Rank): Self = StObject.set(x, "rank", value.asInstanceOf[js.Any])
    
    inline def setRankUndefined: Self = StObject.set(x, "rank", js.undefined)
    
    inline def setSavingsOpportunity(value: SavingsOpportunity): Self = StObject.set(x, "savingsOpportunity", value.asInstanceOf[js.Any])
    
    inline def setSavingsOpportunityUndefined: Self = StObject.set(x, "savingsOpportunity", js.undefined)
  }
}
