package typings.awsSdk.codebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReportGroup extends js.Object {
  /**
    *  The ARN of a ReportGroup. 
    */
  var arn: js.UndefOr[NonEmptyString] = js.native
  /**
    *  The date and time this ReportGroup was created. 
    */
  var created: js.UndefOr[Timestamp] = js.native
  /**
    *  Information about the destination where the raw data of this ReportGroup is exported. 
    */
  var exportConfig: js.UndefOr[ReportExportConfig] = js.native
  /**
    *  The date and time this ReportGroup was last modified. 
    */
  var lastModified: js.UndefOr[Timestamp] = js.native
  /**
    *  The name of a ReportGroup. 
    */
  var name: js.UndefOr[ReportGroupName] = js.native
  /**
    *  The type of the ReportGroup. The one valid value is TEST. 
    */
  var `type`: js.UndefOr[ReportType] = js.native
}

object ReportGroup {
  @scala.inline
  def apply(
    arn: NonEmptyString = null,
    created: Timestamp = null,
    exportConfig: ReportExportConfig = null,
    lastModified: Timestamp = null,
    name: ReportGroupName = null,
    `type`: ReportType = null
  ): ReportGroup = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (created != null) __obj.updateDynamic("created")(created.asInstanceOf[js.Any])
    if (exportConfig != null) __obj.updateDynamic("exportConfig")(exportConfig.asInstanceOf[js.Any])
    if (lastModified != null) __obj.updateDynamic("lastModified")(lastModified.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReportGroup]
  }
}

