package typings.awsSdk.mgnMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RetryDataReplicationRequest extends StObject {
  
  /**
    * Retry data replication for Source Server ID.
    */
  var sourceServerID: SourceServerID
}
object RetryDataReplicationRequest {
  
  inline def apply(sourceServerID: SourceServerID): RetryDataReplicationRequest = {
    val __obj = js.Dynamic.literal(sourceServerID = sourceServerID.asInstanceOf[js.Any])
    __obj.asInstanceOf[RetryDataReplicationRequest]
  }
  
  extension [Self <: RetryDataReplicationRequest](x: Self) {
    
    inline def setSourceServerID(value: SourceServerID): Self = StObject.set(x, "sourceServerID", value.asInstanceOf[js.Any])
  }
}
