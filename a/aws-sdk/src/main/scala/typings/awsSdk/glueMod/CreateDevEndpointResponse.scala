package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDevEndpointResponse extends StObject {
  
  /**
    * The map of arguments used to configure this DevEndpoint. Valid arguments are:    "--enable-glue-datacatalog": ""    You can specify a version of Python support for development endpoints by using the Arguments parameter in the CreateDevEndpoint or UpdateDevEndpoint APIs. If no arguments are provided, the version defaults to Python 2.
    */
  var Arguments: js.UndefOr[MapValue] = js.undefined
  
  /**
    * The AWS Availability Zone where this DevEndpoint is located.
    */
  var AvailabilityZone: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The point in time at which this DevEndpoint was created.
    */
  var CreatedTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name assigned to the new DevEndpoint.
    */
  var EndpointName: js.UndefOr[GenericString] = js.undefined
  
  /**
    * Path to one or more Java .jar files in an S3 bucket that will be loaded in your DevEndpoint.
    */
  var ExtraJarsS3Path: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The paths to one or more Python libraries in an S3 bucket that will be loaded in your DevEndpoint.
    */
  var ExtraPythonLibsS3Path: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The reason for a current failure in this DevEndpoint.
    */
  var FailureReason: js.UndefOr[GenericString] = js.undefined
  
  /**
    * Glue version determines the versions of Apache Spark and Python that Glue supports. The Python version indicates the version supported for running your ETL scripts on development endpoints.  For more information about the available Glue versions and corresponding Spark and Python versions, see Glue version in the developer guide.
    */
  var GlueVersion: js.UndefOr[GlueVersionString] = js.undefined
  
  /**
    * The number of Glue Data Processing Units (DPUs) allocated to this DevEndpoint.
    */
  var NumberOfNodes: js.UndefOr[IntegerValue] = js.undefined
  
  /**
    * The number of workers of a defined workerType that are allocated to the development endpoint.
    */
  var NumberOfWorkers: js.UndefOr[NullableInteger] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the role assigned to the new DevEndpoint.
    */
  var RoleArn: js.UndefOr[typings.awsSdk.glueMod.RoleArn] = js.undefined
  
  /**
    * The name of the SecurityConfiguration structure being used with this DevEndpoint.
    */
  var SecurityConfiguration: js.UndefOr[NameString] = js.undefined
  
  /**
    * The security groups assigned to the new DevEndpoint.
    */
  var SecurityGroupIds: js.UndefOr[StringList] = js.undefined
  
  /**
    * The current status of the new DevEndpoint.
    */
  var Status: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The subnet ID assigned to the new DevEndpoint.
    */
  var SubnetId: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The ID of the virtual private cloud (VPC) used by this DevEndpoint.
    */
  var VpcId: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The type of predefined worker that is allocated to the development endpoint. May be a value of Standard, G.1X, or G.2X.
    */
  var WorkerType: js.UndefOr[typings.awsSdk.glueMod.WorkerType] = js.undefined
  
  /**
    * The address of the YARN endpoint used by this DevEndpoint.
    */
  var YarnEndpointAddress: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The Apache Zeppelin port for the remote Apache Spark interpreter.
    */
  var ZeppelinRemoteSparkInterpreterPort: js.UndefOr[IntegerValue] = js.undefined
}
object CreateDevEndpointResponse {
  
