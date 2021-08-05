package typings.awsSdk.codedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoRollbackConfiguration extends StObject {
  
  /**
    * Indicates whether a defined automatic rollback configuration is currently enabled.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The event type or types that trigger a rollback.
    */
  var events: js.UndefOr[AutoRollbackEventsList] = js.undefined
}
object AutoRollbackConfiguration {
  
  inline def apply(): AutoRollbackConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoRollbackConfiguration]
  }
  
  extension [Self <: AutoRollbackConfiguration](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setEvents(value: AutoRollbackEventsList): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    inline def setEventsVarargs(value: AutoRollbackEvent*): Self = StObject.set(x, "events", js.Array(value :_*))
  }
}
