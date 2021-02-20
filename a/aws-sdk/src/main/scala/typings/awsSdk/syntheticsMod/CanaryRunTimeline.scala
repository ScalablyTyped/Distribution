package typings.awsSdk.syntheticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CanaryRunTimeline extends StObject {
  
  /**
    * The end time of the run.
    */
  var Completed: js.UndefOr[Timestamp] = js.native
  
  /**
    * The start time of the run.
    */
  var Started: js.UndefOr[Timestamp] = js.native
}
object CanaryRunTimeline {
  
  @scala.inline
  def apply(): CanaryRunTimeline = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CanaryRunTimeline]
  }
  
  @scala.inline
  implicit class CanaryRunTimelineMutableBuilder[Self <: CanaryRunTimeline] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompleted(value: Timestamp): Self = StObject.set(x, "Completed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompletedUndefined: Self = StObject.set(x, "Completed", js.undefined)
    
    @scala.inline
    def setStarted(value: Timestamp): Self = StObject.set(x, "Started", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartedUndefined: Self = StObject.set(x, "Started", js.undefined)
  }
}
