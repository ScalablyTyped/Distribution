package typings.awsSdk.syntheticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CanaryTimeline extends StObject {
  
  /**
    * The date and time the canary was created.
    */
  var Created: js.UndefOr[Timestamp] = js.native
  
  /**
    * The date and time the canary was most recently modified.
    */
  var LastModified: js.UndefOr[Timestamp] = js.native
  
  /**
    * The date and time that the canary's most recent run started.
    */
  var LastStarted: js.UndefOr[Timestamp] = js.native
  
  /**
    * The date and time that the canary's most recent run ended.
    */
  var LastStopped: js.UndefOr[Timestamp] = js.native
}
object CanaryTimeline {
  
  @scala.inline
  def apply(): CanaryTimeline = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CanaryTimeline]
  }
  
  @scala.inline
  implicit class CanaryTimelineMutableBuilder[Self <: CanaryTimeline] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreated(value: Timestamp): Self = StObject.set(x, "Created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedUndefined: Self = StObject.set(x, "Created", js.undefined)
    
    @scala.inline
    def setLastModified(value: Timestamp): Self = StObject.set(x, "LastModified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedUndefined: Self = StObject.set(x, "LastModified", js.undefined)
    
    @scala.inline
    def setLastStarted(value: Timestamp): Self = StObject.set(x, "LastStarted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastStartedUndefined: Self = StObject.set(x, "LastStarted", js.undefined)
    
    @scala.inline
    def setLastStopped(value: Timestamp): Self = StObject.set(x, "LastStopped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastStoppedUndefined: Self = StObject.set(x, "LastStopped", js.undefined)
  }
}
