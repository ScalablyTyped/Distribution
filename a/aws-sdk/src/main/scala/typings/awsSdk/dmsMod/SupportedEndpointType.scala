package typings.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SupportedEndpointType extends js.Object {
  /**
    * The type of endpoint. Valid values are source and target.
    */
  var EndpointType: js.UndefOr[ReplicationEndpointTypeValue] = js.native
  /**
    * The expanded name for the engine name. For example, if the EngineName parameter is "aurora," this value would be "Amazon Aurora MySQL."
    */
  var EngineDisplayName: js.UndefOr[String] = js.native
  /**
    * The database engine name. Valid values, depending on the EndpointType, include "mysql", "oracle", "postgres", "mariadb", "aurora", "aurora-postgresql", "redshift", "s3", "db2", "azuredb", "sybase", "dynamodb", "mongodb", "kinesis", "kafka", "elasticsearch", "documentdb", "sqlserver", and "neptune".
    */
  var EngineName: js.UndefOr[String] = js.native
  /**
    * The earliest AWS DMS engine version that supports this endpoint engine. Note that endpoint engines released with AWS DMS versions earlier than 3.1.1 do not return a value for this parameter.
    */
  var ReplicationInstanceEngineMinimumVersion: js.UndefOr[String] = js.native
  /**
    * Indicates if Change Data Capture (CDC) is supported.
    */
  var SupportsCDC: js.UndefOr[Boolean] = js.native
}

object SupportedEndpointType {
  @scala.inline
  def apply(
    EndpointType: ReplicationEndpointTypeValue = null,
    EngineDisplayName: String = null,
    EngineName: String = null,
    ReplicationInstanceEngineMinimumVersion: String = null,
    SupportsCDC: js.UndefOr[Boolean] = js.undefined
  ): SupportedEndpointType = {
    val __obj = js.Dynamic.literal()
    if (EndpointType != null) __obj.updateDynamic("EndpointType")(EndpointType.asInstanceOf[js.Any])
    if (EngineDisplayName != null) __obj.updateDynamic("EngineDisplayName")(EngineDisplayName.asInstanceOf[js.Any])
    if (EngineName != null) __obj.updateDynamic("EngineName")(EngineName.asInstanceOf[js.Any])
    if (ReplicationInstanceEngineMinimumVersion != null) __obj.updateDynamic("ReplicationInstanceEngineMinimumVersion")(ReplicationInstanceEngineMinimumVersion.asInstanceOf[js.Any])
    if (!js.isUndefined(SupportsCDC)) __obj.updateDynamic("SupportsCDC")(SupportsCDC.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SupportedEndpointType]
  }
}

