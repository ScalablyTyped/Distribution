package typings.awsSdk.computeoptimizerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceRecommendation extends StObject {
  
  /**
    * The Amazon Web Services account ID of the instance.
    */
  var accountId: js.UndefOr[AccountId] = js.undefined
  
  /**
    * The instance type of the current instance.
    */
  var currentInstanceType: js.UndefOr[CurrentInstanceType] = js.undefined
  
  /**
    * The risk of the current instance not meeting the performance needs of its workloads. The higher the risk, the more likely the current instance cannot meet the performance requirements of its workload.
    */
  var currentPerformanceRisk: js.UndefOr[CurrentPerformanceRisk] = js.undefined
  
  /**
    * An object that describes the effective recommendation preferences for the instance.
    */
  var effectiveRecommendationPreferences: js.UndefOr[EffectiveRecommendationPreferences] = js.undefined
  
  /**
    * The finding classification of the instance. Findings for instances include:     Underprovisioned —An instance is considered under-provisioned when at least one specification of your instance, such as CPU, memory, or network, does not meet the performance requirements of your workload. Under-provisioned instances may lead to poor application performance.     Overprovisioned —An instance is considered over-provisioned when at least one specification of your instance, such as CPU, memory, or network, can be sized down while still meeting the performance requirements of your workload, and no specification is under-provisioned. Over-provisioned instances may lead to unnecessary infrastructure cost.     Optimized —An instance is considered optimized when all specifications of your instance, such as CPU, memory, and network, meet the performance requirements of your workload and is not over provisioned. For optimized resources, Compute Optimizer might recommend a new generation instance type.  
    */
  var finding: js.UndefOr[Finding] = js.undefined
  
  /**
    * The reason for the finding classification of the instance. Finding reason codes for instances include:     CPUOverprovisioned  — The instance’s CPU configuration can be sized down while still meeting the performance requirements of your workload. This is identified by analyzing the CPUUtilization metric of the current instance during the look-back period.     CPUUnderprovisioned  — The instance’s CPU configuration doesn't meet the performance requirements of your workload and there is an alternative instance type that provides better CPU performance. This is identified by analyzing the CPUUtilization metric of the current instance during the look-back period.     MemoryOverprovisioned  — The instance’s memory configuration can be sized down while still meeting the performance requirements of your workload. This is identified by analyzing the memory utilization metric of the current instance during the look-back period.     MemoryUnderprovisioned  — The instance’s memory configuration doesn't meet the performance requirements of your workload and there is an alternative instance type that provides better memory performance. This is identified by analyzing the memory utilization metric of the current instance during the look-back period.  Memory utilization is analyzed only for resources that have the unified CloudWatch agent installed on them. For more information, see Enabling memory utilization with the Amazon CloudWatch Agent in the Compute Optimizer User Guide. On Linux instances, Compute Optimizer analyses the mem_used_percent metric in the CWAgent namespace, or the legacy MemoryUtilization metric in the System/Linux namespace. On Windows instances, Compute Optimizer analyses the Memory % Committed Bytes In Use metric in the CWAgent namespace.      EBSThroughputOverprovisioned  — The instance’s EBS throughput configuration can be sized down while still meeting the performance requirements of your workload. This is identified by analyzing the VolumeReadOps and VolumeWriteOps metrics of EBS volumes attached to the current instance during the look-back period.     EBSThroughputUnderprovisioned  — The instance’s EBS throughput configuration doesn't meet the performance requirements of your workload and there is an alternative instance type that provides better EBS throughput performance. This is identified by analyzing the VolumeReadOps and VolumeWriteOps metrics of EBS volumes attached to the current instance during the look-back period.     EBSIOPSOverprovisioned  — The instance’s EBS IOPS configuration can be sized down while still meeting the performance requirements of your workload. This is identified by analyzing the VolumeReadBytes and VolumeWriteBytes metric of EBS volumes attached to the current instance during the look-back period.     EBSIOPSUnderprovisioned  — The instance’s EBS IOPS configuration doesn't meet the performance requirements of your workload and there is an alternative instance type that provides better EBS IOPS performance. This is identified by analyzing the VolumeReadBytes and VolumeWriteBytes metric of EBS volumes attached to the current instance during the look-back period.     NetworkBandwidthOverprovisioned  — The instance’s network bandwidth configuration can be sized down while still meeting the performance requirements of your workload. This is identified by analyzing the NetworkIn and NetworkOut metrics of the current instance during the look-back period.     NetworkBandwidthUnderprovisioned  — The instance’s network bandwidth configuration doesn't meet the performance requirements of your workload and there is an alternative instance type that provides better network bandwidth performance. This is identified by analyzing the NetworkIn and NetworkOut metrics of the current instance during the look-back period. This finding reason happens when the NetworkIn or NetworkOut performance of an instance is impacted.     NetworkPPSOverprovisioned  — The instance’s network PPS (packets per second) configuration can be sized down while still meeting the performance requirements of your workload. This is identified by analyzing the NetworkPacketsIn and NetworkPacketsIn metrics of the current instance during the look-back period.     NetworkPPSUnderprovisioned  — The instance’s network PPS (packets per second) configuration doesn't meet the performance requirements of your workload and there is an alternative instance type that provides better network PPS performance. This is identified by analyzing the NetworkPacketsIn and NetworkPacketsIn metrics of the current instance during the look-back period.     DiskIOPSOverprovisioned  — The instance’s disk IOPS configuration can be sized down while still meeting the performance requirements of your workload. This is identified by analyzing the DiskReadOps and DiskWriteOps metrics of the current instance during the look-back period.     DiskIOPSUnderprovisioned  — The instance’s disk IOPS configuration doesn't meet the performance requirements of your workload and there is an alternative instance type that provides better disk IOPS performance. This is identified by analyzing the DiskReadOps and DiskWriteOps metrics of the current instance during the look-back period.     DiskThroughputOverprovisioned  — The instance’s disk throughput configuration can be sized down while still meeting the performance requirements of your workload. This is identified by analyzing the DiskReadBytes and DiskWriteBytes metrics of the current instance during the look-back period.     DiskThroughputUnderprovisioned  — The instance’s disk throughput configuration doesn't meet the performance requirements of your workload and there is an alternative instance type that provides better disk throughput performance. This is identified by analyzing the DiskReadBytes and DiskWriteBytes metrics of the current instance during the look-back period.    For more information about instance metrics, see List the available CloudWatch metrics for your instances in the Amazon Elastic Compute Cloud User Guide. For more information about EBS volume metrics, see Amazon CloudWatch metrics for Amazon EBS in the Amazon Elastic Compute Cloud User Guide. 
    */
  var findingReasonCodes: js.UndefOr[InstanceRecommendationFindingReasonCodes] = js.undefined
  
  /**
    * The applications that might be running on the instance as inferred by Compute Optimizer. Compute Optimizer can infer if one of the following applications might be running on the instance:    AmazonEmr - Infers that Amazon EMR might be running on the instance.    ApacheCassandra - Infers that Apache Cassandra might be running on the instance.    ApacheHadoop - Infers that Apache Hadoop might be running on the instance.    Memcached - Infers that Memcached might be running on the instance.    NGINX - Infers that NGINX might be running on the instance.    PostgreSql - Infers that PostgreSQL might be running on the instance.    Redis - Infers that Redis might be running on the instance.  
    */
  var inferredWorkloadTypes: js.UndefOr[InferredWorkloadTypes] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the current instance.
    */
  var instanceArn: js.UndefOr[InstanceArn] = js.undefined
  
  /**
    * The name of the current instance.
    */
  var instanceName: js.UndefOr[InstanceName] = js.undefined
  
  /**
    * The timestamp of when the instance recommendation was last generated.
    */
  var lastRefreshTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The number of days for which utilization metrics were analyzed for the instance.
    */
  var lookBackPeriodInDays: js.UndefOr[LookBackPeriodInDays] = js.undefined
  
  /**
    * An array of objects that describe the recommendation options for the instance.
    */
  var recommendationOptions: js.UndefOr[RecommendationOptions] = js.undefined
  
  /**
    * An array of objects that describe the source resource of the recommendation.
    */
  var recommendationSources: js.UndefOr[RecommendationSources] = js.undefined
  
  /**
    * An array of objects that describe the utilization metrics of the instance.
    */
  var utilizationMetrics: js.UndefOr[UtilizationMetrics] = js.undefined
}
object InstanceRecommendation {
  
