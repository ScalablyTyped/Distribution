package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthorizeDBSecurityGroupIngressResult extends StObject {
  
  var DBSecurityGroup: js.UndefOr[typings.awsSdk.rdsMod.DBSecurityGroup] = js.undefined
}
object AuthorizeDBSecurityGroupIngressResult {
  
  inline def apply(): AuthorizeDBSecurityGroupIngressResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthorizeDBSecurityGroupIngressResult]
  }
  
  extension [Self <: AuthorizeDBSecurityGroupIngressResult](x: Self) {
    
    inline def setDBSecurityGroup(value: DBSecurityGroup): Self = StObject.set(x, "DBSecurityGroup", value.asInstanceOf[js.Any])
    
    inline def setDBSecurityGroupUndefined: Self = StObject.set(x, "DBSecurityGroup", js.undefined)
  }
}
