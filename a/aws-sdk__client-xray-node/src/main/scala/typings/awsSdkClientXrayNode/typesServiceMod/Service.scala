package typings.awsSdkClientXrayNode.typesServiceMod

import typings.awsSdkClientXrayNode.typesEdgeMod.Edge
import typings.awsSdkClientXrayNode.typesHistogramEntryMod.HistogramEntry
import typings.awsSdkClientXrayNode.typesServiceStatisticsMod.ServiceStatistics
import typings.std.Date
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Service extends js.Object {
  /**
    * <p>Identifier of the AWS account in which the service runs.</p>
    */
  var AccountId: js.UndefOr[String] = js.undefined
  /**
    * <p>A histogram that maps the spread of service durations.</p>
    */
  var DurationHistogram: js.UndefOr[js.Array[HistogramEntry] | Iterable[HistogramEntry]] = js.undefined
  /**
    * <p>Connections to downstream services.</p>
    */
  var Edges: js.UndefOr[js.Array[Edge] | Iterable[Edge]] = js.undefined
  /**
    * <p>The end time of the last segment that the service generated.</p>
    */
  var EndTime: js.UndefOr[Date | String | Double] = js.undefined
  /**
    * <p>The canonical name of the service.</p>
    */
  var Name: js.UndefOr[String] = js.undefined
  /**
    * <p>A list of names for the service, including the canonical name.</p>
    */
  var Names: js.UndefOr[js.Array[String] | Iterable[String]] = js.undefined
  /**
    * <p>Identifier for the service. Unique within the service map.</p>
    */
  var ReferenceId: js.UndefOr[Double] = js.undefined
  /**
    * <p>A histogram that maps the spread of service response times.</p>
    */
  var ResponseTimeHistogram: js.UndefOr[js.Array[HistogramEntry] | Iterable[HistogramEntry]] = js.undefined
  /**
    * <p>Indicates that the service was the first service to process a request.</p>
    */
  var Root: js.UndefOr[Boolean] = js.undefined
  /**
    * <p>The start time of the first segment that the service generated.</p>
    */
  var StartTime: js.UndefOr[Date | String | Double] = js.undefined
  /**
    * <p>The service's state.</p>
    */
  var State: js.UndefOr[String] = js.undefined
  /**
    * <p>Aggregated statistics for the service.</p>
    */
  var SummaryStatistics: js.UndefOr[ServiceStatistics] = js.undefined
  /**
    * <p>The type of service.</p> <ul> <li> <p>AWS Resource - The type of an AWS resource. For example, <code>AWS::EC2::Instance</code> for a application running on Amazon EC2 or <code>AWS::DynamoDB::Table</code> for an Amazon DynamoDB table that the application used.</p> </li> <li> <p>AWS Service - The type of an AWS service. For example, <code>AWS::DynamoDB</code> for downstream calls to Amazon DynamoDB that didn't target a specific table.</p> </li> <li> <p> <code>client</code> - Represents the clients that sent requests to a root service.</p> </li> <li> <p> <code>remote</code> - A downstream service of indeterminate type.</p> </li> </ul>
    */
  var Type: js.UndefOr[String] = js.undefined
}

object Service {
  @scala.inline
  def apply(
    AccountId: String = null,
    DurationHistogram: js.Array[HistogramEntry] | Iterable[HistogramEntry] = null,
    Edges: js.Array[Edge] | Iterable[Edge] = null,
    EndTime: Date | String | Double = null,
    Name: String = null,
    Names: js.Array[String] | Iterable[String] = null,
    ReferenceId: js.UndefOr[Double] = js.undefined,
    ResponseTimeHistogram: js.Array[HistogramEntry] | Iterable[HistogramEntry] = null,
    Root: js.UndefOr[Boolean] = js.undefined,
    StartTime: Date | String | Double = null,
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

