package typings.awsSdkClientKms.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GrantListEntry extends StObject {
  
  /**
    * <p>A list of key-value pairs that must be present in the encryption context of certain
    *       subsequent operations that the grant allows.</p>
    */
  var Constraints: js.UndefOr[GrantConstraints] = js.undefined
  
  /**
    * <p>The date and time when the grant was created.</p>
    */
  var CreationDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * <p>The unique identifier for the grant.</p>
    */
  var GrantId: js.UndefOr[String] = js.undefined
  
  /**
    * <p>The identity that gets the permissions in the grant.</p>
    *          <p>The <code>GranteePrincipal</code> field in the <code>ListGrants</code> response usually contains the
    *         user or role designated as the grantee principal in the grant. However, when the grantee
    *         principal in the grant is an Amazon Web Services service, the <code>GranteePrincipal</code> field contains
    *         the <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_principal.html#principal-services">service
    *           principal</a>, which might represent several different grantee principals.</p>
    */
  var GranteePrincipal: js.UndefOr[String] = js.undefined
  
  /**
    * <p>The Amazon Web Services account under which the grant was issued.</p>
    */
  var IssuingAccount: js.UndefOr[String] = js.undefined
  
  /**
    * <p>The unique identifier for the KMS key to which the grant applies.</p>
    */
  var KeyId: js.UndefOr[String] = js.undefined
  
  /**
    * <p>The friendly name that identifies the grant. If a name was provided in the <a>CreateGrant</a> request, that name is returned. Otherwise this value is null.</p>
    */
  var Name: js.UndefOr[String] = js.undefined
  
  /**
    * <p>The list of operations permitted by the grant.</p>
    */
  var Operations: js.UndefOr[js.Array[GrantOperation | String]] = js.undefined
  
  /**
    * <p>The principal that can retire the grant.</p>
    */
  var RetiringPrincipal: js.UndefOr[String] = js.undefined
}
object GrantListEntry {
  
  inline def apply(): GrantListEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GrantListEntry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GrantListEntry] (val x: Self) extends AnyVal {
    
    inline def setConstraints(value: GrantConstraints): Self = StObject.set(x, "Constraints", value.asInstanceOf[js.Any])
    
    inline def setConstraintsUndefined: Self = StObject.set(x, "Constraints", js.undefined)
    
    inline def setCreationDate(value: js.Date): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
    
    inline def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
    
    inline def setGrantId(value: String): Self = StObject.set(x, "GrantId", value.asInstanceOf[js.Any])
    
    inline def setGrantIdUndefined: Self = StObject.set(x, "GrantId", js.undefined)
    
    inline def setGranteePrincipal(value: String): Self = StObject.set(x, "GranteePrincipal", value.asInstanceOf[js.Any])
    
    inline def setGranteePrincipalUndefined: Self = StObject.set(x, "GranteePrincipal", js.undefined)
    
    inline def setIssuingAccount(value: String): Self = StObject.set(x, "IssuingAccount", value.asInstanceOf[js.Any])
    
    inline def setIssuingAccountUndefined: Self = StObject.set(x, "IssuingAccount", js.undefined)
    
    inline def setKeyId(value: String): Self = StObject.set(x, "KeyId", value.asInstanceOf[js.Any])
    
    inline def setKeyIdUndefined: Self = StObject.set(x, "KeyId", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setOperations(value: js.Array[GrantOperation | String]): Self = StObject.set(x, "Operations", value.asInstanceOf[js.Any])
    
    inline def setOperationsUndefined: Self = StObject.set(x, "Operations", js.undefined)
    
    inline def setOperationsVarargs(value: (GrantOperation | String)*): Self = StObject.set(x, "Operations", js.Array(value*))
    
    inline def setRetiringPrincipal(value: String): Self = StObject.set(x, "RetiringPrincipal", value.asInstanceOf[js.Any])
    
    inline def setRetiringPrincipalUndefined: Self = StObject.set(x, "RetiringPrincipal", js.undefined)
  }
}
