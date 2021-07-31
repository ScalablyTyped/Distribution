package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobBookmarkEntry extends StObject {
  
  /**
    * The attempt ID number.
    */
  var Attempt: js.UndefOr[IntegerValue] = js.undefined
  
  /**
    * The bookmark itself.
    */
  var JobBookmark: js.UndefOr[JsonValue] = js.undefined
  
  /**
    * The name of the job in question.
    */
  var JobName: js.UndefOr[typings.awsSdk.glueMod.JobName] = js.undefined
  
  /**
    * The unique run identifier associated with the previous job run.
    */
  var PreviousRunId: js.UndefOr[RunId] = js.undefined
  
  /**
    * The run ID number.
    */
  var Run: js.UndefOr[IntegerValue] = js.undefined
  
  /**
    * The run ID number.
    */
  var RunId: js.UndefOr[typings.awsSdk.glueMod.RunId] = js.undefined
  
  /**
    * The version of the job.
    */
  var Version: js.UndefOr[IntegerValue] = js.undefined
}
object JobBookmarkEntry {
  
  @scala.inline
  def apply(): JobBookmarkEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobBookmarkEntry]
  }
  
  @scala.inline
  implicit class JobBookmarkEntryMutableBuilder[Self <: JobBookmarkEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttempt(value: IntegerValue): Self = StObject.set(x, "Attempt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttemptUndefined: Self = StObject.set(x, "Attempt", js.undefined)
    
    @scala.inline
    def setJobBookmark(value: JsonValue): Self = StObject.set(x, "JobBookmark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobBookmarkUndefined: Self = StObject.set(x, "JobBookmark", js.undefined)
    
    @scala.inline
    def setJobName(value: JobName): Self = StObject.set(x, "JobName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobNameUndefined: Self = StObject.set(x, "JobName", js.undefined)
    
    @scala.inline
    def setPreviousRunId(value: RunId): Self = StObject.set(x, "PreviousRunId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousRunIdUndefined: Self = StObject.set(x, "PreviousRunId", js.undefined)
    
    @scala.inline
    def setRun(value: IntegerValue): Self = StObject.set(x, "Run", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunId(value: RunId): Self = StObject.set(x, "RunId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunIdUndefined: Self = StObject.set(x, "RunId", js.undefined)
    
    @scala.inline
    def setRunUndefined: Self = StObject.set(x, "Run", js.undefined)
    
    @scala.inline
    def setVersion(value: IntegerValue): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "Version", js.undefined)
  }
}
