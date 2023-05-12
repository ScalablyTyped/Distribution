package typings.awsSdk2Types.clientsS3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Metrics extends StObject {
  
  /**
    *  A container specifying the time threshold for emitting the s3:Replication:OperationMissedThreshold event. 
    */
  var EventThreshold: js.UndefOr[ReplicationTimeValue] = js.undefined
  
  /**
    *  Specifies whether the replication metrics are enabled. 
    */
  var Status: MetricsStatus
}
object Metrics {
  
  inline def apply(Status: MetricsStatus): Metrics = {
    val __obj = js.Dynamic.literal(Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Metrics]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Metrics] (val x: Self) extends AnyVal {
    
    inline def setEventThreshold(value: ReplicationTimeValue): Self = StObject.set(x, "EventThreshold", value.asInstanceOf[js.Any])
    
    inline def setEventThresholdUndefined: Self = StObject.set(x, "EventThreshold", js.undefined)
    
    inline def setStatus(value: MetricsStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
  }
}
