package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifyManagedPrefixListRequest extends js.Object {
  
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
  implicit class ModifyManagedPrefixListRequestOps[Self <: ModifyManagedPrefixListRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPrefixListId(value: PrefixListResourceId): Self = this.set("PrefixListId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddEntriesVarargs(value: AddPrefixListEntry*): Self = this.set("AddEntries", js.Array(value :_*))
    
    @scala.inline
    def setAddEntries(value: AddPrefixListEntries): Self = this.set("AddEntries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddEntries: Self = this.set("AddEntries", js.undefined)
    
    @scala.inline
    def setCurrentVersion(value: Long): Self = this.set("CurrentVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrentVersion: Self = this.set("CurrentVersion", js.undefined)
    
    @scala.inline
    def setDryRun(value: Boolean): Self = this.set("DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDryRun: Self = this.set("DryRun", js.undefined)
    
    @scala.inline
    def setPrefixListName(value: String): Self = this.set("PrefixListName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefixListName: Self = this.set("PrefixListName", js.undefined)
    
    @scala.inline
    def setRemoveEntriesVarargs(value: RemovePrefixListEntry*): Self = this.set("RemoveEntries", js.Array(value :_*))
    
    @scala.inline
    def setRemoveEntries(value: RemovePrefixListEntries): Self = this.set("RemoveEntries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoveEntries: Self = this.set("RemoveEntries", js.undefined)
  }
}
