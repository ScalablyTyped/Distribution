package typings.awsSdk.nimbleMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActiveDirectoryConfiguration extends StObject {
  
  /**
    * A collection of custom attributes for an Active Directory computer.
    */
  var computerAttributes: js.UndefOr[ActiveDirectoryComputerAttributeList] = js.undefined
  
  /**
    * The directory ID of the Directory Service for Microsoft Active Directory to access using this studio component.
    */
  var directoryId: js.UndefOr[DirectoryId] = js.undefined
  
  /**
    * The distinguished name (DN) and organizational unit (OU) of an Active Directory computer.
    */
  var organizationalUnitDistinguishedName: js.UndefOr[ActiveDirectoryOrganizationalUnitDistinguishedName] = js.undefined
}
object ActiveDirectoryConfiguration {
  
  inline def apply(): ActiveDirectoryConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActiveDirectoryConfiguration]
  }
  
  extension [Self <: ActiveDirectoryConfiguration](x: Self) {
    
    inline def setComputerAttributes(value: ActiveDirectoryComputerAttributeList): Self = StObject.set(x, "computerAttributes", value.asInstanceOf[js.Any])
    
    inline def setComputerAttributesUndefined: Self = StObject.set(x, "computerAttributes", js.undefined)
    
    inline def setComputerAttributesVarargs(value: ActiveDirectoryComputerAttribute*): Self = StObject.set(x, "computerAttributes", js.Array(value*))
    
    inline def setDirectoryId(value: DirectoryId): Self = StObject.set(x, "directoryId", value.asInstanceOf[js.Any])
    
    inline def setDirectoryIdUndefined: Self = StObject.set(x, "directoryId", js.undefined)
    
    inline def setOrganizationalUnitDistinguishedName(value: ActiveDirectoryOrganizationalUnitDistinguishedName): Self = StObject.set(x, "organizationalUnitDistinguishedName", value.asInstanceOf[js.Any])
    
    inline def setOrganizationalUnitDistinguishedNameUndefined: Self = StObject.set(x, "organizationalUnitDistinguishedName", js.undefined)
  }
}
