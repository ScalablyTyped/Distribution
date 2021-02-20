package typings.awsSdk.iotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DatasetContentSummary extends StObject {
  
  /**
    * The time the dataset content status was updated to SUCCEEDED or FAILED.
    */
  var completionTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * The actual time the creation of the dataset contents was started.
    */
  var creationTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * The time the creation of the dataset contents was scheduled to start.
    */
  var scheduleTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * The status of the data set contents.
    */
  var status: js.UndefOr[DatasetContentStatus] = js.native
  
  /**
    * The version of the dataset contents.
    */
  var version: js.UndefOr[DatasetContentVersion] = js.native
}
object DatasetContentSummary {
  
  @scala.inline
  def apply(): DatasetContentSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatasetContentSummary]
  }
  
  @scala.inline
  implicit class DatasetContentSummaryMutableBuilder[Self <: DatasetContentSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompletionTime(value: Timestamp): Self = StObject.set(x, "completionTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompletionTimeUndefined: Self = StObject.set(x, "completionTime", js.undefined)
    
    @scala.inline
    def setCreationTime(value: Timestamp): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    @scala.inline
    def setScheduleTime(value: Timestamp): Self = StObject.set(x, "scheduleTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduleTimeUndefined: Self = StObject.set(x, "scheduleTime", js.undefined)
    
    @scala.inline
    def setStatus(value: DatasetContentStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setVersion(value: DatasetContentVersion): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
