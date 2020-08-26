package typings.awsSdkClientXrayNode.typesEdgeMod

import typings.awsSdkClientXrayNode.typesAliasMod.UnmarshalledAlias
import typings.awsSdkClientXrayNode.typesEdgeStatisticsMod.UnmarshalledEdgeStatistics
import typings.awsSdkClientXrayNode.typesHistogramEntryMod.UnmarshalledHistogramEntry
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledEdge extends Edge {
  /**
    * <p>Aliases for the edge.</p>
    */
  @JSName("Aliases")
  var Aliases_UnmarshalledEdge: js.UndefOr[js.Array[UnmarshalledAlias]] = js.native
  /**
    * <p>The end time of the last segment on the edge.</p>
    */
  @JSName("EndTime")
  var EndTime_UnmarshalledEdge: js.UndefOr[Date] = js.native
  /**
    * <p>A histogram that maps the spread of client response times on an edge.</p>
    */
  @JSName("ResponseTimeHistogram")
  var ResponseTimeHistogram_UnmarshalledEdge: js.UndefOr[js.Array[UnmarshalledHistogramEntry]] = js.native
  /**
    * <p>The start time of the first segment on the edge.</p>
    */
  @JSName("StartTime")
  var StartTime_UnmarshalledEdge: js.UndefOr[Date] = js.native
  /**
    * <p>Response statistics for segments on the edge.</p>
    */
  @JSName("SummaryStatistics")
  var SummaryStatistics_UnmarshalledEdge: js.UndefOr[UnmarshalledEdgeStatistics] = js.native
}

object UnmarshalledEdge {
  @scala.inline
  def apply(): UnmarshalledEdge = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledEdge]
  }
  @scala.inline
  implicit class UnmarshalledEdgeOps[Self <: UnmarshalledEdge] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAliasesVarargs(value: UnmarshalledAlias*): Self = this.set("Aliases", js.Array(value :_*))
    @scala.inline
    def setAliases(value: js.Array[UnmarshalledAlias]): Self = this.set("Aliases", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAliases: Self = this.set("Aliases", js.undefined)
    @scala.inline
    def setEndTime(value: Date): Self = this.set("EndTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndTime: Self = this.set("EndTime", js.undefined)
    @scala.inline
    def setResponseTimeHistogramVarargs(value: UnmarshalledHistogramEntry*): Self = this.set("ResponseTimeHistogram", js.Array(value :_*))
    @scala.inline
    def setResponseTimeHistogram(value: js.Array[UnmarshalledHistogramEntry]): Self = this.set("ResponseTimeHistogram", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponseTimeHistogram: Self = this.set("ResponseTimeHistogram", js.undefined)
    @scala.inline
    def setStartTime(value: Date): Self = this.set("StartTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartTime: Self = this.set("StartTime", js.undefined)
    @scala.inline
    def setSummaryStatistics(value: UnmarshalledEdgeStatistics): Self = this.set("SummaryStatistics", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSummaryStatistics: Self = this.set("SummaryStatistics", js.undefined)
  }
  
}

