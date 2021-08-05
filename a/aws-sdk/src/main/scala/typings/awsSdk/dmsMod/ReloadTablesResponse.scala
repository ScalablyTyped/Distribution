package typings.awsSdk.dmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReloadTablesResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the replication task. 
    */
  var ReplicationTaskArn: js.UndefOr[String] = js.undefined
}
object ReloadTablesResponse {
  
  inline def apply(): ReloadTablesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReloadTablesResponse]
  }
  
  extension [Self <: ReloadTablesResponse](x: Self) {
    
    inline def setReplicationTaskArn(value: String): Self = StObject.set(x, "ReplicationTaskArn", value.asInstanceOf[js.Any])
    
    inline def setReplicationTaskArnUndefined: Self = StObject.set(x, "ReplicationTaskArn", js.undefined)
  }
}
