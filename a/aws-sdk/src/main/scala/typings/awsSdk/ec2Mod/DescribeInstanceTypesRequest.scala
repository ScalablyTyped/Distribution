package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeInstanceTypesRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * One or more filters. Filter names and values are case-sensitive.    auto-recovery-supported - Indicates whether auto recovery is supported. (true | false)    bare-metal - Indicates whether it is a bare metal instance type. (true | false)    burstable-performance-supported - Indicates whether it is a burstable performance instance type. (true | false)    current-generation - Indicates whether this instance type is the latest generation instance type of an instance family. (true | false)    ebs-info.ebs-optimized-support - Indicates whether the instance type is EBS-optimized. (true | false)    ebs-info.encryption-support - Indicates whether EBS encryption is supported. (true | false)    free-tier-eligible - Indicates whether the instance type is eligible to use in the free tier. (true | false)    hibernation-supported - Indicates whether On-Demand hibernation is supported. (true | false)    hypervisor - The hypervisor used. (nitro | xen)    instance-storage-info.disk.count - The number of local disks.    instance-storage-info.disk.size-in-gb - The storage size of each instance storage disk, in GB.    instance-storage-info.disk.type - The storage technology for the local instance storage disks. (hdd | ssd)    instance-storage-info.total-size-in-gb - The total amount of storage available from all local instance storage, in GB.    instance-storage-supported - Indicates whether the instance type has local instance storage. (true | false)    memory-info.size-in-mib - The memory size.    network-info.ena-support - Indicates whether Elastic Network Adapter (ENA) is supported or required. (required | supported | unsupported)    network-info.ipv4-addresses-per-interface - The maximum number of private IPv4 addresses per network interface.    network-info.ipv6-addresses-per-interface - The maximum number of private IPv6 addresses per network interface.    network-info.ipv6-supported - Indicates whether the instance type supports IPv6. (true | false)    network-info.maximum-network-interfaces - The maximum number of network interfaces per instance.    network-info.network-performance - Describes the network performance.    processor-info.sustained-clock-speed-in-ghz - The CPU clock speed, in GHz.    vcpu-info.default-cores - The default number of cores for the instance type.    vcpu-info.default-threads-per-core - The default number of threads per core for the instance type.    vcpu-info.default-vcpus - The default number of vCPUs for the instance type.  
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
  def apply(
    DryRun: js.UndefOr[scala.Boolean] = js.undefined,
    Filters: FilterList = null,
    InstanceTypes: RequestInstanceTypeList = null,
    MaxResults: Int | scala.Double = null,
    NextToken: NextToken = null
  ): DescribeInstanceTypesRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.asInstanceOf[js.Any])
    if (Filters != null) __obj.updateDynamic("Filters")(Filters.asInstanceOf[js.Any])
    if (InstanceTypes != null) __obj.updateDynamic("InstanceTypes")(InstanceTypes.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeInstanceTypesRequest]
  }
}

