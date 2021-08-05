package typings.awsSdk.workspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateConnectionAliasRequest extends StObject {
  
  /**
    * A connection string in the form of a fully qualified domain name (FQDN), such as www.example.com.  After you create a connection string, it is always associated to your AWS account. You cannot recreate the same connection string with a different account, even if you delete all instances of it from the original account. The connection string is globally reserved for your account. 
    */
  var ConnectionString: typings.awsSdk.workspacesMod.ConnectionString
  
  /**
    * The tags to associate with the connection alias.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object CreateConnectionAliasRequest {
  
  inline def apply(ConnectionString: ConnectionString): CreateConnectionAliasRequest = {
    val __obj = js.Dynamic.literal(ConnectionString = ConnectionString.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateConnectionAliasRequest]
  }
  
  extension [Self <: CreateConnectionAliasRequest](x: Self) {
    
    inline def setConnectionString(value: ConnectionString): Self = StObject.set(x, "ConnectionString", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
