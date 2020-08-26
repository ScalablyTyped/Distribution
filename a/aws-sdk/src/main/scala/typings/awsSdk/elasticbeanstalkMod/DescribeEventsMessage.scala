package typings.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeEventsMessage extends js.Object {
  /**
    * If specified, AWS Elastic Beanstalk restricts the returned descriptions to include only those associated with this application.
    */
  var ApplicationName: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.ApplicationName] = js.native
  /**
    *  If specified, AWS Elastic Beanstalk restricts the returned descriptions to those that occur up to, but not including, the EndTime. 
    */
  var EndTime: js.UndefOr[TimeFilterEnd] = js.native
  /**
    * If specified, AWS Elastic Beanstalk restricts the returned descriptions to those associated with this environment.
    */
  var EnvironmentId: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.EnvironmentId] = js.native
  /**
    * If specified, AWS Elastic Beanstalk restricts the returned descriptions to those associated with this environment.
    */
  var EnvironmentName: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.EnvironmentName] = js.native
  /**
    * Specifies the maximum number of events that can be returned, beginning with the most recent event.
    */
  var MaxRecords: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.MaxRecords] = js.native
  /**
    * Pagination token. If specified, the events return the next batch of results.
    */
  var NextToken: js.UndefOr[Token] = js.native
  /**
    * The ARN of a custom platform version. If specified, AWS Elastic Beanstalk restricts the returned descriptions to those associated with this custom platform version.
    */
  var PlatformArn: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.PlatformArn] = js.native
  /**
    * If specified, AWS Elastic Beanstalk restricts the described events to include only those associated with this request ID.
    */
  var RequestId: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.RequestId] = js.native
  /**
    * If specified, limits the events returned from this call to include only those with the specified severity or higher.
    */
  var Severity: js.UndefOr[EventSeverity] = js.native
  /**
    * If specified, AWS Elastic Beanstalk restricts the returned descriptions to those that occur on or after this time.
    */
  var StartTime: js.UndefOr[TimeFilterStart] = js.native
  /**
    * If specified, AWS Elastic Beanstalk restricts the returned descriptions to those that are associated with this environment configuration.
    */
  var TemplateName: js.UndefOr[ConfigurationTemplateName] = js.native
  /**
    * If specified, AWS Elastic Beanstalk restricts the returned descriptions to those associated with this application version.
    */
  var VersionLabel: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.VersionLabel] = js.native
}

object DescribeEventsMessage {
  @scala.inline
  def apply(): DescribeEventsMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEventsMessage]
  }
  @scala.inline
  implicit class DescribeEventsMessageOps[Self <: DescribeEventsMessage] (val x: Self) extends AnyVal {
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
    def setApplicationName(value: ApplicationName): Self = this.set("ApplicationName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplicationName: Self = this.set("ApplicationName", js.undefined)
    @scala.inline
    def setEndTime(value: TimeFilterEnd): Self = this.set("EndTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndTime: Self = this.set("EndTime", js.undefined)
    @scala.inline
    def setEnvironmentId(value: EnvironmentId): Self = this.set("EnvironmentId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnvironmentId: Self = this.set("EnvironmentId", js.undefined)
    @scala.inline
    def setEnvironmentName(value: EnvironmentName): Self = this.set("EnvironmentName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnvironmentName: Self = this.set("EnvironmentName", js.undefined)
    @scala.inline
    def setMaxRecords(value: MaxRecords): Self = this.set("MaxRecords", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxRecords: Self = this.set("MaxRecords", js.undefined)
    @scala.inline
    def setNextToken(value: Token): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setPlatformArn(value: PlatformArn): Self = this.set("PlatformArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlatformArn: Self = this.set("PlatformArn", js.undefined)
    @scala.inline
    def setRequestId(value: RequestId): Self = this.set("RequestId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestId: Self = this.set("RequestId", js.undefined)
    @scala.inline
    def setSeverity(value: EventSeverity): Self = this.set("Severity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeverity: Self = this.set("Severity", js.undefined)
    @scala.inline
    def setStartTime(value: TimeFilterStart): Self = this.set("StartTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartTime: Self = this.set("StartTime", js.undefined)
    @scala.inline
    def setTemplateName(value: ConfigurationTemplateName): Self = this.set("TemplateName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplateName: Self = this.set("TemplateName", js.undefined)
    @scala.inline
    def setVersionLabel(value: VersionLabel): Self = this.set("VersionLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersionLabel: Self = this.set("VersionLabel", js.undefined)
  }
  
}

