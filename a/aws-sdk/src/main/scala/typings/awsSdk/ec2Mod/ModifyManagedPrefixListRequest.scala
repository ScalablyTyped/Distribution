package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifyManagedPrefixListRequest extends StObject {
  
  /**
    * One or more entries to add to the prefix list.
    */
  var AddEntries: js.UndefOr[AddPrefixListEntries] = js.native
  
  /**
    * The current version of the prefix list.
    */
  var CurrentVersion: js.UndefOr[Long] = js.native
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  
  /**
    * The ID of the prefix list.
    */
  var PrefixListId: PrefixListResourceId = js.native
  
  /**
    * A name for the prefix list.
    */
  var PrefixListName: js.UndefOr[String] = js.native
  
  /**
    * One or more entries to remove from the prefix list.
    */
  var RemoveEntries: js.UndefOr[RemovePrefixListEntries] = js.native
}
object ModifyManagedPrefixListRequest {
  
  @scala.inline
  def apply(PrefixListId: PrefixListResourceId): ModifyManagedPrefixListRequest = {
    val __obj = js.Dynamic.literal(PrefixListId = PrefixListId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyManagedPrefixListRequest]
  }
  
  @scala.inline
  implicit class ModifyManagedPrefixListRequestMutableBuilder[Self <: ModifyManagedPrefixListRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddEntries(value: AddPrefixListEntries): Self = StObject.set(x, "AddEntries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddEntriesUndefined: Self = StObject.set(x, "AddEntries", js.undefined)
    
    @scala.inline
    def setAddEntriesVarargs(value: AddPrefixListEntry*): Self = StObject.set(x, "AddEntries", js.Array(value :_*))
    
    @scala.inline
    def setCurrentVersion(value: Long): Self = StObject.set(x, "CurrentVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentVersionUndefined: Self = StObject.set(x, "CurrentVersion", js.undefined)
    
    @scala.inline
    def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    @scala.inline
    def setPrefixListId(value: PrefixListResourceId): Self = StObject.set(x, "PrefixListId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixListName(value: String): Self = StObject.set(x, "PrefixListName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixListNameUndefined: Self = StObject.set(x, "PrefixListName", js.undefined)
    
    @scala.inline
    def setRemoveEntries(value: RemovePrefixListEntries): Self = StObject.set(x, "RemoveEntries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveEntriesUndefined: Self = StObject.set(x, "RemoveEntries", js.undefined)
    
    @scala.inline
    def setRemoveEntriesVarargs(value: RemovePrefixListEntry*): Self = StObject.set(x, "RemoveEntries", js.Array(value :_*))
  }
}
