package typings.awsSdk.lakeformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchPermissionsFailureEntry extends StObject {
  
  /**
    * An error message that applies to the failure of the entry.
    */
  var Error: js.UndefOr[ErrorDetail] = js.undefined
  
  /**
    * An identifier for an entry of the batch request.
    */
  var RequestEntry: js.UndefOr[BatchPermissionsRequestEntry] = js.undefined
}
object BatchPermissionsFailureEntry {
  
  inline def apply(): BatchPermissionsFailureEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchPermissionsFailureEntry]
  }
  
  extension [Self <: BatchPermissionsFailureEntry](x: Self) {
    
    inline def setError(value: ErrorDetail): Self = StObject.set(x, "Error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "Error", js.undefined)
    
    inline def setRequestEntry(value: BatchPermissionsRequestEntry): Self = StObject.set(x, "RequestEntry", value.asInstanceOf[js.Any])
    
    inline def setRequestEntryUndefined: Self = StObject.set(x, "RequestEntry", js.undefined)
  }
}
