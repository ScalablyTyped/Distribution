package typings.awsSdk.kendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartDataSourceSyncJobResponse extends StObject {
  
  /**
    * Identifies a particular synchronization job.
    */
  var ExecutionId: js.UndefOr[String] = js.undefined
}
object StartDataSourceSyncJobResponse {
  
  @scala.inline
  def apply(): StartDataSourceSyncJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartDataSourceSyncJobResponse]
  }
  
  @scala.inline
  implicit class StartDataSourceSyncJobResponseMutableBuilder[Self <: StartDataSourceSyncJobResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecutionId(value: String): Self = StObject.set(x, "ExecutionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutionIdUndefined: Self = StObject.set(x, "ExecutionId", js.undefined)
  }
}
