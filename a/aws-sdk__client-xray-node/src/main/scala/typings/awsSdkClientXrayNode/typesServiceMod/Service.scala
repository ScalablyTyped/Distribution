package typings.awsSdkClientXrayNode.typesServiceMod

import typings.awsSdkClientXrayNode.typesEdgeMod.Edge
import typings.awsSdkClientXrayNode.typesHistogramEntryMod.HistogramEntry
import typings.awsSdkClientXrayNode.typesServiceStatisticsMod.ServiceStatistics
import typings.std.Date
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Service extends js.Object {
  
  /**
    * <p>Identifier of the AWS account in which the service runs.</p>
    */
  var AccountId: js.UndefOr[String] = js.native
  
  /**
    * <p>A histogram that maps the spread of service durations.</p>
    */
  var DurationHistogram: js.UndefOr[js.Array[HistogramEntry] | Iterable[HistogramEntry]] = js.native
  
  /**
    * <p>Connections to downstream services.</p>
    */
  var Edges: js.UndefOr[js.Array[Edge] | Iterable[Edge]] = js.native
  
  /**
    * <p>The end time of the last segment that the service generated.</p>
    */
  var EndTime: js.UndefOr[Date | String | Double] = js.native
  
  /**
    * <p>The canonical name of the service.</p>
    */
  var Name: js.UndefOr[String] = js.native
  
  /**
    * <p>A list of names for the service, including the canonical name.</p>
    */
  var Names: js.UndefOr[js.Array[String] | Iterable[String]] = js.native
  
  /**
    * <p>Identifier for the service. Unique within the service map.</p>
    */
  var ReferenceId: js.UndefOr[Double] = js.native
  
  /**
    * <p>A histogram that maps the spread of service response times.</p>
    */
  var ResponseTimeHistogram: js.UndefOr[js.Array[HistogramEntry] | Iterable[HistogramEntry]] = js.native
  
  /**
    * <p>Indicates that the service was the first service to process a request.</p>
    */
  var Root: js.UndefOr[Boolean] = js.native
  
  /**
    * <p>The start time of the first segment that the service generated.</p>
    */
  var StartTime: js.UndefOr[Date | String | Double] = js.native
  
  /**
    * <p>The service's state.</p>
    */
  var State: js.UndefOr[String] = js.native
  
  /**
    * <p>Aggregated statistics for the service.</p>
    */
  var SummaryStatistics: js.UndefOr[ServiceStatistics] = js.native
  
  /**
    * <p>The type of service.</p> <ul> <li> <p>AWS Resource - The type of an AWS resource. For example, <code>AWS::EC2::Instance</code> for a application running on Amazon EC2 or <code>AWS::DynamoDB::Table</code> for an Amazon DynamoDB table that the application used.</p> </li> <li> <p>AWS Service - The type of an AWS service. For example, <code>AWS::DynamoDB</code> for downstream calls to Amazon DynamoDB that didn't target a specific table.</p> </li> <li> <p> <code>client</code> - Represents the clients that sent requests to a root service.</p> </li> <li> <p> <code>remote</code> - A downstream service of indeterminate type.</p> </li> </ul>
    */
  var Type: js.UndefOr[String] = js.native
}
object Service {
  
  @scala.inline
  def apply(): Service = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Service]
  }
  
  @scala.inline
  implicit class ServiceOps[Self <: Service] (val x: Self) extends AnyVal {
    
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
    def setAccountId(value: String): Self = this.set("AccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountId: Self = this.set("AccountId", js.undefined)
    
    @scala.inline
    def setDurationHistogramVarargs(value: HistogramEntry*): Self = this.set("DurationHistogram", js.Array(value :_*))
    
    @scala.inline
    def setDurationHistogram(value: js.Array[HistogramEntry] | Iterable[HistogramEntry]): Self = this.set("DurationHistogram", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDurationHistogram: Self = this.set("DurationHistogram", js.undefined)
    
    @scala.inline
    def setEdgesVarargs(value: Edge*): Self = this.set("Edges", js.Array(value :_*))
    
    @scala.inline
    def setEdges(value: js.Array[Edge] | Iterable[Edge]): Self = this.set("Edges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEdges: Self = this.set("Edges", js.undefined)
    
    @scala.inline
    def setEndTime(value: Date | String | Double): Self = this.set("EndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndTime: Self = this.set("EndTime", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    
    @scala.inline
    def setNamesVarargs(value: String*): Self = this.set("Names", js.Array(value :_*))
    
    @scala.inline
    def setNames(value: js.Array[String] | Iterable[String]): Self = this.set("Names", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNames: Self = this.set("Names", js.undefined)
    
    @scala.inline
    def setReferenceId(value: Double): Self = this.set("ReferenceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReferenceId: Self = this.set("ReferenceId", js.undefined)
    
    @scala.inline
    def setResponseTimeHistogramVarargs(value: HistogramEntry*): Self = this.set("ResponseTimeHistogram", js.Array(value :_*))
    
    @scala.inline
    def setResponseTimeHistogram(value: js.Array[HistogramEntry] | Iterable[HistogramEntry]): Self = this.set("ResponseTimeHistogram", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponseTimeHistogram: Self = this.set("ResponseTimeHistogram", js.undefined)
    
    @scala.inline
    def setRoot(value: Boolean): Self = this.set("Root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoot: Self = this.set("Root", js.undefined)
    
    @scala.inline
    def setStartTime(value: Date | String | Double): Self = this.set("StartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTime: Self = this.set("StartTime", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = this.set("State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
    
    @scala.inline
    def setSummaryStatistics(value: ServiceStatistics): Self = this.set("SummaryStatistics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSummaryStatistics: Self = this.set("SummaryStatistics", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
  }
}
