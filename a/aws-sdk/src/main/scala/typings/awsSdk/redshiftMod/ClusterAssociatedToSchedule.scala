package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClusterAssociatedToSchedule extends StObject {
  
  /**
    * 
    */
  var ClusterIdentifier: js.UndefOr[String] = js.native
  
  /**
    * 
    */
  var ScheduleAssociationState: js.UndefOr[ScheduleState] = js.native
}
object ClusterAssociatedToSchedule {
  
  @scala.inline
  def apply(): ClusterAssociatedToSchedule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterAssociatedToSchedule]
  }
  
  @scala.inline
  implicit class ClusterAssociatedToScheduleMutableBuilder[Self <: ClusterAssociatedToSchedule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClusterIdentifier(value: String): Self = StObject.set(x, "ClusterIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterIdentifierUndefined: Self = StObject.set(x, "ClusterIdentifier", js.undefined)
    
    @scala.inline
    def setScheduleAssociationState(value: ScheduleState): Self = StObject.set(x, "ScheduleAssociationState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduleAssociationStateUndefined: Self = StObject.set(x, "ScheduleAssociationState", js.undefined)
  }
}
