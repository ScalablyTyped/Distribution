package typings.awsSdk.codebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateReportGroupInput extends js.Object {
  /**
    *  The ARN of the report group to update. 
    */
  var arn: NonEmptyString = js.native
  /**
    *  Used to specify an updated export type. Valid values are:     S3: The report results are exported to an S3 bucket.     NO_EXPORT: The report results are not exported.   
    */
  var exportConfig: js.UndefOr[ReportExportConfig] = js.native
  /**
    *  An updated list of tag key and value pairs associated with this report group.  These tags are available for use by AWS services that support AWS CodeBuild report group tags.
    */
  var tags: js.UndefOr[TagList] = js.native
}

object UpdateReportGroupInput {
  @scala.inline
  def apply(arn: NonEmptyString, exportConfig: ReportExportConfig = null, tags: TagList = null): UpdateReportGroupInput = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    if (exportConfig != null) __obj.updateDynamic("exportConfig")(exportConfig.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateReportGroupInput]
  }
}

