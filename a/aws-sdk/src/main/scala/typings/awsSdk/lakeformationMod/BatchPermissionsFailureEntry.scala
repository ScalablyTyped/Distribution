package typings.awsSdk.lakeformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchPermissionsFailureEntry extends StObject {
  
  /**
    * An error message that applies to the failure of the entry.
    */
  var Error: js.UndefOr[ErrorDetail] = js.native
  
  /**
    * An identifier for an entry of the batch request.
    */
  var RequestEntry: js.UndefOr[BatchPermissionsRequestEntry] = js.native
}
object BatchPermissionsFailureEntry {
  
  @scala.inline
  def apply(): BatchPermissionsFailureEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchPermissionsFailureEntry]
  }
  
  @scala.inline
  implicit class BatchPermissionsFailureEntryMutableBuilder[Self <: BatchPermissionsFailureEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: ErrorDetail): Self = StObject.set(x, "Error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "Error", js.undefined)
    
    @scala.inline
    def setRequestEntry(value: BatchPermissionsRequestEntry): Self = StObject.set(x, "RequestEntry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestEntryUndefined: Self = StObject.set(x, "RequestEntry", js.undefined)
  }
}
