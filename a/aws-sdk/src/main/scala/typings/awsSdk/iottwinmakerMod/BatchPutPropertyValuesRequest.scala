package typings.awsSdk.iottwinmakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchPutPropertyValuesRequest extends StObject {
  
  /**
    * An object that maps strings to the property value entries to set. Each string in the mapping must be unique to this object.
    */
  var entries: Entries
  
  /**
    * The ID of the workspace that contains the properties to set.
    */
  var workspaceId: Id
}
object BatchPutPropertyValuesRequest {
  
  inline def apply(entries: Entries, workspaceId: Id): BatchPutPropertyValuesRequest = {
    val __obj = js.Dynamic.literal(entries = entries.asInstanceOf[js.Any], workspaceId = workspaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchPutPropertyValuesRequest]
  }
  
  extension [Self <: BatchPutPropertyValuesRequest](x: Self) {
    
    inline def setEntries(value: Entries): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    inline def setEntriesVarargs(value: PropertyValueEntry*): Self = StObject.set(x, "entries", js.Array(value*))
    
    inline def setWorkspaceId(value: Id): Self = StObject.set(x, "workspaceId", value.asInstanceOf[js.Any])
  }
}
