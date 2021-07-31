package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResetJobBookmarkResponse extends StObject {
  
  /**
    * The reset bookmark entry.
    */
  var JobBookmarkEntry: js.UndefOr[typings.awsSdk.glueMod.JobBookmarkEntry] = js.undefined
}
object ResetJobBookmarkResponse {
  
  @scala.inline
  def apply(): ResetJobBookmarkResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResetJobBookmarkResponse]
  }
  
  @scala.inline
  implicit class ResetJobBookmarkResponseMutableBuilder[Self <: ResetJobBookmarkResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJobBookmarkEntry(value: JobBookmarkEntry): Self = StObject.set(x, "JobBookmarkEntry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobBookmarkEntryUndefined: Self = StObject.set(x, "JobBookmarkEntry", js.undefined)
  }
}
