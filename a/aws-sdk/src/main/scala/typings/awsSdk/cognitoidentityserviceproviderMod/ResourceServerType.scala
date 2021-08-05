package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceServerType extends StObject {
  
  /**
    * The identifier for the resource server.
    */
  var Identifier: js.UndefOr[ResourceServerIdentifierType] = js.undefined
  
  /**
    * The name of the resource server.
    */
  var Name: js.UndefOr[ResourceServerNameType] = js.undefined
  
  /**
    * A list of scopes that are defined for the resource server.
    */
  var Scopes: js.UndefOr[ResourceServerScopeListType] = js.undefined
  
  /**
    * The user pool ID for the user pool that hosts the resource server.
    */
  var UserPoolId: js.UndefOr[UserPoolIdType] = js.undefined
}
object ResourceServerType {
  
  inline def apply(): ResourceServerType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceServerType]
  }
  
  extension [Self <: ResourceServerType](x: Self) {
    
    inline def setIdentifier(value: ResourceServerIdentifierType): Self = StObject.set(x, "Identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "Identifier", js.undefined)
    
    inline def setName(value: ResourceServerNameType): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setScopes(value: ResourceServerScopeListType): Self = StObject.set(x, "Scopes", value.asInstanceOf[js.Any])
    
    inline def setScopesUndefined: Self = StObject.set(x, "Scopes", js.undefined)
    
    inline def setScopesVarargs(value: ResourceServerScopeType*): Self = StObject.set(x, "Scopes", js.Array(value :_*))
    
    inline def setUserPoolId(value: UserPoolIdType): Self = StObject.set(x, "UserPoolId", value.asInstanceOf[js.Any])
    
    inline def setUserPoolIdUndefined: Self = StObject.set(x, "UserPoolId", js.undefined)
  }
}
