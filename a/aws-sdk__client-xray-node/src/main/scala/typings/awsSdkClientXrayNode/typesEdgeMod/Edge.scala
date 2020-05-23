package typings.awsSdkClientXrayNode.typesEdgeMod

import typings.awsSdkClientXrayNode.typesAliasMod.Alias
import typings.awsSdkClientXrayNode.typesEdgeStatisticsMod.EdgeStatistics
import typings.awsSdkClientXrayNode.typesHistogramEntryMod.HistogramEntry
import typings.std.Date
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Edge extends js.Object {
  /**
    * <p>Aliases for the edge.</p>
    */
  var Aliases: js.UndefOr[js.Array[Alias] | Iterable[Alias]] = js.undefined
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
  var ResponseTimeHistogram: js.UndefOr[js.Array[HistogramEntry] | Iterable[HistogramEntry]] = js.undefined
  /**
    * <p>The start time of the first segment on the edge.</p>
    */
  var StartTime: js.UndefOr[Date | String | Double] = js.undefined
  /**
    * <p>Response statistics for segments on the edge.</p>
    */
  var SummaryStatistics: js.UndefOr[EdgeStatistics] = js.undefined
}

object Edge {
  @scala.inline
  def apply(
    Aliases: js.Array[Alias] | Iterable[Alias] = null,
    EndTime: Date | String | Double = null,
    ReferenceId: js.UndefOr[Double] = js.undefined,
    ResponseTimeHistogram: js.Array[HistogramEntry] | Iterable[HistogramEntry] = null,
    StartTime: Date | String | Double = null,
    SummaryStatistics: EdgeStatistics = null
  ): Edge = {
    val __obj = js.Dynamic.literal()
    if (Aliases != null) __obj.updateDynamic("Aliases")(Aliases.asInstanceOf[js.Any])
    if (EndTime != null) __obj.updateDynamic("EndTime")(EndTime.asInstanceOf[js.Any])
    if (!js.isUndefined(ReferenceId)) __obj.updateDynamic("ReferenceId")(ReferenceId.get.asInstanceOf[js.Any])
    if (ResponseTimeHistogram != null) __obj.updateDynamic("ResponseTimeHistogram")(ResponseTimeHistogram.asInstanceOf[js.Any])
    if (StartTime != null) __obj.updateDynamic("StartTime")(StartTime.asInstanceOf[js.Any])
    if (SummaryStatistics != null) __obj.updateDynamic("SummaryStatistics")(SummaryStatistics.asInstanceOf[js.Any])
    __obj.asInstanceOf[Edge]
  }
}

