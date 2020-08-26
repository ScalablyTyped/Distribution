package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DevEndpoint extends js.Object {
  /**
    * A map of arguments used to configure the DevEndpoint. Valid arguments are:    "--enable-glue-datacatalog": ""     "GLUE_PYTHON_VERSION": "3"     "GLUE_PYTHON_VERSION": "2"    You can specify a version of Python support for development endpoints by using the Arguments parameter in the CreateDevEndpoint or UpdateDevEndpoint APIs. If no arguments are provided, the version defaults to Python 2.
    */
  var Arguments: js.UndefOr[MapValue] = js.native
  /**
    * The AWS Availability Zone where this DevEndpoint is located.
    */
  var AvailabilityZone: js.UndefOr[GenericString] = js.native
  /**
    * The point in time at which this DevEndpoint was created.
    */
  var CreatedTimestamp: js.UndefOr[TimestampValue] = js.native
  /**
    * The name of the DevEndpoint.
    */
  var EndpointName: js.UndefOr[GenericString] = js.native
  /**
    * The path to one or more Java .jar files in an S3 bucket that should be loaded in your DevEndpoint.  You can only use pure Java/Scala libraries with a DevEndpoint. 
    */
  var ExtraJarsS3Path: js.UndefOr[GenericString] = js.native
  /**
    * The paths to one or more Python libraries in an Amazon S3 bucket that should be loaded in your DevEndpoint. Multiple values must be complete paths separated by a comma.  You can only use pure Python libraries with a DevEndpoint. Libraries that rely on C extensions, such as the pandas Python data analysis library, are not currently supported. 
    */
  var ExtraPythonLibsS3Path: js.UndefOr[GenericString] = js.native
  /**
    * The reason for a current failure in this DevEndpoint.
    */
  var FailureReason: js.UndefOr[GenericString] = js.native
  /**
    * Glue version determines the versions of Apache Spark and Python that AWS Glue supports. The Python version indicates the version supported for running your ETL scripts on development endpoints.  For more information about the available AWS Glue versions and corresponding Spark and Python versions, see Glue version in the developer guide. Development endpoints that are created without specifying a Glue version default to Glue 0.9. You can specify a version of Python support for development endpoints by using the Arguments parameter in the CreateDevEndpoint or UpdateDevEndpoint APIs. If no arguments are provided, the version defaults to Python 2.
    */
  var GlueVersion: js.UndefOr[GlueVersionString] = js.native
  /**
    * The point in time at which this DevEndpoint was last modified.
    */
  var LastModifiedTimestamp: js.UndefOr[TimestampValue] = js.native
  /**
    * The status of the last update.
    */
  var LastUpdateStatus: js.UndefOr[GenericString] = js.native
  /**
    * The number of AWS Glue Data Processing Units (DPUs) allocated to this DevEndpoint.
    */
  var NumberOfNodes: js.UndefOr[IntegerValue] = js.native
  /**
    * The number of workers of a defined workerType that are allocated to the development endpoint. The maximum number of workers you can define are 299 for G.1X, and 149 for G.2X. 
    */
  var NumberOfWorkers: js.UndefOr[NullableInteger] = js.native
  /**
    * A private IP address to access the DevEndpoint within a VPC if the DevEndpoint is created within one. The PrivateAddress field is present only when you create the DevEndpoint within your VPC.
    */
  var PrivateAddress: js.UndefOr[GenericString] = js.native
  /**
    * The public IP address used by this DevEndpoint. The PublicAddress field is present only when you create a non-virtual private cloud (VPC) DevEndpoint.
    */
  var PublicAddress: js.UndefOr[GenericString] = js.native
  /**
    * The public key to be used by this DevEndpoint for authentication. This attribute is provided for backward compatibility because the recommended attribute to use is public keys.
    */
  var PublicKey: js.UndefOr[GenericString] = js.native
  /**
    * A list of public keys to be used by the DevEndpoints for authentication. Using this attribute is preferred over a single public key because the public keys allow you to have a different private key per client.  If you previously created an endpoint with a public key, you must remove that key to be able to set a list of public keys. Call the UpdateDevEndpoint API operation with the public key content in the deletePublicKeys attribute, and the list of new keys in the addPublicKeys attribute. 
    */
  var PublicKeys: js.UndefOr[PublicKeysList] = js.native
  /**
    * The Amazon Resource Name (ARN) of the IAM role used in this DevEndpoint.
    */
  var RoleArn: js.UndefOr[typings.awsSdk.glueMod.RoleArn] = js.native
  /**
    * The name of the SecurityConfiguration structure to be used with this DevEndpoint.
    */
  var SecurityConfiguration: js.UndefOr[NameString] = js.native
  /**
    * A list of security group identifiers used in this DevEndpoint.
    */
  var SecurityGroupIds: js.UndefOr[StringList] = js.native
  /**
    * The current status of this DevEndpoint.
    */
  var Status: js.UndefOr[GenericString] = js.native
  /**
    * The subnet ID for this DevEndpoint.
    */
  var SubnetId: js.UndefOr[GenericString] = js.native
  /**
    * The ID of the virtual private cloud (VPC) used by this DevEndpoint.
    */
  var VpcId: js.UndefOr[GenericString] = js.native
  /**
    * The type of predefined worker that is allocated to the development endpoint. Accepts a value of Standard, G.1X, or G.2X.   For the Standard worker type, each worker provides 4 vCPU, 16 GB of memory and a 50GB disk, and 2 executors per worker.   For the G.1X worker type, each worker maps to 1 DPU (4 vCPU, 16 GB of memory, 64 GB disk), and provides 1 executor per worker. We recommend this worker type for memory-intensive jobs.   For the G.2X worker type, each worker maps to 2 DPU (8 vCPU, 32 GB of memory, 128 GB disk), and provides 1 executor per worker. We recommend this worker type for memory-intensive jobs.   Known issue: when a development endpoint is created with the G.2X WorkerType configuration, the Spark drivers for the development endpoint will run on 4 vCPU, 16 GB of memory, and a 64 GB disk. 
    */
  var WorkerType: js.UndefOr[typings.awsSdk.glueMod.WorkerType] = js.native
  /**
    * The YARN endpoint address used by this DevEndpoint.
    */
  var YarnEndpointAddress: js.UndefOr[GenericString] = js.native
  /**
    * The Apache Zeppelin port for the remote Apache Spark interpreter.
    */
  var ZeppelinRemoteSparkInterpreterPort: js.UndefOr[IntegerValue] = js.native
}

