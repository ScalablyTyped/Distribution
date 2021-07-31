package typings.awsSdk.codebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReportFilter extends StObject {
  
  /**
    *  The status used to filter reports. You can filter using one status only. 
    */
  var status: js.UndefOr[ReportStatusType] = js.undefined
}
object ReportFilter {
  
  @scala.inline
  def apply(): ReportFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReportFilter]
  }
  
  @scala.inline
  implicit class ReportFilterMutableBuilder[Self <: ReportFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatus(value: ReportStatusType): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
