package typings.atAwsDashSdkClientDashXrayDashNode.typesUnderscoreEdgeMod

import typings.atAwsDashSdkClientDashXrayDashNode.typesUnderscoreAliasMod._Alias
import typings.atAwsDashSdkClientDashXrayDashNode.typesUnderscoreEdgeStatisticsMod._EdgeStatistics
import typings.atAwsDashSdkClientDashXrayDashNode.typesUnderscoreHistogramEntryMod._HistogramEntry
import typings.std.Date
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Edge extends js.Object {
  /**
    * <p>Aliases for the edge.</p>
    */
  var Aliases: js.UndefOr[js.Array[_Alias] | Iterable[_Alias]] = js.undefined
  /**
    * <p>The end time of the last segment on the edge.</p>
    */
  var EndTime: js.UndefOr[Date | String | Double] = js.undefined
  /**
    * <p>Identifier of the edge. Unique within a service map.</p>
    */
  var ReferenceId: js.UndefOr[Double] = js.undefined
  /**
    * <p>A histogram that maps the spread of client response times on an edge.</p>
    */
  var ResponseTimeHistogram: js.UndefOr[js.Array[_HistogramEntry] | Iterable[_HistogramEntry]] = js.undefined
  /**
    * <p>The start time of the first segment on the edge.</p>
    */
  var StartTime: js.UndefOr[Date | String | Double] = js.undefined
  /**
    * <p>Response statistics for segments on the edge.</p>
    */
  var SummaryStatistics: js.UndefOr[_EdgeStatistics] = js.undefined
}

object _Edge {
  @scala.inline
  def apply(
    Aliases: js.Array[_Alias] | Iterable[_Alias] = null,
    EndTime: Date | String | Double = null,
    ReferenceId: Int | Double = null,
    ResponseTimeHistogram: js.Array[_HistogramEntry] | Iterable[_HistogramEntry] = null,
    StartTime: Date | String | Double = null,
    SummaryStatistics: _EdgeStatistics = null
  ): _Edge = {
    val __obj = js.Dynamic.literal()
    if (Aliases != null) __obj.updateDynamic("Aliases")(Aliases.asInstanceOf[js.Any])
    if (EndTime != null) __obj.updateDynamic("EndTime")(EndTime.asInstanceOf[js.Any])
    if (ReferenceId != null) __obj.updateDynamic("ReferenceId")(ReferenceId.asInstanceOf[js.Any])
    if (ResponseTimeHistogram != null) __obj.updateDynamic("ResponseTimeHistogram")(ResponseTimeHistogram.asInstanceOf[js.Any])
    if (StartTime != null) __obj.updateDynamic("StartTime")(StartTime.asInstanceOf[js.Any])
    if (SummaryStatistics != null) __obj.updateDynamic("SummaryStatistics")(SummaryStatistics.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Edge]
  }
}

