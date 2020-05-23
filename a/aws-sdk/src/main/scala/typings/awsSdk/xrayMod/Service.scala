package typings.awsSdk.xrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Service extends js.Object {
  /**
    * Identifier of the AWS account in which the service runs.
    */
  var AccountId: js.UndefOr[String] = js.native
  /**
    * A histogram that maps the spread of service durations.
    */
  var DurationHistogram: js.UndefOr[Histogram] = js.native
  /**
    * Connections to downstream services.
    */
  var Edges: js.UndefOr[EdgeList] = js.native
  /**
    * The end time of the last segment that the service generated.
    */
  var EndTime: js.UndefOr[Timestamp] = js.native
  /**
    * The canonical name of the service.
    */
  var Name: js.UndefOr[String] = js.native
  /**
    * A list of names for the service, including the canonical name.
    */
  var Names: js.UndefOr[ServiceNames] = js.native
  /**
    * Identifier for the service. Unique within the service map.
    */
  var ReferenceId: js.UndefOr[NullableInteger] = js.native
  /**
    * A histogram that maps the spread of service response times.
    */
  var ResponseTimeHistogram: js.UndefOr[Histogram] = js.native
  /**
    * Indicates that the service was the first service to process a request.
    */
  var Root: js.UndefOr[NullableBoolean] = js.native
  /**
    * The start time of the first segment that the service generated.
    */
  var StartTime: js.UndefOr[Timestamp] = js.native
  /**
    * The service's state.
    */
  var State: js.UndefOr[String] = js.native
  /**
    * Aggregated statistics for the service.
    */
  var SummaryStatistics: js.UndefOr[ServiceStatistics] = js.native
  /**
    * The type of service.   AWS Resource - The type of an AWS resource. For example, AWS::EC2::Instance for a application running on Amazon EC2 or AWS::DynamoDB::Table for an Amazon DynamoDB table that the application used.   AWS Service - The type of an AWS service. For example, AWS::DynamoDB for downstream calls to Amazon DynamoDB that didn't target a specific table.    client - Represents the clients that sent requests to a root service.    remote - A downstream service of indeterminate type.  
    */
  var Type: js.UndefOr[String] = js.native
}

object Service {
  @scala.inline
  def apply(
    AccountId: String = null,
    DurationHistogram: Histogram = null,
    Edges: EdgeList = null,
    EndTime: Timestamp = null,
    Name: String = null,
    Names: ServiceNames = null,
    ReferenceId: js.UndefOr[NullableInteger] = js.undefined,
    ResponseTimeHistogram: Histogram = null,
    Root: js.UndefOr[NullableBoolean] = js.undefined,
    StartTime: Timestamp = null,
    State: String = null,
    SummaryStatistics: ServiceStatistics = null,
    Type: String = null
  ): Service = {
    val __obj = js.Dynamic.literal()
    if (AccountId != null) __obj.updateDynamic("AccountId")(AccountId.asInstanceOf[js.Any])
    if (DurationHistogram != null) __obj.updateDynamic("DurationHistogram")(DurationHistogram.asInstanceOf[js.Any])
    if (Edges != null) __obj.updateDynamic("Edges")(Edges.asInstanceOf[js.Any])
    if (EndTime != null) __obj.updateDynamic("EndTime")(EndTime.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (Names != null) __obj.updateDynamic("Names")(Names.asInstanceOf[js.Any])
    if (!js.isUndefined(ReferenceId)) __obj.updateDynamic("ReferenceId")(ReferenceId.get.asInstanceOf[js.Any])
    if (ResponseTimeHistogram != null) __obj.updateDynamic("ResponseTimeHistogram")(ResponseTimeHistogram.asInstanceOf[js.Any])
    if (!js.isUndefined(Root)) __obj.updateDynamic("Root")(Root.get.asInstanceOf[js.Any])
    if (StartTime != null) __obj.updateDynamic("StartTime")(StartTime.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (SummaryStatistics != null) __obj.updateDynamic("SummaryStatistics")(SummaryStatistics.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Service]
  }
}

