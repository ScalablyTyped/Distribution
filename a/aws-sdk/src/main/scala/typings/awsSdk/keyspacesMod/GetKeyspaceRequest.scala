package typings.awsSdk.keyspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetKeyspaceRequest extends StObject {
  
  /**
    * The name of the keyspace.
    */
  var keyspaceName: KeyspaceName
}
object GetKeyspaceRequest {
  
  inline def apply(keyspaceName: KeyspaceName): GetKeyspaceRequest = {
    val __obj = js.Dynamic.literal(keyspaceName = keyspaceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetKeyspaceRequest]
  }
  
  extension [Self <: GetKeyspaceRequest](x: Self) {
    
    inline def setKeyspaceName(value: KeyspaceName): Self = StObject.set(x, "keyspaceName", value.asInstanceOf[js.Any])
  }
}
