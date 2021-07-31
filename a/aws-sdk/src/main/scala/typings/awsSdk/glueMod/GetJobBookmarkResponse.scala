package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetJobBookmarkResponse extends StObject {
  
  /**
    * A structure that defines a point that a job can resume processing.
    */
  var JobBookmarkEntry: js.UndefOr[typings.awsSdk.glueMod.JobBookmarkEntry] = js.undefined
}
object GetJobBookmarkResponse {
  
  @scala.inline
  def apply(): GetJobBookmarkResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetJobBookmarkResponse]
  }
  
  @scala.inline
  implicit class GetJobBookmarkResponseMutableBuilder[Self <: GetJobBookmarkResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJobBookmarkEntry(value: JobBookmarkEntry): Self = StObject.set(x, "JobBookmarkEntry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobBookmarkEntryUndefined: Self = StObject.set(x, "JobBookmarkEntry", js.undefined)
  }
}
