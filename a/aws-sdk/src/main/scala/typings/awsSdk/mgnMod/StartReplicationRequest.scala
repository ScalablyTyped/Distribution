package typings.awsSdk.mgnMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartReplicationRequest extends StObject {
  
  /**
    * ID of source server on which to start replication.
    */
  var sourceServerID: SourceServerID
}
object StartReplicationRequest {
  
  inline def apply(sourceServerID: SourceServerID): StartReplicationRequest = {
    val __obj = js.Dynamic.literal(sourceServerID = sourceServerID.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartReplicationRequest]
  }
  
  extension [Self <: StartReplicationRequest](x: Self) {
    
    inline def setSourceServerID(value: SourceServerID): Self = StObject.set(x, "sourceServerID", value.asInstanceOf[js.Any])
  }
}
