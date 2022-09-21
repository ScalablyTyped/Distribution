package typings.awsSdk.iotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatasetContentSummary extends StObject {
  
  /**
    * The time the dataset content status was updated to SUCCEEDED or FAILED.
    */
  var completionTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The actual time the creation of the dataset contents was started.
    */
  var creationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The time the creation of the dataset contents was scheduled to start.
    */
  var scheduleTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The status of the dataset contents.
    */
  var status: js.UndefOr[DatasetContentStatus] = js.undefined
  
  /**
    * The version of the dataset contents.
    */
  var version: js.UndefOr[DatasetContentVersion] = js.undefined
}
object DatasetContentSummary {
  
  inline def apply(): DatasetContentSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatasetContentSummary]
  }
  
  extension [Self <: DatasetContentSummary](x: Self) {
    
    inline def setCompletionTime(value: js.Date): Self = StObject.set(x, "completionTime", value.asInstanceOf[js.Any])
    
    inline def setCompletionTimeUndefined: Self = StObject.set(x, "completionTime", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    inline def setScheduleTime(value: js.Date): Self = StObject.set(x, "scheduleTime", value.asInstanceOf[js.Any])
    
    inline def setScheduleTimeUndefined: Self = StObject.set(x, "scheduleTime", js.undefined)
    
    inline def setStatus(value: DatasetContentStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setVersion(value: DatasetContentVersion): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
