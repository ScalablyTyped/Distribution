package typings.awsSdk.codedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGetApplicationsOutput extends StObject {
  
  /**
    * Information about the applications.
    */
  var applicationsInfo: js.UndefOr[ApplicationsInfoList] = js.undefined
}
object BatchGetApplicationsOutput {
  
  @scala.inline
  def apply(): BatchGetApplicationsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetApplicationsOutput]
  }
  
  @scala.inline
  implicit class BatchGetApplicationsOutputMutableBuilder[Self <: BatchGetApplicationsOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationsInfo(value: ApplicationsInfoList): Self = StObject.set(x, "applicationsInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationsInfoUndefined: Self = StObject.set(x, "applicationsInfo", js.undefined)
    
    @scala.inline
    def setApplicationsInfoVarargs(value: ApplicationInfo*): Self = StObject.set(x, "applicationsInfo", js.Array(value :_*))
  }
}
