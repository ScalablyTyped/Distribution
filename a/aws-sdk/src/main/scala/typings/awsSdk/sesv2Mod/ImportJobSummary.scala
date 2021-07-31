package typings.awsSdk.sesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportJobSummary extends StObject {
  
  /**
    * The date and time when the import job was created.
    */
  var CreatedTimestamp: js.UndefOr[Timestamp] = js.undefined
  
  var ImportDestination: js.UndefOr[typings.awsSdk.sesv2Mod.ImportDestination] = js.undefined
  
  var JobId: js.UndefOr[typings.awsSdk.sesv2Mod.JobId] = js.undefined
  
  var JobStatus: js.UndefOr[typings.awsSdk.sesv2Mod.JobStatus] = js.undefined
}
object ImportJobSummary {
  
  @scala.inline
  def apply(): ImportJobSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportJobSummary]
  }
  
  @scala.inline
  implicit class ImportJobSummaryMutableBuilder[Self <: ImportJobSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreatedTimestamp(value: Timestamp): Self = StObject.set(x, "CreatedTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedTimestampUndefined: Self = StObject.set(x, "CreatedTimestamp", js.undefined)
    
    @scala.inline
    def setImportDestination(value: ImportDestination): Self = StObject.set(x, "ImportDestination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportDestinationUndefined: Self = StObject.set(x, "ImportDestination", js.undefined)
    
    @scala.inline
    def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobIdUndefined: Self = StObject.set(x, "JobId", js.undefined)
    
    @scala.inline
    def setJobStatus(value: JobStatus): Self = StObject.set(x, "JobStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobStatusUndefined: Self = StObject.set(x, "JobStatus", js.undefined)
  }
}
