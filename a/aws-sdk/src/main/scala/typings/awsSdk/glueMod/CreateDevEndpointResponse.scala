package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(
    Arguments: MapValue = null,
    AvailabilityZone: GenericString = null,
    CreatedTimestamp: TimestampValue = null,
    EndpointName: GenericString = null,
    ExtraJarsS3Path: GenericString = null,
    ExtraPythonLibsS3Path: GenericString = null,
    FailureReason: GenericString = null,
    GlueVersion: GlueVersionString = null,
    NumberOfNodes: Int | Double = null,
    NumberOfWorkers: Int | Double = null,
    RoleArn: RoleArn = null,
    SecurityConfiguration: NameString = null,
    SecurityGroupIds: StringList = null,
    Status: GenericString = null,
    SubnetId: GenericString = null,
    VpcId: GenericString = null,
    WorkerType: WorkerType = null,
    YarnEndpointAddress: GenericString = null,
    ZeppelinRemoteSparkInterpreterPort: Int | Double = null
  ): CreateDevEndpointResponse = {
    val __obj = js.Dynamic.literal()
    if (Arguments != null) __obj.updateDynamic("Arguments")(Arguments.asInstanceOf[js.Any])
    if (AvailabilityZone != null) __obj.updateDynamic("AvailabilityZone")(AvailabilityZone.asInstanceOf[js.Any])
    if (CreatedTimestamp != null) __obj.updateDynamic("CreatedTimestamp")(CreatedTimestamp.asInstanceOf[js.Any])
    if (EndpointName != null) __obj.updateDynamic("EndpointName")(EndpointName.asInstanceOf[js.Any])
    if (ExtraJarsS3Path != null) __obj.updateDynamic("ExtraJarsS3Path")(ExtraJarsS3Path.asInstanceOf[js.Any])
    if (ExtraPythonLibsS3Path != null) __obj.updateDynamic("ExtraPythonLibsS3Path")(ExtraPythonLibsS3Path.asInstanceOf[js.Any])
    if (FailureReason != null) __obj.updateDynamic("FailureReason")(FailureReason.asInstanceOf[js.Any])
    if (GlueVersion != null) __obj.updateDynamic("GlueVersion")(GlueVersion.asInstanceOf[js.Any])
    if (NumberOfNodes != null) __obj.updateDynamic("NumberOfNodes")(NumberOfNodes.asInstanceOf[js.Any])
    if (NumberOfWorkers != null) __obj.updateDynamic("NumberOfWorkers")(NumberOfWorkers.asInstanceOf[js.Any])
    if (RoleArn != null) __obj.updateDynamic("RoleArn")(RoleArn.asInstanceOf[js.Any])
    if (SecurityConfiguration != null) __obj.updateDynamic("SecurityConfiguration")(SecurityConfiguration.asInstanceOf[js.Any])
    if (SecurityGroupIds != null) __obj.updateDynamic("SecurityGroupIds")(SecurityGroupIds.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (SubnetId != null) __obj.updateDynamic("SubnetId")(SubnetId.asInstanceOf[js.Any])
    if (VpcId != null) __obj.updateDynamic("VpcId")(VpcId.asInstanceOf[js.Any])
    if (WorkerType != null) __obj.updateDynamic("WorkerType")(WorkerType.asInstanceOf[js.Any])
    if (YarnEndpointAddress != null) __obj.updateDynamic("YarnEndpointAddress")(YarnEndpointAddress.asInstanceOf[js.Any])
    if (ZeppelinRemoteSparkInterpreterPort != null) __obj.updateDynamic("ZeppelinRemoteSparkInterpreterPort")(ZeppelinRemoteSparkInterpreterPort.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDevEndpointResponse]
  }
}

