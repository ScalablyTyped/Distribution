package typings.awsSdk.fsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoExportPolicy extends StObject {
  
  /**
    * The AutoExportPolicy can have the following event values:    NEW - Amazon FSx automatically exports new files and directories to the data repository as they are added to the file system.    CHANGED - Amazon FSx automatically exports changes to files and directories on the file system to the data repository.    DELETED - Files and directories are automatically deleted on the data repository when they are deleted on the file system.   You can define any combination of event types for your AutoExportPolicy.
    */
  var Events: js.UndefOr[EventTypes] = js.undefined
}
object AutoExportPolicy {
  
  inline def apply(): AutoExportPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoExportPolicy]
  }
  
  extension [Self <: AutoExportPolicy](x: Self) {
    
    inline def setEvents(value: EventTypes): Self = StObject.set(x, "Events", value.asInstanceOf[js.Any])
    
    inline def setEventsUndefined: Self = StObject.set(x, "Events", js.undefined)
    
    inline def setEventsVarargs(value: EventType*): Self = StObject.set(x, "Events", js.Array(value*))
  }
}
