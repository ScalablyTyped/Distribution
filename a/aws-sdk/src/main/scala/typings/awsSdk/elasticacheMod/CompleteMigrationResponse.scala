package typings.awsSdk.elasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompleteMigrationResponse extends StObject {
  
  var ReplicationGroup: js.UndefOr[typings.awsSdk.elasticacheMod.ReplicationGroup] = js.undefined
}
object CompleteMigrationResponse {
  
  inline def apply(): CompleteMigrationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompleteMigrationResponse]
  }
  
  extension [Self <: CompleteMigrationResponse](x: Self) {
    
    inline def setReplicationGroup(value: ReplicationGroup): Self = StObject.set(x, "ReplicationGroup", value.asInstanceOf[js.Any])
    
    inline def setReplicationGroupUndefined: Self = StObject.set(x, "ReplicationGroup", js.undefined)
  }
}
