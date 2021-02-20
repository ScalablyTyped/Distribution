package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuthorizeDBSecurityGroupIngressResult extends StObject {
  
  var DBSecurityGroup: js.UndefOr[typings.awsSdk.rdsMod.DBSecurityGroup] = js.native
}
object AuthorizeDBSecurityGroupIngressResult {
  
  @scala.inline
  def apply(): AuthorizeDBSecurityGroupIngressResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthorizeDBSecurityGroupIngressResult]
  }
  
  @scala.inline
  implicit class AuthorizeDBSecurityGroupIngressResultMutableBuilder[Self <: AuthorizeDBSecurityGroupIngressResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDBSecurityGroup(value: DBSecurityGroup): Self = StObject.set(x, "DBSecurityGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDBSecurityGroupUndefined: Self = StObject.set(x, "DBSecurityGroup", js.undefined)
  }
}
