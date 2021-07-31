package typings.awsSdk.importexportMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Job extends StObject {
  
  var CreationDate: js.UndefOr[typings.awsSdk.importexportMod.CreationDate] = js.undefined
  
  var IsCanceled: js.UndefOr[typings.awsSdk.importexportMod.IsCanceled] = js.undefined
  
  var JobId: js.UndefOr[typings.awsSdk.importexportMod.JobId] = js.undefined
  
  var JobType: js.UndefOr[typings.awsSdk.importexportMod.JobType] = js.undefined
}
object Job {
  
  @scala.inline
  def apply(): Job = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Job]
  }
  
  @scala.inline
  implicit class JobMutableBuilder[Self <: Job] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationDate(value: CreationDate): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
    
    @scala.inline
    def setIsCanceled(value: IsCanceled): Self = StObject.set(x, "IsCanceled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsCanceledUndefined: Self = StObject.set(x, "IsCanceled", js.undefined)
    
    @scala.inline
    def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobIdUndefined: Self = StObject.set(x, "JobId", js.undefined)
    
    @scala.inline
    def setJobType(value: JobType): Self = StObject.set(x, "JobType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobTypeUndefined: Self = StObject.set(x, "JobType", js.undefined)
  }
}
