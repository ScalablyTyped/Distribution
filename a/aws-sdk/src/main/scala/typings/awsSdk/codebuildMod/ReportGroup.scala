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
    *  A list of tag key and value pairs associated with this report group.  These tags are available for use by AWS services that support AWS CodeBuild report group tags.
    */
  var tags: js.UndefOr[TagList] = js.native
  /**
    *  The type of the ReportGroup. The one valid value is TEST. 
    */
  var `type`: js.UndefOr[ReportType] = js.native
}

object ReportGroup {
  @scala.inline
  def apply(): ReportGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReportGroup]
  }
  @scala.inline
  implicit class ReportGroupOps[Self <: ReportGroup] (val x: Self) extends AnyVal {
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
    def setArn(value: NonEmptyString): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    @scala.inline
    def setCreated(value: Timestamp): Self = this.set("created", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreated: Self = this.set("created", js.undefined)
    @scala.inline
    def setExportConfig(value: ReportExportConfig): Self = this.set("exportConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExportConfig: Self = this.set("exportConfig", js.undefined)
    @scala.inline
    def setLastModified(value: Timestamp): Self = this.set("lastModified", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastModified: Self = this.set("lastModified", js.undefined)
    @scala.inline
    def setName(value: ReportGroupName): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: TagList): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    @scala.inline
    def setType(value: ReportType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

