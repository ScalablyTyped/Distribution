package typings.awsSdk.cloudwatchlogsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportTaskExecutionInfo extends StObject {
  
  /**
    * The completion time of the export task, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC.
    */
  var completionTime: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The creation time of the export task, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC.
    */
  var creationTime: js.UndefOr[Timestamp] = js.undefined
}
object ExportTaskExecutionInfo {
  
  @scala.inline
  def apply(): ExportTaskExecutionInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportTaskExecutionInfo]
  }
  
  @scala.inline
  implicit class ExportTaskExecutionInfoMutableBuilder[Self <: ExportTaskExecutionInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompletionTime(value: Timestamp): Self = StObject.set(x, "completionTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompletionTimeUndefined: Self = StObject.set(x, "completionTime", js.undefined)
    
    @scala.inline
    def setCreationTime(value: Timestamp): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
  }
}
