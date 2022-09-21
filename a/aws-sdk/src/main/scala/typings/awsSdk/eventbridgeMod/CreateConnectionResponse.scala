package typings.awsSdk.eventbridgeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateConnectionResponse extends StObject {
  
  /**
    * The ARN of the connection that was created by the request.
    */
  var ConnectionArn: js.UndefOr[typings.awsSdk.eventbridgeMod.ConnectionArn] = js.undefined
  
  /**
    * The state of the connection that was created by the request.
    */
  var ConnectionState: js.UndefOr[typings.awsSdk.eventbridgeMod.ConnectionState] = js.undefined
  
  /**
    * A time stamp for the time that the connection was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A time stamp for the time that the connection was last updated.
    */
  var LastModifiedTime: js.UndefOr[js.Date] = js.undefined
}
object CreateConnectionResponse {
  
  inline def apply(): CreateConnectionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateConnectionResponse]
  }
  
  extension [Self <: CreateConnectionResponse](x: Self) {
    
    inline def setConnectionArn(value: ConnectionArn): Self = StObject.set(x, "ConnectionArn", value.asInstanceOf[js.Any])
    
    inline def setConnectionArnUndefined: Self = StObject.set(x, "ConnectionArn", js.undefined)
    
    inline def setConnectionState(value: ConnectionState): Self = StObject.set(x, "ConnectionState", value.asInstanceOf[js.Any])
    
    inline def setConnectionStateUndefined: Self = StObject.set(x, "ConnectionState", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTimeUndefined: Self = StObject.set(x, "LastModifiedTime", js.undefined)
  }
}
