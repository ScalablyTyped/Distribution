package typings.awsSdk.kendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Principal extends StObject {
  
  /**
    * Whether to allow or deny access to the principal.
    */
  var Access: ReadAccessType
  
  /**
    * The name of the user or group.
    */
  var Name: PrincipalName
  
  /**
    * The type of principal.
    */
  var Type: PrincipalType
}
object Principal {
  
  inline def apply(Access: ReadAccessType, Name: PrincipalName, Type: PrincipalType): Principal = {
    val __obj = js.Dynamic.literal(Access = Access.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Principal]
  }
  
  extension [Self <: Principal](x: Self) {
    
    inline def setAccess(value: ReadAccessType): Self = StObject.set(x, "Access", value.asInstanceOf[js.Any])
    
    inline def setName(value: PrincipalName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setType(value: PrincipalType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