  inline def apply(): InstanceRecommendation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceRecommendation]
  }
  
  extension [Self <: InstanceRecommendation](x: Self) {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setCurrentInstanceType(value: CurrentInstanceType): Self = StObject.set(x, "currentInstanceType", value.asInstanceOf[js.Any])
    
    inline def setCurrentInstanceTypeUndefined: Self = StObject.set(x, "currentInstanceType", js.undefined)
    
    inline def setCurrentPerformanceRisk(value: CurrentPerformanceRisk): Self = StObject.set(x, "currentPerformanceRisk", value.asInstanceOf[js.Any])
    
    inline def setCurrentPerformanceRiskUndefined: Self = StObject.set(x, "currentPerformanceRisk", js.undefined)
    
    inline def setEffectiveRecommendationPreferences(value: EffectiveRecommendationPreferences): Self = StObject.set(x, "effectiveRecommendationPreferences", value.asInstanceOf[js.Any])
    
    inline def setEffectiveRecommendationPreferencesUndefined: Self = StObject.set(x, "effectiveRecommendationPreferences", js.undefined)
    
    inline def setFinding(value: Finding): Self = StObject.set(x, "finding", value.asInstanceOf[js.Any])
    
    inline def setFindingReasonCodes(value: InstanceRecommendationFindingReasonCodes): Self = StObject.set(x, "findingReasonCodes", value.asInstanceOf[js.Any])
    
    inline def setFindingReasonCodesUndefined: Self = StObject.set(x, "findingReasonCodes", js.undefined)
    
    inline def setFindingReasonCodesVarargs(value: InstanceRecommendationFindingReasonCode*): Self = StObject.set(x, "findingReasonCodes", js.Array(value*))
    
    inline def setFindingUndefined: Self = StObject.set(x, "finding", js.undefined)
    
    inline def setInferredWorkloadTypes(value: InferredWorkloadTypes): Self = StObject.set(x, "inferredWorkloadTypes", value.asInstanceOf[js.Any])
    
    inline def setInferredWorkloadTypesUndefined: Self = StObject.set(x, "inferredWorkloadTypes", js.undefined)
    
    inline def setInferredWorkloadTypesVarargs(value: InferredWorkloadType*): Self = StObject.set(x, "inferredWorkloadTypes", js.Array(value*))
    
    inline def setInstanceArn(value: InstanceArn): Self = StObject.set(x, "instanceArn", value.asInstanceOf[js.Any])
    
    inline def setInstanceArnUndefined: Self = StObject.set(x, "instanceArn", js.undefined)
    
    inline def setInstanceName(value: InstanceName): Self = StObject.set(x, "instanceName", value.asInstanceOf[js.Any])
    
    inline def setInstanceNameUndefined: Self = StObject.set(x, "instanceName", js.undefined)
    
    inline def setLastRefreshTimestamp(value: js.Date): Self = StObject.set(x, "lastRefreshTimestamp", value.asInstanceOf[js.Any])
    
    inline def setLastRefreshTimestampUndefined: Self = StObject.set(x, "lastRefreshTimestamp", js.undefined)
    
    inline def setLookBackPeriodInDays(value: LookBackPeriodInDays): Self = StObject.set(x, "lookBackPeriodInDays", value.asInstanceOf[js.Any])
    
    inline def setLookBackPeriodInDaysUndefined: Self = StObject.set(x, "lookBackPeriodInDays", js.undefined)
    
    inline def setRecommendationOptions(value: RecommendationOptions): Self = StObject.set(x, "recommendationOptions", value.asInstanceOf[js.Any])
    
    inline def setRecommendationOptionsUndefined: Self = StObject.set(x, "recommendationOptions", js.undefined)
    
    inline def setRecommendationOptionsVarargs(value: InstanceRecommendationOption*): Self = StObject.set(x, "recommendationOptions", js.Array(value*))
    
    inline def setRecommendationSources(value: RecommendationSources): Self = StObject.set(x, "recommendationSources", value.asInstanceOf[js.Any])
    
    inline def setRecommendationSourcesUndefined: Self = StObject.set(x, "recommendationSources", js.undefined)
    
    inline def setRecommendationSourcesVarargs(value: RecommendationSource*): Self = StObject.set(x, "recommendationSources", js.Array(value*))
    
    inline def setUtilizationMetrics(value: UtilizationMetrics): Self = StObject.set(x, "utilizationMetrics", value.asInstanceOf[js.Any])
    
    inline def setUtilizationMetricsUndefined: Self = StObject.set(x, "utilizationMetrics", js.undefined)
    
    inline def setUtilizationMetricsVarargs(value: UtilizationMetric*): Self = StObject.set(x, "utilizationMetrics", js.Array(value*))
  }
}
