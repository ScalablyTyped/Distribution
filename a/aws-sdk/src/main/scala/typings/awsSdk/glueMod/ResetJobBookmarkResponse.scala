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
  
  inline def apply(): ResetJobBookmarkResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResetJobBookmarkResponse]
  }
  
  extension [Self <: ResetJobBookmarkResponse](x: Self) {
    
    inline def setJobBookmarkEntry(value: JobBookmarkEntry): Self = StObject.set(x, "JobBookmarkEntry", value.asInstanceOf[js.Any])
    
    inline def setJobBookmarkEntryUndefined: Self = StObject.set(x, "JobBookmarkEntry", js.undefined)
  }
}
