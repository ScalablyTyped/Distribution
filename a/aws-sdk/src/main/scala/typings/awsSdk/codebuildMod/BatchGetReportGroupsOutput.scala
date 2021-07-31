package typings.awsSdk.codebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGetReportGroupsOutput extends StObject {
  
  /**
    *  The array of report groups returned by BatchGetReportGroups. 
    */
  var reportGroups: js.UndefOr[ReportGroups] = js.undefined
  
  /**
    *  An array of ARNs passed to BatchGetReportGroups that are not associated with a ReportGroup. 
    */
  var reportGroupsNotFound: js.UndefOr[ReportGroupArns] = js.undefined
}
object BatchGetReportGroupsOutput {
  
  @scala.inline
  def apply(): BatchGetReportGroupsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetReportGroupsOutput]
  }
  
  @scala.inline
  implicit class BatchGetReportGroupsOutputMutableBuilder[Self <: BatchGetReportGroupsOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReportGroups(value: ReportGroups): Self = StObject.set(x, "reportGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReportGroupsNotFound(value: ReportGroupArns): Self = StObject.set(x, "reportGroupsNotFound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReportGroupsNotFoundUndefined: Self = StObject.set(x, "reportGroupsNotFound", js.undefined)
    
    @scala.inline
    def setReportGroupsNotFoundVarargs(value: NonEmptyString*): Self = StObject.set(x, "reportGroupsNotFound", js.Array(value :_*))
    
    @scala.inline
    def setReportGroupsUndefined: Self = StObject.set(x, "reportGroups", js.undefined)
    
    @scala.inline
    def setReportGroupsVarargs(value: ReportGroup*): Self = StObject.set(x, "reportGroups", js.Array(value :_*))
  }
}
