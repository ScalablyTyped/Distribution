package typings.atAwsDashSdkClientDashXrayDashNode.typesUnderscoreServiceMod

import typings.atAwsDashSdkClientDashXrayDashNode.typesUnderscoreEdgeMod._UnmarshalledEdge
import typings.atAwsDashSdkClientDashXrayDashNode.typesUnderscoreHistogramEntryMod._UnmarshalledHistogramEntry
import typings.atAwsDashSdkClientDashXrayDashNode.typesUnderscoreServiceStatisticsMod._UnmarshalledServiceStatistics
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledService extends _Service {
  /**
    * <p>A histogram that maps the spread of service durations.</p>
    */
  @JSName("DurationHistogram")
  var DurationHistogram__UnmarshalledService: js.UndefOr[js.Array[_UnmarshalledHistogramEntry]] = js.undefined
  /**
    * <p>Connections to downstream services.</p>
    */
  @JSName("Edges")
  var Edges__UnmarshalledService: js.UndefOr[js.Array[_UnmarshalledEdge]] = js.undefined
  /**
    * <p>The end time of the last segment that the service generated.</p>
    */
  @JSName("EndTime")
  var EndTime__UnmarshalledService: js.UndefOr[Date] = js.undefined
  /**
    * <p>A list of names for the service, including the canonical name.</p>
    */
  @JSName("Names")
  var Names__UnmarshalledService: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * <p>A histogram that maps the spread of service response times.</p>
    */
  @JSName("ResponseTimeHistogram")
  var ResponseTimeHistogram__UnmarshalledService: js.UndefOr[js.Array[_UnmarshalledHistogramEntry]] = js.undefined
  /**
    * <p>The start time of the first segment that the service generated.</p>
    */
  @JSName("StartTime")
  var StartTime__UnmarshalledService: js.UndefOr[Date] = js.undefined
  /**
    * <p>Aggregated statistics for the service.</p>
    */
  @JSName("SummaryStatistics")
  var SummaryStatistics__UnmarshalledService: js.UndefOr[_UnmarshalledServiceStatistics] = js.undefined
}

object _UnmarshalledService {
  @scala.inline
  def apply(
    AccountId: String = null,
    DurationHistogram: js.Array[_UnmarshalledHistogramEntry] = null,
    Edges: js.Array[_UnmarshalledEdge] = null,
    EndTime: Date = null,
    Name: String = null,
    Names: js.Array[String] = null,
    ReferenceId: Int | Double = null,
    ResponseTimeHistogram: js.Array[_UnmarshalledHistogramEntry] = null,
    Root: js.UndefOr[Boolean] = js.undefined,
    StartTime: Date = null,
    State: String = null,
    SummaryStatistics: _UnmarshalledServiceStatistics = null,
    Type: String = null
  ): _UnmarshalledService = {
    val __obj = js.Dynamic.literal()
    if (AccountId != null) __obj.updateDynamic("AccountId")(AccountId.asInstanceOf[js.Any])
    if (DurationHistogram != null) __obj.updateDynamic("DurationHistogram")(DurationHistogram.asInstanceOf[js.Any])
    if (Edges != null) __obj.updateDynamic("Edges")(Edges.asInstanceOf[js.Any])
    if (EndTime != null) __obj.updateDynamic("EndTime")(EndTime.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (Names != null) __obj.updateDynamic("Names")(Names.asInstanceOf[js.Any])
    if (ReferenceId != null) __obj.updateDynamic("ReferenceId")(ReferenceId.asInstanceOf[js.Any])
    if (ResponseTimeHistogram != null) __obj.updateDynamic("ResponseTimeHistogram")(ResponseTimeHistogram.asInstanceOf[js.Any])
    if (!js.isUndefined(Root)) __obj.updateDynamic("Root")(Root.asInstanceOf[js.Any])
    if (StartTime != null) __obj.updateDynamic("StartTime")(StartTime.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (SummaryStatistics != null) __obj.updateDynamic("SummaryStatistics")(SummaryStatistics.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[_UnmarshalledService]
  }
}