object DevEndpoint {
  @scala.inline
  def apply(): DevEndpoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DevEndpoint]
  }
  @scala.inline
  implicit class DevEndpointOps[Self <: DevEndpoint] (val x: Self) extends AnyVal {
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
    def setArguments(value: MapValue): Self = this.set("Arguments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArguments: Self = this.set("Arguments", js.undefined)
    @scala.inline
    def setAvailabilityZone(value: GenericString): Self = this.set("AvailabilityZone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvailabilityZone: Self = this.set("AvailabilityZone", js.undefined)
    @scala.inline
    def setCreatedTimestamp(value: TimestampValue): Self = this.set("CreatedTimestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedTimestamp: Self = this.set("CreatedTimestamp", js.undefined)
    @scala.inline
    def setEndpointName(value: GenericString): Self = this.set("EndpointName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndpointName: Self = this.set("EndpointName", js.undefined)
    @scala.inline
    def setExtraJarsS3Path(value: GenericString): Self = this.set("ExtraJarsS3Path", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtraJarsS3Path: Self = this.set("ExtraJarsS3Path", js.undefined)
    @scala.inline
    def setExtraPythonLibsS3Path(value: GenericString): Self = this.set("ExtraPythonLibsS3Path", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtraPythonLibsS3Path: Self = this.set("ExtraPythonLibsS3Path", js.undefined)
    @scala.inline
    def setFailureReason(value: GenericString): Self = this.set("FailureReason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFailureReason: Self = this.set("FailureReason", js.undefined)
    @scala.inline
    def setGlueVersion(value: GlueVersionString): Self = this.set("GlueVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGlueVersion: Self = this.set("GlueVersion", js.undefined)
    @scala.inline
    def setLastModifiedTimestamp(value: TimestampValue): Self = this.set("LastModifiedTimestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastModifiedTimestamp: Self = this.set("LastModifiedTimestamp", js.undefined)
    @scala.inline
    def setLastUpdateStatus(value: GenericString): Self = this.set("LastUpdateStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastUpdateStatus: Self = this.set("LastUpdateStatus", js.undefined)
    @scala.inline
    def setNumberOfNodes(value: IntegerValue): Self = this.set("NumberOfNodes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumberOfNodes: Self = this.set("NumberOfNodes", js.undefined)
    @scala.inline
    def setNumberOfWorkers(value: NullableInteger): Self = this.set("NumberOfWorkers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumberOfWorkers: Self = this.set("NumberOfWorkers", js.undefined)
    @scala.inline
    def setPrivateAddress(value: GenericString): Self = this.set("PrivateAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrivateAddress: Self = this.set("PrivateAddress", js.undefined)
    @scala.inline
    def setPublicAddress(value: GenericString): Self = this.set("PublicAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublicAddress: Self = this.set("PublicAddress", js.undefined)
    @scala.inline
    def setPublicKey(value: GenericString): Self = this.set("PublicKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublicKey: Self = this.set("PublicKey", js.undefined)
    @scala.inline
    def setPublicKeysVarargs(value: GenericString*): Self = this.set("PublicKeys", js.Array(value :_*))
    @scala.inline
    def setPublicKeys(value: PublicKeysList): Self = this.set("PublicKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublicKeys: Self = this.set("PublicKeys", js.undefined)
    @scala.inline
    def setRoleArn(value: RoleArn): Self = this.set("RoleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoleArn: Self = this.set("RoleArn", js.undefined)
    @scala.inline
    def setSecurityConfiguration(value: NameString): Self = this.set("SecurityConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecurityConfiguration: Self = this.set("SecurityConfiguration", js.undefined)
    @scala.inline
    def setSecurityGroupIdsVarargs(value: GenericString*): Self = this.set("SecurityGroupIds", js.Array(value :_*))
    @scala.inline
    def setSecurityGroupIds(value: StringList): Self = this.set("SecurityGroupIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecurityGroupIds: Self = this.set("SecurityGroupIds", js.undefined)
    @scala.inline
    def setStatus(value: GenericString): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    @scala.inline
    def setSubnetId(value: GenericString): Self = this.set("SubnetId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubnetId: Self = this.set("SubnetId", js.undefined)
    @scala.inline
    def setVpcId(value: GenericString): Self = this.set("VpcId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpcId: Self = this.set("VpcId", js.undefined)
    @scala.inline
    def setWorkerType(value: WorkerType): Self = this.set("WorkerType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkerType: Self = this.set("WorkerType", js.undefined)
    @scala.inline
    def setYarnEndpointAddress(value: GenericString): Self = this.set("YarnEndpointAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYarnEndpointAddress: Self = this.set("YarnEndpointAddress", js.undefined)
    @scala.inline
    def setZeppelinRemoteSparkInterpreterPort(value: IntegerValue): Self = this.set("ZeppelinRemoteSparkInterpreterPort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZeppelinRemoteSparkInterpreterPort: Self = this.set("ZeppelinRemoteSparkInterpreterPort", js.undefined)
  }
  
}

