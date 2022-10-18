package typings.awsSdk.clientsWorkspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectionAlias extends StObject {
  
  /**
    * The identifier of the connection alias.
    */
  var AliasId: js.UndefOr[ConnectionAliasId] = js.undefined
  
  /**
    * The association status of the connection alias.
    */
  var Associations: js.UndefOr[ConnectionAliasAssociationList] = js.undefined
  
  /**
    * The connection string specified for the connection alias. The connection string must be in the form of a fully qualified domain name (FQDN), such as www.example.com.
    */
  var ConnectionString: js.UndefOr[typings.awsSdk.clientsWorkspacesMod.ConnectionString] = js.undefined
  
  /**
    * The identifier of the Amazon Web Services account that owns the connection alias.
    */
  var OwnerAccountId: js.UndefOr[AwsAccount] = js.undefined
  
  /**
    * The current state of the connection alias.
    */
  var State: js.UndefOr[ConnectionAliasState] = js.undefined
}
object ConnectionAlias {
  
  inline def apply(): ConnectionAlias = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectionAlias]
  }
  
  extension [Self <: ConnectionAlias](x: Self) {
    
    inline def setAliasId(value: ConnectionAliasId): Self = StObject.set(x, "AliasId", value.asInstanceOf[js.Any])
    
    inline def setAliasIdUndefined: Self = StObject.set(x, "AliasId", js.undefined)
    
    inline def setAssociations(value: ConnectionAliasAssociationList): Self = StObject.set(x, "Associations", value.asInstanceOf[js.Any])
    
    inline def setAssociationsUndefined: Self = StObject.set(x, "Associations", js.undefined)
    
    inline def setAssociationsVarargs(value: ConnectionAliasAssociation*): Self = StObject.set(x, "Associations", js.Array(value*))
    
    inline def setConnectionString(value: ConnectionString): Self = StObject.set(x, "ConnectionString", value.asInstanceOf[js.Any])
    
    inline def setConnectionStringUndefined: Self = StObject.set(x, "ConnectionString", js.undefined)
    
    inline def setOwnerAccountId(value: AwsAccount): Self = StObject.set(x, "OwnerAccountId", value.asInstanceOf[js.Any])
    
    inline def setOwnerAccountIdUndefined: Self = StObject.set(x, "OwnerAccountId", js.undefined)
    
    inline def setState(value: ConnectionAliasState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}
