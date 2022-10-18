package typings.awsSdk.clientsSyntheticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CanaryTimeline extends StObject {
  
  /**
    * The date and time the canary was created.
    */
  var Created: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The date and time the canary was most recently modified.
    */
  var LastModified: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The date and time that the canary's most recent run started.
    */
  var LastStarted: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The date and time that the canary's most recent run ended.
    */
  var LastStopped: js.UndefOr[js.Date] = js.undefined
}
object CanaryTimeline {
  
  inline def apply(): CanaryTimeline = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CanaryTimeline]
  }
  
  extension [Self <: CanaryTimeline](x: Self) {
    
    inline def setCreated(value: js.Date): Self = StObject.set(x, "Created", value.asInstanceOf[js.Any])
    
    inline def setCreatedUndefined: Self = StObject.set(x, "Created", js.undefined)
    
    inline def setLastModified(value: js.Date): Self = StObject.set(x, "LastModified", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedUndefined: Self = StObject.set(x, "LastModified", js.undefined)
    
    inline def setLastStarted(value: js.Date): Self = StObject.set(x, "LastStarted", value.asInstanceOf[js.Any])
    
    inline def setLastStartedUndefined: Self = StObject.set(x, "LastStarted", js.undefined)
    
    inline def setLastStopped(value: js.Date): Self = StObject.set(x, "LastStopped", value.asInstanceOf[js.Any])
    
    inline def setLastStoppedUndefined: Self = StObject.set(x, "LastStopped", js.undefined)
  }
}
