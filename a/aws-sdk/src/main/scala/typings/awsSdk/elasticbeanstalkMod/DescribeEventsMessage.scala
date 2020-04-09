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
  def apply(
    ApplicationName: ApplicationName = null,
    EndTime: TimeFilterEnd = null,
    EnvironmentId: EnvironmentId = null,
    EnvironmentName: EnvironmentName = null,
    MaxRecords: Int | Double = null,
    NextToken: Token = null,
    PlatformArn: PlatformArn = null,
    RequestId: RequestId = null,
    Severity: EventSeverity = null,
    StartTime: TimeFilterStart = null,
    TemplateName: ConfigurationTemplateName = null,
    VersionLabel: VersionLabel = null
  ): DescribeEventsMessage = {
    val __obj = js.Dynamic.literal()
    if (ApplicationName != null) __obj.updateDynamic("ApplicationName")(ApplicationName.asInstanceOf[js.Any])
    if (EndTime != null) __obj.updateDynamic("EndTime")(EndTime.asInstanceOf[js.Any])
    if (EnvironmentId != null) __obj.updateDynamic("EnvironmentId")(EnvironmentId.asInstanceOf[js.Any])
    if (EnvironmentName != null) __obj.updateDynamic("EnvironmentName")(EnvironmentName.asInstanceOf[js.Any])
    if (MaxRecords != null) __obj.updateDynamic("MaxRecords")(MaxRecords.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (PlatformArn != null) __obj.updateDynamic("PlatformArn")(PlatformArn.asInstanceOf[js.Any])
    if (RequestId != null) __obj.updateDynamic("RequestId")(RequestId.asInstanceOf[js.Any])
    if (Severity != null) __obj.updateDynamic("Severity")(Severity.asInstanceOf[js.Any])
    if (StartTime != null) __obj.updateDynamic("StartTime")(StartTime.asInstanceOf[js.Any])
    if (TemplateName != null) __obj.updateDynamic("TemplateName")(TemplateName.asInstanceOf[js.Any])
    if (VersionLabel != null) __obj.updateDynamic("VersionLabel")(VersionLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeEventsMessage]
  }
}

