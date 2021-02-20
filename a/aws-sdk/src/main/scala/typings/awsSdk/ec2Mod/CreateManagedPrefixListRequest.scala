package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateManagedPrefixListRequest extends StObject {
  
  /**
    * The IP address type. Valid Values: IPv4 | IPv6 
    */
  var AddressFamily: String = js.native
  
  /**
    * Unique, case-sensitive identifier you provide to ensure the idempotency of the request. For more information, see Ensuring Idempotency. Constraints: Up to 255 UTF-8 characters in length.
    */
  var ClientToken: js.UndefOr[String] = js.native
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  
  /**
    * One or more entries for the prefix list.
    */
  var Entries: js.UndefOr[AddPrefixListEntries] = js.native
  
  /**
    * The maximum number of entries for the prefix list.
    */
  var MaxEntries: Integer = js.native
  
  /**
    * A name for the prefix list. Constraints: Up to 255 characters in length. The name cannot start with com.amazonaws.
    */
  var PrefixListName: String = js.native
  
  /**
    * The tags to apply to the prefix list during creation.
    */
  var TagSpecifications: js.UndefOr[TagSpecificationList] = js.native
}
object CreateManagedPrefixListRequest {
  
  @scala.inline
  def apply(AddressFamily: String, MaxEntries: Integer, PrefixListName: String): CreateManagedPrefixListRequest = {
    val __obj = js.Dynamic.literal(AddressFamily = AddressFamily.asInstanceOf[js.Any], MaxEntries = MaxEntries.asInstanceOf[js.Any], PrefixListName = PrefixListName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateManagedPrefixListRequest]
  }
  
  @scala.inline
  implicit class CreateManagedPrefixListRequestMutableBuilder[Self <: CreateManagedPrefixListRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddressFamily(value: String): Self = StObject.set(x, "AddressFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientToken(value: String): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    @scala.inline
    def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    @scala.inline
    def setEntries(value: AddPrefixListEntries): Self = StObject.set(x, "Entries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntriesUndefined: Self = StObject.set(x, "Entries", js.undefined)
    
    @scala.inline
    def setEntriesVarargs(value: AddPrefixListEntry*): Self = StObject.set(x, "Entries", js.Array(value :_*))
    
    @scala.inline
    def setMaxEntries(value: Integer): Self = StObject.set(x, "MaxEntries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixListName(value: String): Self = StObject.set(x, "PrefixListName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagSpecifications(value: TagSpecificationList): Self = StObject.set(x, "TagSpecifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagSpecificationsUndefined: Self = StObject.set(x, "TagSpecifications", js.undefined)
    
    @scala.inline
    def setTagSpecificationsVarargs(value: TagSpecification*): Self = StObject.set(x, "TagSpecifications", js.Array(value :_*))
  }
}
