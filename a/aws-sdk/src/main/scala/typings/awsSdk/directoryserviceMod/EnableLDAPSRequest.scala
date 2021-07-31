package typings.awsSdk.directoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnableLDAPSRequest extends StObject {
  
  /**
    * The identifier of the directory.
    */
  var DirectoryId: typings.awsSdk.directoryserviceMod.DirectoryId
  
  /**
    * The type of LDAP security to enable. Currently only the value Client is supported.
    */
  var Type: LDAPSType
}
object EnableLDAPSRequest {
  
  @scala.inline
  def apply(DirectoryId: DirectoryId, Type: LDAPSType): EnableLDAPSRequest = {
    val __obj = js.Dynamic.literal(DirectoryId = DirectoryId.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnableLDAPSRequest]
  }
  
  @scala.inline
  implicit class EnableLDAPSRequestMutableBuilder[Self <: EnableLDAPSRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirectoryId(value: DirectoryId): Self = StObject.set(x, "DirectoryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: LDAPSType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
