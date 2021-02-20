package typings.awsSdk.codebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateReportGroupOutput extends StObject {
  
  /**
    *  Information about the updated report group. 
    */
  var reportGroup: js.UndefOr[ReportGroup] = js.native
}
object UpdateReportGroupOutput {
  
  @scala.inline
  def apply(): UpdateReportGroupOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateReportGroupOutput]
  }
  
  @scala.inline
  implicit class UpdateReportGroupOutputMutableBuilder[Self <: UpdateReportGroupOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReportGroup(value: ReportGroup): Self = StObject.set(x, "reportGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReportGroupUndefined: Self = StObject.set(x, "reportGroup", js.undefined)
  }
}
