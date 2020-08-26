package typings.awsSdk.codebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateReportGroupInput extends js.Object {
  /**
    *  A ReportExportConfig object that contains information about where the report group test results are exported. 
    */
  var exportConfig: ReportExportConfig = js.native
  /**
    *  The name of the report group. 
    */
  var name: ReportGroupName = js.native
  /**
    *  A list of tag key and value pairs associated with this report group.  These tags are available for use by AWS services that support AWS CodeBuild report group tags.
    */
  var tags: js.UndefOr[TagList] = js.native
  /**
    *  The type of report group. 
    */
  var `type`: ReportType = js.native
}

object CreateReportGroupInput {
  @scala.inline
  def apply(exportConfig: ReportExportConfig, name: ReportGroupName, `type`: ReportType): CreateReportGroupInput = {
    val __obj = js.Dynamic.literal(exportConfig = exportConfig.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateReportGroupInput]
  }
  @scala.inline
  implicit class CreateReportGroupInputOps[Self <: CreateReportGroupInput] (val x: Self) extends AnyVal {
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
    def setExportConfig(value: ReportExportConfig): Self = this.set("exportConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: ReportGroupName): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: ReportType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: TagList): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

