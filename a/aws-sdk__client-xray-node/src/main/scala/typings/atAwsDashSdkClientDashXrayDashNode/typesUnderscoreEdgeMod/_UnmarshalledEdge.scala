package typings.atAwsDashSdkClientDashXrayDashNode.typesUnderscoreEdgeMod

import typings.atAwsDashSdkClientDashXrayDashNode.typesUnderscoreAliasMod._UnmarshalledAlias
import typings.atAwsDashSdkClientDashXrayDashNode.typesUnderscoreEdgeStatisticsMod._UnmarshalledEdgeStatistics
import typings.atAwsDashSdkClientDashXrayDashNode.typesUnderscoreHistogramEntryMod._UnmarshalledHistogramEntry
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledEdge extends _Edge {
  /**
    * <p>Aliases for the edge.</p>
    */
  @JSName("Aliases")
  var Aliases__UnmarshalledEdge: js.UndefOr[js.Array[_UnmarshalledAlias]] = js.undefined
  /**
    * <p>The end time of the last segment on the edge.</p>
    */
  @JSName("EndTime")
  var EndTime__UnmarshalledEdge: js.UndefOr[Date] = js.undefined
  /**
    * <p>A histogram that maps the spread of client response times on an edge.</p>
    */
  @JSName("ResponseTimeHistogram")
  var ResponseTimeHistogram__UnmarshalledEdge: js.UndefOr[js.Array[_UnmarshalledHistogramEntry]] = js.undefined
  /**
    * <p>The start time of the first segment on the edge.</p>
    */
  @JSName("StartTime")
  var StartTime__UnmarshalledEdge: js.UndefOr[Date] = js.undefined
  /**
    * <p>Response statistics for segments on the edge.</p>
    */
  @JSName("SummaryStatistics")
  var SummaryStatistics__UnmarshalledEdge: js.UndefOr[_UnmarshalledEdgeStatistics] = js.undefined
}

object _UnmarshalledEdge {
  @scala.inline
  def apply(
    Aliases: js.Array[_UnmarshalledAlias] = null,
    EndTime: Date = null,
    ReferenceId: Int | Double = null,
    ResponseTimeHistogram: js.Array[_UnmarshalledHistogramEntry] = null,
    StartTime: Date = null,
    SummaryStatistics: _UnmarshalledEdgeStatistics = null
  ): _UnmarshalledEdge = {
    val __obj = js.Dynamic.literal()
    if (Aliases != null) __obj.updateDynamic("Aliases")(Aliases)
    if (EndTime != null) __obj.updateDynamic("EndTime")(EndTime)
    if (ReferenceId != null) __obj.updateDynamic("ReferenceId")(ReferenceId.asInstanceOf[js.Any])
    if (ResponseTimeHistogram != null) __obj.updateDynamic("ResponseTimeHistogram")(ResponseTimeHistogram)
    if (StartTime != null) __obj.updateDynamic("StartTime")(StartTime)
    if (SummaryStatistics != null) __obj.updateDynamic("SummaryStatistics")(SummaryStatistics)
    __obj.asInstanceOf[_UnmarshalledEdge]
  }
}

