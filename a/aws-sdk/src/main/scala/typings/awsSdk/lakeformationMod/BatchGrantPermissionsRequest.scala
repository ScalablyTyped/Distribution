package typings.awsSdk.lakeformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGrantPermissionsRequest extends StObject {
  
  /**
    * The identifier for the Data Catalog. By default, the account ID. The Data Catalog is the persistent metadata store. It contains database definitions, table definitions, and other control information to manage your AWS Lake Formation environment. 
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.undefined
  
  /**
    * A list of up to 20 entries for resource permissions to be granted by batch operation to the principal.
    */
  var Entries: BatchPermissionsRequestEntryList
}
object BatchGrantPermissionsRequest {
  
  @scala.inline
  def apply(Entries: BatchPermissionsRequestEntryList): BatchGrantPermissionsRequest = {
    val __obj = js.Dynamic.literal(Entries = Entries.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGrantPermissionsRequest]
  }
  
  @scala.inline
  implicit class BatchGrantPermissionsRequestMutableBuilder[Self <: BatchGrantPermissionsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCatalogId(value: CatalogIdString): Self = StObject.set(x, "CatalogId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCatalogIdUndefined: Self = StObject.set(x, "CatalogId", js.undefined)
    
    @scala.inline
    def setEntries(value: BatchPermissionsRequestEntryList): Self = StObject.set(x, "Entries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntriesVarargs(value: BatchPermissionsRequestEntry*): Self = StObject.set(x, "Entries", js.Array(value :_*))
  }
}
