package typings.awsSdk.directoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisableLDAPSRequest extends StObject {
  
  /**
    * The identifier of the directory.
    */
  var DirectoryId: typings.awsSdk.directoryserviceMod.DirectoryId
  
  /**
    * The type of LDAP security to enable. Currently only the value Client is supported.
    */
  var Type: LDAPSType
}
object DisableLDAPSRequest {
  
  inline def apply(DirectoryId: DirectoryId, Type: LDAPSType): DisableLDAPSRequest = {
    val __obj = js.Dynamic.literal(DirectoryId = DirectoryId.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisableLDAPSRequest]
  }
  
  extension [Self <: DisableLDAPSRequest](x: Self) {
    
    inline def setDirectoryId(value: DirectoryId): Self = StObject.set(x, "DirectoryId", value.asInstanceOf[js.Any])
    
    inline def setType(value: LDAPSType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
