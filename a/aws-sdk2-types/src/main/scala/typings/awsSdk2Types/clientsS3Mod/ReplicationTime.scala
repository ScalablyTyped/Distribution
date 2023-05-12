package typings.awsSdk2Types.clientsS3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReplicationTime extends StObject {
  
  /**
    *  Specifies whether the replication time is enabled. 
    */
  var Status: ReplicationTimeStatus
  
  /**
    *  A container specifying the time by which replication should be complete for all objects and operations on objects. 
    */
  var Time: ReplicationTimeValue
}
object ReplicationTime {
  
  inline def apply(Status: ReplicationTimeStatus, Time: ReplicationTimeValue): ReplicationTime = {
    val __obj = js.Dynamic.literal(Status = Status.asInstanceOf[js.Any], Time = Time.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplicationTime]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReplicationTime] (val x: Self) extends AnyVal {
    
    inline def setStatus(value: ReplicationTimeStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setTime(value: ReplicationTimeValue): Self = StObject.set(x, "Time", value.asInstanceOf[js.Any])
  }
}
