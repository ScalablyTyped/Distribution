package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateDevEndpointResponse extends js.Object {
  
  /**
    * The map of arguments used to configure this DevEndpoint. Valid arguments are:    "--enable-glue-datacatalog": ""     "GLUE_PYTHON_VERSION": "3"     "GLUE_PYTHON_VERSION": "2"    You can specify a version of Python support for development endpoints by using the Arguments parameter in the CreateDevEndpoint or UpdateDevEndpoint APIs. If no arguments are provided, the version defaults to Python 2.
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
    * The name assigned to the new DevEndpoint.
    */
  var EndpointName: js.UndefOr[GenericString] = js.native
  
  /**
    * Path to one or more Java .jar files in an S3 bucket that will be loaded in your DevEndpoint.
    */
  var ExtraJarsS3Path: js.UndefOr[GenericString] = js.native
  
  /**
    * The paths to one or more Python libraries in an S3 bucket that will be loaded in your DevEndpoint.
    */
  var ExtraPythonLibsS3Path: js.UndefOr[GenericString] = js.native
  
  /**
    * The reason for a current failure in this DevEndpoint.
    */
  var FailureReason: js.UndefOr[GenericString] = js.native
  
  /**
    * Glue version determines the versions of Apache Spark and Python that AWS Glue supports. The Python version indicates the version supported for running your ETL scripts on development endpoints. 
    */
  var GlueVersion: js.UndefOr[GlueVersionString] = js.native
  
  /**
    * The number of AWS Glue Data Processing Units (DPUs) allocated to this DevEndpoint.
    */
  var NumberOfNodes: js.UndefOr[IntegerValue] = js.native
  
  /**
    * The number of workers of a defined workerType that are allocated to the development endpoint.
    */
  var NumberOfWorkers: js.UndefOr[NullableInteger] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the role assigned to the new DevEndpoint.
    */
  var RoleArn: js.UndefOr[typings.awsSdk.glueMod.RoleArn] = js.native
  
  /**
    * The name of the SecurityConfiguration structure being used with this DevEndpoint.
    */
  var SecurityConfiguration: js.UndefOr[NameString] = js.native
  
  /**
    * The security groups assigned to the new DevEndpoint.
    */
  var SecurityGroupIds: js.UndefOr[StringList] = js.native
  
  /**
    * The current status of the new DevEndpoint.
    */
  var Status: js.UndefOr[GenericString] = js.native
  
  /**
    * The subnet ID assigned to the new DevEndpoint.
    */
  var SubnetId: js.UndefOr[GenericString] = js.native
  
  /**
    * The ID of the virtual private cloud (VPC) used by this DevEndpoint.
    */
  var VpcId: js.UndefOr[GenericString] = js.native
  
  /**
    * The type of predefined worker that is allocated to the development endpoint. May be a value of Standard, G.1X, or G.2X.
    */
  var WorkerType: js.UndefOr[typings.awsSdk.glueMod.WorkerType] = js.native
  
  /**
    * The address of the YARN endpoint used by this DevEndpoint.
    */
  var YarnEndpointAddress: js.UndefOr[GenericString] = js.native
  
  /**
    * The Apache Zeppelin port for the remote Apache Spark interpreter.
    */
  var ZeppelinRemoteSparkInterpreterPort: js.UndefOr[IntegerValue] = js.native
}
object CreateDevEndpointResponse {
  
  @scala.inline
  def apply(): CreateDevEndpointResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDevEndpointResponse]
  }
  
  @scala.inline
  implicit class CreateDevEndpointResponseOps[Self <: CreateDevEndpointResponse] (val x: Self) extends AnyVal {
    
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
    def setNumberOfNodes(value: IntegerValue): Self = this.set("NumberOfNodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumberOfNodes: Self = this.set("NumberOfNodes", js.undefined)
    
    @scala.inline
    def setNumberOfWorkers(value: NullableInteger): Self = this.set("NumberOfWorkers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumberOfWorkers: Self = this.set("NumberOfWorkers", js.undefined)
    
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
