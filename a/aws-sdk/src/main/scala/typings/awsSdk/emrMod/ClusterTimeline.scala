package typings.awsSdk.emrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterTimeline extends StObject {
  
  /**
    * The creation date and time of the cluster.
    */
  var CreationDateTime: js.UndefOr[Date] = js.undefined
  
  /**
    * The date and time when the cluster was terminated.
    */
  var EndDateTime: js.UndefOr[Date] = js.undefined
  
  /**
    * The date and time when the cluster was ready to execute steps.
    */
  var ReadyDateTime: js.UndefOr[Date] = js.undefined
}
object ClusterTimeline {
  
  @scala.inline
  def apply(): ClusterTimeline = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterTimeline]
  }
  
  @scala.inline
  implicit class ClusterTimelineMutableBuilder[Self <: ClusterTimeline] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationDateTime(value: Date): Self = StObject.set(x, "CreationDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationDateTimeUndefined: Self = StObject.set(x, "CreationDateTime", js.undefined)
    
    @scala.inline
    def setEndDateTime(value: Date): Self = StObject.set(x, "EndDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndDateTimeUndefined: Self = StObject.set(x, "EndDateTime", js.undefined)
    
    @scala.inline
    def setReadyDateTime(value: Date): Self = StObject.set(x, "ReadyDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadyDateTimeUndefined: Self = StObject.set(x, "ReadyDateTime", js.undefined)
  }
}
