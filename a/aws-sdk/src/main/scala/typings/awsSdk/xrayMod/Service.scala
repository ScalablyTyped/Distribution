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
    def set(key: java.lang.String, value: js.Any): Self = {
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
    def setDurationHistogram(value: Histogram): Self = this.set("DurationHistogram", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDurationHistogram: Self = this.set("DurationHistogram", js.undefined)
    @scala.inline
    def setEdgesVarargs(value: Edge*): Self = this.set("Edges", js.Array(value :_*))
    @scala.inline
    def setEdges(value: EdgeList): Self = this.set("Edges", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEdges: Self = this.set("Edges", js.undefined)
    @scala.inline
    def setEndTime(value: Timestamp): Self = this.set("EndTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndTime: Self = this.set("EndTime", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    @scala.inline
    def setNamesVarargs(value: String*): Self = this.set("Names", js.Array(value :_*))
    @scala.inline
    def setNames(value: ServiceNames): Self = this.set("Names", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNames: Self = this.set("Names", js.undefined)
    @scala.inline
    def setReferenceId(value: NullableInteger): Self = this.set("ReferenceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReferenceId: Self = this.set("ReferenceId", js.undefined)
    @scala.inline
    def setResponseTimeHistogramVarargs(value: HistogramEntry*): Self = this.set("ResponseTimeHistogram", js.Array(value :_*))
    @scala.inline
    def setResponseTimeHistogram(value: Histogram): Self = this.set("ResponseTimeHistogram", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponseTimeHistogram: Self = this.set("ResponseTimeHistogram", js.undefined)
    @scala.inline
    def setRoot(value: NullableBoolean): Self = this.set("Root", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoot: Self = this.set("Root", js.undefined)
    @scala.inline
    def setStartTime(value: Timestamp): Self = this.set("StartTime", value.asInstanceOf[js.Any])
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

