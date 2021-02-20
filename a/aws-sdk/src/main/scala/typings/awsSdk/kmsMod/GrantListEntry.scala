package typings.awsSdk.kmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GrantListEntry extends StObject {
  
  /**
    * A list of key-value pairs that must be present in the encryption context of certain subsequent operations that the grant allows.
    */
  var Constraints: js.UndefOr[GrantConstraints] = js.native
  
  /**
    * The date and time when the grant was created.
    */
  var CreationDate: js.UndefOr[DateType] = js.native
  
  /**
    * The unique identifier for the grant.
    */
  var GrantId: js.UndefOr[GrantIdType] = js.native
  
  /**
    * The identity that gets the permissions in the grant. The GranteePrincipal field in the ListGrants response usually contains the user or role designated as the grantee principal in the grant. However, when the grantee principal in the grant is an AWS service, the GranteePrincipal field contains the service principal, which might represent several different grantee principals.
    */
  var GranteePrincipal: js.UndefOr[PrincipalIdType] = js.native
  
  /**
    * The AWS account under which the grant was issued.
    */
  var IssuingAccount: js.UndefOr[PrincipalIdType] = js.native
  
  /**
    * The unique identifier for the customer master key (CMK) to which the grant applies.
    */
  var KeyId: js.UndefOr[KeyIdType] = js.native
  
  /**
    * The friendly name that identifies the grant. If a name was provided in the CreateGrant request, that name is returned. Otherwise this value is null.
    */
  var Name: js.UndefOr[GrantNameType] = js.native
  
  /**
    * The list of operations permitted by the grant.
    */
  var Operations: js.UndefOr[GrantOperationList] = js.native
  
  /**
    * The principal that can retire the grant.
    */
  var RetiringPrincipal: js.UndefOr[PrincipalIdType] = js.native
}
object GrantListEntry {
  
  @scala.inline
  def apply(): GrantListEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GrantListEntry]
  }
  
  @scala.inline
  implicit class GrantListEntryMutableBuilder[Self <: GrantListEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConstraints(value: GrantConstraints): Self = StObject.set(x, "Constraints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConstraintsUndefined: Self = StObject.set(x, "Constraints", js.undefined)
    
    @scala.inline
    def setCreationDate(value: DateType): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
    
    @scala.inline
    def setGrantId(value: GrantIdType): Self = StObject.set(x, "GrantId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGrantIdUndefined: Self = StObject.set(x, "GrantId", js.undefined)
    
    @scala.inline
    def setGranteePrincipal(value: PrincipalIdType): Self = StObject.set(x, "GranteePrincipal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGranteePrincipalUndefined: Self = StObject.set(x, "GranteePrincipal", js.undefined)
    
    @scala.inline
    def setIssuingAccount(value: PrincipalIdType): Self = StObject.set(x, "IssuingAccount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIssuingAccountUndefined: Self = StObject.set(x, "IssuingAccount", js.undefined)
    
    @scala.inline
    def setKeyId(value: KeyIdType): Self = StObject.set(x, "KeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyIdUndefined: Self = StObject.set(x, "KeyId", js.undefined)
    
    @scala.inline
    def setName(value: GrantNameType): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setOperations(value: GrantOperationList): Self = StObject.set(x, "Operations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationsUndefined: Self = StObject.set(x, "Operations", js.undefined)
    
    @scala.inline
    def setOperationsVarargs(value: GrantOperation*): Self = StObject.set(x, "Operations", js.Array(value :_*))
    
    @scala.inline
    def setRetiringPrincipal(value: PrincipalIdType): Self = StObject.set(x, "RetiringPrincipal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetiringPrincipalUndefined: Self = StObject.set(x, "RetiringPrincipal", js.undefined)
  }
}
