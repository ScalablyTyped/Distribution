package typings.awsSdk.keyspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateKeyspaceRequest extends StObject {
  
  /**
    * The name of the keyspace to be created.
    */
  var keyspaceName: KeyspaceName
  
  /**
    * A list of key-value pair tags to be attached to the keyspace. For more information, see Adding tags and labels to Amazon Keyspaces resources in the Amazon Keyspaces Developer Guide.
    */
  var tags: js.UndefOr[TagList] = js.undefined
}
object CreateKeyspaceRequest {
  
  inline def apply(keyspaceName: KeyspaceName): CreateKeyspaceRequest = {
    val __obj = js.Dynamic.literal(keyspaceName = keyspaceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateKeyspaceRequest]
  }
  
  extension [Self <: CreateKeyspaceRequest](x: Self) {
    
    inline def setKeyspaceName(value: KeyspaceName): Self = StObject.set(x, "keyspaceName", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value*))
  }
}
