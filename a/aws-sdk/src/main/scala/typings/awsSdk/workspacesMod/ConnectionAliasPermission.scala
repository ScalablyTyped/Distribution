package typings.awsSdk.workspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectionAliasPermission extends StObject {
  
  /**
    * Indicates whether the specified AWS account is allowed to associate the connection alias with a directory.
    */
  var AllowAssociation: BooleanObject
  
  /**
    * The identifier of the AWS account that the connection alias is shared with.
    */
  var SharedAccountId: AwsAccount
}
object ConnectionAliasPermission {
  
  inline def apply(AllowAssociation: BooleanObject, SharedAccountId: AwsAccount): ConnectionAliasPermission = {
    val __obj = js.Dynamic.literal(AllowAssociation = AllowAssociation.asInstanceOf[js.Any], SharedAccountId = SharedAccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionAliasPermission]
  }
  
  extension [Self <: ConnectionAliasPermission](x: Self) {
    
    inline def setAllowAssociation(value: BooleanObject): Self = StObject.set(x, "AllowAssociation", value.asInstanceOf[js.Any])
    
    inline def setSharedAccountId(value: AwsAccount): Self = StObject.set(x, "SharedAccountId", value.asInstanceOf[js.Any])
  }
}
