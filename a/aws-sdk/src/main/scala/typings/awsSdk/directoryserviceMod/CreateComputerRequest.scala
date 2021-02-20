package typings.awsSdk.directoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateComputerRequest extends StObject {
  
  /**
    * An array of Attribute objects that contain any LDAP attributes to apply to the computer account.
    */
  var ComputerAttributes: js.UndefOr[Attributes] = js.native
  
  /**
    * The name of the computer account.
    */
  var ComputerName: typings.awsSdk.directoryserviceMod.ComputerName = js.native
  
  /**
    * The identifier of the directory in which to create the computer account.
    */
  var DirectoryId: typings.awsSdk.directoryserviceMod.DirectoryId = js.native
  
  /**
    * The fully-qualified distinguished name of the organizational unit to place the computer account in.
    */
  var OrganizationalUnitDistinguishedName: js.UndefOr[OrganizationalUnitDN] = js.native
  
  /**
    * A one-time password that is used to join the computer to the directory. You should generate a random, strong password to use for this parameter.
    */
  var Password: ComputerPassword = js.native
}
object CreateComputerRequest {
  
  @scala.inline
  def apply(ComputerName: ComputerName, DirectoryId: DirectoryId, Password: ComputerPassword): CreateComputerRequest = {
    val __obj = js.Dynamic.literal(ComputerName = ComputerName.asInstanceOf[js.Any], DirectoryId = DirectoryId.asInstanceOf[js.Any], Password = Password.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateComputerRequest]
  }
  
  @scala.inline
  implicit class CreateComputerRequestMutableBuilder[Self <: CreateComputerRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComputerAttributes(value: Attributes): Self = StObject.set(x, "ComputerAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComputerAttributesUndefined: Self = StObject.set(x, "ComputerAttributes", js.undefined)
    
    @scala.inline
    def setComputerAttributesVarargs(value: Attribute*): Self = StObject.set(x, "ComputerAttributes", js.Array(value :_*))
    
    @scala.inline
    def setComputerName(value: ComputerName): Self = StObject.set(x, "ComputerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectoryId(value: DirectoryId): Self = StObject.set(x, "DirectoryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganizationalUnitDistinguishedName(value: OrganizationalUnitDN): Self = StObject.set(x, "OrganizationalUnitDistinguishedName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganizationalUnitDistinguishedNameUndefined: Self = StObject.set(x, "OrganizationalUnitDistinguishedName", js.undefined)
    
    @scala.inline
    def setPassword(value: ComputerPassword): Self = StObject.set(x, "Password", value.asInstanceOf[js.Any])
  }
}
