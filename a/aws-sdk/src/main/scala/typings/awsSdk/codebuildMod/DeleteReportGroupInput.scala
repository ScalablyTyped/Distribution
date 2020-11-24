package typings.awsSdk.codebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteReportGroupInput extends js.Object {
  
  /**
    * The ARN of the report group to delete. 
    */
  var arn: NonEmptyString = js.native
  
  /**
    * If true, deletes any reports that belong to a report group before deleting the report group.  If false, you must delete any reports in the report group. Use ListReportsForReportGroup to get the reports in a report group. Use DeleteReport to delete the reports. If you call DeleteReportGroup for a report group that contains one or more reports, an exception is thrown. 
    */
  var deleteReports: js.UndefOr[Boolean] = js.native
}
object DeleteReportGroupInput {
  
  @scala.inline
  def apply(arn: NonEmptyString): DeleteReportGroupInput = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteReportGroupInput]
  }
  
  @scala.inline
  implicit class DeleteReportGroupInputOps[Self <: DeleteReportGroupInput] (val x: Self) extends AnyVal {
    
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
    def setDeleteReports(value: Boolean): Self = this.set("deleteReports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeleteReports: Self = this.set("deleteReports", js.undefined)
  }
}
