package typings.awsSdk.migrationhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProgressUpdateStreamSummary extends StObject {
  
  /**
    * The name of the ProgressUpdateStream. Do not store personal data in this field. 
    */
  var ProgressUpdateStreamName: js.UndefOr[ProgressUpdateStream] = js.native
}
object ProgressUpdateStreamSummary {
  
  @scala.inline
  def apply(): ProgressUpdateStreamSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProgressUpdateStreamSummary]
  }
  
  @scala.inline
  implicit class ProgressUpdateStreamSummaryMutableBuilder[Self <: ProgressUpdateStreamSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProgressUpdateStreamName(value: ProgressUpdateStream): Self = StObject.set(x, "ProgressUpdateStreamName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressUpdateStreamNameUndefined: Self = StObject.set(x, "ProgressUpdateStreamName", js.undefined)
  }
}