  inline def apply(): CreateDevEndpointResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDevEndpointResponse]
  }
  
  extension [Self <: CreateDevEndpointResponse](x: Self) {
    
    inline def setArguments(value: MapValue): Self = StObject.set(x, "Arguments", value.asInstanceOf[js.Any])
    
    inline def setArgumentsUndefined: Self = StObject.set(x, "Arguments", js.undefined)
    
    inline def setAvailabilityZone(value: GenericString): Self = StObject.set(x, "AvailabilityZone", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityZoneUndefined: Self = StObject.set(x, "AvailabilityZone", js.undefined)
    
    inline def setCreatedTimestamp(value: js.Date): Self = StObject.set(x, "CreatedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCreatedTimestampUndefined: Self = StObject.set(x, "CreatedTimestamp", js.undefined)
    
    inline def setEndpointName(value: GenericString): Self = StObject.set(x, "EndpointName", value.asInstanceOf[js.Any])
    
    inline def setEndpointNameUndefined: Self = StObject.set(x, "EndpointName", js.undefined)
    
    inline def setExtraJarsS3Path(value: GenericString): Self = StObject.set(x, "ExtraJarsS3Path", value.asInstanceOf[js.Any])
    
    inline def setExtraJarsS3PathUndefined: Self = StObject.set(x, "ExtraJarsS3Path", js.undefined)
    
    inline def setExtraPythonLibsS3Path(value: GenericString): Self = StObject.set(x, "ExtraPythonLibsS3Path", value.asInstanceOf[js.Any])
    
    inline def setExtraPythonLibsS3PathUndefined: Self = StObject.set(x, "ExtraPythonLibsS3Path", js.undefined)
    
    inline def setFailureReason(value: GenericString): Self = StObject.set(x, "FailureReason", value.asInstanceOf[js.Any])
    
    inline def setFailureReasonUndefined: Self = StObject.set(x, "FailureReason", js.undefined)
    
    inline def setGlueVersion(value: GlueVersionString): Self = StObject.set(x, "GlueVersion", value.asInstanceOf[js.Any])
    
    inline def setGlueVersionUndefined: Self = StObject.set(x, "GlueVersion", js.undefined)
    
    inline def setNumberOfNodes(value: IntegerValue): Self = StObject.set(x, "NumberOfNodes", value.asInstanceOf[js.Any])
    
    inline def setNumberOfNodesUndefined: Self = StObject.set(x, "NumberOfNodes", js.undefined)
    
    inline def setNumberOfWorkers(value: NullableInteger): Self = StObject.set(x, "NumberOfWorkers", value.asInstanceOf[js.Any])
    
    inline def setNumberOfWorkersUndefined: Self = StObject.set(x, "NumberOfWorkers", js.undefined)
    
    inline def setRoleArn(value: RoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
    
    inline def setSecurityConfiguration(value: NameString): Self = StObject.set(x, "SecurityConfiguration", value.asInstanceOf[js.Any])
    
    inline def setSecurityConfigurationUndefined: Self = StObject.set(x, "SecurityConfiguration", js.undefined)
    
    inline def setSecurityGroupIds(value: StringList): Self = StObject.set(x, "SecurityGroupIds", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupIdsUndefined: Self = StObject.set(x, "SecurityGroupIds", js.undefined)
    
    inline def setSecurityGroupIdsVarargs(value: GenericString*): Self = StObject.set(x, "SecurityGroupIds", js.Array(value*))
    
    inline def setStatus(value: GenericString): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setSubnetId(value: GenericString): Self = StObject.set(x, "SubnetId", value.asInstanceOf[js.Any])
    
    inline def setSubnetIdUndefined: Self = StObject.set(x, "SubnetId", js.undefined)
    
    inline def setVpcId(value: GenericString): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
    
    inline def setVpcIdUndefined: Self = StObject.set(x, "VpcId", js.undefined)
    
    inline def setWorkerType(value: WorkerType): Self = StObject.set(x, "WorkerType", value.asInstanceOf[js.Any])
    
    inline def setWorkerTypeUndefined: Self = StObject.set(x, "WorkerType", js.undefined)
    
    inline def setYarnEndpointAddress(value: GenericString): Self = StObject.set(x, "YarnEndpointAddress", value.asInstanceOf[js.Any])
    
    inline def setYarnEndpointAddressUndefined: Self = StObject.set(x, "YarnEndpointAddress", js.undefined)
    
    inline def setZeppelinRemoteSparkInterpreterPort(value: IntegerValue): Self = StObject.set(x, "ZeppelinRemoteSparkInterpreterPort", value.asInstanceOf[js.Any])
    
    inline def setZeppelinRemoteSparkInterpreterPortUndefined: Self = StObject.set(x, "ZeppelinRemoteSparkInterpreterPort", js.undefined)
  }
}
