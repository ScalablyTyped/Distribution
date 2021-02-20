package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeInstanceTypesRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  
  /**
    * One or more filters. Filter names and values are case-sensitive.    auto-recovery-supported - Indicates whether auto recovery is supported (true | false).    bare-metal - Indicates whether it is a bare metal instance type (true | false).    burstable-performance-supported - Indicates whether it is a burstable performance instance type (true | false).    current-generation - Indicates whether this instance type is the latest generation instance type of an instance family (true | false).    ebs-info.ebs-optimized-info.baseline-bandwidth-in-mbps - The baseline bandwidth performance for an EBS-optimized instance type, in Mbps.    ebs-info.ebs-optimized-info.baseline-iops - The baseline input/output storage operations per second for an EBS-optimized instance type.    ebs-info.ebs-optimized-info.baseline-throughput-in-mbps - The baseline throughput performance for an EBS-optimized instance type, in MB/s.    ebs-info.ebs-optimized-info.maximum-bandwidth-in-mbps - The maximum bandwidth performance for an EBS-optimized instance type, in Mbps.    ebs-info.ebs-optimized-info.maximum-iops - The maximum input/output storage operations per second for an EBS-optimized instance type.    ebs-info.ebs-optimized-info.maximum-throughput-in-mbps - The maximum throughput performance for an EBS-optimized instance type, in MB/s.    ebs-info.ebs-optimized-support - Indicates whether the instance type is EBS-optimized (supported | unsupported | default).    ebs-info.encryption-support - Indicates whether EBS encryption is supported (supported | unsupported).    ebs-info.nvme-support - Indicates whether non-volatile memory express (NVMe) is supported for EBS volumes (required | supported | unsupported).    free-tier-eligible - Indicates whether the instance type is eligible to use in the free tier (true | false).    hibernation-supported - Indicates whether On-Demand hibernation is supported (true | false).    hypervisor - The hypervisor (nitro | xen).    instance-storage-info.disk.count - The number of local disks.    instance-storage-info.disk.size-in-gb - The storage size of each instance storage disk, in GB.    instance-storage-info.disk.type - The storage technology for the local instance storage disks (hdd | ssd).    instance-storage-info.nvme-support - Indicates whether non-volatile memory express (NVMe) is supported for instance store (required | supported) | unsupported).    instance-storage-info.total-size-in-gb - The total amount of storage available from all local instance storage, in GB.    instance-storage-supported - Indicates whether the instance type has local instance storage (true | false).    instance-type - The instance type (for example c5.2xlarge or c5*).    memory-info.size-in-mib - The memory size.    network-info.efa-supported - Indicates whether the instance type supports Elastic Fabric Adapter (EFA) (true | false).    network-info.ena-support - Indicates whether Elastic Network Adapter (ENA) is supported or required (required | supported | unsupported).    network-info.ipv4-addresses-per-interface - The maximum number of private IPv4 addresses per network interface.    network-info.ipv6-addresses-per-interface - The maximum number of private IPv6 addresses per network interface.    network-info.ipv6-supported - Indicates whether the instance type supports IPv6 (true | false).    network-info.maximum-network-interfaces - The maximum number of network interfaces per instance.    network-info.network-performance - The network performance (for example, "25 Gigabit").    processor-info.supported-architecture - The CPU architecture (arm64 | i386 | x86_64).    processor-info.sustained-clock-speed-in-ghz - The CPU clock speed, in GHz.    supported-root-device-type - The root device type (ebs | instance-store).    supported-usage-class - The usage class (on-demand | spot).    supported-virtualization-type - The virtualization type (hvm | paravirtual).    vcpu-info.default-cores - The default number of cores for the instance type.    vcpu-info.default-threads-per-core - The default number of threads per core for the instance type.    vcpu-info.default-vcpus - The default number of vCPUs for the instance type.    vcpu-info.valid-cores - The number of cores that can be configured for the instance type.    vcpu-info.valid-threads-per-core - The number of threads per core that can be configured for the instance type. For example, "1" or "1,2".  
    */
  var Filters: js.UndefOr[FilterList] = js.native
  
  /**
    * The instance types. For more information, see Instance Types in the Amazon Elastic Compute Cloud User Guide.
    */
  var InstanceTypes: js.UndefOr[RequestInstanceTypeList] = js.native
  
  /**
    * The maximum number of results to return for the request in a single page. The remaining results can be seen by sending another request with the next token value.
    */
  var MaxResults: js.UndefOr[DITMaxResults] = js.native
  
  /**
    * The token to retrieve the next page of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.ec2Mod.NextToken] = js.native
}
object DescribeInstanceTypesRequest {
  
  @scala.inline
  def apply(): DescribeInstanceTypesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeInstanceTypesRequest]
  }
  
  @scala.inline
  implicit class DescribeInstanceTypesRequestMutableBuilder[Self <: DescribeInstanceTypesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    @scala.inline
    def setFilters(value: FilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    @scala.inline
    def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "Filters", js.Array(value :_*))
    
    @scala.inline
    def setInstanceTypes(value: RequestInstanceTypeList): Self = StObject.set(x, "InstanceTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceTypesUndefined: Self = StObject.set(x, "InstanceTypes", js.undefined)
    
    @scala.inline
    def setInstanceTypesVarargs(value: InstanceType*): Self = StObject.set(x, "InstanceTypes", js.Array(value :_*))
    
    @scala.inline
    def setMaxResults(value: DITMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
