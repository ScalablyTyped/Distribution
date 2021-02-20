package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateDevEndpointResponse extends StObject {
  
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
  implicit class CreateDevEndpointResponseMutableBuilder[Self <: CreateDevEndpointResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArguments(value: MapValue): Self = StObject.set(x, "Arguments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgumentsUndefined: Self = StObject.set(x, "Arguments", js.undefined)
    
    @scala.inline
    def setAvailabilityZone(value: GenericString): Self = StObject.set(x, "AvailabilityZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailabilityZoneUndefined: Self = StObject.set(x, "AvailabilityZone", js.undefined)
    
    @scala.inline
    def setCreatedTimestamp(value: TimestampValue): Self = StObject.set(x, "CreatedTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedTimestampUndefined: Self = StObject.set(x, "CreatedTimestamp", js.undefined)
    
    @scala.inline
    def setEndpointName(value: GenericString): Self = StObject.set(x, "EndpointName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointNameUndefined: Self = StObject.set(x, "EndpointName", js.undefined)
    
    @scala.inline
    def setExtraJarsS3Path(value: GenericString): Self = StObject.set(x, "ExtraJarsS3Path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtraJarsS3PathUndefined: Self = StObject.set(x, "ExtraJarsS3Path", js.undefined)
    
    @scala.inline
    def setExtraPythonLibsS3Path(value: GenericString): Self = StObject.set(x, "ExtraPythonLibsS3Path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtraPythonLibsS3PathUndefined: Self = StObject.set(x, "ExtraPythonLibsS3Path", js.undefined)
    
    @scala.inline
    def setFailureReason(value: GenericString): Self = StObject.set(x, "FailureReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureReasonUndefined: Self = StObject.set(x, "FailureReason", js.undefined)
    
    @scala.inline
    def setGlueVersion(value: GlueVersionString): Self = StObject.set(x, "GlueVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlueVersionUndefined: Self = StObject.set(x, "GlueVersion", js.undefined)
    
    @scala.inline
    def setNumberOfNodes(value: IntegerValue): Self = StObject.set(x, "NumberOfNodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberOfNodesUndefined: Self = StObject.set(x, "NumberOfNodes", js.undefined)
    
    @scala.inline
    def setNumberOfWorkers(value: NullableInteger): Self = StObject.set(x, "NumberOfWorkers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberOfWorkersUndefined: Self = StObject.set(x, "NumberOfWorkers", js.undefined)
    
    @scala.inline
    def setRoleArn(value: RoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
    
    @scala.inline
    def setSecurityConfiguration(value: NameString): Self = StObject.set(x, "SecurityConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityConfigurationUndefined: Self = StObject.set(x, "SecurityConfiguration", js.undefined)
    
    @scala.inline
    def setSecurityGroupIds(value: StringList): Self = StObject.set(x, "SecurityGroupIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityGroupIdsUndefined: Self = StObject.set(x, "SecurityGroupIds", js.undefined)
    
    @scala.inline
    def setSecurityGroupIdsVarargs(value: GenericString*): Self = StObject.set(x, "SecurityGroupIds", js.Array(value :_*))
    
    @scala.inline
    def setStatus(value: GenericString): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setSubnetId(value: GenericString): Self = StObject.set(x, "SubnetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetIdUndefined: Self = StObject.set(x, "SubnetId", js.undefined)
    
    @scala.inline
    def setVpcId(value: GenericString): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcIdUndefined: Self = StObject.set(x, "VpcId", js.undefined)
    
    @scala.inline
    def setWorkerType(value: WorkerType): Self = StObject.set(x, "WorkerType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkerTypeUndefined: Self = StObject.set(x, "WorkerType", js.undefined)
    
    @scala.inline
    def setYarnEndpointAddress(value: GenericString): Self = StObject.set(x, "YarnEndpointAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYarnEndpointAddressUndefined: Self = StObject.set(x, "YarnEndpointAddress", js.undefined)
    
    @scala.inline
    def setZeppelinRemoteSparkInterpreterPort(value: IntegerValue): Self = StObject.set(x, "ZeppelinRemoteSparkInterpreterPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZeppelinRemoteSparkInterpreterPortUndefined: Self = StObject.set(x, "ZeppelinRemoteSparkInterpreterPort", js.undefined)
  }
}
