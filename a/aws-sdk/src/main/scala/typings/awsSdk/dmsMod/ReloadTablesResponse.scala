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
  
  @scala.inline
  def apply(): ReloadTablesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReloadTablesResponse]
  }
  
  @scala.inline
  implicit class ReloadTablesResponseMutableBuilder[Self <: ReloadTablesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReplicationTaskArn(value: String): Self = StObject.set(x, "ReplicationTaskArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicationTaskArnUndefined: Self = StObject.set(x, "ReplicationTaskArn", js.undefined)
  }
}
