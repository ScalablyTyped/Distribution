package typings.awsSdk.rumMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppMonitorSummary extends StObject {
  
  /**
    * The date and time that the app monitor was created.
    */
  var Created: js.UndefOr[ISOTimestampString] = js.undefined
  
  /**
    * The unique ID of this app monitor.
    */
  var Id: js.UndefOr[AppMonitorId] = js.undefined
  
  /**
    * The date and time of the most recent changes to this app monitor's configuration.
    */
  var LastModified: js.UndefOr[ISOTimestampString] = js.undefined
  
  /**
    * The name of this app monitor.
    */
  var Name: js.UndefOr[AppMonitorName] = js.undefined
  
  /**
    * The current state of this app monitor.
    */
  var State: js.UndefOr[StateEnum] = js.undefined
}
object AppMonitorSummary {
  
  inline def apply(): AppMonitorSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppMonitorSummary]
  }
  
  extension [Self <: AppMonitorSummary](x: Self) {
    
    inline def setCreated(value: ISOTimestampString): Self = StObject.set(x, "Created", value.asInstanceOf[js.Any])
    
    inline def setCreatedUndefined: Self = StObject.set(x, "Created", js.undefined)
    
    inline def setId(value: AppMonitorId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setLastModified(value: ISOTimestampString): Self = StObject.set(x, "LastModified", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedUndefined: Self = StObject.set(x, "LastModified", js.undefined)
    
    inline def setName(value: AppMonitorName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setState(value: StateEnum): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}
