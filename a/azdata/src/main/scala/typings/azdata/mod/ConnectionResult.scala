package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectionResult extends StObject {
  
  /**
    * Whether the connection was successful
    */
  var connected: Boolean
  
  /**
    * The ID of the connection if it was successful. {@link connection.getUriForConnection} can be used to get
    * the URI for this connection used by many of the other Extension API functions.
    */
  var connectionId: js.UndefOr[String] = js.undefined
  
  /**
    * The error code number associated with the error if the connection was unsuccessful.
    *
    * e.g. 18456
    * (https://docs.microsoft.com/sql/relational-databases/errors-events/mssqlserver-18456-database-engine-error)
    */
  var errorCode: js.UndefOr[Double] = js.undefined
  
  /**
    * The error message if the connection was unsuccessful
    *
    * e.g. Login failed for user '<user>'.
    */
  var errorMessage: js.UndefOr[String] = js.undefined
}
object ConnectionResult {
  
  inline def apply(connected: Boolean): ConnectionResult = {
    val __obj = js.Dynamic.literal(connected = connected.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionResult]
  }
  
  extension [Self <: ConnectionResult](x: Self) {
    
    inline def setConnected(value: Boolean): Self = StObject.set(x, "connected", value.asInstanceOf[js.Any])
    
    inline def setConnectionId(value: String): Self = StObject.set(x, "connectionId", value.asInstanceOf[js.Any])
    
    inline def setConnectionIdUndefined: Self = StObject.set(x, "connectionId", js.undefined)
    
    inline def setErrorCode(value: Double): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    inline def setErrorCodeUndefined: Self = StObject.set(x, "errorCode", js.undefined)
    
    inline def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
  }
}
