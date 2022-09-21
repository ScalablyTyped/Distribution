package typings.awsSdk.mwaaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LastUpdate extends StObject {
  
  /**
    * The day and time of the last update on the environment.
    */
  var CreatedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The error that was encountered during the last update of the environment.
    */
  var Error: js.UndefOr[UpdateError] = js.undefined
  
  /**
    * The source of the last update to the environment. Includes internal processes by Amazon MWAA, such as an environment maintenance update.
    */
  var Source: js.UndefOr[UpdateSource] = js.undefined
  
  /**
    * The status of the last update on the environment.
    */
  var Status: js.UndefOr[UpdateStatus] = js.undefined
}
object LastUpdate {
  
  inline def apply(): LastUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LastUpdate]
  }
  
  extension [Self <: LastUpdate](x: Self) {
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "CreatedAt", js.undefined)
    
    inline def setError(value: UpdateError): Self = StObject.set(x, "Error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "Error", js.undefined)
    
    inline def setSource(value: UpdateSource): Self = StObject.set(x, "Source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "Source", js.undefined)
    
    inline def setStatus(value: UpdateStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
