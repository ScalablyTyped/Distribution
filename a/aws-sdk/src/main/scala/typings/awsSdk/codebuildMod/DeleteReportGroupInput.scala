package typings.awsSdk.codebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteReportGroupInput extends StObject {
  
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
  implicit class DeleteReportGroupInputMutableBuilder[Self <: DeleteReportGroupInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: NonEmptyString): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteReports(value: Boolean): Self = StObject.set(x, "deleteReports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteReportsUndefined: Self = StObject.set(x, "deleteReports", js.undefined)
  }
}
