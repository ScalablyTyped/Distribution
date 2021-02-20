package typings.awsSdk.qldbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateLedgerRequest extends StObject {
  
  /**
    * The flag that prevents a ledger from being deleted by any user. If not provided on ledger creation, this feature is enabled (true) by default. If deletion protection is enabled, you must first disable it before you can delete the ledger using the QLDB API or the AWS Command Line Interface (AWS CLI). You can disable it by calling the UpdateLedger operation to set the flag to false. The QLDB console disables deletion protection for you when you use it to delete a ledger.
    */
  var DeletionProtection: js.UndefOr[typings.awsSdk.qldbMod.DeletionProtection] = js.native
  
  /**
    * The name of the ledger that you want to create. The name must be unique among all of your ledgers in the current AWS Region. Naming constraints for ledger names are defined in Quotas in Amazon QLDB in the Amazon QLDB Developer Guide.
    */
  var Name: LedgerName = js.native
  
  /**
    * The permissions mode to assign to the ledger that you want to create.
    */
  var PermissionsMode: typings.awsSdk.qldbMod.PermissionsMode = js.native
  
  /**
    * The key-value pairs to add as tags to the ledger that you want to create. Tag keys are case sensitive. Tag values are case sensitive and can be null.
    */
  var Tags: js.UndefOr[typings.awsSdk.qldbMod.Tags] = js.native
}
object CreateLedgerRequest {
  
  @scala.inline
  def apply(Name: LedgerName, PermissionsMode: PermissionsMode): CreateLedgerRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], PermissionsMode = PermissionsMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLedgerRequest]
  }
  
  @scala.inline
  implicit class CreateLedgerRequestMutableBuilder[Self <: CreateLedgerRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeletionProtection(value: DeletionProtection): Self = StObject.set(x, "DeletionProtection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletionProtectionUndefined: Self = StObject.set(x, "DeletionProtection", js.undefined)
    
    @scala.inline
    def setName(value: LedgerName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionsMode(value: PermissionsMode): Self = StObject.set(x, "PermissionsMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
